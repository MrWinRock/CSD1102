interface Addable {
    int add(int a, int b);
}

public class LambdaExpressionExample5 {
    public static void main(String[] args) {
        System.out.println("Java Lambda Expression: Multiple Parameters");
        System.out.println("Pharthiwath Gristsoopharruth");
        System.out.println("===========================");

        Addable addable1 = (a, b) -> (a + b);
        System.out.println(addable1.add(100, 200));

        Addable addable2 = (int a, int b) -> (a + b);
        System.out.println(addable2.add(1000, 2000));
    }
}
