import javax.lang.model.element.Name;
import javax.print.attribute.standard.PresentationDirection;

/*1) create an employee class with name,id,salary and intialize it using constructor and override toString() method
to print the string representation of employee and an instance method which increments the salary of the employee
and call the method inside another class MainEmployee and increment the salary and display employee information */
import java.util.*;
class Employee
{
    String name;
    int id;
    float salary;
     Employee() 
    {
        name= "Ragu";
        id =1234;
        salary= 25000.00f;       
    }

        public float salary(float n)
        {
            salary+=salary*(n/100);
            return  salary ;
        }
        public String toString()
        {
            return ("Name :"+name +"ID : "+id +"Salary : "+salary);
        }
}
class MainEmployee
{
    public static void main(String []args)
    {
        Employee em=new Employee();
        Scanner sc=new Scanner(System.in);
        
        int emp=sc.nextInt();
        em.salary(emp);
        System.out.println(em.salary);

        
    }
}