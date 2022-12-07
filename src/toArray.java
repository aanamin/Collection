import java.util.LinkedList;

public class toArray {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Kan");
        list.add("MEi");
        list.add("Opoi");
        list.add("Ayam");
        System.out.println("LinkedList: " + list);
        Object[] a = list.toArray();
        System.out.print("Hasil setelah dikonversi ke array ");
        for (Object element : a)
            System.out.print(element + " ");

    }

}