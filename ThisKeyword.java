package module3.basicjava;

public class ThisKeyword 
{
	int empno;
    double salary;
    String name;
    void employeedetails(int empno,double salary,String name)
    {
            System.out.println("Employee name is ->"+name);
            System.out.println("Employee salary is->"+salary);
            System.out.println("Employee no is ->"+ empno);
            this.empno=empno;
            this.salary=salary;
            this.name=name;
    }
    public static void main(String[] args) 
    {
            ThisKeyword c1=new ThisKeyword();
            c1.employeedetails(74,18.6, "Ram Sharma");
            System.out.println(c1.empno);
            System.out.println(c1.salary);
            System.out.println(c1.name);
    }
}
