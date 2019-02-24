import java.util.*;
import java.io.*;
public class Dlist extends MainSystem 
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        Calendar c1=Calendar.getInstance();
        FareChart ob = new FareChart();
        //MainSystem ob1 = new MainSystem();
        System.out.print("\f");
        System.out.println("C A N C E L L A T I O N \t\t\t\t\t\t\tToday's Date : "+c1.get(Calendar.DATE)+"/"+(c1.get(Calendar.MONTH)+1)+"/"+c1.get(Calendar.YEAR));
        for(int i=0;i<110;i++) System.out.print("=");System.out.print("\n");       
        System.out.println("Sl.No.  Name                            Age    Sex   Coach No./Berth No.  Class          Journey Date"); 
        for(int i=0;i<110;i++) System.out.print("=");System.out.print("\n");       
        int y=0;
        for(int i=0;i<100;i++)
        {
            if(r[i][1]!=null)
            y++;
        }
        for(int i=0;i<y;i++)
        {
            System.out.printf("%3s",r[i][8]);
            System.out.printf("  ");
            System.out.printf("%-35s",r[i][0]);
            System.out.printf("%-8s",r[i][1]);
            System.out.printf("%-8s",r[i][2]);
            System.out.printf("%-17s",r[i][7]);
            System.out.printf("%-15s",r[i][5]);
            System.out.printf("%-15s",r[i][3]);
            System.out.println();
        }
        for(int i=0;i<110;i++) System.out.print("=");System.out.print("\n"); 
        System.out.print("Enter Serial No. to be Cancelled : ");
        String x="";int i=0,j=0,k=0;
        x = br.readLine();
        String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
        a1=a2=a3=a4=a5=a6=a7=a8=a9=a10="";
        for(i=0;i<y;i++)
        {
            if(x.equals(r[i][8].trim()))
            {
                k=i;
                 a1=(r[k][0]);
                 a2=(r[k][1]);
                 a3=(r[k][2]);
                 a4=(r[k][3]);
                 a5=(r[k][4]);
                 a6=(r[k][5]);
                 a7=(r[k][6]);
                 a8=(r[k][7]);
                 a9=(r[k][8]);
                 a10=(r[k][9]);
                for(j=i+1;j<y+1;j++,k++)
                {
                    r[k][0]=r[j][0];
                    r[k][1]=r[j][1];
                    r[k][2]=r[j][2];
                    r[k][3]=r[j][3];
                    r[k][4]=r[j][4];
                    r[k][5]=r[j][5];
                    r[k][6]=r[j][6];
                    r[k][7]=r[j][7];
                    r[k][8]=Integer.toString(k+1);
                    r[k][9]=r[j][9];
                }
                break;
            }
        }
        System.out.println("Ticket has been cancelled");
        for(i=0;i<110;i++) System.out.print("=");System.out.print("\n");       
        System.out.println("Train No. PNR NO.   Name                            Coach No.     Class        Journey Date    Refund Amount"); 
        for(i=0;i<110;i++) System.out.print("=");System.out.print("\n");       
            System.out.printf("%3s",a5);
            System.out.printf("     ");
            System.out.printf("%-10s",a7);
            System.out.printf("%-33s",(a1+"/"+a2+"/"+a3));
            System.out.printf("%-13s",a8);
            System.out.printf("%-13s",a6);
            System.out.printf("%-18s",a4);
            double t=Double.parseDouble(a10.trim());
            t=t-t*40/100.0;
            String t1=Double.toString(t);
            System.out.printf("%10s",t1);
            //System.out.printf("%-15s",r[i][3]);
            System.out.println();
        System.out.println("\n\n\n\n\nPress Enter key to continue.....");
        String ss=br.readLine();
    }
}