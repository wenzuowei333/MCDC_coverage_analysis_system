def log_condition(condition, outcome):
    print(f"Condition: {condition}, Outcome: {outcome}")
    return outcome

# SampleCode.py
import sys

x = int(sys.argv[1])
y = int(sys.argv[2])

# Simple if statement
if log_condition("x > 5", x > 5):
    print("x is greater than 5")
else:
    print("x is 5 or less")

# Nested if statement
if log_condition("x > 2", x > 2):
    if log_condition("y < 10", y < 10):
        print("x is greater than 2 and y is less than 10")
    elif log_condition("y == 10", y == 10):
        print("x is greater than 2 and y is equal to 10")
    else:
        print("x is greater than 2 and y is greater than 10")
else:
    print("x is 2 or less")
