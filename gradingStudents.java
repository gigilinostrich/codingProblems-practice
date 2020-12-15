import java.util.*;

public class gradingStudents {

	public static void main(String[] args) {
		//input    output
		//73		75
		//67		67
		//38		40
		//33		33
		
		// List of students' grades 		
		List<Integer> grades = new LinkedList<Integer>();
		
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);
		
		// iterating through the list of grades
	int nextMultipleOf5 = 0; // mortified grades
	int difference = 0; // the difference between the mortified and the original grade
	// list needs to be returned	
		List<Integer> finalGrades = new LinkedList<Integer>();			
	for (int i: grades) {
		
		nextMultipleOf5 = i - (i % 5) + 5; //	//num - (num % 5) + 5
		difference = nextMultipleOf5 - i;
		// round up grades if the requirements are met 
		if (nextMultipleOf5 >= 40 && difference < 3) { 
			i = nextMultipleOf5; // update the grade 
			finalGrades.add(i);
		}
		else {	// if the nextMultipleOf5 is less than 40, don't round up 
			finalGrades.add(i);
		}
	}
		System.out.println(finalGrades);
		
	}

}
