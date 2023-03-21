interface Addable {
    int add(int a, int b);
}

public class LambdaExpressionExample6 {
    public static void main(String[] args) {
        System.out.println("Java Lambda Expression: แบบมีและไม่มี return");
        System.out.println("Pharthiwath Gristsoopharruth");
        System.out.println("===========================");

        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(100, 200));

        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(1000, 2000));
    }
}