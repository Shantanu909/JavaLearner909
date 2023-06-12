import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionFramework {
    public static void main(String[] args) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Apple");
        stringCollection.add("Banana");
        stringCollection.add("Cherry");
        System.out.println("Elements in the collection: " + stringCollection);
        String searchElement = "Banana";
        if (stringCollection.contains(searchElement)) {
            System.out.println("The collection contains: " + searchElement);
        } else {
            System.out.println("The collection does not contain: " + searchElement);
        }
        String removeElement = "Cherry";
        boolean removed = stringCollection.remove(removeElement);
        if (removed) {
            System.out.println("Removed: " + removeElement);
        } else {
            System.out.println("Failed to remove: " + removeElement);
        }
        Iterator<String> iterator = stringCollection.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
        }

        int size = stringCollection.size();
        System.out.println("Size of the collection: " + size);

        stringCollection.clear();
        System.out.println("Cleared the collection");

        boolean isEmpty = stringCollection.isEmpty();
        System.out.println("Is the collection empty? " + isEmpty);
    }
}
