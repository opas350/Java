package grades2;

import java.util.Scanner;

/**
 * CourseGrade determines the final grade which is computed as
 * the weighted sum of the grades obtained in exam, lab and homework
 */
public class grade
{
    public static void main(String[] args)
    {
        int examWeight = 70;    // Percentage weight given to examination
        int labWeight = 20;     // Percentage weight given to lab work
        int hwWeight = 10;      // Percentage weight given to homework assignment
        double examScore;       // Examination score obtained by student
        double labScore;        // Lab score obtained by student
        double hwScore;         // Homework score obtained by student
        double finalGrade;      // Final grade obtained by student
        
        Scanner s = new Scanner(System.in);

        // Ask student to input scores for exam, lab and nomework
        System.out.println("Enter your exam grade");
        examScore = s.nextDouble();
        
        System.out.println("Enter your lab grade");
        labScore = s.nextDouble();
  
        System.out.println("Enter your homework grade");
        hwScore = s.nextDouble();
     
     
        // Computer final grade as the weighted sum of exam, lab and homework scores
	    examScore = examScore * (examWeight / 100.0);
        labScore = labScore * (labWeight / 100.0);
        hwScore = hwScore * (hwWeight / 100.0);
        finalGrade = examScore + labScore + hwScore;
        
        // Output the final grade
        System.out.println("Your final grade is "+finalGrade);
      
        
    }
}        
