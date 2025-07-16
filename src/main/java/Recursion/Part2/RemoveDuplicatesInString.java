package Recursion.Part2;

public class RemoveDuplicatesInString {
    //"appnnacollege"
    public static void removeDuplicate(String s, int idx, StringBuilder str, boolean[] map){
        //base
        if(idx == s.length()){
            System.out.println(str);
            return;
        }
        //logic
        char currChar = s.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicate(s, idx+1, str, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicate(s, idx+1, str.append(currChar), map);
        }
    }
    public static void main(String[] args){
        String s = "appnnacollege";
        removeDuplicate(s, 0, new StringBuilder(""), new boolean[26]);
    }
}
