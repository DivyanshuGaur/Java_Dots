package Practise;

import java.util.Arrays;





public class Sort_Smart {

	
	
		public static void main(String [] args) {
			Student sarray[]=new Student[4];
			sarray[0]=new Student("Ad",1);
			sarray[1]=new Student("Du",3);
			sarray[2]=new Student("NoD",2);
			sarray[3]=new Student("Naaaa",0);
			
			
			Arrays.sort(sarray ,(a,b)->a.roll-b.roll);
			
			for(Student s : sarray) {
				
				System.out.println(s.name +"  "+s.roll);
			
			
		}
			
			
			
			
			
			
		}
			
	
	
	
	
	
}
