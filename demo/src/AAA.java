import java.util.HashMap;
import java.util.Map;

public class AAA {
    public static void main (String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);

        System.out.println(map.containsKey("a"));
        System.out.println(map.get("a"));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
    }
}