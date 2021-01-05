import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class Oven extends Device  implements java.io.Serializable
{

    //Private Variables
    private final String TYPE = "Oven";
    private int Capasity;
    private String Color;
    private int Programms;
    private String kausimo;


    // Counter Variable
    public static int OvensCounter = 0;
        // Main Constructor
        public Oven(String TYPE, int Capasity, String Color,int Programms,String Eidos_Kausimou,int Mikos, int Ypsos,int Vathos,String Company,String Modelo, int Price,String Energy_Class)
        {

        super(Mikos,Ypsos,Vathos,Company,Modelo,Price,Energy_Class);
        this.Programms=Programms; this.Capasity=Capasity; this.Color=Color; this.kausimo = Eidos_Kausimou;

        // Counter
        {OvensCounter +=1;}
        }

    //Default Constructor
    public Oven()
    {
        super();
        // Counter
        {OvensCounter +=1;}
    }

    //Diadikasia Kataskeuis Constructor Apo Keyboard Input
    public void NewOvenConstruct(Scanner input)
    {
        System.out.println("Please Enter The Following Informations");
        Scanner Input = new Scanner(System.in);
        System.out.println("Capasity :");
        int Capasity = Integer.parseInt(Input.nextLine());
        setCapasity(Capasity);
        System.out.println("Number Of Programms :");
        int Programms= Integer.parseInt(Input.nextLine());
        setProgramms(Programms);
        System.out.println("Color ?:");
        String Color= Input.nextLine();
        setColor(Color);
        System.out.println("Energy Type ?:");
        String Eidos_Kausimou= Input.nextLine();
        setEidos_Kausimou(Eidos_Kausimou);
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
        // Synartisi Ektypwsis Constructors
        public void PrintOvens()
        {
        System.out.println("Device Type : "+TYPE);
        System.out.println("Programms : "+getProgramms()+" || Energy Type : "+getKausimo());
        System.out.println("Color : "+getColor()+ " Capasity : "+getCapasity()+"Lt");
        System.out.println("Lenght : "+getMikos()+ " || Height : "+ getYpsos() + " || Depth : "+getVathos());
        System.out.println("Company : "+getCompany()+ " || Modell : "+getModelo()+ " || Energy Class : "+ getEnergeia());
        System.out.println("Price : "+getPrice()+"Euros");
        System.out.println("\n");

        }


        //Synartisi Ektypwsis Constructors Se ARXEIO
        public void FileWriteO()
        {
            try{
                PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream("Objects.txt", true)));
                writer.print("Device Type : "+TYPE);
                writer.print("|| BTU's : " + getCapasity() + "Lt || Programms : " + getProgramms() );
                writer.print("|| Color : " + getColor() + " || Energy TYpe : " + getKausimo());
                writer.print("|| Lenght :  " + getMikos() + "|| Height : " + getYpsos() + "|| Depth : " + getVathos());
                writer.print("|| Company : " + getCompany() + "|| Modell : " + getModelo() + "|| Energy Class : " + getEnergeia());
                writer.print("|| Price : " + getPrice() + "Euros");
                writer.print("\n");
                writer.close();
                System.out.println("FILE WRITE DONE!!\n");

            }
            catch (Exception e) {System.out.println("FILE WRITE ERROR!!\n"); }
        }

        // Synartisi Ektypwsis Counter
        public static void Counter(){System.out.println("THE OVENS ARE : "+Oven.OvensCounter);}

        //Private Getters
        public String getColor(){return Color;}
        public int getCapasity(){return Capasity;}
        public String getKausimo(){return kausimo;}
        public int getProgramms(){return Programms;}
        //public String getTYPE() { return TYPE;}


        //Private Setters
        public void setColor(String Color){Color = Color;}
        public void setCapasity(int Capasity){Capasity = Capasity;}
        public void setEidos_Kausimou(String Eidos_Kausimou){kausimo = Eidos_Kausimou;}
        public void setProgramms(int programms){Programms = Programms;}
        //public void setTYPE(String newTYPE) {TYPE = newTYPE;}
}
