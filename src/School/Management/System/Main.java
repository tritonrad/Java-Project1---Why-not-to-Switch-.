package School.Management.System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = 0;
        while (k != 5) {
            System.out.println("1. Access School Information\n2. Access Teacher Information\n3. Access Student Information\n4. Quit");
            k = scanner.nextInt();
            switch (k) {
                case 1:
                    List<School> schoolList = new ArrayList<>();
                    int n = 0;
                    outerloop1:
                    while (n != 5) {
                        System.out.println("1. List all school\n2. Add School\n3. Remove School\n4. Quit or return to Previous Options");
                        n = scanner.nextInt();
                        String filler = scanner.nextLine();

                        switch (n) {
                            case 1:
                                for (School x : schoolList) {
                                    System.out.println(x.getSchoolName() + " " + x.getStudents() + " " + x.getTeachers());
                                }
                                break;
                            case 2:
                                System.out.println("What is the school name?");
                                String school = scanner.nextLine();
                                List<Teacher> teacherList = new ArrayList<>();
                                List<Student> studentList = new ArrayList<>();
                                School x = new School(school, teacherList, studentList);
                                schoolList.add(x);
                                break;
                            case 3:
                                System.out.println("Which school do you want to remove?");
                                String removedSchool = scanner.next();
                                for (School j : schoolList) {
                                    if (j.getSchoolName().equalsIgnoreCase(removedSchool)) {
                                        schoolList.remove(j);
                                    }
                                    break;
                                }
                                continue;
                            case 4:
                                System.out.println("Return to previous options? Type \"yes\" or \"no1\"");
                                String yes = scanner.next();
                                if (yes.equalsIgnoreCase("yes")) {
                                    break outerloop1;
                                }
                                else {
                                    System.out.println("Are you sure you want to end the program, type \"yes\" or \"no\"?");
                                    String exitButton = scanner.next();
                                    if (exitButton.equals("yes")) {
                                        System.exit(0);
                                    }
                                        break outerloop1;
                                }
                            }
                        }
                    break;
                case 2:
                    List<Teacher> teacherList = new ArrayList<>();
                    int i = 0;
                    outerloop2:
                    while (i != 5) {
                        System.out.println("1. List all teachers\n2. Add Teacher\n3. Remove Teacher\n4. Quit");
                        i = scanner.nextInt();

                        switch (i) {
                            case 1:
                                for (Teacher x : teacherList) {
                                    System.out.println("ID Number: " + x.getId() + ", Name: " + x.getName() + ", Salary: $US: " + x.getSalary());
                                }
                                break;
                            case 2:
                                System.out.println("What is the teacher's Id number?");
                                int teacherId = scanner.nextInt();
                                System.out.println("What is the teacher's name?");
                                String name = scanner.next();
                                System.out.println("What is the teacher's Salary?");
                                int salary = scanner.nextInt();
                                Teacher x = new Teacher(teacherId, name, salary);
                                teacherList.add(x);
                                break;
                            case 3:
                                System.out.println("Which teacher do you want to remove?");
                                String removedTeacher = scanner.next();
                                for (Teacher j : teacherList) {
                                    if (j.getName().equalsIgnoreCase(removedTeacher)) {
                                        teacherList.remove(j);
                                    }
                                    break;
                                }
                                break;
                            case 4:
                                System.out.println("return to Teacher Information? type \"no\"  or \"yes\"");
                                String yes = scanner.next();
                                if (yes.equalsIgnoreCase("yes")) {
                                    break;
                                } else {
                                    System.out.println("Are you sure you want to end the program, type y ?");
                                    String exitButton = scanner.next();
                                    if (exitButton.equals("y")) {
                                        System.exit(0);
                                    }
                                        break outerloop2;
                                }

                        }
                    }
break;
                case 3:
                    List<Student> studentList = new ArrayList<>();
                    int m = 0;
                    outerloop3:
                    while (m != 5) {
                        System.out.println("1. List All Students\n2. Add Student\n3. Remove Student\n4. Quit");
                        m = scanner.nextInt();

                        switch (m) {
                            case 1:
                                for (Student x : studentList) {
                                    System.out.println("Id: " + x.getId() + ", Name: " + x.getName() + ", Grade: " + x.getGrade());
                                }
                                break;
                            case 2:
                                System.out.println("What is the student's Id number?");
                                int studentId = scanner.nextInt();
                                System.out.println("What is the student's name?");
                                String name = scanner.next();
                                System.out.println("What is the student's grade?");
                                int grade = scanner.nextInt();
                                Student x = new Student(studentId, name, grade);
                                studentList.add(x);
                                break;
                            case 3:
                                System.out.println("Which student do you want to remove?");
                                String removedStudent = scanner.next();
                                for (Student j : studentList) {
                                    if (j.getName().equalsIgnoreCase(removedStudent)) {
                                        studentList.remove(j);
                                    }
                                    break;
                                }
                                break;
                            case 4:
                                break outerloop3;
                        }
                    }
                case 4:
                    System.out.println("Are you sure you want to end the program, press \"y\" or \"n\" ?");
                    String exitButton = scanner.next();
                    if (exitButton.equalsIgnoreCase("y")) {
                        System.exit(0);
                    }
                    break;
            }
        }
    }
}


