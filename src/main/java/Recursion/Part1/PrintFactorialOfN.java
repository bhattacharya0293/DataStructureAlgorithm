package Recursion.Part1;

public class PrintFactorialOfN {
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fnm = fact(n-1);
        int fn = n * fnm;
        return fn;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.print(fact(5));
    }
}
