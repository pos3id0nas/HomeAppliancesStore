public class Oven
{
    //Private Variables
    private int X;
    private int Y;
    private int W;
    private String Marka;
    private String Modelo;
    private static final String TYPOS = "OVEN";
    private String Energeia;

    private int xwritikotita;
    private String xrwma;
    private int programmata;
    private String kausimo;
    private int timi;
    // Counter Variable
    public static int OvensCounter = 0;
        // Main Constructor
        public Oven(int Mikos,int Ypsos,int Vathos, String Company, String Modell,String Energy_Class,int Xwros, String Colour,int Programms,String Eidos_Kausimou,int Price)
        {
        X = Mikos; Y = Ypsos; W=Vathos; Marka =Company; Modelo=Modell; Energeia=Energy_Class; programmata=Programms; xwritikotita=Xwros; xrwma=Colour;
        kausimo = Eidos_Kausimou; timi=Price;
        // Counter
        {OvensCounter +=1;}
        }
        // Synartisi Ektypwsis Constructors
        public void PrintOvens()
        {
        System.out.println(TYPOS);
        System.out.println("Tis Etairias :"+Marka+" To Modelo: "+Modelo);
        System.out.println("Exei Diastaseis(cm): "+"Mikos: "+X+" X Ypsos: "+Y+" X Vathos: "+W);
        System.out.println("H energeiaki tou Klasi einai :"+Energeia+" Programmata :"+programmata+" Typou :"+kausimo);
        System.out.println("Xrwnatos :"+xrwma+ "Xwritikotita :"+xwritikotita+"Lt");
        System.out.println("Timi :"+timi+" Euros");
        System.out.println("");

        }
        // Synartisi Ektypwsis Counter
        public static void Ovens(){System.out.println("OVEN : "+Oven.OvensCounter);}
        // Spare Synartisi
        private void periodicMantainance(){}
        // Getters
        public int getMikos(){return X;}
        public int getYpsos(){return Y;}
        public int getVathos(){return W;}
        public String getMarka(){return Marka;}
        public String getModelo(){return Modelo;}
        public String getTypos(){return TYPOS;}
        public String getXrwma(){return xrwma;}
        public int getXwritikotita(){return xwritikotita;}
        public String getKausimo(){return kausimo;}
        public int getProgrammata(){return programmata;}
        public int  getTimi(){return timi;}
        public String getEnergeia(){return Energeia;}
        // Setters
        public void setMikos(int Mikos){X = Mikos;}
        public void setYpsos(int Ypsos){Y = Ypsos;}
        public void setVathos(int Vathos){W = Vathos;}
        public void setMarka(String Company){ Marka = Company;}
        public void setModelo(String Modell){Modelo = Modell;}
        public void setXrwma(String Xrwma){xrwma = Xrwma;}
        public void setXwritikotita(int Xwros){xwritikotita = Xwros;}
        public void setEidos_Kausimou(String Eidos_Kausimou){kausimo = Eidos_Kausimou;}
        public void setkatapsixti(int programms){programmata = programms;}
        public void setTimi(int price){timi = price;}
        public void setEnergeia(String Energy){Energeia = Energy;}
}
