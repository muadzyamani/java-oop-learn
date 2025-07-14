public class Main {
  public static void main(String[] args) {
    Employee employee1 = new Employee("Zahid", 43, 60000.00, "Amman");
    Employee employee2 = new Employee("Basim", 37, 45000.00, "Doha");

    System.out.println("Employee One salary:" + employee1.salary);
    System.out.println("Employee Two salary:" + employee2.salary);
    System.out.println("Employee One salary raised!");
    employee1.raiseSalary(5000.00);
    System.out.println("Employee One salary:" + employee1.salary);
    System.out.println("Employee Two salary:" + employee2.salary);
  }
}
