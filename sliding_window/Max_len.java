public class Max_len {
    public static void main(String[] args) {
          int l , r , max_len , len , n ;
          l = r = max_len = len = 0;
          String s = "abcedecfd";
          n=s.length()-1;
        
            int Hash[]=new int[256];

            for(int i =0 ; i< Hash.length ; i++)
            {
                Hash[i]=-1;
            }

          while(r<=n)
          {
            if(Hash[s.charAt(r)]!=-1)
            {
                 if(Hash[s.charAt(r)]>=l) l=Hash[s.charAt(r)]+1;
            }
            len=r-l+1;

            if(max_len<len)
            {
                max_len=len;
            }

            Hash[s.charAt(r)]=r;
            r++;
          }
          System.out.println(max_len);
          System.out.println(l);

    }
  

}
