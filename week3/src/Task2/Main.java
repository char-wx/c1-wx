package Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stuff stuff1 = new Stuff(1, "joe", 70000, 3);
        Stuff stuff2 = new Stuff(2, "Henry", 80000, 4);
        Stuff stuff3 = new Stuff(3, "Sam", 60000, null);
        Stuff stuff4 = new Stuff(4, "Max", 90000, null);

        List<Stuff> list = new ArrayList<>();
        list.add(stuff1);
        list.add(stuff2);
        list.add(stuff3);
        list.add(stuff4);

        System.out.println("Id  Name   Salary   ManageId");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).print();
        }
    }
}
