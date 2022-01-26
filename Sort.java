package Practise;

import java.util.Arrays;
import java.util.Comparator;

class Student{
	
		String name;
		int roll;
		
		Student(){
			
			
		}
		Student(String name , int roll){
			
			
					this.name=name;
					this.roll=roll;
			
			
		}
		

	
}



class SortByRoll implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
			
			return o1.roll-o2.roll;
	}
	
	
	
	
}

public class Sort {
		
		public static void main(String [] args) {
			
				System.out.println("Hello World ");
				sarray[0]=new Student("Ad",1);
				sarray[1]=new Student("Du",3);
				sarray[2]=new Student("NoD",2);
				sarray[3]=new Student("Naaaa",0);
				
				Arrays.sort(sarray, new SortByRoll());
				
				
				
				for(Student s : sarray) {
					
						System.out.println(s.name +"  "+s.roll);
					
					
				}
					
				
				
				
		}

}

















