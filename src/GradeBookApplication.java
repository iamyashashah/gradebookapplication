import java.util.Scanner;
import java.util.Date;
import java.util.Arrays;


public class GradeBookApplication {
	static Scanner sc = new Scanner(System.in);
	static String response ="y";
	static String [] names = new String[100];
	static String [] grades = new String[100];
	static String [] genders = new String[100];
	static String [] majors = new String[10];
	static String [] stateOfOrigins = new String[10];
	static int [] scores = new int[100];
	static int noOfStudents;
	static int male = 0;
	static int female = 0;


	public static void main(String [] args)
	{

		System.out.println("Welcom to Dalton school Gradebook Application");
		for (int i=0;i<scores.length;i++)
		{
			scores[i]=0;
		}
		Enter();
	}
	public static void Enter()
	{
		String name ;
		String gender ;
		String major ;
		String stateOfOrigin ;
		int score;
		int male = 0;
		int female = 0;
		int course = 0;
		int bio = 0;
		int phy = 0;
		int che = 0;
		int dc = 0;
		int md = 0;
		int va = 0;


		double average = 0 ,sum =0, totalsum = 0, coursesum = 0, statesum = 0, maleavg = 0, femaleavg = 0, bioavg = 0, phyavg = 0, cheavg = 0, dcavg = 0, mdavg = 0, vaavg = 0;
		date();
		System.out.println("Enter the number of records you want to enter");
		noOfStudents=sc.nextInt();

		for (int i=0; i<noOfStudents;i++)
		{

			System.out.println("Name: ");


			System.out.println("Gender: ");


			System.out.println("Major: ");
			course++;

			System.out.println("State of Origin: ");


			name = sc.next();
			names[i]=name;
			gender = sc.next();
			genders[i] = gender;

			if (genders[i].equalsIgnoreCase("M"))
			{
				male++; 

			}
			else if (genders[i].equalsIgnoreCase("F"))
			{
				female++;
			}
			else {
				System.out.println("invalid entry");
			}
			major= sc.next();
			majors[i] = major;

			if (majors[i].equalsIgnoreCase("BIO"))
			{
				bio++;
			}
			else if (majors[i].equalsIgnoreCase("PHY"))
			{
				phy++;
			}
			else if (majors[i].equalsIgnoreCase("CHE"))
			{
				che++;
			}

			else {
				System.out.println("invalid entry");
			}
			stateOfOrigin = sc.next();
			stateOfOrigins[i] =stateOfOrigin;

			if (stateOfOrigins[i].equalsIgnoreCase("DC"))
			{
				dc++;
			}
			else if (stateOfOrigins[i].equalsIgnoreCase("MD"))
			{
				md++;
			}
			else if (stateOfOrigins[i].equalsIgnoreCase("VA"))
			{
				va++;
			}
			else {
				System.out.println("invalid entry");
			}

			//System.out.println("Grade: ");
			// grade = sc.next();


			System.out.println("Score: ");
			score = sc.nextInt();
			scores[i]=score;
			//int testscore = 76;
			String grade1;

			if (scores [i] >= 90) {
				grade1 = "A";
			} else if (scores [i] >= 80) {
				grade1 = "B";
			} else if (scores [i] >= 70) {
				grade1 = "C";
			} else if (scores [i] >= 60) {
				grade1 = "D";
			} else {
				grade1 = "F";
			}
			System.out.println("Grade = " + grade1);
			grades[i] =grade1;


			sum +=scores[i];

			totalsum = male + female;
			coursesum = bio + phy + che;
			statesum = dc + md + va;





			while(scores[i]!=0)
			{
				average =(sum/(course));
				maleavg = (male/totalsum)* 100;
				femaleavg = (female/totalsum) * 100;
				bioavg = (bio/coursesum) * 100;
				phyavg = (phy/coursesum) * 100;
				cheavg = (che/coursesum) * 100;
				dcavg = (dc/statesum) * 100;
				mdavg = (md/statesum) * 100;
				vaavg = (va/statesum) * 100;
				System.out.println("Score :" + sum);
				System.out.println("Avg male gender :" + maleavg + "%");
				System.out.println("Avg female gender :" + femaleavg + "%");
				System.out.println("Avg of bio course :" + bioavg + "%" );
				System.out.println("Avg of phy course :" + phyavg + "%" );
				System.out.println("Avg of che course :" + cheavg + "%" );
				System.out.println("Avg of dc state :" + dcavg + "%" );
				System.out.println("Avg of md state :" + mdavg + "%" );
				System.out.println("Avg of va state :" + vaavg + "%" );
				System.out.println("Average :" + average);
				break;
			}

			System.out.println("---------------- ");
		}
	}
	public static void finalReport(int average, int maleavg, int femaleavg, int bioavg, int phyavg, int cheavg, int dcavg, int mdavg, int vaavg)
	

	{
		System.out.println("---------------------------------------");
		System.out.println("Final Report Card of Dalton School");
		date();
		System.out.println("Avg male gender :" + maleavg + "%");
		System.out.println("Avg female gender :" + femaleavg + "%");
		System.out.println("Avg of bio course :" + bioavg + "%" );
		System.out.println("Avg of phy course :" + phyavg + "%" );
		System.out.println("Avg of che course :" + cheavg + "%" );
		System.out.println("Avg of dc state :" + dcavg + "%" );
		System.out.println("Avg of md state :" + mdavg + "%" );
		System.out.println("Avg of va state :" + vaavg + "%" );
		System.out.println("Average :" + average);
		System.out.println("---------------------------------------");
	}
	
	
	public static void date () {
		// Instantiate a Date object
		Date date = new Date();

		// display time and date using toString()
		System.out.println(date.toString());
	}
}