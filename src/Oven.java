
class Oven extends Device
{

    //Private Variables
    private String TYPE;
    private int xwritikotita;
    private String Color;
    private int programmata;
    private String kausimo;


    // Counter Variable
    public static int OvensCounter = 0;
        // Main Constructor
        public Oven(String TYPE, int Xwros, String Color,int Programms,String Eidos_Kausimou,int Mikos, int Ypsos,int Vathos,String Company,String Modelo, int Timi,String Energy_Class)
        {

        super(Mikos,Ypsos,Vathos,Company,Modelo,Timi,Energy_Class);
        this.TYPE = TYPE; this.programmata=Programms; this.xwritikotita=Xwros; this.Color=Color; this.kausimo = Eidos_Kausimou;

        // Counter
        {OvensCounter +=1;}
        }
        // Synartisi Ektypwsis Constructors
        public void PrintOvens()
        {
        System.out.println("Device Type : "+getTYPE());
        System.out.println("Programms : "+getProgrammata()+" Energy Type : "+getKausimo());
        System.out.println("Color :%s "+getColor()+ "Capasity : "+getXwritikotita()+"Lt");
        System.out.println("Lenght : "+getMikos()+ "|| Height : "+ getYpsos() + "|| Depth : "+getVathos());
        System.out.println("Company : "+getCompany()+ "|| Modell : "+getModelo()+ "|| Energy Class : "+ getEnergeia());
        System.out.println("Price : "+getTimi()+"Euros");
        System.out.println("");

        }
        // Synartisi Ektypwsis Counter
        public static void Counter(){System.out.println("OVEN : "+Oven.OvensCounter);}

        //Private Getters
        public String getColor(){return Color;}
        public int getXwritikotita(){return xwritikotita;}
        public String getKausimo(){return kausimo;}
        public int getProgrammata(){return programmata;}
        public String getTYPE() { return TYPE;}


        //Private Setters
        public void setColor(String Color){Color = Color;}
        public void setXwritikotita(int Xwros){xwritikotita = Xwros;}
        public void setEidos_Kausimou(String Eidos_Kausimou){kausimo = Eidos_Kausimou;}
        public void setkatapsixti(int programms){programmata = programms;}
        public void setTYPE(String newTYPE) {
        TYPE = newTYPE;
    }
}
