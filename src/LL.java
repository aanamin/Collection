import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("B");
        ll.add("C");
        System.out.println("Isi linkedlist ll :" + ll);

        ll.addFirst("A");
        ll.addLast("Z");
        ll.add(2, "Sisipkan");
        System.out.println(ll);

        LinkedList<String> list = new LinkedList<>();
        list.add("PP");
        System.out.println("isi linkedlist baru :" + list);

        list.addAll(ll);
        System.out.println("isi linkedlist baru setelah ditambah linkedlist lama :" + list);

    }
}