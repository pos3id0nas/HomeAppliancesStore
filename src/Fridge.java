import java.util.Scanner;

class Fridge extends Device
{

    //boolean state = false;
    //Private Variables
    private final String TYPE= "Fridge";
    private String Color;
    private String Othoni;
    private String katapsixti;
    private int Capasity;

    // Counter Variable
    public static int FridgeCounter=0;

        // Main Constructor
        Fridge(int Capasity, String Color,String katapsixti, String Othoni,int Mikos, int Ypsos,int Vathos,String Company,String Modelo, int Price,String Energy_Class)
        {
            super(Mikos,Ypsos,Vathos,Company,Modelo,Price,Energy_Class);
            this.Capasity = Capasity; this.Color = Color; this.katapsixti = katapsixti; this.Othoni = Othoni;

        // Counter
        { FridgeCounter +=1;}

        }

        //Default Constructor
        Fridge()
        {
            super();
            { FridgeCounter +=1;}
        }

    //Diadikasia Kataskeuis Constructor Apo Keyboard Input
    public void NewFridgeConstruct(Scanner input)
        {
            System.out.println("Please Enter The Following Informations");
            Scanner Input = new Scanner(System.in);
            System.out.println("Capacity :");
            int Capasity = Integer.parseInt(Input.nextLine());
            setCapasity(Capasity);
            System.out.println("Color :");
            String Color= Input.nextLine();
            setColor(Color);
            System.out.println("Have a Freezer ?:");
            String katapsixti= Input.nextLine();
            setkatapsixti(katapsixti);
            System.out.println("Have An LCD Screen ?:");
            String Othoni= Input.nextLine();
            setOthoni(Othoni);
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
        public void PrintFridges ()
        {
        System.out.println("Device Type : "+ TYPE);
        System.out.println("Color :" + getColor() + " || Capasity :" + getCapasity()+"Lt");
        System.out.println("LCD Screen : " + getOthoni());
        System.out.println("Froze : " + getkatapsixti());
        System.out.println("Lenght : "+getMikos()+ " || Height : "+ getYpsos() + " || Depth : "+getVathos());
        System.out.println("Company : "+getCompany()+ " || Modell : "+getModelo()+ " || Energy Class : "+ getEnergeia());
        System.out.println("Price : "+getPrice()+"Euros");
        System.out.println("\n");
        }
        //Synartisi Ektypwsis Counter
        public static void Counter(){System.out.println("THE FRIDGES ARE : "+Fridge.FridgeCounter);}



    //Private Getters

        public String getColor(){return Color;}
        public int getCapasity(){return Capasity;}
        public String getOthoni(){return Othoni;}
        public String getkatapsixti() {return katapsixti;}
        //public String getTYPE() {return TYPE;}

        //Private Setters

        public void setColor (String Color){this.Color = Color;}
        public void setCapasity ( int Capasity){this.Capasity = Capasity;}
        public void setOthoni (String lcd){this.Othoni = lcd;}
        public void setkatapsixti (String Katapsixi){this.katapsixti = Katapsixi;}
        //public void setTYPE(String newTYPE) {TYPE = newTYPE;}

}
