

/*1) Create a class called Book with author name,book name and isbc number as variable and store it in collection and retrive 
   it using for each loop and itertor and also do serializaion and clonning*/
import java.io.*;
import java.util.*;
   class Book implements Serializable
   {
       String auname;
       String boname;
       int isbcnum;
       Book (String auname,String boname, int isbcnum)
       {
   this.auname=auname;
   this.boname=boname;
   this.isbcnum=isbcnum;
   
       }
public String toString()
{
    return "Auther Name : "+auname+"BooK Name :"+boname+"ISBC Number : "+isbcnum;
}

   }

   class MainBook
   {
    public static void main(String[] args)throws IOException, ClassNotFoundException
    {
        HashSet<Book> hs=new HashSet<Book>();
        Book b1=new Book("Rabindranath Tagore","Chandalika",   91055);
        hs.add(b1);
        for (Book boo:hs)
        {
            System.out.println(boo);

        }
        Iterator it=hs.iterator();
        while(it.hasNext());
        {
            System.out.println(it.next());
        }
        FileOutputStream fos=new FileOutputStream("C:\\Ragu\\05-10-2023(2)\\Book.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(b1);
        oos.close();
        fos.close();
        FileInputStream fis=new FileInputStream("C:\\Ragu\\05-10-2023(2)\\Book.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Book b2 =(Book)ois.readObject();
        ois.close();
        fis.close();
        System.out.println(b2);

    }
   } 