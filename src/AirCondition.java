import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class AirCondition extends Device  implements java.io.Serializable
{
    //Private Variables
    private final String TYPE = "AirCondition";
    private int BTU;
    private int DBL;
    private String ionist;
    private String wifi;

    //Counter Varieable
    public static int ACounter = 0;

        // Main Constructor
        AirCondition(String TYPE,int BTU,int DBL,String Ionistis,String WIFI,int Mikos, int Ypsos,int Vathos,String Company,String Modelo, int Price,String Energy_Class)
        {
            super(Mikos,Ypsos,Vathos,Company,Modelo,Price,Energy_Class);
            this.BTU=BTU; this.DBL=DBL; this.ionist =Ionistis; this.wifi=WIFI;

        //Counter
        {ACounter +=1;}
        }

        //Default Constructor
        AirCondition()
        {
            super();
            {ACounter +=1;}
        }
    //Diadikasia Kataskeuis Constructor Apo Keyboard Input
    public void NewACConstruct(Scanner input)
    {
        System.out.println("Please Enter The Following Informations");
        Scanner Input = new Scanner(System.in);
        System.out.println("BTUs :");
        int BTU = Integer.parseInt(Input.nextLine());
        setBTU(BTU);
        System.out.println("DBLs Noise :");
        int DBL= Integer.parseInt(Input.nextLine());
        setDBL(DBL);
        System.out.println("Have an Ionizer ?:");
        String Ionistis= Input.nextLine();
        setionist(Ionistis);
        System.out.println("Have A WIFI ?:");
        String WIFI= Input.nextLine();
        setWIFI(WIFI);
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
        public void PrintAC()
        {
        System.out.println("Device Type : "+ TYPE);
        System.out.println("BTUs :"+getBTU()+" || DBL Noice :"+getDBL()+"dB");
        System.out.println("Inventor :"+getionistis());
        System.out.println("WiFi :"+getwifi());
        System.out.println("Lenght : "+getMikos()+ " || Height : "+ getYpsos() + " || Depth : "+getVathos());
        System.out.println("Company : "+getCompany()+ " || Modell : "+getModelo()+ " || Energy Class : "+ getEnergeia());
        System.out.println("Price : "+getPrice()+"Euros");
        System.out.println("\n");

        }

        //Synartisi Ektypwsis Constructors Se ARXEIO
        public void FileWriteAC()
        {
            try{
                PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream("Objects.txt", true)));
                writer.print("Device Type : "+TYPE);
                writer.print("|| BTU's : " + getBTU() + "Lt || DBL Noice : : " + getDBL() );
                writer.print("|| Ionizer : " + getionistis() + " || WIFI : " + getwifi());
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
        public static void Counter(){System.out.println("THE AIR_CONDITIONS ARE: "+AirCondition.ACounter);}

        //Private Getters
        public int getDBL(){return this.DBL;}
        public int getBTU(){return this.BTU;}
        public String getwifi(){return this.wifi;}
        public String getionistis(){return this.ionist;}
        //public String getTYPE() { return TYPE;}



        //Private Setters
        public void setDBL(int Thoryvos){this.DBL = Thoryvos;}
        public void setBTU(int BTU){this.BTU = BTU;}
        public void setWIFI(String WIFI){this.wifi= WIFI;}
        public void setionist(String ionistis){this.ionist = ionistis;}
        //public void setTYPE(String newTYPE) {this.TYPE = newTYPE;}
    }

