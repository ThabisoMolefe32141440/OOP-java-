
/**
 * Write a description of class Laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Laptop extends ComputerObject 
{
    private int ScreenSize =13;
    public Laptop(){};
    public Laptop(String StockCode,int P_Cost,int ScreenSize,String StaffNumber,String SerialNumber,String CPU_Type,String CPU_Speed,String Ram_Amount)
    {
        super(StockCode,P_Cost,StaffNumber,SerialNumber,CPU_Type,CPU_Speed,Ram_Amount);
        setScreenSize(ScreenSize);
    }
    public void setScreenSize(int ScreenSize)
    {
       this.ScreenSize=ScreenSize;
    }
    public int getScreenSize()
    {
        return ScreenSize;
    }
    public int AnnualDepriciation()
    {
        int A_Depriciation=0;
        if(ScreenSize >=12 )
        {
            A_Depriciation=(super.getP_Cost() *20)/100;
        }
        else
        {
            A_Depriciation=(super.getP_Cost() *25)/100;
        }
        return A_Depriciation;
    }
    //@Override
    public String toString()
    {
        String Str ="laptop with a stock code of "+super.getStockCode()+" ,purchasing price of "+ super.getP_Cost()+", a screen size of "+ScreenSize+" inch ";
        return Str;
    }
}
