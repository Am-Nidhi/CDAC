import java.util.ArrayList;

public class AddArraylist {
    public static void main(String[] args) {
        ArrayList<String> colorlist = new ArrayList<>();

        colorlist.add("blue");
        colorlist.add("red");
        colorlist.add("white");
        colorlist.add("black");

        System.out.println("Color list: ");
        for (String color : colorlist) {
            System.out.println(color);
        }
    }
}
