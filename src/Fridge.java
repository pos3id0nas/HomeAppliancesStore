
class Fridge extends Device
{

    //boolean state = false;
    //Private Variables
    private String TYPE;
    private String Color;
    private String Othoni;
    private String katapsixti;
    private int xwritikotita;

    // Counter Variable
    public static int FridgeCounter=0;

        // Main Constructor
        Fridge(String TYPE ,int Capasity, String Color,String Katapsixi, String lcd,int Mikos, int Ypsos,int Vathos,String Company,String Modelo, int Timi,String Energy_Class)
        {
            super(Mikos,Ypsos,Vathos,Company,Modelo,Timi,Energy_Class);
            this.TYPE = TYPE; this.xwritikotita = Capasity; this.Color = Color; this.katapsixti = Katapsixi; this.Othoni = lcd;


        // Counter
        { FridgeCounter +=1;}

        }

        //Synartisi Ektypwsis Constructors
        public void PrintFridges ()
        {
        System.out.println("Device Type : "+ getTYPE());
        System.out.println("Color :" + getColor() + " - Capasity :" + getXwritikotita()+"Lt");
        System.out.println("LCD Screen : " + getOthoni());
        System.out.println("Froze : " + getkatapsixti());
        System.out.println("Lenght : "+getMikos()+ "|| Height : "+ getYpsos() + "|| Depth : "+getVathos());
        System.out.println("Company : "+getCompany()+ "|| Modell : "+getModelo()+ "|| Energy Class : "+ getEnergeia());
        System.out.println("Price : "+getTimi()+"Euros");
        System.out.println("");
        }
        //Synartisi Ektypwsis Counter
        public static void Counter(){System.out.println("FRIDGE : "+Fridge.FridgeCounter);}


        //Private Getters

        public String getColor(){return Color;}
        public int getXwritikotita(){return xwritikotita;}
        public String getOthoni(){return Othoni;}
        public String getkatapsixti() {return katapsixti;}
        public String getTYPE() {return TYPE;}

        //Private Setters

        public void setColor (String Color){Color = Color;}
        public void setXwritikotita ( int Xwros){xwritikotita = Xwros;}
        public void setOthoni (String lcd){Othoni = lcd;}
        public void setkatapsixti (String Katapsixi){katapsixti = Katapsixi;}
        public void setTYPE(String newTYPE) {TYPE = newTYPE;}

}
