package Ex4;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement(5);

        Employee emp1 = new Employee("E101", "Rakshita", "HR", 90000);
        Employee emp2 = new Employee("E102", "Saranya", "Manager", 65000);
        Employee emp3 = new Employee("E103", "Prada", "SoftwareDeveloper", 60500);

        em.addEmployee(emp1);
        em.addEmployee(emp2);
        em.addEmployee(emp3);

        em.traverseEmployees();

        Employee e = em.searchEmployee("E102");
        System.out.println("Found: " + e);

        em.deleteEmployee("E102");

        em.traverseEmployees();
    }
}
