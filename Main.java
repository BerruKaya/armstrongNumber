import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        
        /*operaiton:
        to figure out if the given number is an armstrong number or not
        for a number to be a armstrong number, it should satisfy the following:
        1634=1^4+ 6^4 + 3^4 + 4^4 (4 being the # of digits)
        371 = 3*3 + 7^3 + 1^3
    
        */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num= scan.nextInt();
        System.out.println("number of digits: ");
        int digitNum= scan.nextInt();
        
        int tempNum= num;  //to prevent anomalies in program, since our number should decrease
        
        int total=0;
        
        do{
            int digitValue= tempNum%10;
            tempNum/=10;
            
            total+= Math.pow(digitValue,digitNum);
            
            
        }while(tempNum>00);
       
       
       if(num==total){
           System.out.println("this is an armstrong number");
       }
       else{
           System.out.println("this is not an armstrong number");
       }
          }
          
  }
          
