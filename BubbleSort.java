//Perform Bubble Sort. Take size and values of arry from the user
import java.util.Scanner;
class BubbleSort{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int store;
        System.out.println("size of array?");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j < arr.length; j++){
            for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i + 1]){
                store = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = store;
            }
        }
    }  
        for(int myArr : arr){
            System.out.println("sorted array" + myArr);
        }
    }
}