/**
 * WildcardTools
 * Demonstrations of bounds + wildcards that DO NOT rely on Java Collections.
 *
 * Students: You will implement a few of these methods in the lab.
 */
public final class WildcardTools {

  private WildcardTools() { }

  /**
   * Finds an element by id in a set of things that have ids.
   *
   * TODO (Lab Part E):
   * - Implement using a loop from 0..set.size()-1 and set.getAt(i).
   * - Return the first matching item.
   * - If none, return null.
   */
  public static <T extends HasId> T findById(SimpleSet<T> set, int id) {
    // TODO
    return null;
  }

  /**
   * Copies all elements from src into dst.
   *
   * Key generic idea:
   * - src is a PRODUCER, so we use ? extends T
   * - dst is a CONSUMER, so we use ? super T
   *
   * TODO (Lab Part F):
   * - For each element in src, call dst.add(element).
   * - Return number of elements successfully added.
   */
  public static <T> int copyAll(SimpleSet<? extends T> src, SimpleSet<? super T> dst) {
    // TODO
    return 0;
  }

  /**
   * Counts how many elements in the set match the given id.
   * This method uses a wildcard:
   * - We don't care what the exact HasId subtype is, just that it has id().
   *
   * TODO (Lab Part G):
   * - Implement using ? extends HasId
   */
  public static int countId(SimpleSet<? extends HasId> set, int id) {
    // TODO
    return 0;
  }
}
