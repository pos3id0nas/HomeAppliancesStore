import java.util.Scanner;

class WashineMachine extends Device
{

    //Private Variables
    private final String TYPE = "WashineMachine";
    private int strofes;
    private String Color;
    private int Programms;
    private int Capasity;

    // Counter Variable
    static int WashingsCounter=0;

        // Main Constructor
        public WashineMachine(String TYPE, int Capasity, String Color,int Programms,int Strofes_Ana_Sec,int Mikos, int Ypsos,int Vathos,String Company,String Modelo, int Price,String Energy_Class)
        {
        super(Mikos,Ypsos,Vathos,Company,Modelo,Price,Energy_Class);
        this.Programms=Programms; this.Capasity=Capasity; this.Color=Color; this.strofes = Strofes_Ana_Sec;

        // Counter
        { WashingsCounter +=1;}
        }

        //Default Constructor
        WashineMachine()
        {
            super();
            { WashingsCounter +=1;}

        }

    //Diadikasia Kataskeuis Constructor Apo Keyboard Input
    public void NewWashineMachineConstruct(Scanner input)
    {
        System.out.println("Please Enter The Following Informations");
        Scanner Input = new Scanner(System.in);
        System.out.println("BTUs :");
        int Capasity = Integer.parseInt(Input.nextLine());
        setCapasity(Capasity);
        System.out.println("Number Of Programms :");
        int Programms= Integer.parseInt(Input.nextLine());
        setProgramms(Programms);
        System.out.println("Color ?:");
        String Color= Input.nextLine();
        setColor(Color);
        System.out.println("Rounds Per Minute ?:");
        int Strofes_Ana_Sec =Integer.parseInt(Input.nextLine());
        setstrofes(Strofes_Ana_Sec);
        System.out.println("Lenght :");
        int Mikos = Integer.parseInt(Input.nextLine());
        setMikos(Mikos);
        System.out.println("Height :");
        int Ypsos = Integer.parseInt(Input.nextLine());
        setYpsos(Ypsos);
        System.out.println("Depth :");
        int Vathos = Integer.parseInt(Input.nextLine());
        setVathos(Vathos);
        System.out.println("Company ?:");
        String Company = Input.nextLine();
        setCompany(Company);
        System.out.println("Model Code:");
        String Modelo = Input.nextLine();
        setModelo(Modelo);
        System.out.println("Energy_Class ?:");
        String Energy_Class = Input.nextLine();
        setEnergeia(Energy_Class);
        System.out.println("Price :");
        int Price = Integer.parseInt(Input.nextLine());
        setPrice(Price);
    }
        //Synartisi Ektypwsis Constructors
        public void PrintWashings()
        {
        System.out.println("Device Type : "+TYPE);
        System.out.println("Programms : "+getProgramms()+" - RPM :  "+getstrofes());
        System.out.println("Color : "+getColor()+ " - Capasity :  "+getCapasity()+"Lt");
        System.out.println("Lenght :  "+getMikos()+ "|| Height : "+ getYpsos() + "|| Depth : "+getVathos());
        System.out.println("Company : "+getCompany()+ "|| Modell : "+getModelo()+ "|| Energy Class : "+ getEnergeia());
        System.out.println("Price : "+getPrice()+"Euros");
        System.out.println("\n");
        }

        //Synartisi Ektypwsis Counter
        public static void Counter(){System.out.println("THE WASHINE MACHINES ARE : "+WashineMachine.WashingsCounter);}

    //Private Getters

        public String getColor(){return Color;}
        public int getCapasity(){return Capasity;}
        public int getProgramms(){return Programms;}
        public int getstrofes(){return strofes;}
        //public String getTYPE() { return TYPE;}


        //Private Setters
        public void setColor(String Color){Color = Color;}
        public void setCapasity(int Xwros){Capasity = Capasity;}
        public void setstrofes(int Strofes_Ana_Sec){strofes= Strofes_Ana_Sec;}
        public void setProgramms(int Programms){Programms = Programms;}
        //public void setTYPE(String newTYPE) {TYPE = newTYPE;}
}
