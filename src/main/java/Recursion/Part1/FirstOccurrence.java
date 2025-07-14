package Recursion.Part1;

public class FirstOccurrence {
    public static int findFirstOccurrence(int[] arr, int key, int idx){
        //base case
        if(idx == arr.length){
            return -1;
        }
        //logic
        if(arr[idx] == key){
            return idx;
        }
        return findFirstOccurrence(arr, key, idx+1);
    }
    public static void main(String[] args){
        int[] arr = {3,3,6,9,3,10,2,5,8};
        int key = 8;
        System.out.print(findFirstOccurrence(arr, key, 0));
    }
}
