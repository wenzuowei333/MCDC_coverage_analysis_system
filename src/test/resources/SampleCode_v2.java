public class SampleCode_v2 {
    public static void main(String[] args) {

        // 解析参数
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // 简单的if语句
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is 5 or less");
        }

        // 带有嵌套的if语句
        if (x > 2) {
            if (y < 10) {
                System.out.println("x is greater than 2 and y is less than 10");
            } else if (y == 10) {
                System.out.println("x is greater than 2 and y is equal to 10");
            } else {
                System.out.println("x is greater than 2 and y is greater than 10");
            }
        } else {
            System.out.println("x is 2 or less");
        }
    }
}
