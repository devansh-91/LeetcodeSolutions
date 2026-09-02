class Solution {
    public int maximumPopulation(int[][] logs) {
        int row = logs.length;
        int p=0,y=0;
        int max=0;
        int min=2050;
        for(int i=0;i<row;i++){
            min=Math.min(logs[i][0],min);
            max=Math.max(max,logs[i][1]);
        }
        for(int i=min;i<=max;i++){
            int c=0;
            for(int j=0;j<row;j++)
                if(i>=logs[j][0] && i<logs[j][1])
                    c++;
            if(c>p){
                p=c;
                y=i;
            }
        }
        return y;
    }
}