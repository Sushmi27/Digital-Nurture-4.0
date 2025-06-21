package Week1.DesignPatterns.DependencyPattern.Code;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer findCustomerById(int id) {

        if (id == 1) {
            return new Customer(1, "Sushmitha");
        } else {
            return new Customer(id, "Unknown");
        }
    }
}
