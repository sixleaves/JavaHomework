package day09.customer_info_system;

import static day09.customer_info_system.CMUtility.readInt;

public class CustomerView {


    private CustomerList customers = new CustomerList(10);

    public void enterMainMenu() {
        boolean loopFlag = true;
        do {

            int numTab = 4;
            System.out.print(
                    Constant.FILL_STRING + Constant.TITLE + Constant.FILL_STRING + "\n\n" +
                            Constant.getTab(numTab) + "1 " + Constant.ADD_CUSTOMER + "\n" +
                            Constant.getTab(numTab) + "2 " + Constant.MODIFY_CUSTOMER + "\n" +
                            Constant.getTab(numTab) + "3 " + Constant.DELETE_CUSTOMER + "\n" +
                            Constant.getTab(numTab) + "4 " + Constant.CUSTOMER_LIST + "\n" +
                            Constant.getTab(numTab) + "5 " + Constant.EXIT + "\n" +
                            Constant.PLEASE_INPUT
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

        System.out.println(Constant.FILL_STRING + Constant.ADD_CUSTOMER + Constant.FILL_STRING + "\n");
        System.out.print("姓名:");
        String name = CMUtility.readString(5);
        System.out.print("性别:");
        char gender = CMUtility.readChar();
        System.out.print("年龄:");
        int age = CMUtility.readInt();
        System.out.print("电话:");
        String phone = CMUtility.readString(11);
        System.out.print("邮箱:");
        String email = CMUtility.readString(30);

        Customer customer = new Customer(name, gender, age, phone, email);
        if (customers.addCustomer(customer)) {
            System.out.print(Constant.FILL_STRING + Constant.ADD_FINISHED + Constant.FILL_STRING);
        }else {
            System.out.print(Constant.FILL_STRING + Constant.ADD_FAILED + Constant.FILL_STRING);
        }
    }

    private void modifyCustomer() {
        System.out.println(Constant.FILL_STRING + Constant.MODIFY_CUSTOMER + Constant.FILL_STRING + "\n");

        System.out.print("请选择待修改客户编号(-1) 退出:");
        int customerID = CMUtility.readInt();

        if (customerID == -1) return;

        Customer customer = customers.getCustomer(customerID - 1);

        if (customer == null) {
            System.out.print(Constant.FILL_STRING + Constant.MODIFY_FAILED + Constant.FILL_STRING);
        }else {

            System.out.print(String.format("姓名(%s):", customer.getName()));
            String name = CMUtility.readString(5, "\n");

            if (!name.equals("\n")) customer.setName(name);

            System.out.print(String.format("性别(%c):", customer.getGender()));
            char gender = CMUtility.readChar('\n');
            if (gender != '\n') customer.setGender(gender);

            System.out.print(String.format("年龄(%d):", customer.getAge()));
            int age = CMUtility.readInt(-1);
            if (age != -1) customer.setAge(age);

            System.out.print(String.format("电话(%s):", customer.getPhone()));
            String phone = CMUtility.readString(11, "\n");
            if (!phone.equals("\n")) customer.setPhone(phone);

            System.out.print(String.format("邮箱(%s):", customer.getEmail()));
            String email = CMUtility.readString(30, "\n");
            if (!email.equals("\n")) customer.setEmail(email);
            System.out.print(Constant.FILL_STRING + Constant.MODIFY_FINISHED + Constant.FILL_STRING);
        }
    }

    private void deleteCustomer() {


        System.out.println(Constant.FILL_STRING + Constant.DELETE_CUSTOMER + Constant.FILL_STRING);
        System.out.print("请选择待删除客户编号(-1)退出:");
        int customerID = CMUtility.readInt();
        if (customerID == -1) return;

        if (customers.deleteCustomer(customerID - 1)) {
            System.out.println(Constant.FILL_STRING + Constant.DELETE_FINISHED + Constant.FILL_STRING);
        }else {
            System.out.println(Constant.FILL_STRING + Constant.DELETE_FAILED + Constant.FILL_STRING);
        }
    }

    private void listAllCustomers() {
        System.out.println(Constant.FILL_STRING + Constant.CUSTOMER_LIST + Constant.FILL_STRING);

        System.out.println(Constant.CUSTOMER_ID + "\t" + Constant.NAME + "\t" +
                Constant.GENDER + "\t" + Constant.AGE + "\t" + Constant.PHONE + "\t" + Constant.EMAIL);

        int numberOfCustomers = customers.getCurrentLength();
        for (int i = 0; i < numberOfCustomers; i++) {
            System.out.println(customers.getCustomer(i));
        }

        System.out.println(Constant.FILL_STRING + Constant.CUSTOMER_LIST_FINISHED + Constant.FILL_STRING);
    }

    public static void main(String[] args) {
        CustomerView view =new CustomerView();
        view.enterMainMenu();
    }



}
