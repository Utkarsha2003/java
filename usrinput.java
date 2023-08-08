import java.util.Scanner;
public class usrinput {
    public static void main(String[] args){

        System.out.println("Taking input");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.1");
        int  a = sc.nextInt();
        System.out.println("enter no.2");
        float  b = sc.nextFloat();
        float sum = a+b;
        System.out.println("The sum of these nos.");
        System.out.println(sum);
    }
}
