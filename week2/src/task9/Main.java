package task9;

public class Main {
    public static void main(String[] args) {
        Star star = new Star();
        Star sun = new Sun();

        star.shine();//调用父类中的shine方法
        System.out.println("===================");
        ((Sun) sun).doAnything();
        sun.shine();//调用子类中重写后的shine方法
    }
}