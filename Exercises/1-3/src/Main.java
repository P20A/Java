import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("enter the radius of the circle: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int r = Integer.valueOf(str);
        double p = Math.PI * (r * 2);
        double a = Math.PI * (Math.pow(r,2));
        System.out.println("the perimeter of the circle is: "+ p);
        System.out.println("the area of the circle is: "+ a);


    }
}