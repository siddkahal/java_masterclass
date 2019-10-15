public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 150.05);
        bank.addCustomer("Adelaide", "Percy", 650.05);

        bank.addBranch("New York");
        bank.addCustomer("New York", "Jon", 100.09);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Mike", 144.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 84.22);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("New York", false);

        if (!bank.addCustomer("San Jose", "Sidd", 300)) {
            System.out.println("Error this branch does not exist");
        }

        if (!bank.addCustomerTransaction("Adelaide", "John", 52.33)) {
            System.out.println("Error customer does not exist!");
        }
    }
}
