
class AirCondition extends Device
{
    //Private Variables
    private String TYPE;
    private int BTU;
    private int DBL;
    private String ionist;
    private String wifi;

    //Counter Varieable
    public static int ACounter = 0;

        // Main Constructor
        public AirCondition(String TYPE, int BTU,int DBL,String Ionistis,String WIFI,int Mikos, int Ypsos,int Vathos,String Company,String Modelo, int Timi,String Energy_Class)
        {
            super(Mikos,Ypsos,Vathos,Company,Modelo,Timi,Energy_Class);
        this.TYPE=TYPE; this.BTU=BTU; this.DBL=DBL; this.ionist =Ionistis; this.wifi=WIFI;

        //Counter
        {ACounter +=1;}
        }


    // Synartisi Ektypwsis Constructors
        public void PrintAC()
        {
        System.out.println("Device Type : "+ getTYPE());
        System.out.println("BTUs :"+getBTU()+" - DBL Noice :"+getDBL()+"dB");
        System.out.println("Inventor :"+getionistis());
        System.out.println("WiFi :"+getwifi());
        System.out.println("Lenght : "+getMikos()+ "|| Height : "+ getYpsos() + "|| Depth : "+getVathos());
        System.out.println("Company : "+getCompany()+ "|| Modell : "+getModelo()+ "|| Energy Class : "+ getEnergeia());
        System.out.println("Price : "+getTimi()+"Euros");
        System.out.println("");

        }
        // Synartisi Ektypwsis Counter
        public static void Counter(){System.out.println("AIR CONDITION: "+AirCondition.ACounter);}

        //Private Getters
        public int getDBL(){return this.DBL;}
        public int getBTU(){return this.BTU;}
        public String getwifi(){return this.wifi;}
        public String getionistis(){return this.ionist;}
        public String getTYPE() { return TYPE;}



        //Private Setters
        public void setDBL(int Thoryvos){this.DBL = Thoryvos;}
        public void setBTU(int BTU){this.BTU = BTU;}
        public void setWIFI(String WIFI){this.wifi= WIFI;}
        public void setionist(String ionistis){this.ionist = ionistis;}
        public void setTYPE(String newTYPE) {
        TYPE = newTYPE;
    }

}
