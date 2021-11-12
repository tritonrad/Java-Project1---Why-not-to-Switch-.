# Attempt at using .switch() for School management System.
**In this project, we are attempting to make a school management system only using .switch() in Java and using cases.**

**Let's go through the structure of the school, understand why ".switch()" is not the optimal way to build a school in Java, and find a solution to this problem.**

## Structure of School - _There are three classes School, Teacher, and Student_
### School class 
**To create School objects and keep track of tuition, Salary, expenses**

**Teachers, Students, Total money earned, Total Money spent = Teachers Salary**
### Teacher class 
**To create teacher objects, keeps track of salary**

**Id number, Name, Salary**
### Student class 
**To create student objects, keeps track of tuition**

**Id number, Name, Total Tuition, TuitionPaid**

## why not use ".switch()"
**Definition of the ".switch()":** 
 **Unlike if-then and if-then-else statements, the switch statement can have a number of possible execution paths. 
 A switch works with the byte, short, char, and int primitive data types. It also works with enumerated types (discussed in Enum Types), 
 the String class, and a few special classes that wrap certain primitive types: Character, Byte, Short, and Integer (discussed in Numbers and Strings).**
 
 ## Why only using switch doesn't work:
 **A switch can essentially be implemented in two ways (or in principle, a combination): for a small number of cases, or ones whose values are widely dispersed, 
 a switch essentially becomes the equivalent of a series of ifs on a temporary variable (the value being switched on must only be evaluated once). 
 For a moderate number of cases that are more or less consecutive in value, a switch table is used (the TABLESWITCH instruction in Java), 
 whereby the location to jump to is effectively looked up in a table**
 ### Solution
 **The simple If-else, If-else if statements would suffice to fix this issue.
