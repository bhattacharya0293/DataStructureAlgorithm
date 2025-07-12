package Backtracking;

public class FindSubsets {
    //Find & print all subsets of a given string
    //String s = "abc"
    //result = a,b,c,ab,bc,ac,abc
    public static void findSubsets(String str, String ans, int i){
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.print("null");
            }
            System.out.println(ans);
            return;
        }
        //yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //No choice
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        findSubsets("abc", "", 0);
    }
}
