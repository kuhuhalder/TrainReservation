public class Enquiry
{
    static String t[][]={{"Rajdhani Express","12501","Kolkata  ", "New Delhi"},
                  {"Rajdhani Express","12502","New Delhi", "Kolkata"},                  
                  {"Shatabdi Express","12503","Kolkata  ", "New Delhi"},
                  {"Shatabdi Express","12504","New Delhi", "Kolkata"},
                  {"Shatabdi Express","12505","Kolkata  ", "Bhubaneswar"},
                  {"Shatabdi Express","12506","Bhubaneswar", "Kolkata"},
                  {"Geetanjali Express","12507","Kolkata  ","Mumbai Central"},
                  {"Geetanjali Express","12508","Mumbai Central", "Kolkata"},
                  {"Coromondal Express","12509","Kolkata  ","Chennai Central"},
                  {"Coromondal Express","12510","Chennai Central","Kolkata"},
                  {"Jodhpur Express  ","12511","Kolkata  ","Jaipur"},
                  {"Jodhpur Express  ","12512","Jaipur   ","Kolkata"},
                  {"Kalka Mail       ","12513","Kolkata  ","Kalka"},
                  {"Kalka Mail       ","12514","Kalka    ","Kolkata"},
                  {"Jaswantpur Express","12515","Kolkata  ","Bangalore"},
                  {"Jaswantpur Express","12516","Bangalore", "Kolkata"},
                  {"Falaknama  Express","12517","Kolkata  ", "Hyderabad"},
                  {"Falaknama  Express","12518","Hyderabad", "Kolkaa"},
                  };
    public static void main()  
    {
        System.out.println("T R A I N D E T A I L S - E N Q I R Y");
        for(int i=0;i<110;i++) System.out.print("=");System.out.print("\n");
        System.out.println("Train name                    Train No.           From                             To");
        for(int i=0;i<110;i++) System.out.print("=");System.out.print("\n");
        for(int i=0;i<18;i++)
        System.out.println(t[i][0]+"\t\t"+t[i][1]+"\t\t"+t[i][2]+"\t\t\t"+t[i][3]);
        for(int i=0;i<110;i++) System.out.print("=");System.out.print("\n");
        for(long i=-5000000000l;i<=10000000l;i++);
    }
}