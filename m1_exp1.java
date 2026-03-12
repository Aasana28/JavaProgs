import java.util.Scanner;

class StudentMarks
{
	public static void main(String args[])
	{
		Scanner sm = new Scanner(System.in);
		
		int n,i,total_marks = 0,avg_marks = 0;

		System.out.print("Enter Number of Subjects: ");
		n = sm.nextInt();

		int oneD[] = new int[n];

		System.out.print("Enter marks: \n");
		for(i=0;i<n;i++)
		{
			oneD[i] = sm.nextInt();
			total_marks += oneD[i];
			avg_marks = total_marks/(oneD.length);
		}

		char grade;
       			 
        	if(avg_marks >= 80) 
		{
       			grade = 'A';
        	} 
		else if(avg_marks >= 60) 
		{
            		grade = 'B';
        	} 
		else if(avg_marks >= 40) 
		{
           		 grade = 'C';
        	} 
		else 
		{
            		grade = 'F';
        	}
		
		System.out.println("Total marks: " + total_marks);
		System.out.println("Average marks: " + avg_marks);
		System.out.println("Grade: " + grade);		
	}
}
