import java.util.Random;
import java.util.Scanner;

public abstract class Device implements DeviceBasic
{
    //Public Variables
    public int Mikos;
    public int Ypsos;
    public int Vathos;
    public String Company;
    public String Modelo;
    public int Price;
    public String Energy_Class;

    boolean state=true;


    Device(int Mikos, int Ypsos,int Vathos,String Company,String Modelo, int Price,String Energy_Class)
        {
        this.Mikos = Mikos;
        this.Ypsos = Ypsos;
        this.Vathos = Vathos;
        this.Company = Company;
        this.Modelo = Modelo;
        this.Price = Price;
        this.Energy_Class = Energy_Class;

        }

    public Device() {}


    //Getters
    public int getMikos(){return Mikos;}
    public int getYpsos(){return Ypsos;}
    public int getVathos(){return Vathos;}
    public String getCompany(){return Company;}
    public String getModelo(){return Modelo;}
    public int getPrice(){return Price;}
    public String getEnergeia(){return Energy_Class;}



    //Setters
    public void setMikos(int newMikos){this.Mikos= newMikos;}
    public void setYpsos(int newYpsos){this.Ypsos = newYpsos;}
    public void setVathos(int newVathos){this.Vathos = newVathos;}
    public void setCompany(String newCompany){ this.Company = newCompany;}
    public void setModelo(String newModell){this.Modelo = newModell;}
    public void setPrice(int newPrice){this.Price = newPrice;}
    public void setEnergeia(String newEnergy){this.Energy_Class = newEnergy;}




    public void powerOff(){state= false;}
    public void powerOn(){state= true;}
    public void booleanstatus()//Synartisi Elegxou AN einai ON h OFF
    {
        if(state)
        {
            System.out.println("\nThe Device "+Company+" Is ON");
            System.out.println("Turned OFF (n) or (y)?");
            Scanner in = new Scanner(System.in);
            String read = in.nextLine();
            {
                if (read.equals("y")) {System.out.println("DONE!!!");powerOff();}
                else if (read.equals("n")) {System.out.println("DONE!!!");powerOn();}
                else if (!read.equals("y") || !read.equals("n")){System.out.println("!!FAULT CHOICE!!");}
            }
        }
        else if(state)
        {
            System.out.println("\nThe Device"+Company+" Is OFF");
            System.out.println("Turned ON (n) or (y)?");
            Scanner in = new Scanner(System.in);
            String read = in.nextLine();
            {
                if (read.equals("y")) {System.out.println("DONE!!!");powerOn();}
                else if (read.equals("n")) {System.out.println("DONE!!!");powerOff();}
                else if (!read.equals("y") || !read.equals("n")){System.out.println("!!FAULT CHOICE!!");}
            }
        }
        else {System.out.println(" ");}
    }


    public void periodicmaintenance()//Sinartisi Elegxou An Irthe I Wra Gia SERVICE
    {
        Random rand = new Random();
        int rand_WashingMaintain = rand.nextInt(20);
        if (rand_WashingMaintain > 10) {
            System.out.println("\nTHE DEVICE "+Company+" NEEDS MAINTENANCE");
        } else {
            System.out.println("\nTHE DEVICE " + Company + " DOESN'T NEED MAINTENANCE YET");
        }
    }



}
