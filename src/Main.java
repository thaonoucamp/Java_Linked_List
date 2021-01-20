import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(1);

        List<Person> list = new LinkedList<Person>();

        list.add(person);

        for (Person p : list) {
            System.out.println(p.getId());
        }
        list.remove(0);
    }
}
// truy xuat giong nhu List_Array;
// dung khi can them, sua, xoa nhieu;

// khac Array_list dung quan ly va truy xuat tot hon;