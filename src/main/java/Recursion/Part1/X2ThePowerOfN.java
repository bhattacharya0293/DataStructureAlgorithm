package Recursion.Part1;

public class X2ThePowerOfN {
    public static int power(int x, int n){ //O(n)
        //base case
        if(n == 0){
            return 1;
        }
        //logic
        return x * power(x,n-1);
    }
    public static int optimizedPower(int x, int n){
        //base case
        if(n == 0){
            return 1;
        }
        //logic
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        //odd
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args){
        int x = 2;
        int n = 10;
        System.out.print(optimizedPower(x,n));
    }
}
