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
    public int Timi;
    public String Energy_Class;

    boolean state=true;
    String read="y";


    Device(int Mikos, int Ypsos,int Vathos,String Company,String Modelo, int Timi,String Energy_Class)
        {
        this.Mikos = Mikos;
        this.Ypsos = Ypsos;
        this.Vathos = Vathos;
        this.Company = Company;
        this.Modelo = Modelo;
        this.Timi = Timi;
        this.Energy_Class = Energy_Class;
        }

    //Getters
    public int getMikos(){return Mikos;}
    public int getYpsos(){return Ypsos;}
    public int getVathos(){return Vathos;}
    public String getCompany(){return Company;}
    public String getModelo(){return Modelo;}
    public int getTimi(){return Timi;}
    public String getEnergeia(){return Energy_Class;}



    //Setters
    public void setMikos(int newMikos){Mikos= newMikos;}
    public void setYpsos(int newYpsos){Ypsos = newYpsos;}
    public void setVathos(int newVathos){Vathos = newVathos;}
    public void setCompany(String newCompany){ Company = newCompany;}
    public void setModelo(String newModell){Modelo = newModell;}
    public void setTimi(int newTimi){Timi = newTimi;}
    public void setEnergeia(String newEnergy){Energy_Class = newEnergy;}




    public void powerOff(){state= false;}
    public void powerOn(){state= true;}
    public void booleanstatus()
    {
        if(state)
        {
            System.out.println("\nH Syskeui "+Company+" Einai Anoixth");
            System.out.println("Thelete Na Tin Kleisete (n) or (y)?");
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
            System.out.println("\nH Syskeui "+ Company + " Einai Kleisth");
            System.out.println("Thelete Na Tin Anoixete (n) or (y)?");
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


    public void periodicMantainance()
    {
        Random rand = new Random();
        int rand_WashingMaintain = rand.nextInt(20);
        if (rand_WashingMaintain > 10) {
            System.out.println("\nH Syskeyi "+Company+" Tha Xreiastei Service");
        } else {
            System.out.println("\nH Syskeyi Markas " + Company + " Den Xreiazetai sevice");
        }
    }


}
