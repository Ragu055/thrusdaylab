
/*3) Create a class called Student with student name,id,attendance and mark and sort it according to students name and display
   the details*/
   import java.util.*;
   class Student implements Comparator<Student>
   {
    String stdname;
    int stdid;
    double stdmark;
    double stdatt;
    public int compare(Student s1, Student s2,Student s3, Student s4){
        return s1.stdname.compareTo(s2.stdname);
    }
    Student(String stdname,int stdid, double stdmark, double stdatt)
    {
        this.stdname=stdname;
        this.stdid=stdid;
        this.stdmark=stdmark;
        this.stdatt=stdatt;
        
    }
    Student()
    {

    }
    public String toString()
    {
        return "Student Name ; "+stdname+"Student ID :"+stdid+"Student Mark : "+stdmark+"Student Attandecne : "+stdatt;
    }


   }
   public class MainStd
   {
    public static void main(String[] args) 
    {
        LinkedList<Student> ll=new LinkedList<Student>();
        Student s1=new Student("Dhoni",1430,75,85.65);
        Student s2=new Student("Arul",1431,86,74.32);
        Student s3=new Student("Karthi",1432,65,79.21);
        Student s4=new Student("Murugan",1433,98,65);
        ll.add(s1);
        ll.add(s2);
        ll.add(s3);
        ll.add(s4);
        Collections.sort(ll.new Student());
        Iterator it=ll.Iterator();
        while(ll.hasNext())
        {
            System.out.println(it.next());
        }



    }
   }