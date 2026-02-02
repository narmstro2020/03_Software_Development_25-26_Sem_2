import java.util.ArrayList;
import java.util.List;

/**
 * ============================================
 * Class Roster Manager - Student Activity
 * ============================================
 * 
 * Your Task: Complete this Java file to create
 * a working class roster management system!
 * 
 * Skills you'll practice:
 * - Creating and initializing Lists
 * - Adding elements to Lists
 * - Iterating with for-each and traditional for loops
 * - Using List methods: get(), size(), remove(), contains()
 * - Modifying objects through references
 * 
 * Look for TODO comments to find where you need to write code.
 * The reference section at the bottom shows syntax examples.
 */
public class RosterManager {
    
    // ============================================
    // ROSTER DATA - The list of students
    // ============================================
    private List<Student> roster;
    
    
    // ============================================
    // TODO #1: Constructor - Initialize the Roster
    // ============================================
    /**
     * Creates a new RosterManager with an empty roster.
     * 
     * HINT: Initialize 'roster' as a new ArrayList
     * SYNTAX: roster = new ArrayList<>();
     */
    public RosterManager() {
        // TODO: Initialize the roster as an empty ArrayList
        
        // YOUR CODE HERE:
        
    }
    
    
    // ============================================
    // TODO #2: Add a Student to the Roster
    // ============================================
    /**
     * Adds a new student to the roster.
     * @param student The student to add
     * 
     * HINT: Use the add() method on the roster list
     */
    public void addStudent(Student student) {
        // TODO: Add the student to the roster
        
        // YOUR CODE HERE:
        
    }
    
    
    // ============================================
    // TODO #3: Get the Number of Students
    // ============================================
    /**
     * Returns the number of students in the roster.
     * @return The count of students
     * 
     * HINT: Use the size() method
     */
    public int getStudentCount() {
        // TODO: Return the size of the roster
        
        // YOUR CODE HERE:
        return 0; // Replace this line
    }
    
    
    // ============================================
    // TODO #4: Print All Students (Enhanced For Loop)
    // ============================================
    /**
     * Prints all students in the roster using an enhanced for loop.
     * 
     * SYNTAX: for (Student s : roster) { ... }
     */
    public void printAllStudents() {
        System.out.println("=== Class Roster ===");
        
        // TODO: Use an enhanced for loop to print each student
        // Print each student on its own line using System.out.println()
        
        // YOUR CODE HERE:
        
        
        System.out.println("====================");
    }
    
    
    // ============================================
    // TODO #5: Find Student by ID (Traditional For Loop)
    // ============================================
    /**
     * Finds and returns a student by their ID number.
     * @param id The student ID to search for
     * @return The Student with that ID, or null if not found
     * 
     * HINT: Use a traditional for loop with index
     * HINT: Use roster.get(i) to access each student
     * HINT: Use student.getId() to check the ID
     */
    public Student findStudentById(int id) {
        // TODO: Loop through the roster and find the student with matching ID
        // Return the student if found, or null if not found
        
        // YOUR CODE HERE:
        
        
        return null; // Replace this with your implementation
    }
    
    
    // ============================================
    // TODO #6: Calculate Class Average
    // ============================================
    /**
     * Calculates and returns the average grade for the class.
     * @return The average grade, or 0.0 if roster is empty
     * 
     * HINT: Sum all grades, then divide by count
     * HINT: Check if roster is empty first to avoid divide by zero
     */
    public double calculateAverage() {
        // TODO: Check if roster is empty first
        // If empty, return 0.0
        
        // TODO: Sum up all the grades using a loop
        
        // TODO: Divide by the number of students and return
        
        // YOUR CODE HERE:
        
        
        return 0.0; // Replace this with your implementation
    }
    
    
    // ============================================
    // TODO #7: Get Students with Grade Above Threshold
    // ============================================
    /**
     * Returns a new list containing only students with grades 
     * at or above the threshold.
     * @param threshold The minimum grade to include
     * @return A List of students meeting the criteria
     * 
     * HINT: Create a new ArrayList to hold the results
     * HINT: Loop through roster and add qualifying students
     */
    public List<Student> getStudentsAbove(double threshold) {
        // TODO: Create a new ArrayList to store results
        
        // TODO: Loop through roster
        // If student's grade >= threshold, add them to results
        
        // TODO: Return the results list
        
        // YOUR CODE HERE:
        
        
        return new ArrayList<>(); // Replace this with your implementation
    }
    
    
    // ============================================
    // TODO #8: Update Student Grade (Reference Types!)
    // ============================================
    /**
     * Updates the grade of a student with the given ID.
     * This demonstrates that List elements are REFERENCES!
     * 
     * @param id The student ID to update
     * @param newGrade The new grade to assign
     * @return true if student was found and updated, false otherwise
     * 
     * HINT: Use findStudentById() to get the student
     * HINT: If found, use setGrade() on the student object
     * HINT: The change will automatically reflect in the list!
     */
    public boolean updateStudentGrade(int id, double newGrade) {
        // TODO: Find the student by ID
        
        // TODO: If student is null, return false
        
        // TODO: Update the student's grade using setGrade()
        
        // TODO: Return true to indicate success
        
        // YOUR CODE HERE:
        
        
        return false; // Replace this with your implementation
    }
    
    
    // ============================================
    // TODO #9: Remove Student by ID
    // ============================================
    /**
     * Removes a student from the roster by their ID.
     * @param id The student ID to remove
     * @return true if student was removed, false if not found
     * 
     * HINT: First find the student object
     * HINT: Use roster.remove(object) to remove it
     */
    public boolean removeStudent(int id) {
        // TODO: Find the student by ID
        
        // TODO: If student is null, return false
        
        // TODO: Remove the student from the roster
        
        // TODO: Return true to indicate success
        
        // YOUR CODE HERE:
        
        
        return false; // Replace this with your implementation
    }
    
    
    // ============================================
    // TODO #10: Count Passing Students
    // ============================================
    /**
     * Counts how many students have a passing grade (>= 60).
     * @return The number of passing students
     * 
     * HINT: Use student.isPassing() method
     */
    public int countPassingStudents() {
        // TODO: Initialize a counter to 0
        
        // TODO: Loop through roster
        // If student.isPassing() is true, increment counter
        
        // TODO: Return the counter
        
        // YOUR CODE HERE:
        
        
        return 0; // Replace this with your implementation
    }
    
    
    // ============================================
    // Main Method - Test Your Implementation!
    // ============================================
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║     Class Roster Manager Test      ║");
        System.out.println("╚════════════════════════════════════╝\n");
        
