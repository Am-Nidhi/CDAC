import java.util.ArrayList;
import java.util.Collections;

public class SortArraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(3);

        System.out.println("Arraylist before sorting:");
        for (Integer ele : list) {
            System.out.print(ele+" ");
        }

        Collections.sort(list);

        System.out.println();
        System.out.println("Arraylist after sorting:");
        for (Integer ele : list) {
            System.out.print(ele+" ");
        }
    }
}
