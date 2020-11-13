public class AirCondition
{
    //Private Variables
    private int X;
    private int Y;
    private int W;
    private String Marka;
    private String Modelo;
    private static final String TYPOS =  "AIR CONDITION";// Static Variable Classes
    private String Energeia;

    private int btu;
    private int dbl;
    private String ionist;
    private String wifi;
    private int timi;

    //Counter Varieable
    public static int ACounter = 0;

        // Main Constructor
        public AirCondition(int Mikos,int Ypsos,int Vathos, String Company, String Modell,String Energy_Class,int BTU,int Thoryvos,int Price,String Ionistis,String WIFI)
        {
        X = Mikos; Y = Ypsos; W=Vathos; Marka =Company; Modelo=Modell; Energeia=Energy_Class; btu=BTU; dbl=Thoryvos; timi=Price;
        ionist =Ionistis; wifi=WIFI;

        {ACounter +=1;}//Counter
        }

        // Synartisi Ektypwsis Constructors
        public void PrintAC()
        {
        System.out.println(TYPOS);
        System.out.println("Einai tis Etairias :"+Marka+" - To Modelo: "+Modelo);
        System.out.println("Exei Diastaseis(cm): "+"Mikos: "+X+" X Ypsos: "+Y+" X Vathos: "+W);
        System.out.println("H energeiaki tou Klasi einai :"+Energeia+" - Ta BTU tou Einai :"+btu+" - Me Entasi Thoryvou :"+dbl+"dB");
        System.out.println("Ionisti :"+ionist);
        System.out.println("WiFi :"+wifi);
        System.out.println("Timi :"+timi+" Euros");
        System.out.println("");

        }
        // Synartisi Ektypwsis Counter
        public static void AirConditions(){System.out.println("AIR CONDITION: "+AirCondition.ACounter);}
        // Spare Synartisi
        private void periodicMantainance(){}
        // Getters
        public int getMikos(){return X;}
        public int getYpsos(){return Y;}
        public int getVathos(){return W;}
        public String getMarka(){return Marka;}
        public String getModelo(){return Modelo;}
        public int getDbl(){return dbl;}
        public int getBtu(){return btu;}
        public String getwifi(){return wifi;}
        public String getionistis(){return ionist;}
        public int  getTimi(){return timi;}
        public String getEnergeia(){return Energeia;}
        // Setters
        public void setMikos(int Mikos){X = Mikos;}
        public void setYpsos(int Ypsos){Y = Ypsos;}
        public void setVathos(int Vathos){W = Vathos;}
        public void setMarka(String Company){ Marka = Company;}
        public void setModelo(String Modell){Modelo = Modell;}
        public void setDbl(int Thoryvos){dbl = Thoryvos;}
        public void setbtu(int BTU){btu = BTU;}
        public void setWIFI(String WIFI){wifi= WIFI;}
        public void setionist(String ionistis){ionist = ionistis;}
        public void setTimi(int price){timi = price;}
        public void setEnergeia(String Energy_Class){Energeia = Energy_Class;}

}
