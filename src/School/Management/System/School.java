package School.Management.System;

import java.util.List;

/**
 * Many teachers, Many students
 *
 */
public class School {
    public String name;
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * @param teachers
     * @param students
     */
    public School(String name, List<Teacher> teachers, List<Student> students) {
        this.name=name;
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }
    public String getSchoolName(){
        return name;
    }

    /**
     *
     * @return the list of teachers in the school.
     */
    public List<Teacher> getTeachers() {

        return teachers;
    }

    /**
     * Adds a teacher to the school.
     * @param teacher the teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**\
     *
     * @return list of students in the
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school.
     * @param student the student to be added
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return total money earned
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds total money earned by the school
     * @param MoneyEarned money to be added
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school
     * (i.e. salary given by the school to its teachers)
     * @param moneySpent money spent by school.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
    }
}