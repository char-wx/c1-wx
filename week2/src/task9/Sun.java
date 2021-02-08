package task9;

public class Sun extends Star implements Universe {
    //Star为父类，Sun为子类
    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }

    @Override
    public void shine() { //重写shine
        System.out.println("sun:光照八分钟，到达地球");
    }
}
