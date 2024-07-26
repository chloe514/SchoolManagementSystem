package school.management.system;

/**
 * This class is responsible for keeping track of student's fees, name, id, grade, and fees paid
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing
     * Fees for every student is $30,000
     * Fees paid initially is 0
     * @param id the id of the student
     * @param name the name of the student
     * @param grade the grade of the student
     */
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * Return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     * Return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Return grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * Return total fees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * Return remaining fees of the student
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    /**
     * Method to pay fees, which updates feesPaid
     * @param fees the amount to be paid
     */
    public void payFees(int fees) {
        feesPaid += fees;
    }

    /**
     * Used to update the student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }
}




