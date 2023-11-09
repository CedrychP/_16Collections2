import java.util.ArrayList;

public class GenericsBeispiel {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);

    // Dies würde einen Kompilierungsfehler verursachen, da nur Integer-Objekte erlaubt sind.
    // list.add("Vier");

    System.out.println("Liste:");
    for (Integer value : list) {
      System.out.println(value);
    }
  }
}