class Solution {
public:
    double average(vector<int>& salary) {
        sort(salary.begin(), salary.end());
        int ans=0;
        int i;
        for(i=1; i<salary.size()-1; i++){
            ans+=salary[i];
        }
        return (double)ans/(i-1);
    }
};