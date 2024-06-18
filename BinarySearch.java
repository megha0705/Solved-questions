//Perform Binary search on array. Take size and values of arry from the user
import java.util.Scanner;
class BinarySearch{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);  
        System.out.println("size of array?");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        int midIndex = (firstIndex + lastIndex)/2;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("number u want to find?");
        int search = sc.nextInt();
        while(search != arr[midIndex]){
            if(search < arr[midIndex]){
                midIndex -= 1;
            }else if(search > arr[midIndex]){
                midIndex += 1;
            }
        }
        System.out.println(midIndex);
    }
}