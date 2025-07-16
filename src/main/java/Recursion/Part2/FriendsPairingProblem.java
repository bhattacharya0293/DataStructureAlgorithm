package Recursion.Part2;

public class FriendsPairingProblem {
    public static int friendsPairing(int n){
        //base
        if(n == 1 || n == 2){
            return n;
        }
        //logic
        //single
        int fnm1 = friendsPairing(n-1);
        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
    public static void main(String[] args){
        int n = 3;
        System.out.print("ways: "+friendsPairing(n));
    }
}
