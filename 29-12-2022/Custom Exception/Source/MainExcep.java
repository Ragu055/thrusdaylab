//2) Write an custom exception where there are set of student names,student id, attendance and his marks display it 
  // and throw the Custom exception when student gets less than 60% attendance.
   
  class CusExcep extends Exception{
    CusExcep(String str)
	{
	   super(str);
	}
	static String studentName[]={"Arul","Karthi","Murugan","Anitha","Roja"};
	static int id[]={1430,1431,1432,1433,1434};
	static int marks[]={86,87,65,80,65};
	static int att[]={68,80,72,90,59};
	
}
class MainCusExcep{
    public static void main(String...args){
	    for(int i=0;i<CusExcep.marks.length;i++){
		  try{
		       System.out.println("Student Name  :"+CusExcep.studentName[i]+"\t"+ "Student Id :"+CusExcep.id[i]+"\t"+"Marks :"+CusExcep.marks[i]+"\t"+ "Attendance :"+CusExcep.att[i]);  
			     if(CusExcep.att[i]<60)
				 {
					 throw new CusExcep(CusExcep.studentName[i]+" Secured less than 60 attendance");
				 }
			}
				 catch(CusExcep e)
				 {
					System.out.println(e.getMessage()); 
				 }
		     

		}
	}
}