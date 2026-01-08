/*
Unit 01 - Java Generics - Block 01 - Introduction to Java Generics
Pair Programming Lab: Generics Boot Camp
Names: ______________________  ______________________  (______________________)

Instructions:
- Complete each TODO.
- Run after each TODO to test.
- NO casting. NO raw types. Avoid Object unless the prompt explicitly uses it.
- Use type parameters <T>, <A, B> whenever possible.

Roles (switch halfway)

Driver: types, runs the code, shares screen/keyboard
Navigator: reads instructions, watches for mistakes, explains “why”
(Optional 3rd) Coach: checks requirements, tests edge cases, keeps time

0–3 min: Assign roles, create file, run it once (expect imperfect output).
3–15 min: Complete Parts A–C + run tests after each TODO.
15 min: Switch Driver/Navigator.
15–25 min: Complete Parts D–E.
25–30 min: Clean up: confirm all tests run, add names, push to GitHub

Each person will turn in a complete copy. So make sure all of the work is present for both students.

When finished turn this in on Github and Canvas.

This portion is worth 15 points.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n=== PART A: Build a Generic Box<T> ===\n");

        // ------------------------------------------------------------
        // 1) Box<T>
        // Complete the generic class Box<T> below.
        //
        // Requirements:
        // - private field: T value
        // - constructors:
        //   - Box() sets value to null
        //   - Box(T value) stores the value
        // - methods:
        //   - void set(T value)
        //   - T get()
        //   - boolean isEmpty()  (true if value is null)
        // ------------------------------------------------------------

        Box<String> nameBox = new Box<>();
        nameBox.set("Ada");
        System.out.println("nameBox.get() should be Ada -> " + nameBox.get());

        Box<Integer> scoreBox = new Box<>(9001);
        System.out.println("scoreBox.get() should be 9001 -> " + scoreBox.get());

        Box<String> emptyBox = new Box<>();
        System.out.println("emptyBox.isEmpty() should be true -> " + emptyBox.isEmpty());
        System.out.println("nameBox.isEmpty() should be false -> " + nameBox.isEmpty());

        line();

        System.out.println("\n=== PART B: Generic Methods (No casting) ===\n");

        // ------------------------------------------------------------
        // 2) first(a, b)
        // Returns the FIRST parameter (a).
        //
        // Signature should be:
        // public static <T> T first(T a, T b)
        // ------------------------------------------------------------

        System.out.println("first(\"A\", \"B\") should be A -> " + first("A", "B"));
        System.out.println("first(10, 20) should be 10 -> " + first(10, 20));

        // ------------------------------------------------------------
        // 3) last(a, b)
        // Returns the SECOND parameter (b).
        //
        // Signature should be:
        // public static <T> T last(T a, T b)
        // ------------------------------------------------------------

        System.out.println("last(\"A\", \"B\") should be B -> " + last("A", "B"));
        System.out.println("last(10, 20) should be 20 -> " + last(10, 20));

        line();

        System.out.println("\n=== PART C: swap(T[] arr, i, j) ===\n");

        // ------------------------------------------------------------
        // 4) swap(arr, i, j)
        // Swaps two elements in ANY array type (String[], Integer[], etc.)
        //
        // Signature:
        // public static <T> void swap(T[] arr, int i, int j)
        //
        // Requirements:
        // - Must use a temp variable
        // - No casts
        // ------------------------------------------------------------

        String[] robots = {"Alpha", "Beta", "Gamma"};
        Integer[] nums = {1, 2, 3};

        System.out.println("Before robots: " + join(robots));
        swap(robots, 0, 2);
        System.out.println("After  robots: " + join(robots) + "  (should be [Gamma, Beta, Alpha])");

        System.out.println();

        System.out.println("Before nums:   " + join(nums));
        swap(nums, 0, 2);
        System.out.println("After  nums:   " + join(nums) + "  (should be [3, 2, 1])");

        line();

        System.out.println("\n=== PART D: Copy + Print (Type Safe) ===\n");

        // ------------------------------------------------------------
        // 5) copy(from, to)
        // Copies the value from one Box<T> into another Box<T>.
        //
        // Signature:
        // public static <T> void copy(Box<T> from, Box<T> to)
        //
        // Requirements:
        // - No casts
        // - No raw types
        // - Use from.get() and to.set(...)
        // ------------------------------------------------------------

        Box<String> source = new Box<>("Hello");
        Box<String> dest = new Box<>();
        copy(source, dest);
        System.out.println("dest.get() should be Hello -> " + dest.get());

        // ------------------------------------------------------------
        // 6) printAll(items)
        // Prints every element in an Iterable<T> on its own line.
        //
        // Signature:
        // public static <T> void printAll(Iterable<T> items)
        //
        // Requirement:
        // - Use an enhanced for-loop (for-each)
        // ------------------------------------------------------------

        List<String> names = List.of("Ada", "Grace", "Linus");
        System.out.println("\nprintAll(names) should print Ada, Grace, Linus on separate lines:");
        printAll(names);

        // Extra test with integers
        List<Integer> levels = List.of(1, 2, 3);
        System.out.println("\nprintAll(levels) should print 1, 2, 3 on separate lines:");
        printAll(levels);

        line();

        System.out.println("\n=== PART E: Final Team Challenge (Pair<A, B>) ===\n");

        // ------------------------------------------------------------
        // 7) Pair<A, B>
        // Complete the Pair class below.
        //
        // Requirements:
        // - private fields: A first; B second;
        // - constructor Pair(A first, B second)
        // - getters: getFirst(), getSecond()
        // - toString() returns "(first, second)"
        // ------------------------------------------------------------

        Pair<String, Integer> player = new Pair<>("Level", 3);
        System.out.println("player should print (Level, 3) -> " + player);

        // ------------------------------------------------------------
        // 8) swapPair(pair)
        // Returns a NEW Pair with the types swapped: Pair<B, A>
        //
        // Example:
        // Pair<String, Integer> -> Pair<Integer, String>
        //
        // Signature:
        // public static <A, B> Pair<B, A> swapPair(Pair<A, B> pair)
        // ------------------------------------------------------------

        Pair<Integer, String> swapped = swapPair(player);
        System.out.println("swapped should print (3, Level) -> " + swapped);

        // ------------------------------------------------------------
        // 9) buildList(a, b, c)
        // Returns an ArrayList<T> containing three items in order.
        //
        // Signature:
        // public static <T> ArrayList<T> buildList(T a, T b, T c)
        //
        // Requirements:
        // - Create an ArrayList<T>
        // - Add all three
        // - Return it
        // ------------------------------------------------------------

        ArrayList<String> words = buildList("one", "two", "three");
        System.out.println("words should be [one, two, three] -> " + words);

        ArrayList<Integer> points = buildList(5, 10, 15);
        System.out.println("points should be [5, 10, 15] -> " + points);

        line();

        System.out.println("\n=== EXIT TICKET (answer in comments at bottom) ===");
        System.out.println("1) What is the difference between a type parameter and a type argument?");
        System.out.println("2) Why is ObjectBox-style coding risky?");
        System.out.println("3) Name one thing generics help with besides convenience.");
    }

    // ============================
    // PART B: Generic methods
    // ============================
    public static <T> T first(T a, T b) {
        // TODO: return a
        return null;
    }

    public static <T> T last(T a, T b) {
        // TODO: return b
        return null;
    }

    // ============================
    // PART C: swap
    // ============================
    public static <T> void swap(T[] arr, int i, int j) {
        // TODO:
        // T temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
    }

    // ============================
    // PART D: copy + printAll
    // ============================
    public static <T> void copy(Box<T> from, Box<T> to) {
        // TODO: to.set(from.get());
    }

    public static <T> void printAll(Iterable<T> items) {
        // TODO: for (T item : items) { System.out.println(item); }
    }

    public static <A, B> Pair<B, A> swapPair(Pair<A, B> pair) {
        // TODO: return new Pair<>(pair.getSecond(), pair.getFirst());
        return null;
    }

    public static <T> ArrayList<T> buildList(T a, T b, T c) {
        // TODO: create list, add a/b/c, return list
        return null;
    }

    // ============================
    // Helpers (Do not edit)
    // ============================
    private static void line() {
        System.out.println("\n" + "-".repeat(60) + "\n");
    }

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
