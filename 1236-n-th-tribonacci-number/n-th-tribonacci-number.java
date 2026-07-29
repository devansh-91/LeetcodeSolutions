class Solution {
    public int tribonacci(int n) {
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        int t0=0,t1=1,t2=1,t3=0;
        n=n-2;
        while(n!=0){
            t3=t0+t1+t2;
            t0=t1;
            t1=t2;
            t2=t3;
            n--;
        }
        // System.out.println(t3);
        return t3;
    }
}