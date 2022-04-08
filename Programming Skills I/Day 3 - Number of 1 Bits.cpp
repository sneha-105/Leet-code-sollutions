class Solution {
public:
    int hammingWeight(uint32_t n) {
        return __builtin_popcount(n); //two underscore( _ ) in the first position.
    }
};