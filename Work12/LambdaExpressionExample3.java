interface Sayable {
    public String say();
}

public class LambdaExpressionExample3 {
    public static void main(String[] args) {
        
        System.out.println("Java Lambda Expression แบบไม่มีพารามิเตอร์");
        System.out.println("Pharthiwath Gristsoopharruth");
        System.out.println("===========================");
        
        Sayable s = () -> {
            return "I Love Computer Science.";
        };
        System.out.println(s.say());
    }
}