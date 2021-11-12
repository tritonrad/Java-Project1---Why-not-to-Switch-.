package School.Management.System;

/**
 * This class keeps track of a teacher's name, id, salary.
 * Assumptions: Salaries are different for every teacher.
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new teacher object.
     * @param id id for teacher.
     * @param name name of teacher.
     * @param salary salary of teacher.
     */
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;


    }

    /**
     *
     * @return the id for current teacher.
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return the name for current teacher.
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return the salary for current teacher.
     */
    public int getSalary(){
        return salary;
    }

    /**
     *  set the salary
     * @param Salary
     */
    public void setSalary(int Salary){
        this.salary=salary;
    }

    /**
     * Adds to salaryEarned.
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salaryEarned);
    }
}
