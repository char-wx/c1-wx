package task7;

public class Duck extends Poultry {
    //提供空参和带参构造方法
    public Duck() {
    }

    public Duck(String name, String symptom, String illness, int age) {
        super(name, symptom, illness, age);
    }

    @Override//验证重写showSymptom 方法
    public void showSymptom() {  //重写
        System.out.println("入院原因：" + super.getIllness());
        System.out.println("症状：" + super.getSymptom());
    }
}