public class CalenderPrinter
{
    public static void main (String[] args) 
    {
        int x = 1;
        String n="";
        while(x<31){
            if (x==5 || x==6 || x==12 || x==13 || x==19 || x==20 ||x==26 || x==27){
                line = month + x +" - WEEKEND";
            };
            if (x==7){
                line = month + x +" - LABOR DAY";
            };
            if (x==25){
                line = month + x + " - END OF THE MARKING PERIOD";
            };
            System.out.printin(line);
        }
    }
}