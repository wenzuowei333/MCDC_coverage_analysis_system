#include <stdio.h>
#include <stdlib.h>  // 添加此行以包含atoi函数

// 声明 log_condition 函数
int log_condition(const char* condition, int result) {
    printf("Condition: %s, Outcome: %s\n", condition, result ? "true" : "false");
    return result;
}

int main(int argc, char *argv[]) {
    int x = argc > 1 ? atoi(argv[1]) : 5;
    int y = argc > 2 ? atoi(argv[2]) : 10;

    // 嵌套的 if 语句
    if (log_condition("x > 3", x > 3)) {
        if (log_condition("y > 8", y > 8)) {
            printf("1\n");
        } else {
            printf("2\n");
        }
    } else {
        printf("3\n");
    }

    return 0;
}
