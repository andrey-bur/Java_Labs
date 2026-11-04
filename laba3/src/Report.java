public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет по зарплатам");

        for (Employee emp : employees) {
            System.out.printf("%-15s |%10.2f%n", emp.getFullname(), emp.getSalary());
        }
    }
}