        // Create the roster manager
        RosterManager manager = new RosterManager();
        
        // Test TODO #1 & #2: Add students
        System.out.println("► Adding students to roster...");
        manager.addStudent(new Student("Alice Johnson", 1001, 92.5));
        manager.addStudent(new Student("Bob Smith", 1002, 85.0));
        manager.addStudent(new Student("Carol Davis", 1003, 78.5));
        manager.addStudent(new Student("David Wilson", 1004, 55.0));
        manager.addStudent(new Student("Eva Martinez", 1005, 96.0));
        
        // Test TODO #3: Get student count
        System.out.println("► Student count: " + manager.getStudentCount());
        System.out.println();
        
        // Test TODO #4: Print all students
        manager.printAllStudents();
        System.out.println();
        
        // Test TODO #5: Find student by ID
        System.out.println("► Finding student with ID 1003...");
        Student found = manager.findStudentById(1003);
        if (found != null) {
            System.out.println("  Found: " + found);
        } else {
            System.out.println("  Not found!");
        }
        System.out.println();
        
        // Test TODO #6: Calculate average
        System.out.printf("► Class average: %.2f%n", manager.calculateAverage());
        System.out.println();
        
        // Test TODO #7: Get students above threshold
        System.out.println("► Students with A grades (90+):");
        List<Student> honorRoll = manager.getStudentsAbove(90.0);
        for (Student s : honorRoll) {
            System.out.println("  " + s);
        }
        System.out.println();
        
        // Test TODO #8: Update student grade (demonstrates references!)
        System.out.println("► Updating David's grade from 55.0 to 72.0...");
        manager.updateStudentGrade(1004, 72.0);
        System.out.println("► David's updated record:");
        System.out.println("  " + manager.findStudentById(1004));
        System.out.println();
        
        // Test TODO #9: Remove a student
        System.out.println("► Removing student with ID 1002 (Bob)...");
        manager.removeStudent(1002);
        System.out.println("► Updated roster:");
        manager.printAllStudents();
        System.out.println();
        
        // Test TODO #10: Count passing students
        System.out.println("► Passing students: " + manager.countPassingStudents());
        System.out.println();
        
        System.out.println("════════════════════════════════════");
        System.out.println("        Tests Complete!             ");
        System.out.println("════════════════════════════════════");
    }
}


/*
 * ============================================
 * REFERENCE - Syntax Examples from Today's Notes
 * ============================================
 *
 * // Creating a List:
 * List<Student> roster = new ArrayList<>();
 * 
 * // Adding to a List:
 * roster.add(student);
 * roster.add(0, student);  // Add at specific index
 * 
 * // Getting from a List:
 * Student s = roster.get(0);  // Get first element
 * int count = roster.size();  // Get number of elements
 * 
 * // Checking if empty:
 * if (roster.isEmpty()) { ... }
 * 
 * // Enhanced for loop (recommended for most cases):
 * for (Student s : roster) {
 *     System.out.println(s);
 * }
 * 
 * // Traditional for loop (when you need the index):
 * for (int i = 0; i < roster.size(); i++) {
 *     Student s = roster.get(i);
 *     System.out.println(i + ": " + s);
 * }
 * 
 * // Removing from a List:
 * roster.remove(0);           // Remove by index
 * roster.remove(student);     // Remove specific object
 * 
 * // Checking if List contains an element:
 * if (roster.contains(student)) { ... }
 * 
 * // Modifying objects (remember: Lists store REFERENCES!)
 * Student s = roster.get(0);  // Get reference to object
 * s.setGrade(100);            // Modifies the SAME object in list!
 * 
 */
