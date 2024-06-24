import java.util.ArrayList;
import java.util.Collections;

public class Dinosaurs {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("hello world");
        a.add("kim is a good man");
        a.add("hi i am a good boy");
        Collections.sort(a);
        for (String s : a) {
            System.out.println(s);
        }
    }
}
