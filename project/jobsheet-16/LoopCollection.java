import java.util.*;

public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");

        // For-each loop
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n" + fruits.toString());

        // Pop all elements (remove one by one from top)
        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }
        System.out.println();

        fruits.push("Melon");
        fruits.push("Durian");

        System.out.println("");

        // Iterator
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");

        // Stream
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
        System.out.println();

        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");

        Collections.sort(fruits);
        System.out.println(fruits);

    }
}
