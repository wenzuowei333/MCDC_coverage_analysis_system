import com.instrumentor.CodeInstrumentor;

public class SampleCode_deal {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        // 带有逻辑或操作符的if语句
        if (CodeInstrumentor.logCondition("a > b || b < c", a > b || b < c)) {
            System.out.println("a is greater than b or b is less than c");
        }
        System.out.println(com.instrumentor.CodeInstrumentor.getCoverageDataString());
    }
}
