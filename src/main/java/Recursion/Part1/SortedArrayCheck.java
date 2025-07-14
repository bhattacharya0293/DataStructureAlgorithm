package Recursion.Part1;

public class SortedArrayCheck {
    public static boolean sortedArrayCheck(int[] arr, int i){
        //base case
        if(i == arr.length-1){
            return true;
        }
        //logic
        if(arr[i] > arr[i+1]){
            return false;
        }
        return sortedArrayCheck(arr, i+1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,8,5};
        System.out.print(sortedArrayCheck(arr, 0));
    }
}
