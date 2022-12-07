import java.util.LinkedList;

public class Clone {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Imagine");
        ll.add("All");
        ll.add("The People");
        ll.add("Living Life in Peace");

        System.out.println("First LinkedList :" + ll);

        LinkedList ll2 = new LinkedList();
        ll2 = (LinkedList) ll.clone();

        System.out.println("Second LinkedList :" + ll2);
    
    }
}
