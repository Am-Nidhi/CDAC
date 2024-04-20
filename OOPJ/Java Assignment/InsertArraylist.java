import java.util.ArrayList;

public class InsertArraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("1st element ");
        list.add("2nd element");
        list.add("3rd element");

        list.add(0, "4th element");

        System.out.println("list elements: ");
        for (String ele : list) {
            System.out.println(ele);
        }
    }
}
