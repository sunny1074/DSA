class Solution {
    public int strStr(String haystack, String needle) {
      int n = haystack.length();
      int m = needle.length();
      if ( m == 0){
        return 0;
      }
      for(int i=0; i<=(n-m); i++){
        String str1 = haystack.substring(i, i+m);
        if(str1.equals(needle)){
            return i;
        }
      }
      return -1;
    }
}