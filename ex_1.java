import java.util.Scanner;

public class ex_1 {

    public static void main(String[] args)  {

        System.out.println("Welcome to CBSE PERCENTAGE CALCULATOR:");
        Scanner input = new Scanner(System.in);
        System.out.print("Marks of subject 1 - ");
        float s1 = input.nextFloat();
        System.out.print("Marks of subject 2 - ");
        float s2 = input.nextFloat();
        System.out.print("Marks of subject 3 - ");
        float s3 = input.nextFloat();
        System.out.print("Marks of subject 4 - ");
        float s4 = input.nextFloat();
        System.out.print("Marks of subject 5 - ");
        float s5 = input.nextFloat();
        float total = s1+s2+s3+s4+s5;
        float prcnt = (total * 100) / (500);
        System.out.println("Your total percentage = " +prcnt+ "%" );

    }
}
