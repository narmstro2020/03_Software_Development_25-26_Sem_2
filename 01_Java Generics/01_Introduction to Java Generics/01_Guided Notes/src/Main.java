/*
Unit 01 - Java Generics - Block 01 - Introduction to Java Generics
Guided Notes
Students: fill in the blanks by writing answers in COMMENTS and completing the TODO code.
Run this file often to see what happens.

When finished turn this in via Github and Canvas.

This portion is worth 5 points.
*/

public class Main {

    // ============================================================
    // 0–3 min — Warm-Up: “Code déjà vu”
    // Notice the repeated parts. What’s annoying about this?
    // Generics help because they let us:
    // ✅ ________________________________________________
    // ✅ ________________________________________________
    // ============================================================

    public static void main(String[] args) {
        System.out.println("=== WARM-UP: Repeated Code ===\n");

        IntBox livesInTheIntWorld = new IntBox(42);
        StringBox livesInTheStringWorld = new StringBox("hello");

        System.out.println("IntBox value = " + livesInTheIntWorld.get());
        System.out.println("StringBox value = " + livesInTheStringWorld.get());

        line();

        // ============================================================
        // 3–7 min — What are Java Generics?
        // Generics let us write code that works with ____________________
        // while still being ____________________ (safer than Object).
        //
        // Big goal:
        // - Reduce ____________________ code (duplicate classes/methods)
        // - Catch type problems at ____________________ time
        // ============================================================

        System.out.println("=== PART A: The problem before generics (Object + casting) ===\n");

        ObjectBox ob = new ObjectBox();
        ob.set(123); // autoboxing: int -> Integer (object)
        Integer good = (Integer) ob.get(); // cast required
        System.out.println("ObjectBox holds Integer: " + good);

        ob.set("not an integer");

        // Predict BEFORE running:
        // What happens when we cast a String to Integer?
        // _________________________________________________

        try {
            Integer bad = (Integer) ob.get(); // runtime crash (ClassCastException)
            System.out.println("bad = " + bad); // probably never runs
        } catch (ClassCastException e) {
            System.out.println("Crash avoided: " + e.getClass().getSimpleName());
            System.out.println("Why? Because ObjectBox allows ANY type, so we only find out at runtime.");
        }

        line();

        // ============================================================
        // 7–12 min — Generics vocabulary
        //
        // - Generic = code that works with _____________________________
        // - Type Parameter = the letter name inside <> like ____________
        // - Type Argument = the real type you plug in like _____________
        // - Diamond operator = ____________________ (Java can infer)
        // - Compile-time type safety = errors caught before ____________
        //
        // IMPORTANT:
        // Generics are mostly a ____________________ feature (not runtime).
        // (Java uses "type erasure" — more later.)
        // ============================================================

        System.out.println("=== PART B: A generic Box<T> (no more casting) ===\n");

        Box<String> nameBox = new Box<>();
        nameBox.set("Ada");
        String name = nameBox.get(); // no cast!
        System.out.println("nameBox holds: " + name);

        Box<Integer> scoreBox = new Box<>(9001);
        Integer score = scoreBox.get(); // no cast!
        System.out.println("scoreBox holds: " + score);

        // Quick check:
        // Why can't we do Box<int> ?
        // _________________________________________________

        line();

        // ============================================================
        // 12–18 min — Anatomy of a generic class (the “shape”)
        //
        // Template:
        // class ClassName<T> {
        //     private T value;
        //     public void set(T v) { ... }
        //     public T get() { ... }
        // }
        //
        // Label the parts in Box<T> below:
        // - class name: ____________________________
        // - type parameter: ________________________
        // - field type: ____________________________
        // - get() return type: _____________________
        // ============================================================

        System.out.println("=== PART C: Box<T> basics ===\n");
        System.out.println("scoreBox is empty? " + scoreBox.isEmpty());
        Box<String> empty = new Box<>();
        System.out.println("empty is empty? " + empty.isEmpty());

        line();

        // ============================================================
        // 18–22 min — print vs return (still matters in Java)
        //
        // `System.out.println(...)` shows something to the _____________.
        // `return` sends a value back to the __________________________.
        //
        // Predict BEFORE running:
        // What prints to the screen?
        // 1) _______________________________________
        // 2) _______________________________________
        //
        // What is result equal to? ________________________________
        // ============================================================

        System.out.println("=== PART D: print vs return ===\n");

        printDouble(5);
        int result = returnDouble(5);
        System.out.println("result = " + result);

        line();

        // ============================================================
        // 22–28 min — Generic methods (not just generic classes)
        //
        // A generic method has its own <T> BEFORE the return type:
        // public static <T> T first(T a, T b) { ... }
        //
        // Fill in:
        // - The <T> in a method means: ________________________________
        // - first("A", "B") returns type: _____________________________
        // - first(10, 20) returns type: _______________________________
        //
        // TODO: Implement first(a, b) to return the FIRST value.
        // ============================================================

        System.out.println("=== PART E: Generic method TODOs ===\n");

        try {
            System.out.println("first(\"A\", \"B\") = " + first("A", "B"));
        } catch (UnsupportedOperationException e) {
            System.out.println("TODO first(\"A\", \"B\"): " + e.getMessage());
        }

        try {
            System.out.println("first(10, 20) = " + first(10, 20));
        } catch (UnsupportedOperationException e) {
            System.out.println("TODO first(10, 20): " + e.getMessage());
        }

        line();

        // ============================================================
        // 28–35 min — Another useful generic method: swap
        //
        // TODO: Implement swap for ANY array type:
        // public static <T> void swap(T[] arr, int i, int j)
        //
        // Test it with a String[] and an Integer[].
        // ============================================================

        System.out.println("=== PART F: swap TODO ===\n");

        String[] robots = {"Alpha", "Beta", "Gamma"};
        Integer[] nums = {1, 2, 3};

        System.out.println("Before robots: " + join(robots));
        System.out.println("Before nums:   " + join(nums));

        try {
            swap(robots, 0, 2);
            swap(nums, 0, 2);
            System.out.println("After robots:  " + join(robots));
            System.out.println("After nums:    " + join(nums));
        } catch (UnsupportedOperationException e) {
            System.out.println("TODO swap(...): " + e.getMessage());
        }

        line();

        // ============================================================
        // 35–40 min — Limits (tiny preview)
        //
        // You CAN do: Box<String>, Box<Integer>, Box<Double>, Box<MyClass>
        // You CAN'T do: Box<int> because generics require _____________.
        //
        // Type erasure preview:
        // At runtime, Box<String> and Box<Integer> are basically both Box
        // (the T information is mostly gone at runtime).
        //
        // Write one sentence: Why are generics still worth it?
        // _____________________________________________________________
        // ============================================================

        System.out.println("=== EXIT TICKET (in comments) ===");
        System.out.println("1) Define type parameter vs type argument.");
        System.out.println("2) Why is ObjectBox dangerous?");
        System.out.println("3) What does <T> do for safety?");
    }

    // ------------------------------------------------------------
    // Helper: separator line
    private static void line() {
        System.out.println("\n" + "-".repeat(60) + "\n");
    }

    // ------------------------------------------------------------
    // PART D: print vs return
    static void printDouble(int x) {
        System.out.println("printDouble: " + (x * 2));
    }

    static int returnDouble(int x) {
        return x * 2;
    }

    // ------------------------------------------------------------
    // PART E: Generic method TODO
    public static <T> T first(T a, T b) {
        // TODO: Return the FIRST parameter (a)
        throw new UnsupportedOperationException("Implement: return a;");
    }

    // ------------------------------------------------------------
    // PART F: swap TODO
    public static <T> void swap(T[] arr, int i, int j) {
        // TODO:
        // 1) store arr[i] in a temp variable
        // 2) put arr[j] into arr[i]
        // 3) put temp into arr[j]
        throw new UnsupportedOperationException("Implement swap(T[] arr, int i, int j)");
    }

    // ------------------------------------------------------------
    // Helper: join any array into a string (so we can print easily)
    public static <T> String join(T[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int k = 0; k < arr.length; k++) {
            sb.append(arr[k]);
            if (k < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
