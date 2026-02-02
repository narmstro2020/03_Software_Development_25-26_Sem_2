/**
 * Student
 * A sample domain class that implements HasId.
 *
 * We use this for bounded generic methods: <T extends HasId>.
 */
public class Student implements HasId {

  private final int id;
  private final String name;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public int id() {
    return id;
  }

  public String name() {
    return name;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof Student)) return false;
    Student o = (Student) other;
    // Identity rule for this lesson: same id => same student
    return this.id == o.id;
  }

  @Override
  public int hashCode() {
    // Simple hash; good enough for the lesson (we’re not building a hash set today).
    return id * 31;
  }

  @Override
  public String toString() {
    return "Student(" + id + ", " + name + ")";
  }
}
