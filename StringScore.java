import java.util.Scanner;
class StringScore{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);  
        String input = sc.next();
        int ascii [] = new int [input.length() - 1 ];
        int result = 0;
        for(int i = 0; i < input.length() -1; i++){
            ascii[i] = Math.abs(input.charAt(i) - input.charAt(i + 1));
             result += ascii[i];
        }
         System.out.println(result);
    }
}