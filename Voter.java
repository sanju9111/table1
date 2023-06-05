import java.util.Scanner;

public class Voter {

    public static void main(String []args)
    {

        System.out.println("enter you age:");
        Scanner SC = new Scanner (System.in);


        int age = SC.nextInt();


        if ( age < 18 ) {
         
            System.out.println("you are not eligible for vote");

        }
            else {

                System.out.println("you are  eligible for vote");
            }


        }
    }
    
