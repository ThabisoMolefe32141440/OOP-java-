
/**
 * Write a description of class Deskop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Desktop extends ComputerObject
{
    private int Residual_Value;
    private int UseFul_Life;
    private String OfficeNumber;
    public Desktop(){};
    public Desktop(String StockCode,int P_Cost,int Residual_Value,int UseFul_Life,String OfficeNumber,String StaffNumber,String SerialNumber,String CPU_Type,String CPU_Speed,String Ram_Amount)
    {
        super(StockCode,P_Cost,StaffNumber,SerialNumber,CPU_Type,CPU_Speed,Ram_Amount);
        setResidual_Value(Residual_Value);
        setUserFul_Life(UseFul_Life);
        setOfficeNumber(OfficeNumber);
    }
    public void setOfficeNumber(String OfficeNumber )
    {
        this.OfficeNumber=OfficeNumber;
    }
    public void setResidual_Value(int Residual_Value)
    {
        this.Residual_Value=Residual_Value;
    }
    public void setUserFul_Life(int UseFul_Life)
    {
        this.UseFul_Life=UseFul_Life;
    }
    public int getUseFul_Life()
    {
        return UseFul_Life;
    }
    public int getResidual_Value()
    {
        return Residual_Value;
    }
    public String getOfficeNumber()
    {
        return OfficeNumber;
    }
    public int AnnualDepriciation()
    {
        int A_Depriciation=(super.getP_Cost()-Residual_Value)/UseFul_Life;
        return A_Depriciation;
    }
    
    //@Override
    public String toString()
    {
        String Str ="desktop computer with a stock code of "+super.getStockCode()+" ,purchasing price of "+ super.getP_Cost() +" ,residual vale of "+Residual_Value+" ,a useful life of "+UseFul_Life;
        return Str;
    }
}
