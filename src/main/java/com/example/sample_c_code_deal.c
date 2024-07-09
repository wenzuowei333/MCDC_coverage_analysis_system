#include <stdio.h>

int log_condition(const char* condition, int outcome) {
    printf("Condition: %s, Outcome: %d\n", condition, outcome);
    return outcome;
}

#include <stdio.h>
#include <stdlib.h>  // 添加此行以包含atoi函数


int main(int argc, char *argv[]) {
    int x = argc > 1 ? atoi(argv[1]) : 5;
    int y = argc > 2 ? atoi(argv[2]) : 10;

    // 嵌套的 if 语句
    if ( x > 3) {
        if ( y > 8) {
            printf("1\n");
        } else {
            printf("2\n");
        }
    } else {
        printf("3\n");
    }

    return 0;
}
