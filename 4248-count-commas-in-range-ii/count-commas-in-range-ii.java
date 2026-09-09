class Solution {
    public long countCommas(long n) {
        long t=n;
        int i=1,c=0;
        long count=0;
        while(n!=0){
            c++;
            n/=10;
        }
        n=t;
        while(i*3 < c ){
            count+= n- (long)Math.pow(10,i*3) +1;
            i++;
        }
        return count;
    }
}