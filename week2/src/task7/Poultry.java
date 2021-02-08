package task7;

public abstract class Poultry {
    private String name, symptom, illness;
    private int age;

    //提供空参和带参构造方法
    public Poultry() {

    }

    public Poultry(String name, String symptom, String illness, int age) {
        this.name = name;
        this.symptom = symptom;
        this.illness = illness;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void showMessage() {
        System.out.println("动物种类：" + name + ",年龄:" + age + "岁");
    }

    //抽象方法症状(showSymptom)
    public abstract void showSymptom();

}