class Encoding
{
    public static void main(String str,int val)
    {
        int l=str.length();int c=0;
        
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            c=0;
            for(int j=65;j<=90;j++)
           { c=c+1;
               if(ch==j)
               System.out.println(ch+" "+c);}
            }
        }}