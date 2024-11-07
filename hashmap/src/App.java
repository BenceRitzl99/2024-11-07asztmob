import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        HashMap<String, String> szotar = new HashMap<>();
        szotar.put("alma", "apple");
        szotar.put("asztal",  "desk");
        szotar.put("kutya", "dog");

        System.out.println(szotar.containsKey("alma"));
        System.out.println(szotar.containsValue("desk"));
        // String a = szotar.remove("kutya");
        // System.out.println(a);
        System.out.println(szotar.containsKey("kutya"));
        System.out.println(szotar.containsValue("dog"));
        System.out.println(szotar.size());
        szotar.clear();
        System.out.println(szotar.size());

        
    }
}
