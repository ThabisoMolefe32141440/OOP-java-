
/**
 * Write a description of class Computer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class ComputerObject 
{
    private String StockCode;
    private int P_Cost;
    private String StaffNumber;
    private String SerialNumber;
    private String CPU_Type;
    private String CPU_Speed;
    private String Ram_Amount;
    protected ComputerObject(){};
    protected ComputerObject(String StockCode,int P_Cost,String StaffNumber,String SerialNumber,String CPU_Type,String CPU_Speed,String Ram_Amount)
    {
       setStockCode(StockCode);
       setP_Cost(P_Cost);
       setStaffNumber(StaffNumber);
       setSerialNumber(SerialNumber);
       setCPU_Type(CPU_Type);
       setCPU_Speed(CPU_Speed);
       setRam_Amount(Ram_Amount);
    }
    public void setStockCode(String StockCode)
    {
        this.StockCode=StockCode;
    }
    public void setP_Cost(int P_Cost)
    {
        this.P_Cost=P_Cost;
    }
    public void setStaffNumber(String StaffNumber )
    {
        this.StaffNumber=StaffNumber;
    }
    public void setSerialNumber(String SerialNumber)
    {
        this.SerialNumber=SerialNumber;
    }
    public void setCPU_Type(String CPU_Type )
    {
        this.CPU_Type=CPU_Type;
    }
    public void setCPU_Speed(String CPU_Speed)
    {
        this.CPU_Speed=CPU_Speed;
    }
    public void setRam_Amount(String Ram_Amount)
    {
        this.Ram_Amount=Ram_Amount;
    }
    public String getStaffNumber()
    {
        return StaffNumber;
    }
    public String getSerialNumber()
    {
        return SerialNumber;
    }
    public String getCPU_Type()
    {
        return CPU_Type;
    }
    public String getCPU_Speed()
    {
        return CPU_Speed;
    }
    public String getRam_Amount()
    {
        return Ram_Amount;
    }
    public String getStockCode()
    {
        return StockCode;
    }
    public int getP_Cost()
    {
        return P_Cost;
    }
    public abstract int AnnualDepriciation();
    
    
}
