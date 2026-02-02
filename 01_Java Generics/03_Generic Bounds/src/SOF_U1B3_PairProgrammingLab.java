/**
 * SOF_U1B3 Pair Programming Lab (40-ish minutes)
 * Topic: Bounds + Wildcards, and Build-Your-Own Set
 *
 * Names: ______________________  ______________________  (______________________)
 *
 * Instructions:
 * - Complete each TODO in the files:
 *     SimpleSet.java
 *     WildcardTools.java
 * - Run THIS file frequently.
 * - Keep changes small; test after each part.
 *
 * Roles (switch halfway)
 * Driver: types + runs
 * Navigator: reads TODOs, checks logic, catches mistakes, explains “why”
 *
 * Suggested pacing:
 * 0–3 min: Assign roles, open all files, run once (expect failures).
 * 3–15 min: Parts A–C (contains/add/remove).
 * 15 min: Switch roles.
 * 15–25 min: Part D (clear + ensureCapacity).
 * 25–40 min: Parts E–G (bounded methods + wildcards).
 *
 * Turn-in:
 * - Each person submits a complete copy (both names filled out).
 * - Push to GitHub + submit on Canvas.
 * - Worth: 15 points
 */
public class SOF_U1B3_PairProgrammingLab {

  public static void main(String[] args) {
    System.out.println("=== SOF_U1B3 Lab: Custom Set + Bounds/Wildcards ===");

    // ------------------------------------------------------------
    // Setup data
    // ------------------------------------------------------------
    Student a = new Student(101, "Ada");
    Student b = new Student(102, "Babbage");
    Student c = new Student(103, "Curie");
    Student a2 = new Student(101, "Ada Again (same id)");

    // ------------------------------------------------------------
    // PART A/B: contains + add (uniqueness)
    // ------------------------------------------------------------
    SimpleSet<Student> roster = new SimpleSet<>();

    expectTrue(roster.isEmpty(), "New set should be empty");
    expectEquals(0, roster.size(), "New set size should be 0");

    expectTrue(roster.add(a), "Add Ada should succeed");
    expectTrue(roster.add(b), "Add Babbage should succeed");
    expectTrue(roster.add(c), "Add Curie should succeed");

    // Duplicate by equals (same id) should NOT add
    expectFalse(roster.add(a2), "Adding duplicate id should fail");
    expectEquals(3, roster.size(), "Size should remain 3 after duplicate");

    expectTrue(roster.contains(a), "Set should contain Ada");
    expectTrue(roster.contains(a2), "Set should consider AdaAgain contained (same id)");
    expectFalse(roster.contains(new Student(999, "Nobody")), "Set should not contain unknown student");

    // ------------------------------------------------------------
    // PART C: remove
    // ------------------------------------------------------------
    expectTrue(roster.remove(b), "Remove Babbage should succeed");
    expectFalse(roster.contains(b), "After removal, should not contain Babbage");
    expectEquals(2, roster.size(), "Size should be 2 after one removal");

    // Removing again should fail
    expectFalse(roster.remove(b), "Removing missing element should fail");

    // ------------------------------------------------------------
    // PART D: clear + ensureCapacity
    // ------------------------------------------------------------
    roster.clear();
    expectTrue(roster.isEmpty(), "After clear, set should be empty");
    expectEquals(0, roster.size(), "After clear, size should be 0");

    // Force growth
    for (int i = 0; i < 50; i++) {
      roster.add(new Student(2000 + i, "S" + i));
    }
    expectEquals(50, roster.size(), "After adding 50 unique students, size should be 50");

    // ------------------------------------------------------------
    // PART E: bounded generic method <T extends HasId>
    // ------------------------------------------------------------
    Student s = WildcardTools.findById(roster, 2025);
    expectTrue(s != null && s.id() == 2025, "findById should locate id=2025");

    Student missing = WildcardTools.findById(roster, 9999);
    expectTrue(missing == null, "findById should return null when missing");

    // ------------------------------------------------------------
    // PART F: copyAll with wildcards (? extends / ? super)
    // ------------------------------------------------------------
    SimpleSet<Student> src = new SimpleSet<>();
    src.add(new Student(1, "One"));
    src.add(new Student(2, "Two"));

    SimpleSet<Object> dst = new SimpleSet<>();
    int added = WildcardTools.copyAll(src, dst);

    expectEquals(2, added, "copyAll should add 2 elements to dst");
    expectEquals(2, dst.size(), "dst size should be 2");

    // ------------------------------------------------------------
    // PART G: wildcard read: ? extends HasId
    // ------------------------------------------------------------
    int count = WildcardTools.countId(src, 2);
    expectEquals(1, count, "countId should find exactly one element with id=2");

    System.out.println("\n✅ All checks passed (if you implemented the TODOs correctly).");
  }

  // ------------------------------------------------------------
  // Minimal test helpers (no JUnit; keep it simple)
  // ------------------------------------------------------------

  private static void expectTrue(boolean condition, String message) {
    if (!condition) fail(message);
    System.out.println("PASS: " + message);
  }

  private static void expectFalse(boolean condition, String message) {
    if (condition) fail(message);
    System.out.println("PASS: " + message);
  }

  private static void expectEquals(int expected, int actual, String message) {
    if (expected != actual) {
      fail(message + " (expected " + expected + ", got " + actual + ")");
    }
    System.out.println("PASS: " + message);
  }

  private static void fail(String message) {
    System.out.println("\n❌ FAIL: " + message);
    throw new RuntimeException(message);
  }
}
