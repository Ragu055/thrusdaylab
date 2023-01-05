 /*2) Create a Thread to show synchronization where there is a college with college name and college id and it has capacity 
   of upto 50 students already 48 students has got admission then for 51 student it has to display admission is full*/ 
 class Collage1 implements Runnable
{
 int Noofseat=100;
 int Nooffullseat=98;
 int Noofavalseat;
 Collage1(int Noofavalseat)
 {
    this.Noofavalseat=Noofavalseat;
 }
 public void run()
 {
    String name= Thread.currentThread().getName();
    synchronized(this){
    if(Nooffullseat<=Noofseat)
    {
     System.out.println(name+"AASC Collage Admission booking :");
     Nooffullseat++;
     try
     {
        Thread.sleep(1000);
        
     }
     catch(InterruptedException ie)
     {
         
     }
     
    }
    else
    {
        System.out.println(name+"SOORY Seat is Full Admission Close :");
    }
    }
 }
    
}
public class MainCollage1
{
    public static void main(String[]args)
    {
        Collage1 obj=new Collage1(4);
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        Thread t3=new Thread(obj);
        Thread t4=new Thread(obj);
        t1.setName("Arul ");
        t2.setName("Mani ");
        t3.setName("Karthi ");
        t4.setName("Dhoni ");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

               
    }
}