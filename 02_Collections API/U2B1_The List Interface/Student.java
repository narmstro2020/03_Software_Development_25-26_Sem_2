/**
 * Student class for the Class Roster activity.
 * Each student has a name, ID, and grade.
 */
public class Student {
    private String name;
    private int id;
    private double grade;
    
    /**
     * Creates a new Student with the given information.
     * @param name The student's name
     * @param id The student's ID number
     * @param grade The student's current grade (0-100)
     */
    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public double getGrade() {
        return grade;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    /**
     * Returns a letter grade based on the numeric grade.
     * @return The letter grade (A, B, C, D, or F)
     */
    public String getLetterGrade() {
        if (grade >= 90) return "A";
        if (grade >= 80) return "B";
        if (grade >= 70) return "C";
        if (grade >= 60) return "D";
        return "F";
    }
    
    /**
     * Checks if this student is passing (grade >= 60).
     * @return true if passing, false otherwise
     */
    public boolean isPassing() {
        return grade >= 60;
    }
    
    @Override
    public String toString() {
        return String.format("Student[id=%d, name=%s, grade=%.1f (%s)]", 
                             id, name, grade, getLetterGrade());
    }
}
