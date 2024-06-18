//Check if a number is prime or not
import java.util.Scanner;
class PrimeNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;;
      if(n <= 1){
        System.out.println("not a prime number");
      }else if ( n == 2){
        System.out.println("prime number");
      }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                System.out.println("not a prime number");
                prime = false;
                break;
            }
        }
        if(prime){
        System.out.println("prime number");
        }
    }
}