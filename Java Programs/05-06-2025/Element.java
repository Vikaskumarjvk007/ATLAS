import java.util.HashMap;
import java.util.Map;

public enum Element {

    H("Hydrogen", 1, 1.008f),
    HE("Helium", 2, 4.0026f),
    NE("Neon", 10, 20.180f);

    private static final Map<String, Element> BY_LABEL = new HashMap<>();
    private static final Map<Integer, Element> BY_ATOMIC_NUMBER = new HashMap<>();
    private static final Map<Float, Element> BY_ATOMIC_WEIGHT = new HashMap<>();

    static {
        for (Element e : values()) {
            BY_LABEL.put(e.label, e);
            BY_ATOMIC_NUMBER.put(e.atomicNumber, e);
            BY_ATOMIC_WEIGHT.put(e.atomicWeight, e);
        }
    }

    private String label;
    private int atomicNumber;
    private float atomicWeight;

    private Element(String label, int atomicNumber, float atomicWeight) {
        this.label = label;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public static Element valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }

    public static Element valueOfAtomicNumber(int number) {
        return BY_ATOMIC_NUMBER.get(number);
    }

    public static Element valueOfAtomicWeight(float weight) {
        return BY_ATOMIC_WEIGHT.get(weight);
    }

    public static void main(String[] args) {
        Element e1 = Element.valueOfLabel("Hydrogen");
        System.out.println("By Label (Hydrogen): " + e1 + " → " + e1.atomicNumber + ", " + e1.atomicWeight);

        Element e2 = Element.valueOfAtomicNumber(2);
        System.out.println("By Atomic Number (2): " + e2 + " → " + e2.label + ", " + e2.atomicWeight);

        Element e3 = Element.valueOfAtomicWeight(20.180f);
        System.out.println("By Atomic Weight (20.180): " + e3 + " → " + e3.label + ", " + e3.atomicNumber);
    }
}
