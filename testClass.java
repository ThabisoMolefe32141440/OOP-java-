
/**
 * Write a description of class testClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testClass
{
    public static void main(String [] args)
    {
        System.out.print("\f");
        Desktop desktop1= new Desktop("AC201245",15000,1000,7,"Unit 10 G4","00007654","34568976","Intel core 10","3GHz","2");
        Desktop desktop2= new Desktop("DD120342",25000,7000,6,"Unit 10 G2","06877654","39780766","Dual core 11","2.2GHz","4");
        Laptop Laptop1= new Laptop("ZC202247",15000,12,"65789076","56743546","Dual core I 11","3.2GHz","8");
        Laptop Laptop2= new Laptop("FD193341",10000,11,"54654368","64546546","Dual core I 19","4.2GHz","3");
        ComputerObject Computer [] = new ComputerObject[4];
        Computer[0]=desktop1;
        Computer[1]=Laptop1;
        Computer[2]=desktop2;
        Computer[3]=Laptop2;
        for(int k=0 ; k<Computer.length;k++)
        {
           System.out.println("Device "+ k +" is a " +Computer[k]+" and its Annual Depriciation is "+Computer[k].AnnualDepriciation());
        }
    }
}
