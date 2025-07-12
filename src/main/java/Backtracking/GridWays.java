package Backtracking;

public class GridWays { //O(2^(m+n))
    //Find number of ways to reach from (0,0) to (N-1,M-1) in a NxM Grid.
    //Allowed moves - right or down.
   public static int gridWays(int i, int j, int m, int n){
       //base case
       if(i == m-1 && j == n-1){ //standing on last cell
           return 1;
       }
       if(i == m || j == n){ //crossing boundary
           return 0;
       }
       //no of ways
       int way1 = gridWays(i+1, j, m, n);
       int way2 = gridWays(i, j+1, m, n);
       return way1 + way2;
   }
    public static void main(String[] args){
        int m = 3;
        int n = 3;
        System.out.println("Number of ways: "+gridWays(0,0,m,n));
    }

    //O(2^(m+n)) is very bad, we can solve this problem by using permutation formula in linear time
    //No of characters Down,Right: (n-1+m-1)!
    //Repeating character: (n-1)!*(m-1)!
    //No of ways:(n-1+m-1)!/(n-1)!*(m-1)!
}
