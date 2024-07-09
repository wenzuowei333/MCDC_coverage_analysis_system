import ast
import json
import sys

class DecisionNode:
    def __init__(self, condition_str, children=None, parent=None):
        self.condition_str = condition_str
        self.children = children or []
        self.parent = parent

    def add_child(self, child):
        child.parent = self
        self.children.append(child)

    def to_dict(self):
        return {
            "condition": self.condition_str,
            "children": [child.to_dict() for child in self.children]
        }

class ConditionExtractor(ast.NodeVisitor):
    def __init__(self):
        self.current_node = DecisionNode("Root")

    def visit_If(self, node):
        new_node = DecisionNode(ast.unparse(node.test))
        self.current_node.add_child(new_node)
        old_node = self.current_node
        self.current_node = new_node
        self.generic_visit(node)
        self.current_node = old_node

    def visit_BoolOp(self, node):
        new_node = DecisionNode(ast.unparse(node))
        self.current_node.add_child(new_node)
        self.current_node = new_node
        self.generic_visit(node)
        self.current_node = new_node.parent

def parse_code(code):
    tree = ast.parse(code)
    extractor = ConditionExtractor()
    extractor.visit(tree)
    return extractor.current_node.to_dict()

if __name__ == "__main__":
    code = sys.stdin.read()
    try:
        tree = parse_code(code)
        print(json.dumps(tree))
    except Exception as e:
        print(f"An error occurred: {e}")
