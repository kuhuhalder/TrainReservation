public class FareChart
{
    static String f[][]={{"Rajdhani Exp    ","12501","Kolkata    ", "New Delhi  ","3750","2350","    ","    "},
                  {"Rajdhani Exp    ","12502","New Delhi  ",        "Kolkata    ","3750","2350","    ","    "},                  
                  {"Shatabdi Exp    ","12503","Kolkata    ",        "New Delhi  ","4250","    ","    ","2950"},
                  {"Shatabdi Exp    ","12504","New Delhi  ",        "Kolkata    ","4250","    ","    ","2950"},
                  {"Shatabdi Exp    ","12505","Kolkata    ",        "Bhubneswar ","2250","    ","    ","1150"},
                  {"Shatabdi Exp    ","12506","Bhubapneswar ",        "Kolkata    ","2250","    ","    ","1150"},
                  {"Geetanjali Exp  ","12507","Kolkata    ",        "Mumbai Cnt ","4750","2850","1050","    "},
                  {"Geetanjali Exp  ","12508","Mumbai Cnt ",        "Kolkata    ","4750","2850","1050","    "},
                  {"Coromondal Exp  ","12509","Kolkata    ",        "Chennai Cnt","3450","1950"," 950","    "},
                  {"Coromondal Exp  ","12510","Chennai Cnt",        "Kolkata    ","3450","1950"," 950","    "},
                  {"Jodhpur Exp     ","12511","Kolkata    ",        "Jaipur     ","3850","2550"," 975","    "},
                  {"Jodhpur Exp     ","12512","Jaipur     ",        "Kolkata    ","3850","2550"," 975","    "},
                  {"Kalka Mail      ","12513","Kolkata    ",        "Kalka      ","3750","2650","1175","    "},
                  {"Kalka Mail      ","12514","Kalka      ",        "Kolkata    ","3750","2650","1175","    "},
                  {"Jaswantpur Exp  ","12515","Kolkata    ",        "Bangalore  ","3650","2250"," 975","    "},
                  {"Jaswantpur Exp  ","12516","Bangalore  ",        "Kolkata    ","3650","2250"," 975","    "},
                  {"Falaknama  Exp  ","12517","Kolkata    ",        "Hyderabad  ","3250","2150"," 950","    "},
                  {"Falaknama  Exp  ","12518","Hyderabad  ",        "Kolkata    ","3250","2150"," 950","    "},
                  };
                  
    public static void main()  
    {
        System.out.println("Train name        Train No. From              To           AC 1ST   AC 3RD  SLEEPER  CHAIR CAR");
        for(int i=0;i<94;i++) System.out.print("=");System.out.print("\n");
        for(int i=0;i<18;i++)
        System.out.println(f[i][0]+"   "+f[i][1]+"    "+f[i][2]+"    "+f[i][3]+"       "+f[i][4]+"    "+f[i][5]+"      "+f[i][6]+"     "+f[i][7]);
        for(int i=0;i<94;i++) System.out.print("=");System.out.print("\n");
        for(long i=-5000000000l;i<=10000000l;i++);
    }
}