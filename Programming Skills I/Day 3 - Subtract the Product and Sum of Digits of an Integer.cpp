class Solution {
public:
    int subtractProductAndSum(int n) {
        int prod = 1,sum =0,d=0;
        while(n){
            d = n%10; // this will take the last digit from n and store it in d.
            prod *= d;
            sum += d;
            n= n/10; // it reduces n by performing integer division
        }
        return prod-sum;
    }
};