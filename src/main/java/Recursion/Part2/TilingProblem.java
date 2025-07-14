package Recursion.Part2;

public class TilingProblem {
    public static int ways(int n){
        //base
        if(n == 0 || n == 1){
            return 1;
        }
        //logic
        //horizontal
        int tileH = ways(n-2);
        //vertical
        int tileV = ways(n-1);
        int tileWays = tileH + tileV;
        return tileWays;
    }
    public static void main(String[] args){
        int n = 3;
        System.out.print(ways(n));
    }
}
