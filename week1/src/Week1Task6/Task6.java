package Week1Task6;
import java.util.Scanner;
public class Task6 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double balance = -1;
        String name = null;
        do {
            System.out.println("请输入账户名称：");
            name = in.nextLine();
            System.out.println("请输入账户余额：");
            balance = in.nextDouble();
        }while(name == null && balance < 0);
        Account ac = new Account(name,balance);

    }

}

