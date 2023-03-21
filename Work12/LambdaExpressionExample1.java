

interface Drawable {
     public void draw();
}

public class LambdaExpressionExample1 {
     public static void main(String[] args) {
          int width = 500;

          System.out.println("แบบไม่ใช้ Lambda Expression");
          System.out.println("Pharthiwath Gristsoopharruth");
          System.out.println("===========================");
     
          Drawable d1 = new Drawable() {
               public void draw() {
                    System.out.println("Drawing " + width);
               }
          };

          d1.draw();
     }
}