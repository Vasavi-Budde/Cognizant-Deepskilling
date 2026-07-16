public class Main {
    public static void main(String[] args) {
        EmployeeManagement management =
                new EmployeeManagement(10);
        management.addEmployee(
                new Employee(
                        101,
                        "Ravi",
                        "Developer",
                        50000));
        management.addEmployee(
                new Employee(
                        102,
                        "Priya",
                        "Tester",
                        45000));
        management.addEmployee(
                new Employee(
                        103,
                        "Akash",
                        "Manager",
                        80000));
        System.out.println("\nAll Employees:");
        management.traverseEmployees();
        System.out.println("\nSearching Employee:");
        Employee employee =
                management.searchEmployee(102);
        System.out.println(employee);
        System.out.println("\nDeleting Employee:");
        management.deleteEmployee(102);
        System.out.println("\nUpdated Employees:");
        management.traverseEmployees();
    }
}