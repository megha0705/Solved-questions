//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
class TwoSum{
    public static void main(String [] args){
        int [] arr = {3,2,4};
        int myArr[] = new int [2];
        int target = 6;
        for(int j = 0; j < arr.length; j++){
            for(int i = j + 1; i < arr.length; i++){
                int sum = arr[j] + arr[i];
                if(sum == target){
                    myArr[0] = j;
                    myArr[1] = i;
                }
            }
        }
        for(int array : myArr){
            System.out.println(array);
        }
    }
}