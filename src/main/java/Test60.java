public class Test60 {
    boolean[] flag = new boolean[10];

    public String getPermutation(int n, int k) {
        int p = 1;
        StringBuilder res=new StringBuilder();
        if(n==1)return "1";
        for (int i = 1; i < n; i++)
            p = p * i;
        for(int j=n-1;j>=1;j--)
        {
            int t=k/p+1;
            if(k%p==0)t=k/p;
            res.append((select(t,n)));
            k=k-p*(t-1);
            p=p/j;
        }
        res.append(select(1,n));
        return res.toString();
    }
    public String select(int t,int n){
        int k=0;
        int i;
        for( i=1;i<n;i++)
        {
            if(!flag[i])
            {
                k++;
                if(k==t) {
                    flag[i]=true;
                    break;
                }
            }
        }
        return String.valueOf(i);
    }

}