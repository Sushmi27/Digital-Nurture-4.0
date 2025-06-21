package Week1.DesignPatterns.DependencyPattern.Code;

public class CustomerService {
    private CustomerRepository customerRepo;

    public CustomerService(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    public void displayCustomer(int id) {
        Customer customer = customerRepo.findCustomerById(id);
        customer.display();
    }
}
