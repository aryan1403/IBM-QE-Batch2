import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class arrex {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(111);
        num.add(28);
        num.add(30);
        num.add(49);

        // num.remove(0);
        // System.out.println(num); // 1
        for (int i = 0; i < num.size(); i++) {
            // System.out.println(num.get(i)); 2
        }
        for (int i : num) {
            // System.out.println(i); // 3
        }
        int i = 0;
        while (i < num.size()) {
            // System.out.println(num.get(i));
            i++; // 4
        }
        Iterator<Integer> it = num.iterator();
        // while (it.hasNext()) {
        //     // System.out.println(it.next()); 5
        // }

        // num.forEach(e -> System.out.println(e));
        // num.forEach(System.out::println);

        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("apple");

        set.forEach(System.out::println);

        Stack<String> stack = new Stack<>();
        stack.push("first"); // 1
        stack.push("second"); // 2
        stack.push("third"); // 3

        System.out.println(stack.pop());

        Queue<String> q = new ArrayDeque<>();
        q.add("first"); // 1
        q.add("second"); // 2
        q.add("third"); // 3

        System.out.println(q.poll());

        Map<String, Integer> map = new HashMap<>();
        map.put("Aaryan", 100);
        map.put("Arush", 90);
        map.put("Kirti", 80);

        System.out.println(map.get("Aaryan"));
        map.remove("Arush");
        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);
        map.forEach((k, v) -> System.out.println(k + ": " + v));

    }
}
