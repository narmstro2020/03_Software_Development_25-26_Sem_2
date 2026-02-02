/**
 * HasId
 * A tiny interface we control, used for bounded generics like <T extends HasId>.
 *
 * This avoids using generic JDK interfaces like Comparable<T>.
 */
public interface HasId {
  int id();
}
