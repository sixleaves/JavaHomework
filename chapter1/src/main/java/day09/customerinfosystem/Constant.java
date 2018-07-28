package day09.customerinfosystem;

public class Constant {

    public static final String FILL_STRING="-------------------";
    public static final String TITLE = "客户信息管理软件";
    public static final String ADD_CUSTOMER = "添加客户";
    public static final String MODIFY_CUSTOMER = "修改客户";
    public static final String DELETE_CUSTOMER = "删除客户";
    public static final String CUSTOMER_LIST = "客户列表";
    public static final String EXIT = "退\t出";
    public static final String PLEASE_SELECT_MENU_NUMBER = "请选择(1-5):";

    public static final String ADD_FINISHED = "添加完成";
    public static final String ADD_FAILED = "添加失败";

    public static final String MODIFY_FINISHED = "修改完成";
    public static final String MODIFY_FAILED = "修改失败";

    public static final String DELETE_FINISHED = "删除完成";
    public static final String DELETE_FAILED = "删除失败";

    public static final String CUSTOMER_LIST_FINISHED = "客户列表完成";


    public static final String NAME = "姓名";
    public static final String GENDER = "性别";
    public static final String AGE = "年龄";
    public static final String PHONE = "电话";
    public static final String EMAIL = "邮箱";
    public static final String CUSTOMER_ID = "编号";

    public static final String TAB = "\t";
    public static final String NEXT_LINE = "\n";

    public static final String PLEASE_SELECT_CUSTOMER_ID = "请选择待删除客户编号(-1)退出:";

    public static String getTab(int num) {
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(TAB);
        }
        return sb.toString();
    }


}
