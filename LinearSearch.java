//6. Perform Linear search on array. Take size and values of arry from the user
import java.util.Scanner;
class LinearSearch{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array?");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("target number?");
        int target = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println(i);
            }
        }
    }
}