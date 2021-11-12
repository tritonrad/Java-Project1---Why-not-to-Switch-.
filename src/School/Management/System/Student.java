package School.Management.System;

/**
 * This Class keeps track of students fees, name, grade, fees paid
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int tuitionPaid;
    private int tuitionTotal;

    /**
     * To create a new student by initializing
     * Fees for every student is $35,000.
     * Fees initially paid is 0
     * @param id id for student: unique
     * @param name name of student.
     * @param grade grade of student
     */
    public Student(int id, String name, int grade){
        tuitionPaid=0;
        tuitionTotal=35000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    /**
     * To set grade of student k-12.
     * @param grade grade of the student.
     */
    public void updateGrade(int grade){
        this.grade=grade;
    }

    /**
     * continuously adds the tuition to tuition paid.
     * Funds received by school.
     * @param tuition the tuition that the student pays.
     */
    public void payTuition(int tuition){
        tuitionPaid+=tuition;
        School.updateTotalMoneyEarned(tuitionPaid);
    }

    /**
     *
     * @return Id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return tuition paid by the student.
     */
    public int getTuitionPaid() {
        return tuitionPaid;
    }

    /**
     *
     * @return the total tuition of the student.
     */
    public int getTuitionTotal() {
        return tuitionTotal;
    }

    /**
     *
     * @return the remaining tuition to be paid
     */
    public int getRemainingTuition(){
        return tuitionTotal-tuitionPaid;
    }

}
