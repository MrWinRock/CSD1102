// does not use Lambda Expression

interface Drawable {
     public void draw();
}

public class LambdaExpressionExample2 {
     public static void main(String[] args) {
          int width = 500;

          System.out.println("แบบใช้ Lambda Expression");
          System.out.println("Pharthiwath Gristsoopharruth");
          System.out.println("===========================");
          
          Drawable d2 = () -> {
               System.out.println("Drawing " + width);
          };

          d2.draw();
     }
}