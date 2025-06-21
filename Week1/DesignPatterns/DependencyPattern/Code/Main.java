package Week1.DesignPatterns.DependencyPattern.Code;

public class Main {
    public static void main(String[] args) {

        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);

        service.displayCustomer(1);
        service.displayCustomer(2);
    }
}