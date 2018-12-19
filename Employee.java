public class Employee {

    String name;
    String account;

    public Employee(String name, String account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "name =" + name + "account = " + account;
    }
}
