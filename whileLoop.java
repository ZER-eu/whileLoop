import java.util.Scanner;
public class whileLoop
{
    static public void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        int num = 0;

        while(num < 1 || num > 10){
            System.out.print("Enter an Number between 1 - 10: ");
            num = scanner.nextInt();
        }

        System.out.printf("You have Picked the Number: %d", num);


        
        //int age = 0;

        //System.out.print("Enter your Age: ");
        //age = scanner.nextInt();

        //while(age < 12){
        //System.out.println("You need to be +13 to play this Game!");
        //System.out.print("Enter your Age: ");
        //age = scanner.nextInt();
        //}

        //System.out.printf("Your Age: %d, you are allowed to play the Game!", age);



        
        //String response = "";

        //while(!response.equals("Q")){
        // System.out.println("You are playing an Game!");
        //  System.out.println("Press 'Q' to Quit.");
        //  response = scanner.next().toUpperCase();
        //}

        //System.out.println("You have successfully Quit to Game!");

        scanner.close();
    }
}
