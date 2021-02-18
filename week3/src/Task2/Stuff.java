package Task2;

/*

  1.创建一个stuff类，成员变量 Id、name、Salary、ManagerId，有参无参构造 定义一个打印输出方法
  2.定义一个泛型为类的List集合
  3.Main中创建四个对象，利用add将对象存储到List集合中
  4.遍历输出
  差：打印输出的方法中String不能用printf输出，输出排版就乱了
 */
public class Stuff {
    int Id;
    String Name;
    double Salary;
    Integer ManageId;

    public Stuff(int id, String name, double salary, Integer manageId) {
        Id = id;
        Name = name;
        Salary = salary;
        ManageId = manageId;
    }

    public Stuff() {
    }

    public void print() {
        System.out.printf("%d", Id);
        System.out.print("  " + Name + "  ");
        System.out.printf("%6.1f %6d", Salary, ManageId);
        System.out.printf("\n");

    }

}
