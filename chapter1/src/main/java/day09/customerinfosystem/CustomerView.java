package day09.customerinfosystem;

public class CustomerView {

    private CustomerList customers = new CustomerList(10);

    public void enterMainMenu() {
        boolean loopFlag = true;
        do {

            int numTab = 4;
            System.out.print(
                            Constant.FILL_STRING + Constant.TITLE + Constant.FILL_STRING + Constant.NEXT_LINE+Constant.NEXT_LINE +
                            Constant.getTab(numTab) + "1 " + Constant.ADD_CUSTOMER + Constant.NEXT_LINE +
                            Constant.getTab(numTab) + "2 " + Constant.MODIFY_CUSTOMER + Constant.NEXT_LINE +
                            Constant.getTab(numTab) + "3 " + Constant.DELETE_CUSTOMER + Constant.NEXT_LINE +
                            Constant.getTab(numTab) + "4 " + Constant.CUSTOMER_LIST + Constant.NEXT_LINE +
                            Constant.getTab(numTab) + "5 " + Constant.EXIT + Constant.NEXT_LINE +
                            Constant.PLEASE_SELECT_MENU_NUMBER
            );

            int selectID = CMUtility.readInt(5);

            switch (selectID) {
                case 1:
                    addNewCustomer();
                    break;
                case 2:
                    modifyCustomer();
                    break;
                case 3:
                    deleteCustomer();
                    break;
                case 4:
                    listAllCustomers();
                    break;
                case 5:
                    break;
            }

            if (5 == selectID) {
                System.out.print("是否退出 客户信息关系系统:(y/n)");
                char isExit = CMUtility.readChar();
                if (isExit == 'Y' || isExit =='y') loopFlag = false;
            }

        }while (loopFlag);

    }

    private void addNewCustomer() {

        printTilte(Constant.ADD_CUSTOMER);
        System.out.print(Constant.NAME+ ":");
        String name = CMUtility.readString(5);
        System.out.print(Constant.GENDER + ":");
        char gender = CMUtility.readChar();
        System.out.print(Constant.AGE + ":");
        int age = CMUtility.readInt();
        System.out.print(Constant.PHONE + ":");
        String phone = CMUtility.readString(11);
        System.out.print(Constant.EMAIL + ":");
        String email = CMUtility.readString(30);

        Customer customer = new Customer(name, gender, age, phone, email);
        if (customers.addCustomer(customer)) {
            printFooter(Constant.ADD_FINISHED);
        }else {
            printFooter(Constant.ADD_FAILED);
        }
    }

    private void modifyCustomer() {
        printTilte(Constant.MODIFY_CUSTOMER);
        System.out.print(Constant.PLEASE_SELECT_CUSTOMER_ID);
        int customerID = CMUtility.readInt();

        if (customerID == -1) return;

        Customer customer = customers.getCustomer(customerID - 1);

        if (customer == null) {
            printFooter(Constant.MODIFY_FAILED);
        }else {

            System.out.print(String.format(Constant.NAME + "(%s):", customer.getName()));
            String name = CMUtility.readString(5, Constant.NEXT_LINE);
            if (!name.equals(Constant.NEXT_LINE)) customer.setName(name);

            System.out.print(String.format( Constant.GENDER +"(%c):", customer.getGender()));
            char gender = CMUtility.readChar(Constant.NEXT_LINE.charAt(0));
            if (gender != Constant.NEXT_LINE.charAt(0)) customer.setGender(gender);

            System.out.print(String.format(Constant.AGE + "(%d):", customer.getAge()));
            int age = CMUtility.readInt(-1);
            if (age != -1) customer.setAge(age);

            System.out.print(String.format(Constant.PHONE + "(%s):", customer.getPhone()));
            String phone = CMUtility.readString(11, Constant.NEXT_LINE);
            if (!phone.equals(Constant.NEXT_LINE)) customer.setPhone(phone);

            System.out.print(String.format(Constant.EMAIL + "(%s):", customer.getEmail()));
            String email = CMUtility.readString(30, Constant.NEXT_LINE);
            if (!email.equals(Constant.NEXT_LINE)) customer.setEmail(email);

            printFooter(Constant.MODIFY_FINISHED);
        }
    }

    private void deleteCustomer() {

        printTilte(Constant.DELETE_CUSTOMER);
        System.out.print(Constant.PLEASE_SELECT_CUSTOMER_ID);
        int customerID = CMUtility.readInt();
        if (customerID == -1) return;

        if (customers.deleteCustomer(customerID - 1)) {
            printFooter(Constant.DELETE_FINISHED);
        }else {
            printFooter(Constant.DELETE_FAILED);
        }
    }

    private void listAllCustomers() {
        printTilte(Constant.CUSTOMER_LIST);
        System.out.println(Constant.CUSTOMER_ID + Constant.TAB + Constant.NAME + Constant.TAB +
                Constant.GENDER + Constant.TAB + Constant.AGE + Constant.TAB + Constant.PHONE + Constant.TAB + Constant.EMAIL);

        int numberOfCustomers = customers.getCurrentLength();
        for (int i = 0; i < numberOfCustomers; i++) {
            System.out.println(customers.getCustomer(i));
        }

        printFooter(Constant.CUSTOMER_LIST_FINISHED);
    }

    private void printTilte(String tile) {
        System.out.println(Constant.FILL_STRING + tile + Constant.FILL_STRING);
    }

    private void printFooter(String footer) {
        System.out.println(Constant.FILL_STRING + footer + Constant.FILL_STRING);
    }

    public static void main(String[] args) {
        CustomerView view =new CustomerView();
        view.enterMainMenu();
    }
}
