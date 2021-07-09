import java.util.ArrayList;
import java.util.List;

class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
     }
}
class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    public void setGrade(int grade){
        this.grade=grade;
    }

    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :"+name+
                " Total fees paid so far $"+ feesPaid;
    }
}
class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return  salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }


    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned so far $"
                + salaryEarned;
    }
}
public class SchoolManagement {
    public static void main(String[] args) {
        Teacher BuBon = new Teacher(1,"BuBon",500);
        Teacher PakLiang = new Teacher(2,"PakLiang",700);
        Teacher PakChuck = new Teacher(3,"PakChuck",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(BuBon);
        teacherList.add(PakLiang);
        teacherList.add(PakChuck);

        Student adam = new Student(1,"adam",4);
        Student agil = new Student(2,"agil Vasudev",12);
        Student rey = new Student(3,"rey",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(adam);
        studentList.add(rey);
        studentList.add(agil);

        School uny = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        uny.addTeacher(megan);

        adam.payFees(5000);
        agil.payFees(6000);
        System.out.println("uny has earned $"+ uny.getTotalMoneyEarned());

        System.out.println("\n------Making SCHOOL PAY SALARY----");
        BuBon.receiveSalary(BuBon.getSalary());
        System.out.println("uny has spent for salary to " + BuBon.getName()
        +" and now has $" + uny.getTotalMoneyEarned());

        PakChuck.receiveSalary(PakChuck.getSalary());
        System.out.println("uny has spent for salary to " + PakChuck.getName()
                +" and now has $" + uny.getTotalMoneyEarned());

        System.out.println(agil);

        PakLiang.receiveSalary(PakLiang.getSalary());

        System.out.println(PakLiang);


    }
}
