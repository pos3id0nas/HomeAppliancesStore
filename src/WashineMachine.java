public class WashineMachine
{
    //Private Variables
    private int X;
    private int Y;
    private int W;
    private String Marka;
    private String Modelo;
    private static final String TYPOS = "WASHINE MACHINE";
    private String Energeia;

    private int strofes;
    private String xrwma;
    private int programmata;
    private int xwritikotita;
    private int timi;
    // Counter Variable
    static int WashingsCounter=0;

        // Main Constructor
        public WashineMachine(int Mikos,int Ypsos,int Vathos, String Company, String Modell,String Energy_Class,int Xwros, String Color,int Programms,int Strofes_Ana_Sec,int price)
        {
            X = Mikos; Y = Ypsos; W=Vathos; Marka =Company; Modelo=Modell; Energeia=Energy_Class; programmata=Programms; xwritikotita=Xwros; xrwma=Color;
            strofes = Strofes_Ana_Sec; timi=price;
            // Counter
            { WashingsCounter +=1;}
        }
        //Synartisi Ektypwsis Constructors
        public void PrintWashings()
        {
            System.out.println(TYPOS);
            System.out.println("Tis Etairias :"+Marka+" - To Modelo: "+Modelo);
            System.out.println("Exei Diastaseis(cm0: "+"Mikos: "+X+" X Ypsos: "+Y+" X Vathos: "+W);
            System.out.println("H energeiaki tou Klasi einai :"+Energeia+" - Programmata :"+programmata+" - Strofes kadou :"+strofes);
            System.out.println("Xrwnatos :"+xrwma+ " - Xwritikotita :"+xwritikotita+"Lt");
            System.out.println("Timi :"+timi+" Euros");
            System.out.println("");
        }

        //Synartisi Ektypwsis Counter
        public static void Washings(){System.out.println("WASHINE MACHINE : "+WashineMachine.WashingsCounter);}
        //Spare Synartisi
        private void periodicMantainance(){}
        //Getters
        public int getMikos(){return X;}
        public int getYpsos(){return Y;}
        public int getVathos(){return W;}
        public String getMarka(){return Marka;}
        public String getModelo(){return Modelo;}
        public String getXrwma(){return xrwma;}
        public int getXwritikotita(){return xwritikotita;}
        public int getprogrammata(){return programmata;}
        public int getstrofes(){return strofes;}
        public int  getTimi(){return timi;}
        public String getEnergeia(){return Energeia;}
        //Setters
        public void setMikos(int Mikos){X = Mikos;}
        public void setYpsos(int Ypsos){Y = Ypsos;}
        public void setVathos(int Vathos){W = Vathos;}
        public void setMarka(String Company){ Marka = Company;}
        public void setModelo(String Modell){Modelo = Modell;}
        public void setXrwma(String Xrwma){xrwma = Xrwma;}
        public void setXwritikotita(int Xwros){xwritikotita = Xwros;}
        public void setstrofes(int Strofes_Ana_Sec){strofes= Strofes_Ana_Sec;}
        public void setProgrammata(int programms){programmata = programms;}
        public void setTimi(int price){timi = price;}
        public void setEnergeia(String Energy){Energeia = Energy;}
}
