import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if(age>= 18){
            System.out.println("you are eligible to vote");
        } else{
            System.out.println("sorry, you must be at least 18.");
        }
    }

    public static class shoppingCart {
        public static void main(String[] args) {
            int applePrice = 40;
            int bananaPrice = 20;
            int qunatity = 3;

            int total= (applePrice + bananaPrice) * qunatity;
            System.out.println("Total Bill: "+ total);
        }
    }
}
