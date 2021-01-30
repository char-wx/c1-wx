package Week1Task7;

public class CompoundNumber {
    int a1;
    int b1;
    int a2;
    int b2;
     //
    public CompoundNumber(int a1,int b1,int a2,int b2){
       this.a1 = a1;
       this.b1 = b1;
       this.a2 = a2;
       this.b2 = b2;
    }

    public void add(){
      int A = a1 + a2;
      int B = b1 + b2;
      System.out.println("这两个复数相加为"+A+"+"+B+"i。");
    }

    public void reduce(){
        int A = a1 - a2;
        int B = b1 - b2;
        System.out.println("这两个复数相减为"+A+"+"+B+"i。");
    }

    public void multiply(){
        int A = a1 * a2 - b1 * b2;
        int B = a1 * b2 + a2 * b1;
        System.out.println("这两个复数相乘为" + A + "+" + B + "i。");
    }
}
