import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("enter the number: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double n = Double.valueOf(str);
        double r = 1/n;
        System.out.print(r);
    }
}
