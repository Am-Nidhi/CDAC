import java.util.ArrayList;
import java.util.Collections;

public class SwapeleArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(3);
        Collections.sort(list);
        System.out.println("Arraylist before swapping:");
        for (Integer ele : list) {
            System.out.print(ele+" ");
        }

        System.out.println();

        Collections.swap(list, 1, 3);

        System.out.println("Arraylist after swapping:");
        for (Integer ele : list) {
            System.out.print(ele+" ");
        }
    }
}
