class Solution {
    public int addDigits(int num) {
        int sum=num;
        int sum1=0;
        while(sum>=10){
             int n=sum;
             while(n>0){
                sum1+=n%10;
                n/=10;
             }
             sum=sum1;
             sum1=0;
        }
        return sum;
    }
}