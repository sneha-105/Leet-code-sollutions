class Solution {
    public int countOdds(int low, int high) {
        int ans;
        if(low%2+high%2==1)
        {
            ans=(high-low+1)/2;     // either low is odd or high is odd but not both
        }
        else
            ans=(high-low)/2+low%2;   // either both are odd or even
        return ans;
        
    }
}