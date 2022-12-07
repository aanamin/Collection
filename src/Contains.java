import java.util.LinkedList;

public class Contains {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Imagine");
        ll.add("All");
        ll.add("The People");
        ll.add("Living Life in Peace");

        System.out.println("First LinkedList :" + ll);

        System.out.println("\nDoes the List contains 'War'" + ll.contains("Hello"));
        System.out.println("Does the List contains 'All'" + ll.contains("All"));
        System.out.println("Does the List contains 'Peace'" + ll.contains("Peace"));

    }
}
