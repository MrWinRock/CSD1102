interface Sayable {
    String say(String name);
}

public class LambdaExpressionExample4 {
    public static void main(String[] args) {

        System.out.println("Pharthiwath Gristsoopharruth");
        System.out.println("===========================");

        Sayable s1 = (name1) -> {
            return "Hello, " + name1;
        };
        System.out.println(s1.say("Pharthiwath"));

        Sayable s2 = (name2) -> {
            return "Hello, " + name2;
        };
        System.out.println(s2.say("Win"));
    }
}