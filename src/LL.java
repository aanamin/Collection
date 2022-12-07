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
        System.out.println("-----------------------------------------------------------------");

        System.out.println("Hasil method element() : " + list.element());
        System.out.println("Hasil linkedlist setelah dipakai method element() : " + list);
        // hasilnya tidak akan ada perubahan dari linkedlist sebelumnya
        System.out.println("---------------------------------------------------------------");

        // jenis jenis method get
        System.out.println("Hasil dari method get(int index) : " + list.get(4));
        System.out.println("Hasil dari method getFirst() : " + list.getFirst());
        System.out.println("Hasil dari method getFirst() : " + list.getLast());

        // method indexof
        System.out.println("Hasil dari method indexof : " + list.indexOf("C"));
        System.out.println("---------------------------------------------------");

        // method offer
        System.out.println("Linkedlist sebelum dioffer : " + list);
        list.offer("Portugal");
        System.out.println("Hasil method offer : " + list);
        list.offerFirst("Brazil");
        System.out.println("hasil method offerFirst : " + list);
        list.offerLast("Spanyol");
        System.out.println("Hasil method offerLast : " + list);
        System.out.println("-----------------------------------------");

        // method peek
        System.out.println("Hasil dari method peek() : " + list.peek());
        System.out.println("Hasil dari method peekFirst() : " + list.peekFirst());
        System.out.println("Hasil dari method peekLast() : " + list.peekLast());
        System.out.println("----------------------------------------------------------");

        // method poll
        list.poll();
        System.out.println("Linkedlist setelah di poll : " + list);

        list.pollFirst();
        System.out.println("Linkedlist setelah di pollFirst : " + list);

        list.pollLast();
        System.out.println("Linkedlist setelah di pollLast : " + list);

        // method pop
        list.pop();
        System.out.println("Linkedlist setelah di pop : " + list);

        // method push
        list.push("Brazil");
        System.out.println("Linkedlist setelah di push : " + list);
        System.out.println("----------------------------------------");
        
        list.remove(1);
        System.out.println("Linkedlist setelah di remove(index) : " + list);
        
        list.remove("B");
        System.out.println("Linkedlist setelah di remove(object) : " + list);
        
        list.removeFirst();
        System.out.println("Linkedlist setelah di removeFirst() : " + list);
        
        list.removeLast();
        System.out.println("Linkedlist setelah di removeLast() : " + list);
        System.out.println("-----------------------------------------------");
        
        //method remove occurrence
        list.addFirst("Brazil");
        list.addFirst("Brazil");
        list.addLast("Brazil");
        System.out.println("LL sebelum :" + list);
        

        list.removeFirstOccurrence("Brazil");
        System.out.println("Hasil dari removeFirstOccurrence : " + list);
        
        list.removeLastOccurrence("Brazil");
        System.out.println("Hasil dari removeLastOccurrence : " + list);
        System.out.println("----------------------------------------");
        
        //method set
        list.set(2, "Belanda");
        System.out.println("Hasil dari method set : " +list + "Dengan ukuran LinkedList =" + list.size());
        System.out.println("----------------------------------------");
        
        //method isEmpty 
        System.out.println("Mengecek apakah linkedlist saat ini kosong? : " + list.isEmpty());
        System.out.println("--------------------------------------------------");
        
        //method clear
        list.clear();
        System.out.println("isi linkedlist baru setelah diclear : " + list);

    }
}