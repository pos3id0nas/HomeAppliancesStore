
class WashineMachine extends Device
{

    //Private Variables
    private String TYPE;
    private int strofes;
    private String xrwma;
    private int programmata;
    private int xwritikotita;

    // Counter Variable
    static int WashingsCounter=0;

        // Main Constructor
        public WashineMachine(String TYPE, int Xwros, String Color,int Programms,int Strofes_Ana_Sec,int Mikos, int Ypsos,int Vathos,String Company,String Modelo, int Timi,String Energy_Class)
        {
        super(Mikos,Ypsos,Vathos,Company,Modelo,Timi,Energy_Class);
        this.TYPE =TYPE; this.programmata=Programms; this.xwritikotita=Xwros; this.xrwma=Color; this.strofes = Strofes_Ana_Sec;

        // Counter
        { WashingsCounter +=1;}
        }
        //Synartisi Ektypwsis Constructors
        public void PrintWashings()
        {
        System.out.println("Device Type : "+getTYPE());
        System.out.println("Programms : "+getprogrammata()+" - RPM :  "+getstrofes());
        System.out.println("Color : "+getXrwma()+ " - Capasity :  "+getXwritikotita()+"Lt");
        System.out.println("Lenght :  "+getMikos()+ "|| Height : "+ getYpsos() + "|| Depth : "+getVathos());
        System.out.println("Company : "+getCompany()+ "|| Modell : "+getModelo()+ "|| Energy Class : "+ getEnergeia());
        System.out.println("Price : "+getTimi()+"Euros");
        System.out.println("");
        }

        //Synartisi Ektypwsis Counter
        public static void Counter(){System.out.println("WASHINE MACHINE : "+WashineMachine.WashingsCounter);}

    //Private Getters

        public String getXrwma(){return xrwma;}
        public int getXwritikotita(){return xwritikotita;}
        public int getprogrammata(){return programmata;}
        public int getstrofes(){return strofes;}
        public String getTYPE() { return TYPE;}


        //Private Setters
        public void setXrwma(String Xrwma){xrwma = Xrwma;}
        public void setXwritikotita(int Xwros){xwritikotita = Xwros;}
        public void setstrofes(int Strofes_Ana_Sec){strofes= Strofes_Ana_Sec;}
        public void setProgrammata(int programms){programmata = programms;}
        public void setTYPE(String newTYPE) {
        TYPE = newTYPE;
    }
}
