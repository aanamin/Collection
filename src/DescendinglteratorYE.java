import java.util.*;

public class DescendinglteratorYE {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
  
            list.add("Amin");
            list.add("Fikri");
            list.add("Rahman");
  
            System.out.println("LinkedList:" + list);
  
            Iterator x = list.descendingIterator();
  
            while (x.hasNext()) {
                System.out.println("Value is : " + x.next());
    }
}
}
