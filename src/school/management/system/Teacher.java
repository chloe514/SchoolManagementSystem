package school.management.system;

/** This class is responsible for keeping track of teachers' name, id, salary */
public class Teacher {
    private int id;
    private String name;
    private int salary;

    /** Created a new teacher object.
     * @param id
     * @param name
     * @param salary
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /** Return the ID of the teacher */
    public int getId() {
        return id;
    }

    /** Return the name of the teacher */
    public String getName() {
        return this.name;
    }

    /** Return the salary of the teacher */
    public int getSalary() {
        return salary;
    }

    /** Set the salary */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /** Add salary to the teacher's current salary */
    public void receiveSalary(int salary) {
        this.salary += salary;
    }
}




