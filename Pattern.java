//4. Print the following pattern n times. Take n from the user. 0, 1, 1, 2, 4, 12, 60, 780, 47580, 37159980
import java.util.Scanner;
class Pattern{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int n = 1;
        int m = 0;
        for(int i = 0; i < input; i++){
             System.out.println(n);
             int output = n * m;
             m = n;
             n += output;
        }
    }
}