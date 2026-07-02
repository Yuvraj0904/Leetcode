class Solution {
    int checkCnt(String answerKey,char ch,int k){
        int low=0;
        int high=0;
        int n=answerKey.length();
        int changes=0;
        int maxLen=0;
    while(high<n){
        if(answerKey.charAt(high)!=ch){
            changes++;
        }
        while(changes>k){
            if(answerKey.charAt(low)!=ch){
                changes--;
            }
                low++;
        }
        maxLen=Math.max(high-low+1,maxLen);
    high++;
    }
    return maxLen;
    }
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(checkCnt(answerKey,'T',k),checkCnt(answerKey,'F',k));
    }
}