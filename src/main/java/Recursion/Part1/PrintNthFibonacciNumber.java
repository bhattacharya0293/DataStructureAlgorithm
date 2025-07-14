package Recursion.Part1;

public class PrintNthFibonacciNumber {
    //Fibonacci: 0 1 1 2 3 5 8 13 21
    public static int findFib(int n){
        //base case
        if(n == 0 || n == 1){
            return n;
        }
        int num = findFib(n-1) + findFib(n-2);
        return num;
    }
    public static void main(String[] args){
        int n = 8;
        System.out.print(findFib(n));
    }
}
