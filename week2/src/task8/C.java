package task8;

public class C extends B {
    private int numC = 30;

    @Override
    public void showA() {
        System.out.println("A类中numA:" + super.getNumA());
    }

    @Override
    public void showB() {
        System.out.println("B类中numB:" + super.getNumB());
    }

    public void showC() {
        System.out.println("C类中numC:" + this.numC);
    }

}
