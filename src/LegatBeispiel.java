import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import java.util.Stack;
import java.util.Dictionary;

public class LegatBeispiel {

  public static void main(String[] args) {
    Vector<Integer> vector = new Vector<>();
    vector.add(1);
    vector.add(2);

    Stack<String> stack = new Stack<>();
    stack.push("A");
    stack.push("B");

    Dictionary<String, Integer> dictionary = new Hashtable<>();
    dictionary.put("One", 1);
    dictionary.put("Two", 2);

    System.out.println("Vector:");
    for (Integer value : vector) {
      System.out.println(value);
    }

    System.out.println("\nStack:");
    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }

    System.out.println("\nDictionary:");
    Enumeration<String> keys = dictionary.keys();
    while (keys.hasMoreElements()) {
      String key = keys.nextElement();
      System.out.println(key + " -> " + dictionary.get(key));
    }
  }
}