import java.util.*;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Set<String> city= new HashSet<>();
        city.add("london");
        city.add("Nairobi");
        city.add("Dubaui");
        System.out.println(city);
        for(String s:city){
        System.out.println(s.toUpperCase()+"\n");
         System.out.println(s.toLowerCase()+"\n");

        }
    }
}
