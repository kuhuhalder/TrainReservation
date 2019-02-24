import java.util.*;
import java.io.*;
public class Plist extends MainSystem 
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        Calendar c1=Calendar.getInstance();
        FareChart ob = new FareChart();
        //MainSystem ob1 = new MainSystem();
        System.out.print("\f");
        System.out.println("PASSENGERS LIST     \t\t\t\t\t\t\tToday's Date : "+c1.get(Calendar.DATE)+"/"+(c1.get(Calendar.MONTH)+1)+"/"+c1.get(Calendar.YEAR));
        for(int i=0;i<100;i++) System.out.print("=");System.out.print("\n");       
        System.out.println("Sl.No.  Name                            Age    Sex   Coach No./Berth No.  Class          Journey Date"); 
        for(int i=0;i<100;i++) System.out.print("=");System.out.print("\n");       
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
        for(int i=0;i<100;i++) System.out.print("=");System.out.print("\n");       
        System.out.println("\n\n\n\n\nPress Enter key to continue.....");
        String ss=br.readLine();
    }
}