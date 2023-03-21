interface Sayable {
    String say(String message);
}

public class LambdaExpressionExample8 {
    public static void main(String[] args) {
        System.out.println("Pharthiwath Gristsoopharruth");
        System.out.println("===========================");
        
        Sayable person = (message) -> {
            String str1 = "I am going to study, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("traffic jam."));
    }
}