//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyPoint point = new MyPoint(5,3);
        System.out.println(point.toString());
        MyPoint point2 = new MyPoint(3,6);
        System.out.println(point.distance(point2));
    }
}