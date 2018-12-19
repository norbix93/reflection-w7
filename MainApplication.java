import java.util.*;

public class MainApplication {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.transferMoney();

    }

    private static Employee toEmployee(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String name = columns.get(0);
        String account = columns.get(3).trim();
        return new Employee(name, account);
    }

    private static void getEmployee(FileReader reader) {
        List<String> lines = reader.asLines("employees.csv");
        List<Employee> participants = toEmployee(lines);
        for (Employee employee : participants) {
            employee.getName();
        }
    }

    private static List<Employee> toEmployee(List<String> lines) {
        List<Employee> employees = new ArrayList<>();
        for (String line : lines) {
            Employee employee = toEmployee(line);
            employees.add(employee);
        }
        return employees;
    }

}
