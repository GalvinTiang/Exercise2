import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class H2 {

    public static void main(String[] args) {
	//Q1
        /*
        String myFormat="%-8.0f%8.0f%8.0f\n";
        System.out.printf("%-8s%8s%8s\n","Number","Square","Cube");
        double[] number = new double[11];
        double[] square = new double[11];
        double[] cube = new double[11];

        for(int i=0;i<11;i++){
            number[i]=i;
            square[i]=Math.pow(number[i],2);
            cube[i]=Math.pow(number[i],3);
            System.out.printf(myFormat,number[i],square[i],cube[i]);
        }
        

        //Q2
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        int count=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='A'||str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("number of character 'A' found: "+ count);
        

        //Q3
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str2 = input.nextLine();
        System.out.print("In reverse order: ");
        for(int i=str2.length()-1; i>=0; i--){
            System.out.print(str2.charAt(i));
        }
        */

        //Q4
        
        System.out.println("Enter 2 number: ");
        Scanner input = new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        if(num1>num2){
            System.out.println("0");
        }else {
            int randomInt = ThreadLocalRandom.current().nextInt(num1, num2 + 1);
            System.out.println("Random integer between " + num1 +" and " + num2 + ": "+randomInt);
        }
        
    }
}
