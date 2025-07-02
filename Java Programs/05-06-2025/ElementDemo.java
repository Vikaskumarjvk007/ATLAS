import java.util.HashMap;
import java.util.Map;

public class ElementDemo {
    public static void main(String[] args) {
        for (Element e : Element.values()) {
            System.out.println("Symbol: " + e.name() +
                               ", Label: " + e.label +
                               ", Atomic Number: " + e.atomicNumber +
                               ", Atomic Weight: " + e.atomicWeight);
        }
    }
}