package Recursion.Part1;

public class LastOccurrence {
    public static int findLastOccurrence(int[] arr, int key, int idx){
        //base case
        if(idx == arr.length){
            return -1;
        }
        //logic
        int isFound = findLastOccurrence(arr, key, idx+1);
        if(isFound == -1 && arr[idx] == key){
            return idx;
        }
        return isFound;
    }
    public static void main(String[] args){
        int[] arr = {8,3,6,9,8,10,2,5,8};
        int key = 8;
        System.out.print(findLastOccurrence(arr, key, 0));
    }
}
