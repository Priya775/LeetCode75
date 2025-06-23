class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i< word1.length() || i<word2.length(); i++){
            if(word1.length() > i){
                result.append(word1.charAt(i));
            }
            if(word2.length() >i){
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}