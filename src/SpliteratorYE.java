import java.util.LinkedList;
import java.util.*;

public class SpliteratorYE {
    public static void main(String[] args) {
        LinkedList<String> BestMovie = new LinkedList<String>();

        BestMovie.add("The Shawshank Redemption");
        BestMovie.add("The Godfather");
        BestMovie.add("The Godfather: Part II");
        BestMovie.add("The Dark Knight");

        Spliterator<String> name = BestMovie.spliterator();
        
        System.out.println("Best Movie List :");

        while (name.tryAdvance((n) -> System.out.println(n)));
    }
}
