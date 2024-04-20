import java.util.ArrayList;
import java.util.Scanner;
public class RetrieveArraylist {
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Give an index number: ");
        int index = sc.nextInt();
        sc.close();
        if(index>=0 && index<colorlist.size()){
            String color= colorlist.get(index);
            System.out.println(index+" : "+color);
        }
    }
}
