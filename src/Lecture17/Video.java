package Lecture17;

import java.util.ArrayList;
import java.util.List;

public class Video {
    private List<Customer> _customers;
    private boolean success;
    public Video() {
        _customers = new ArrayList<Customer>();
    }
    boolean getOnRent(Customer customer) {
        success = false;
        _customers.add(customer);
        success = true;
        return success;
    }
    public List<Customer> getCustomers(){
        return _customers;
    }
}

