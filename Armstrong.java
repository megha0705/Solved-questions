import java.util.Scanner;
 class Armstrong{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int output = n;
        int length = String.valueOf(n).length();
        int m;
        int power;
        int result = 0 ;
        while(n > 0){
            m = n % 10;
            power  = (int)Math.pow(m , length);
            result += power;
            n = n / 10;
        }
        if(output == result){
            System.out.println("armstrong number");
        }
 }
 }