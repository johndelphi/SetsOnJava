import java.util.*;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        //HashSet
        Set<String> city= new LinkedHashSet<>();
        city.add("london");
        city.add("Nairobi");
        city.add("Dubaui");
        city.add("Arusha");
        System.out.println(city);
        //Treeset
        TreeSet<String> treeSetName = new TreeSet<>(city);
        System.out.println("Sorted treeset " + treeSetName);
        
    }
}
