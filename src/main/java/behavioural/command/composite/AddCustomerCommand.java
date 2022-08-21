package behavioural.command.composite;

import behavioural.command.customer.CustomerService;
import behavioural.command.framework.Command;

public class AddCustomerCommand implements Command {
    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer(); // Delegating the actual work to this service
    }
}
