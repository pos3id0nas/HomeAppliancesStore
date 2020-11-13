public class Fridge
{
    //Private Variables
    private int X;
    private int Y;
    private int W;
    private String Marka;
    private String Modelo;
    private static final String TYPOS = "FRIDGE";
    private String Energeia;

    private String xrwma;
    private String Othoni;
    private int timi;
    private String katapsixti;
    private int xwritikotita;
    // Counter Variable
    static int FridgeCounter=0;

        // Main Constructor
        public Fridge(int Mikos, int Ypsos, int Vathos, String Company, String Modell, String Energy, int Xwros, String Xrwma, int price, String Katapsixi, String lcd)
        {
            X = Mikos;
            Y = Ypsos;
            W = Vathos;
            Marka = Company;
            Modelo = Modell;
            Energeia = Energy;
            xwritikotita = Xwros;
            xrwma = Xrwma;
            timi = price;
            katapsixti = Katapsixi;
            Othoni = lcd;
            // Counter
            { FridgeCounter +=1;}
        }

    //Synartisi Ektypwsis Constructors
            public void PrintFridges ()
            {
                System.out.println(TYPOS);
                System.out.println("Tis Etairias :" + Marka + " - To Modelo: " + Modelo);
                System.out.println("Exei Diastaseis(cm): " + "Mikos: " + X + " X Ypsos: " + Y + " X Vathos: " + W);
                System.out.println("H energeiaki tou Klasi einai :" + Energeia);
                System.out.println("Xrwnatos :" + xrwma + " - Xwritikotita :" + xwritikotita+"Lt");
                System.out.println("Othoni :" + Othoni);
                System.out.println("Katapsixti :" + katapsixti);
                System.out.println("Timi :" + timi+"Euro");
                System.out.println("");
            }
            //Synartisi Ektypwsis Counter
            public static void Fridges(){System.out.println("FRIDGE : "+Fridge.FridgeCounter);}
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
            public String getOthoni(){return Othoni;}
            public String getkatapsixti(){return katapsixti;}
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
            public void setOthoni(String lcd){Othoni=lcd;}
            public void setkatapsixti(String katapsixi){katapsixti = katapsixi;}
            public void setTimi(int price){timi = price;}
            public void setEnergeia(String Energy){Energeia = Energy;}


}
