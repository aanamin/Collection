import java.util.LinkedList;
import java.util.Set;

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

        System.out.println(list.element());
        System.out.println(list.get(4));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.indexOf("C"));

        list.offer("Portugal");
        System.out.println(list);

        list.offerFirst("Brazil");
        System.out.println(list);

        list.offerLast("Spanyol");
        System.out.println(list);

        
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        list.poll();
        System.out.println(list);

        list.pollFirst();
        System.out.println(list);
        
        list.pollLast();
        System.out.println(list);

        list.pop();
        System.out.println(list);

        list.push("Brazil");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove("B");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.addFirst("Brazil");
        list.addFirst("Brazil");
        list.addLast("Brazil");
        System.out.println("LL sebelum :"+list);

        list.removeFirstOccurrence("Brazil");
        System.out.println(list);

        list.removeLastOccurrence("Brazil");
        System.out.println(list);

        list.set(2,"Belanda");
        System.out.println(list + "Dengan ukuran LinkedList ="+list.size());


        

        




        list.clear();
        System.out.println("isi linkedlist baru setelah diclear : "+list);

        
    }
}