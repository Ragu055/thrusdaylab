//1) Write an functional interface with lambda expression to pass a set of items and display it using for each loop.//

interface function{
		void display(String[] bike);
}
class MainInterface{
	public static void main(String...args)
	{
			String str[]={"KTM 260","DUKE 360","HONDA","MT-15"};
			System.out.println("Welcome To Sri Motors");
			function f=(String[] bike)->{
				for(String i:bike)
				{
					System.out.println(i);
				}
			};
			f.display(str);
	}
}