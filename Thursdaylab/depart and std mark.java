public class Testclass {
    public static void main(String[]args)
    {
        int dept[][][]={
            {{45,61,34},{69,46,78},{48,98,75}},
            {{54,45,52},{49,85,98},{65,36,45}}

        };
        for(int i=0;i<dept.length;i++)
        {
            System.out.println("Dept Name : " +(i+1));
            for(int j=0; j<dept.length;j++)
            {
                System.out.println("Student Marks : " +(j+i));
                for(int k=0; k<dept[i][j].length;k++) 
                {
                    System.out.print(dept [i][j][k]+"\t");
                }
            }
            System.out.println();
            
        }
        System.out.println();
    }
    
}
