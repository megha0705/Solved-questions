//Perform Selection Sort. Take size and values of arry from the user
import java.util.Scanner;
class SelectionSort{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int store;
        System.out.println("size of array?");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j < arr.length; j++){ 
             int index = j;
            for( int i = j + 1;i < arr.length; i++){
                if(arr[index] > arr[i]){
                    index = i;
                } 
            } 
            store = arr[j];
            arr[j] = arr[index];
            arr[index] = store;
        }
        System.out.println("sorted array");
        for(int myArr : arr){
            System.out.println(myArr);
        }
     }
}