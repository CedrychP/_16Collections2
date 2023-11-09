import java.util.HashMap;
import java.util.Map;

public class MapBeispiel {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();

    map.put(1, "Eins");
    map.put(2, "Zwei");
    map.put(3, "Drei");
    map.put(1, "Eins_neu"); // Der Schlüssel 1 wird überschrieben

    System.out.println("KeySet:");
    System.out.println(map.keySet());

    System.out.println("\nValues:");
    System.out.println(map.values());

    System.out.println("\nEntrySet:");
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
  }
}