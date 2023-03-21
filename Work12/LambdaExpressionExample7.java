import java.util.*;

public class LambdaExpressionExample7 {
    public static void main(String[] args) {
        System.out.println("Java Lambda Expression: แบบใชก้บั Foreach Loop");
        System.out.println("Pharthiwath Gristsoopharruth");
        System.out.println("===========================");

        List<String> list = new ArrayList<String>();
        list.add("papaya");
        list.add("banana");
        list.add("orange");
        list.add("mango");

        list.forEach(
                (n) -> System.out.println(n));
    }
}