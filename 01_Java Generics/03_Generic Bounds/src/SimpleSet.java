/**
 * SimpleSet<E>
 * A tiny Set-like structure implemented WITHOUT Java Collections.
 *
 * Rules for this file:
 * - No java.util collections.
 * - Avoid generic-based APIs from the JDK.
 *
 * What "set" means here:
 * - No duplicates (based on equals()).
 * - Order is not guaranteed.
 *
 * TODOs in this file are part of the lab.
 */
public class SimpleSet<E> {

  private Object[] elements;
  private int size;

  public SimpleSet() {
    // Start small; we will grow as needed.
    this.elements = new Object[8];
    this.size = 0;
  }

  /**
   * @return number of unique elements in the set
   */
  public int size() {
    return size;
  }

  /**
   * @return true if this set contains no elements
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Checks if this set contains value (using equals).
   *
   * TODO (Lab Part A):
   * - Implement contains using equals() safely with nulls.
   */
  public boolean contains(E value) {
    // TODO: handle null safely
    // Hint: if both are null -> equal
    // Hint: if one is null -> not equal
    // Hint: otherwise use a.equals(b)
    return false;
  }

  /**
   * Adds value if it does not already exist.
   *
   * TODO (Lab Part B):
   * - If contains(value) is true, return false (no change).
   * - Otherwise ensure capacity, store value, increment size, return true.
   */
  public boolean add(E value) {
    // TODO
    return false;
  }

  /**
   * Removes value if present.
   *
   * TODO (Lab Part C):
   * - Find the index of value (use same equality logic as contains).
   * - If not found, return false.
   * - If found, replace it with last element, null out last slot, size--, return true.
   *
   * Why "swap with last"?
   * - O(1) remove after find
   * - We don’t care about preserving order
   */
  public boolean remove(E value) {
    // TODO
    return false;
  }

  /**
   * Clears the set.
   *
   * TODO (Lab Part D):
   * - Null out used slots (0..size-1), then set size=0.
   */
  public void clear() {
    // TODO
  }

  /**
   * Ensures internal array has enough room for one more element.
   *
   * TODO (Lab Helper):
   * - If size < elements.length, do nothing.
   * - Otherwise grow (double).
   * - Use System.arraycopy (allowed).
   */
  private void ensureCapacity() {
    // TODO
  }

  /**
   * String representation for debugging.
   * Keep it simple; do not use Arrays.toString (java.util).
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    for (int i = 0; i < size; i++) {
      if (i > 0) sb.append(", ");
      Object v = elements[i];
      sb.append(v);
    }
    sb.append("}");
    return sb.toString();
  }
}
