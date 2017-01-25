package lottery;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
              Scanner input=new Scanner(System.in);
        
        int lottery=(int)(Math.random()*101);
        
        System.out.println("Enter your lottery diggit between 0 and 100 (two digits):  ");
        int guess=input.nextInt();
        
        int lotteryDigit1=lottery / 10;
        int lotteryDigit2=lottery % 10;
        
        int guessDigit1=guess / 10;
        int guessDigit2=guess % 10;
        
        
        System.out.println("The lottery number is :" + lottery);
        
        if(guess==lottery){
            System.out.println("Exact match!");
           
        }else if(guessDigit1==lotteryDigit2 && guessDigit2==lotteryDigit1){
            System.out.println("Match all digits");
          
        }else if(lotteryDigit1==guessDigit1 || guessDigit2==lotteryDigit2 || guessDigit1==lotteryDigit2 || guessDigit2==lotteryDigit1){
            System.out.println("Match one digit");
        }else{
            System.out.println("No matches! ");
        }
        
        
    }
    
}
