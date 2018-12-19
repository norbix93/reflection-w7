
import java.util.*;

public class Bank {

    private static Salary toSalary(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String amount = columns.get(2);
        return new Salary(Integer.valueOf(amount));
    }

    private static void getSalary(FileReader reader) {
        List<String> lines = reader.asLines("employees.csv");
        List<Salary> salaries = toSalary(lines);
        for (Salary salary : salaries) {
            salary.getAmount();
        }
    }

    private static List<Salary> toSalary(List<String> lines) {
        List<Salary> salaries = new ArrayList<>();
        for (String line : lines) {
            Salary salary = toSalary(line);
            salaries.add(salary);
        }
        return salaries;
    }

    private static List<Account> toAccount(List<String> lines){
        List<Account> accounts = new ArrayList<>();
        for (String line:lines) {
            Account account = toAccount(line);
            accounts.add(account);
        }
        return accounts;
    }
    private static Account toAccount(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String amount = columns.get(3).trim();
        return new Account(amount);
        }

    public void transferMoney(Salary salary, Account account){
        System.out.println("Transfer successful: "+ salary+" to account "+ account);
    }

}