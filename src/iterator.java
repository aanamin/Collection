import java.util.*;

public class iterator {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
       
        names.add("Welcome");
        names.add("To");
        names.add("Gfg");
 
        // Getting ListIterator
        ListIterator<String> namesIterator
            = names.listIterator();
 
        // Traversing elements using next() method
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }
 
        // for-each loop creates Internal Iterator here.
        for (String s : names) {
            System.out.println(s);
        }
    }
}
