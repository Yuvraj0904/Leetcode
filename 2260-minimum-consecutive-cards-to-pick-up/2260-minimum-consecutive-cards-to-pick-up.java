class Solution {
    public int minimumCardPickup(int[] cards) {
       int l=0;
       int r=0;
       HashMap<Integer,Integer>mpp=new HashMap<>();
     int minCnt=Integer.MAX_VALUE;
       while(r<cards.length){
            if(mpp.containsKey(cards[r])){
                minCnt=Math.min(minCnt,r-mpp.get(cards[r])+1);
                l=mpp.get(cards[r])+1;
            }
            mpp.put(cards[r],r);
            r++;
       } 
       return minCnt==Integer.MAX_VALUE?-1:minCnt;
    }
}