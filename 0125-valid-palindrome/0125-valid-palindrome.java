class Solution {
    public boolean isPalindrome(String str) {
    //    str=str.toLowerCase();
       String s= str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for(int i=0;i<s.length()/2;i++){
            char start=s.charAt(i);
            char end=s.charAt(s.length()-1-i); //end ko kam kar rahe hai idhar

            if(start!=end){
                return false;
            }
        }
        return true;
    }
}