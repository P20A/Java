//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"parsa","ataei",400);
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(30));
        System.out.println(employee.toString());
    }
}