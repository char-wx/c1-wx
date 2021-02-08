package task10;

public class Main {
    public static void main(String[] args) {
        Computer p = new Computer();

        p.add(new Mouse());
        p.add(new KeyBoard());
        p.add(new Microphone());
        p.powerOn();
        System.out.println("-----------------");
        p.powerOff();
    }
}
