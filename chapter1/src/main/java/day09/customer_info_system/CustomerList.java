package day09.customer_info_system;

public class CustomerList {

    public int getCurrentLength() {
        return currentIndex;
    }

    public CustomerList() {

    }

    public CustomerList(int totalCustomer) {
        this.total =totalCustomer;
        this.customers = new Customer[totalCustomer];
    }

    public void expandSpace(int size) {
        this.total = size;
        Customer[] temps = new Customer[size];
        for (int i = 0; i < customers.length; i++)
            temps[i] = customers[i];
        customers = temps;
    }

    public boolean addCustomer(Customer customer) {
        try {
            if (currentIndex > total - 1) {
                expandSpace(this.total * 2);
            }
            customer.setId(currentIndex + 1);
            customers[currentIndex++] = customer;
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean replaceCustomer(int index, Customer cust) {

        if (index < 0 || index > total - 1 || cust == null) {
            return false;
        }
        customers[index] = cust;
        return true;
    }


    public boolean deleteCustomer(int index) {

        if (index < 0 || index > total - 1) return false;

        for (int i = index; i < currentIndex; i++) {
            if (i == currentIndex - 1) { // 是最后一个.则
                customers[i] = null;
            }else {
                customers[i] = customers[i + 1];
                customers[i + 1].setId(customers[i + 1].getId() - 1);
            }
        }
        currentIndex--;
        return true;
    }

    public Customer[] getAllCustomers() {
        return customers;
    }

    public Customer getCustomer(int index) {
        Customer customer = null;
        try {
            customer =  customers[index];
        }catch (Exception e) {
            e.printStackTrace();
        }
        return customer;
    }





    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private Customer[] customers;
    private int total = 0;
    private int currentIndex = 0;


}
