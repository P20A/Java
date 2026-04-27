//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(Color.black,6);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        Circle circle2 = new Circle(Color.red, 2);
        circle.addCircle(circle2);
        circle.printer();
        System.out.println(circle.toString());

    }

}