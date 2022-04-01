class Solution {
    public void reverseString(char[] s) {
        //using two pointers method
        int st =0;
        int en=s.length-1;
        
        while(st<en){
            char temp = s[st];
            s[st++]=s[en];
            s[en--]=temp;
        }

    }
}

///////////


class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        
        while(start < end){
            swap(s, start, end);
            start++;
            end--;
        }
    }
    
    private void swap(char[] s, int start, int end){
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    
    }
}