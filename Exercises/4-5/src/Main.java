//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Time time = new Time(15,25,48);
        time.setTime(23,59,59);
        System.out.println(time.toString());
        time.nextSecond();
        System.out.println(time.toString());
        time.previousSecond();
        System.out.println(time.toString());

    }
}