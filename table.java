package collections;
import java.util.*;
import java.util.Map;
//jcf
public class table {

	public static void main(String[] args) {
		int a,i,b;
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  Scanner in=new Scanner(System.in);
		  System.out.println("enter the no of students do u want");
		  a = in.nextInt();
		  for(i=1;i<=a;i++)
		  {
			System.out.println("enter the name of"+i+" student");
			String name = in.next();
			System.out.println("enter the registration number of"+i+" student");
			int num = in.nextInt();
			hm.put(num, name);
		
		  }
	
		  
		  System.out.println("enter the registration number of the any student");
		  b=in.nextInt();
		  String returned_value = (String)hm.remove(b);
		 // System.out.println("New table is: " + hm);
		  System.out.println(" students details after removing ");
		  for(Map.Entry m:hm.entrySet()){
		
		   System.out.println("registration number is " +m.getKey());
		   System.out.println("name of the student is " +m.getValue());  
		  }  
	}
}


