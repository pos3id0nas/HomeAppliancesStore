import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class WashineMachine extends Device implements java.io.Serializable {

    //Private Variables
    private final String TYPE = "WashineMachine";
    private int Strofes;
    private String Color;
    private int Programms;
    private int Capasity;


    // Counter Variable
    static int WashingsCounter = 0;

    // Main Constructor
    public WashineMachine(String TYPE, int Capasity, int Programms, String Color, int Strofes, int Mikos, int Ypsos, int Vathos, String Company, String Modelo, String Energy_Class, int Price) {
        super(Mikos, Ypsos, Vathos, Company, Modelo, Price, Energy_Class);
        this.Programms = Programms;
        this.Capasity = Capasity;
        this.Color = Color;
        this.Strofes = Strofes;


        // Counter
        {
            WashingsCounter += 1;
        }
    }

    //Default Constructor
        public WashineMachine()
        {
            super();

            { WashingsCounter +=1;}

        }

    //Diadikasia Kataskeuis Constructor Apo Keyboard Input
    public  void NewWashineMachineConstruct(Scanner Input)
    {


        System.out.println("Please Enter The Following Informations");
        System.out.println("Capasity :");
        int Capasity = Input.nextInt();
        setCapasity(Capasity);
        System.out.println("Number Of Programms :");
        int Programms = Input.nextInt();
        setProgramms(Programms);
        System.out.println("Color ?:");
        String Color = Input.next();
        setColor(Color);
        System.out.println("Rounds Per Minute ?:");
        int Strofes = Input.nextInt();
        setStrofes(Strofes);
        System.out.println("Lenght :");
        int Mikos = Input.nextInt();
        setMikos(Mikos);
        System.out.println("Height :");
        int Ypsos = Input.nextInt();
        setYpsos(Ypsos);
        System.out.println("Depth :");
        int Vathos = Input.nextInt();
        setVathos(Vathos);
        System.out.println("Company ?:");
        String Company = Input.next();
        setCompany(Company);
        System.out.println("Model Code:");
        String Modelo = Input.next();
        setModelo(Modelo);
        System.out.println("Energy_Class ?:");
        String Energy_Class = Input.next();
        setEnergeia(Energy_Class);
        System.out.println("Price :");
        int Price = Input.nextInt();
        setPrice(Price);
        }
        //Synartisi Ektypwsis Constructors
        public void PrintWashings ()
        {
            System.out.println("Device Type :WASHINE MACHINE ");
            System.out.println("Programms : " + getProgramms() + " - RPM :  " + getStrofes());
            System.out.println("Color : " + getColor() + " - Capasity :  " + getCapasity() + "Lt");
            System.out.println("Lenght :  " + getMikos() + "|| Height : " + getYpsos() + "|| Depth : " + getVathos());
            System.out.println("Company : " + getCompany() + "|| Modell : " + getModelo() + "|| Energy Class : " + getEnergeia());
            System.out.println("Price : " + getPrice() + "Euros");
            System.out.println("\n");
        }

    //Synartisi Ektypwsis Constructors Se ARXEIO
        public void FileWriteWM()
        {
        try{
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream("Objects.txt", true)));
        writer.print("Device Type : "+TYPE);
        writer.print("|| Capasity : " + getCapasity() + "Lt || Programms : " + getProgramms() );
        writer.print("|| Color : " + getColor() + " || RPM : " + getStrofes());
        writer.print("|| Lenght :  " + getMikos() + "|| Height : " + getYpsos() + "|| Depth : " + getVathos());
        writer.print("|| Company : " + getCompany() + "|| Modell : " + getModelo() + "|| Energy Class : " + getEnergeia());
        writer.print("|| Price : " + Price + "Euros");
        writer.print("\n");
        writer.close();
        System.out.println("FILE WRITE DONE!!\n");

        }
        catch (Exception e) {System.out.println("FILE WRITE ERROR!!\n"); }
        }

        //Synartisi Ektypwsis Counter
        public static void Counter () {
            System.out.println("THE WASHINE MACHINES ARE : " + WashineMachine.WashingsCounter);
        }

        //Private Getters

        public String getColor () {return Color;}
        public int getCapasity () {
            return Capasity;
        }
        public int getProgramms () {
            return Programms;
        }
        public int getStrofes () {
            return Strofes;
        }
        //public String getTYPE() { return TYPE;}


        //Private Setters
        public void setColor (String Color){
            this.Color = Color;
        }
        public void setCapasity ( int Capasity){
            this.Capasity = Capasity;
        }
        public void setStrofes ( int Strofes){
            this.Strofes = Strofes;
        }
        public void setProgramms ( int Programms){
            this.Programms = Programms;
        }
        //public void setTYPE(String newTYPE) {TYPE = newTYPE;}


}
