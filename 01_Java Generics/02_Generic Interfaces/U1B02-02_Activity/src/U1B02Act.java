/*
SOF_U1B2 - Pair Programming Lab (40 minutes)
Topic: Java Generics - Generic Interfaces

Names: ______________________  ______________________  (______________________)

Instructions:
- Complete each TODO.
- Run after each TODO chunk to test.
- NO bounds yet (no extends/super on type params).
- Keep solutions simple and readable.

Roles (switch halfway)

Driver: types, runs the code, shares keyboard
Navigator: reads instructions, catches mistakes, explains “why”

0–5 min: Assign roles, create file, run it once (expect TODO failures).
5–20 min: Complete Parts A–C + run tests after each part.
20 min: Switch Driver/Navigator.
20–35 min: Complete Parts D–E.
35–40 min: Clean up: confirm all tests run, add names, push to GitHub.

Each person will turn in a complete copy (make sure ALL work is present).

When finished turn this in on GitHub and Canvas.

This portion is worth 15 points.
*/

public class U1B02Act {

    public static void main(String[] args) {

        System.out.println("\n=== SOF_U1B2 PAIR LAB: GENERIC INTERFACES ===\n");

        // ============================================================
        // PART A (Warm-up): A generic interface with a default method
        // (Goal: implement Formatter<T> + a couple classes)
        // ============================================================

        // TODO A1: Make Formatter<T> interface:
        // - String format(T value);
        // - default void print(T value) { System.out.println(format(value)); }

        // TODO A2: Make IntHexFormatter implements Formatter<Integer>
        // - format(26) -> "0x1A"
        //   hint: Integer.toHexString(value).toUpperCase()

        // TODO A3: Make BracketFormatter<T> implements Formatter<T>
        // - format(x) -> "[" + x + "]"

        // --- Tests for Part A ---
        // TODO A4: Uncomment after finishing A1-A3
        /*
        Formatter<Integer> hex = new IntHexFormatter();
        hex.print(26); // expect 0x1A

        Formatter<String> bracket = new BracketFormatter<>();
        bracket.print("SOF"); // expect [SOF]
        */

        // ============================================================
        // PART B: A generic interface with 2 type parameters
        // (Goal: build a KeyValueStore<K, V>)
        // ============================================================

        // TODO B1: Create interface KeyValueStore<K, V> with methods:
        // - void put(K key, V value)
        // - V get(K key)
        // - boolean containsKey(K key)

        // TODO B2: Create class SimpleKeyValueStore<K, V> implements KeyValueStore<K, V>
        // Use TWO ArrayLists internally:
        // - ArrayList<K> keys
        // - ArrayList<V> values
        //
        // Rules:
        // - put(key, value): if key exists, replace its value; else add key+value.
        // - get(key): return matching value OR null if missing
        // - containsKey(key): true/false

        // --- Tests for Part B ---
        // TODO B3: Uncomment after finishing B1-B2
        /*
        KeyValueStore<String, Integer> scores = new SimpleKeyValueStore<>();
        scores.put("Ada", 100);
        scores.put("Linus", 95);
        System.out.println(scores.get("Ada"));    // expect 100
        System.out.println(scores.get("Nobody")); // expect null
        System.out.println(scores.containsKey("Linus")); // expect true

        scores.put("Ada", 101);
        System.out.println(scores.get("Ada")); // expect 101
        */

        // ============================================================
        // PART C: Generic interface as a parameter type
        // (Goal: write utility methods that accept your interfaces)
        // ============================================================

        // TODO C1: Write a static method printAll(values, formatter)
        // - values is ArrayList<T>
        // - formatter is Formatter<T>
        // - prints each value using formatter.print(...)
        //
        // Signature hint:
        // static <T> void printAll(ArrayList<T> values, Formatter<T> formatter)

        // TODO C2: Test it with strings and integers

        // TODO C3: Uncomment after finishing C1-C2
        /*
        ArrayList<String> words = new ArrayList<>();
        words.add("alpha");
        words.add("beta");
        words.add("gamma");

        Formatter<String> wordFmt = new BracketFormatter<>();
        printAll(words, wordFmt);
        // expect:
        // [alpha]
        // [beta]
        // [gamma]

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(26);
        nums.add(255);

        Formatter<Integer> hexFmt = new IntHexFormatter();
        printAll(nums, hexFmt);
        // expect:
        // 0xA
        // 0x1A
        // 0xFF
        */

        // ============================================================
        // (SWITCH ROLES HERE)
        // ============================================================

        // ============================================================
        // PART D: A generic interface + class implementation
        // (Goal: build a Repository<T> and InMemoryRepository<T>)
        // ============================================================

        // TODO D1: Create interface Repository<T> with methods:
        // - void add(T item)
        // - T get(int index)         (return null if out of range)
        // - int size()
        // - ArrayList<T> getAll()    (return the actual list OR a copy - your choice, but be consistent)

        // TODO D2: Create class InMemoryRepository<T> implements Repository<T>
        // Use: private final ArrayList<T> data = new ArrayList<>();

        // TODO D3: Test it using String and Integer repositories

        // TODO D4: Uncomment after finishing D1-D3
        /*
        Repository<String> notes = new InMemoryRepository<>();
        notes.add("interfaces");
        notes.add("generics");
        notes.add("coffee");

        System.out.println(notes.size());     // expect 3
        System.out.println(notes.get(0));     // expect interfaces
        System.out.println(notes.get(99));    // expect null

        Repository<Integer> levels = new InMemoryRepository<>();
        levels.add(1);
        levels.add(2);
        levels.add(3);

        System.out.println(levels.get(2));    // expect 3
        */

        // ============================================================
        // PART E (Mini-Challenge): Connect interfaces together
        // (Goal: a Transformer<IN, OUT> + applyAll method)
        // ============================================================

        // TODO E1: Create interface Transformer<IN, OUT>:
        // - OUT transform(IN input);

        // TODO E2: Create class StringLengthTransformer implements Transformer<String, Integer>
        // - "robot" -> 5

        // TODO E3: Create class AddPrefixTransformer implements Transformer<String, String>
        // - constructor takes prefix
        // - transform("x") -> prefix + "x"

        // TODO E4: Write a static method applyAll(inputs, transformer)
        // - inputs: ArrayList<IN>
        // - transformer: Transformer<IN, OUT>
        // - returns ArrayList<OUT> with transformed results
        //
        // Signature hint:
        // static <IN, OUT> ArrayList<OUT> applyAll(ArrayList<IN> inputs, Transformer<IN, OUT> transformer)

        // TODO E5: Test E4 with BOTH transformers

        // TODO E6: Uncomment after finishing E1-E5
        /*
        ArrayList<String> names = new ArrayList<>();
        names.add("Ada");
        names.add("Grace");
        names.add("Katherine");

        ArrayList<Integer> lengths = applyAll(names, new StringLengthTransformer());
        System.out.println(lengths); // expect [3, 5, 9]

        ArrayList<String> tagged = applyAll(names, new AddPrefixTransformer("VIP-"));
        System.out.println(tagged); // expect [VIP-Ada, VIP-Grace, VIP-Katherine]
        */

        System.out.println("\n=== DONE (when everything above is passing) ===\n");
    }

    // TODO C1: Put printAll(...) here

    // TODO E4: Put applyAll(...) here
}


// ============================================================
// TODO A1-A3: Put Formatter<T>, IntHexFormatter, BracketFormatter<T> here
// ============================================================


// ============================================================
// TODO B1-B2: Put KeyValueStore<K,V> and SimpleKeyValueStore<K,V> here
// ============================================================


// ============================================================
// TODO D1-D2: Put Repository<T> and InMemoryRepository<T> here
// ============================================================


// ============================================================
// TODO E1-E3: Put Transformer<IN,OUT> and transformer classes here
// ============================================================
