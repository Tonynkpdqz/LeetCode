import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Test {

    public static void main(String[] args) {
        int a = 3;
        List<People> list = new ArrayList<>();
        People people = new People();
        people.age = 12;
        people.name = "nkp";
        list.add(people);
        People temp = people;
        temp.name = "nkpdqz";
        System.out.println(list.get(0).toString());
        /*People people = new People();
        people.age = 15;
        people.name = "nkp";
        System.out.println(people.toString());
        People p1 = people;
        System.out.println(p1.toString());
        People p2 = people;
        p2.name = "tony";
        System.out.println(p2.toString());
        System.out.println(p1.toString());*/
    }

}

class People implements Comparable{
    int age;
    String name;

    TreeMap<String,String> map = new TreeMap<>(new Comparator<Object>() {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    });

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
