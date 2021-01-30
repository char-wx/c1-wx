package Week1Task6;
public class Account {
    String name;
    double balance;

    //构造法开户
    public Account(String na, double ba) {  //全参构造
        name = na;
        balance = ba;
        System.out.println("开户成功，您的账户名是" + name + "余额为" + balance + "圆。");
    }
    public Account(){}  //无参构造

    //查询余额
    public void balanceEnquiry() {
        System.out.println("您的余额为" + balance + "元。");
    }
}
