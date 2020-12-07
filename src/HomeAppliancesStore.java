import java.util.Scanner;

public class HomeAppliancesStore
{
    String CompanyName;
    String Address;
    int Employees;

    public String getName() {
        return this.CompanyName;
    }
    public void setName(String name) {
        this.CompanyName = name;
    }

    public String getAddress() {
        return this.Address;
    }
    public void setAddress(String newAddress) {
        Address = newAddress;
    }

    public int getEmployees() {
        return this.Employees;
    }
    public void setEmployees(int Employees) {
        this.Employees = Employees;
    }

    public static void main(String[] args)
        {
            
            try
            {

                HomeAppliancesStore store = new HomeAppliancesStore();
                store.setName("COMPANY NAME: UshOP");
                store.setAddress("ADDRESS: SPARTA");
                store.setEmployees (18);

                System.out.println(" ");
                System.out.println("   "+store.getName() + " ||| " + store.getAddress() + " ||| EMPLOYEES: " + store.getEmployees());
                System.out.println("----------------------------------------------------------------");

                System.out.printf("\n");

                //Dhmiourgia Constructors Stin Main Kai ektypwsh Meta Apo Ka8e Dhmioyrgia


                Fridge PITSOS = new Fridge("FRIDGE",500,"BLACK","YES","YES",50, 200, 50, "PITSOS", "PT78GVRY", 350, "AAAA");
                PITSOS.PrintFridges();

                Oven PHILIPS = new Oven("OVEN",40,"SILVER",20,"ELECTRICITY",50,120,60,"PHILIPS","PH886G",350,"AAA");
                PHILIPS.PrintOvens();

                AirCondition TOYATOMI = new AirCondition("AIRCONDITION",200,30,"YES","YES",120,100,30,"TOYATOMI","TM8978H",300,"AAA");
                TOYATOMI.PrintAC();

                WashineMachine KENWOOD = new WashineMachine("WASHINE_MACHINE",50,"BLACK",20,180,80,80,80,"KENWOOD","KW8U8",300,"AAAA");
                KENWOOD.PrintWashings();

                PITSOS.periodicMantainance();
                PHILIPS.periodicMantainance();
                TOYATOMI.periodicMantainance();
                KENWOOD.periodicMantainance();

                PITSOS.booleanstatus();
                PHILIPS.booleanstatus();
                TOYATOMI.booleanstatus();
                KENWOOD.booleanstatus();

                //Ektypwsi Counter
                Fridge.Counter();
                WashineMachine.Counter();
                Oven.Counter();
                AirCondition.Counter();

            }

            catch (Exception e)
            {
            {System.out.println("ERROR!!!");}
            }

        }
}
