package Backtracking;

//Find & print all permutations of a String
//abc,acb,bac,bca,cab,cba
public class Permutations {
    public static void findPermutation(String str, String ans){
        //base
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args){
        String str = "abc";
        findPermutation(str, "");
    }
}
