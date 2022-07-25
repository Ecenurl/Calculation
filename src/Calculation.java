import java.util.Scanner;

public class Calculation {

    public class Average
    {
        public static void main(String[] args) {

            int average,finalGrade,midtermExam;

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter Midterm Exam Grade:");

            midtermExam=sc.nextInt();

            System.out.println("Enter Final Grade:");

            finalGrade=sc.nextInt();

            System.out.println("average account:");

            average=(midtermExam+finalGrade)/2;


            if(average>60)

                System.out.print("passed");

            else

                System.out.print("remained");
        }
    }

}
