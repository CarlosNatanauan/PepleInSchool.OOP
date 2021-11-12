import java.util.*;//Natanauan, Carlos Nov 12
class Person {

    private String name;
    private String contactNum;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactNum() {
        return contactNum;
    }
    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
}

class Student extends Person {

    private String program;
    private int yearLevel;

    public void setProgram(String program) {
        this.program = program;
    }
    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }
    public String getProgram() {
        return program;
    }
    public int getYearLevel() {
        return yearLevel;
    }

    void callStudent(String name, String contactNum, String program, int yearLevel) {
        setName(name);
        setContactNum(contactNum);
        setProgram(program);
        setYearLevel(yearLevel);
        System.out.println("----------------------------");
        System.out.println("Name          : " + getName());
        System.out.println("Contact Number: " + getContactNum());
        System.out.println("Program       : " + getProgram());
        System.out.println("Year Level    : " + getYearLevel());
    }

}

class Faculty extends Employee {

    private boolean status;
    boolean isRegular;
    
    boolean status() {
        if (isRegular == true) {
            return status = true;
        }if (isRegular == false) {
            return status = false;
        }
        return status;
    }

    void CallFaculty(String name, String contactNum, String department, double salary) {

        setName(name);
        setContactNum(contactNum);
        setDepartment(department);
        setSalary(salary);
        System.out.println("----------------------------");
        System.out.println("Name          : " + getName());
        System.out.println("Contact Number: " + getContactNum());
        System.out.println("Departemnt    : " + getDepartment());
        System.out.println("Salary        : " + getSalary());
        if (status() == true) {
            System.out.println("Status        : Regular/Tenured");
        } else if (status() == false) {
            System.out.println("Status        : Not Regular/Tenured");
        }
    }
}
class Employee extends Person {

    Scanner s = new Scanner(System.in);
    private double salary;
    private String department;

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    void callEmployee(String name, String contactNum, String department, double salary) {
        setName(name);
        setContactNum(contactNum);
        setDepartment(department);
        setSalary(salary);
        System.out.println("----------------------------");
        System.out.println("Name          : " + getName());
        System.out.println("Contact Number: " + getContactNum());
        System.out.println("Departemnt    : " + getDepartment());
        System.out.println("Salary        : " + getSalary());
    }
}
public class CollegeList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Person p = new Person();
        Student st = new Student();
        Employee emp = new Employee();
        Faculty fac = new Faculty();
        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        String user = s.nextLine();

        if (user.equalsIgnoreCase("E")) {
            System.out.println("Type Employee's name, contact number, department and salary."
                    + "\n" + "Press Enter every input");
            emp.callEmployee(s.nextLine(), s.nextLine(), s.nextLine(), s.nextDouble());
        } else if (user.equalsIgnoreCase("S")) {
            System.out.println("Type Student's name, contact number , program and year level."
                    + "\n" + "Press Enter every input");
            st.callStudent(s.nextLine(), s.nextLine(), s.nextLine(), s.nextInt());
        } else if (user.equalsIgnoreCase("F")) {
            String stat;
            System.out.println("Press Y if Regular/Tenured and N if not");
            stat = s.nextLine();
            if (stat.equalsIgnoreCase("Y")) {
                fac.isRegular = true;

            } else if (stat.equalsIgnoreCase("N")) {
                fac.isRegular = false;
            }
            System.out.println("Type Employee's name, contact number, department and salary."
                    + "\n" + "Press Enter every input");
            
            fac.CallFaculty(s.nextLine(), s.nextLine(), s.nextLine(), s.nextDouble());
        }else {
            System.out.println("Invalid Input!");
        }

    }
}
