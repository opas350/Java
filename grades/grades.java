
public class grades
{
	public static void main(String[] args)
	{	
		int examWeight = 70;
		int labWeight = 20;
		int hwWeight = 10;
		double examScore, labScore, hwScore, finalgrade;

		IO.output("Enter your exam grade: ");
		examScore = IO.inputDouble();
		IO.output("Enter your lab grade: ");
		labScore = IO.inputDouble();
		IO.output("Enter your homework grade: ");
		hwScore = IO.inputDouble();

// Computer final grade as the weighted sum of scores

		examScore= examScore * (examWeight /100.0);
		labScore * (labWeight /100.0);
		hwScore = hwScore * (hwWeight / 100.0);
		finalgrade = examScore + labScore + hwScore;

// Output the final grade

		IO.outputln("Your final grade is " + finalgrade);
}
}	
