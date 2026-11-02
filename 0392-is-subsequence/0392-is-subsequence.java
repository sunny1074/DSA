class Solution {
    public boolean isSubsequence(String s, String t) {
        Queue<Character> pq = new LinkedList<>();
        for(int i=0; i<s.length(); i++){
            pq.add(s.charAt(i));

        }

        for(int j=0; j<t.length(); j++){
            if(pq.isEmpty()) break;
            if(pq.peek() == t.charAt(j)){
                pq.poll();
            }
        }
        if(pq.isEmpty()) return true;
        return false;
    }
}