import java.util.Collections;
import java.util.ArrayList;
public class ReverseArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(3);
        Collections.sort(list);
        System.out.println("Arraylist before reverse:");
        for (Integer ele : list) {
            System.out.print(ele+" ");
        }

        System.out.println();

        Collections.reverse(list);
        System.out.println("Arraylist after reverse:");
        for (Integer ele : list) {
            System.out.print(ele+" ");
        }

    }
}
