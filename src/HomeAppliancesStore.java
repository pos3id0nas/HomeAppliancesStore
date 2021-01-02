import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;


public class HomeAppliancesStore {
    String CompanyName;
    String Address;
    int Employees;

    public String getName() {
        return this.CompanyName;
    }

    public void setName(String name) {
        this.CompanyName = name;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String newAddress) {
        Address = newAddress;
    }

    public int getEmployees() {
        return this.Employees;
    }

    public void setEmployees(int Employees) {
        this.Employees = Employees;
    }

    public static void main(String[] args) {

        try {

            HomeAppliancesStore store = new HomeAppliancesStore();
            store.setName("COMPANY NAME: UshOP");
            store.setAddress("ADDRESS: SPARTA");
            store.setEmployees(18);

            System.out.println(" ");
            System.out.println("   " + store.getName() + " ||| " + store.getAddress() + " ||| EMPLOYEES: " + store.getEmployees());
            System.out.println("----------------------------------------------------------------\n");


            //Dhmiourgia Constructors Stin Main Kai ektypwsh Meta Apo Ka8e Dhmioyrgia


            Fridge PITSOS = new Fridge(300, "Black", "YES", "YES", 100, 200, 50, "PITSOS", "P56THJ0", 500, "AAAA");
            PITSOS.PrintFridges();

            Oven PHILIPS = new Oven("OVEN", 40, "SILVER", 20, "ELECTRICITY", 50, 120, 60, "PHILIPS", "PH886G", 350, "AAA");
            PHILIPS.PrintOvens();

            AirCondition TOYATOMI = new AirCondition("AirCondition", 200, 30, "YES", "YES", 120, 100, 30, "TOYATOMI", "TM8978H", 300, "AAA");
            TOYATOMI.PrintAC();

            WashineMachine KENWOOD = new WashineMachine("WASHINEMACHINE",200,20,"Black",300,100,120,100,"KENWOOD","KW456N","AAA",300);
            KENWOOD.PrintWashings();

            System.out.println("----------------------------------------------------------------");

            //Ektypwsi An Xreiazetai Service
            PITSOS.periodicmaintenance();
            PHILIPS.periodicmaintenance();
            TOYATOMI.periodicmaintenance();
            KENWOOD.periodicmaintenance();

            System.out.println("----------------------------------------------------------------");

            //Ektypwsi Katastasis Syskeyis(ON or OFF) kai Allagi.
            PITSOS.booleanstatus();
            PHILIPS.booleanstatus();
            TOYATOMI.booleanstatus();
            KENWOOD.booleanstatus();

            System.out.println("----------------------------------------------------------------");

            //Ektypwsi Counter
            Fridge.Counter();
            WashineMachine.Counter();
            Oven.Counter();
            AirCondition.Counter();

            System.out.println("----------------------------------------------------------------");
            Read_File();

        } catch (Exception e) {
            {
                System.out.println("ERROR!!!");
            }
        }
    }


    //Synartisi Diavasmatos Apo Arxeio.
    public static void Read_File(){


        try {
            System.out.println("________________________READ_FILE METHOD________________________\n");
            System.out.println("___________________________FILE INPUT___________________________\n");
            System.out.printf("FileName(txt,csv,pdf...etc) : ");
            Scanner in = new Scanner(System.in);
            String Dfile = in.nextLine();
            //Diavazei apo Onoma arxeioy me katalixi


            //While loop gia exodos i oxi
            boolean exit = true;
            while (exit) {
                //Anoigma kai diavasma arxeioy
                FileReader Devices = new FileReader(Dfile);
                BufferedReader br = new BufferedReader(Devices);
                System.out.println("__________________________DEVICE INPUT__________________________");
                //Diavazei EidosSyskeyis (Gia Eukolia exei kai epiloges alla kai eleuthero input)
                System.out.println("Type The Device That You Are Looking For :");
                Scanner Dev = new Scanner(System.in);
                String Device = Dev.nextLine();


                if (Device != null && !Device.isEmpty())                                                                //An i syskeui poy pliktrologisame einai keno
                {
                    Device = Device.toLowerCase();                                                                      //metatropi syskeuis se mikra grammata gia kaluteri anazitisi
                    String line;
                    if (Device.equals("fridge"))                                                                        //An i syskeui einai Fridge klp stis paromoies else if
                    {
                        char[] FridgeARR = new char[0];
                        while ((line = br.readLine()) != null)                                                          //Diavazei grammi grammi to arxeio mexri......
                        {
                            line = line.toLowerCase();                                                                  //Mia metatropi olwn twn grammwn se mikra...
                            if (line.contains(Device))                                                                  //Mexri tin grammi pou tha exei tin lexi poy psaxnoume
                            {
                                String PrintDevice = Device.substring(0, 1).toUpperCase() + Device.substring(1);        //Gia aisthitikous logous kanoume to prwto gramma kefalaio
                                FridgeARR = line.toCharArray();                                                         //Oli I Grammi Se Enan Pinaka Xaraktirwn
                                System.out.println("The File Contains : " + FridgeARR[7] + " " + PrintDevice + "s");    //Ektypwnoyme
                            }
                        }
                        int num = Character.getNumericValue(FridgeARR[7]);                                              //Metatropi Char se Int
                        Fridge[] FridgeObjects;                                                                           //Dilwsi Pinaka Constructors
                        FridgeObjects = new Fridge[num];                                                                   //Dilwsi Megethous
                        boolean construct = true;
                        while (construct)                                                                               //Elegxos Exodou apo epiloges
                        {
                            int k;
                            for (k = 1; k <= num; k++)                                                                  //For loop gia epanalipsi oswn Object Grafei to arxeio
                            {
                                int i = k - 1;
                                System.out.println("Build Constructors (1) - Leave Constructor Default (2) - Exit (3):");
                                Scanner Constr = new Scanner(System.in);
                                String ConstructorBuild = Constr.nextLine();
                                if (ConstructorBuild.equals("1")) {
                                    Scanner Input = new Scanner(System.in);
                                    Fridge NewFridge = new Fridge();                                                    //Dimiourgia Constructor
                                    NewFridge.NewFridgeConstruct(Input);                                                //Dimiourgia meso synartisis eisodou
                                    for (int j = 0; j < FridgeObjects.length; j++) {
                                        FridgeObjects[i] = NewFridge;                                                    //Eisagwgi Stoixeiwn se pinaka
                                    }
                                } else if (ConstructorBuild.equals("2")) {
                                    FridgeObjects[i] = new Fridge();                                                    //Dimiourgia Default Constructor
                                } else {
                                    construct = false;                                                                  //Exodos apo Epilogi
                                    break;
                                }
                                System.out.println("FRIDGE No " + k);                                                   //Metritis entos loopas
                                //-----------------------------------WRITE OBJECT FILE----------------------------------

                                try {
                                    FileOutputStream Output = new FileOutputStream("Objects.txt");
                                    ObjectOutputStream out = new ObjectOutputStream(Output);
                                    out.writeObject(FridgeObjects);
                                    out.close();
                                    Output.close();
                                }
                                catch (Exception e)
                                {
                                    System.out.println("WRITE FILE ERROR!!");
                                }

                                FridgeObjects[i].PrintFridges();                                                        //Synartisi ektypwsis

                            }
                            Fridge.Counter();
                            construct = false;                                                                          //Exodos apo Oloklirwsi Constructors
                        }
                    } else if (Device.equals("oven")) {
                        char[] OvenARR = new char[0];
                        while ((line = br.readLine()) != null) {
                            line = line.toLowerCase();
                            if (line.contains(Device)) {
                                String PrintDevice = Device.substring(0, 1).toUpperCase() + Device.substring(1);
                                OvenARR = line.toCharArray();
                                System.out.println("The File Contains : " + OvenARR[5] + " " + PrintDevice + "s");
                            }
                        }
                        int num = Character.getNumericValue(OvenARR[5]);                                                //Metatropi Char se Int
                        Oven[] OvenObjects;
                        OvenObjects = new Oven[num];                                                                    //Pinakas Constructor
                        boolean construct = true;
                        while (construct)                                                                               //Elegxos Exodou apo epiloges
                        {
                            int k;
                            for (k = 1; k <= num; k++)                                                                  //For loop gia epanalipsi oswn Object Grafei to arxeio
                            {
                                int i = k - 1;
                                System.out.println("Build Constructors (1) - Leave Constructor Default (2) - Exit (3):");
                                Scanner Constr = new Scanner(System.in);
                                String ConstructorBuild = Constr.nextLine();
                                if (ConstructorBuild.equals("1")) {
                                    Scanner Input = new Scanner(System.in);
                                    Oven NewOven = new Oven();                                                          //Dimiourgia Constructor
                                    NewOven.NewOvenConstruct(Input);                                                    //Dimiourgia meso synartisis eisodou
                                    for (int j = 0; j < OvenObjects.length; j++) {
                                        OvenObjects[i] = NewOven;                                                       //Eisagwgi Stoixeiwn se pinaka
                                    }
                                } else if (ConstructorBuild.equals("2")) {
                                    OvenObjects[i] = new Oven();                                                          //Dimiourgia Constructor
                                } else {
                                    construct = false;                                                                  //Exodos apo Epilogi
                                    break;
                                }
                                System.out.println("OVEN No " + k);                                                     //Metritis entos loopas
                                //-----------------------------------WRITE OBJECT FILE----------------------------------
                                try
                                {
                                    FileOutputStream Output = new FileOutputStream("Objects.txt");
                                    ObjectOutputStream out = new ObjectOutputStream(Output);
                                    out.writeObject(OvenObjects);
                                    out.close();
                                    Output.close();
                                }
                                catch (Exception e)
                                {
                                    System.out.println("WRITE FILE ERROR!!");
                                }

                                OvenObjects[i].PrintOvens();                                                            //Synartisi Ektipwsis
                            }
                            Oven.Counter();
                            construct = false;                                                                          //Exodos apo Oloklirwsi Constructors
                        }
                    } else if (Device.equals("aircondition")) {
                        char[] AirConditionARR = new char[0];
                        while ((line = br.readLine()) != null) {
                            line = line.toLowerCase();
                            if (line.contains(Device)) {
                                String PrintDevice = Device.substring(0, 1).toUpperCase() + Device.substring(1);
                                AirConditionARR = line.toCharArray();
                                System.out.println("The File Contains : " + AirConditionARR[13] + " " + PrintDevice + "s");
                            }
                        }
                        int num = Character.getNumericValue(AirConditionARR[13]);                                       //Metatropi Char se Int
                        AirCondition[] AirConditionObjects;
                        AirConditionObjects = new AirCondition[num];

                        boolean construct = true;
                        while (construct)                                                                               //Elegxos Exodou apo epiloges
                        {
                            int k;
                            for (k = 1; k <= num; k++)                                                                  //For loop gia epanalipsi oswn Object Grafei to arxeio
                            {
                                int i = k - 1;
                                System.out.println("Build Constructors (1) - Leave Constructor Default (2) - Exit (3):");
                                Scanner Constr = new Scanner(System.in);
                                String ConstructorBuild = Constr.nextLine();
                                if (ConstructorBuild.equals("1")) {
                                    Scanner Input = new Scanner(System.in);
                                    AirCondition NewAirCondition = new AirCondition();                                  //Dimiourgia Constructor
                                    NewAirCondition.NewACConstruct(Input);                                              //Dimiourgia meso synartisis eisodou
                                    for (int j = 0; j < AirConditionObjects.length; j++) {
                                        AirConditionObjects[i] = NewAirCondition;                                       //Eisagwgi Stoixeiwn se pinaka
                                    }

                                } else if (ConstructorBuild.equals("2")) {
                                    AirConditionObjects[i] = new AirCondition();                                        //Eisagwgi Stoixeiwn se pinaka
                                } else {
                                    construct = false;                                                                  //Exodos apo Epilogi
                                    break;
                                }

                                System.out.println("AIRCONDITION No " + k);                                             //Metritis entos loopas
                                //-----------------------------------WRITE OBJECT FILE----------------------------------
                                try{
                                FileOutputStream Output = new FileOutputStream("Objects.txt");
                                ObjectOutputStream out = new ObjectOutputStream(Output);
                                out.writeObject(AirConditionObjects);
                                    out.close();
                                    Output.close();
                                } catch (Exception e)
                                {
                                    System.out.println("WRITE FILE ERROR!!");
                                }
                                AirConditionObjects[i].PrintAC();                                                       //Synartisi Ektipwsis apo dedomena pinaka

                            }
                            AirCondition.Counter();
                            construct = false;                                                                          //Exodos apo Oloklirwsi Constructors
                        }
                    } else if (Device.equals("washinemachine"))
                    {
                        char[] WashineMachineARR = new char[0];
                        while ((line = br.readLine()) != null) {
                            line = line.toLowerCase();
                            if (line.contains(Device)) {
                                String PrintDevice = Device.substring(0, 1).toUpperCase() + Device.substring(1);
                                WashineMachineARR = line.toCharArray();
                                System.out.println("The File Contains : " + WashineMachineARR[15] + " " + PrintDevice + "s");
                            }
                        }
                        int num = Character.getNumericValue(WashineMachineARR[15]);                                     //Metatropi Char se Int
                        WashineMachine[] WashineMachineObjects;
                        WashineMachineObjects = new WashineMachine[num];
                        boolean construct = true;
                        while (construct)                                                                               //Elegxos Exodou apo epiloges
                        {
                            int k;
                            for (k = 1; k <= num; k++)                                                                  //For loop gia epanalipsi oswn Object Grafei to arxeio
                            {
                                int i = k - 1;
                                System.out.println("Build Constructors (1) - Leave Constructor Default (2) - Exit (3):");
                                Scanner Constr = new Scanner(System.in);
                                String ConstructorBuild = Constr.nextLine();
                                if (ConstructorBuild.equals("1")) {
                                    Scanner Input = new Scanner(System.in);
                                    WashineMachine NewWashineMachine = new WashineMachine();                            //Dimiourgia Constructor
                                    NewWashineMachine.NewWashineMachineConstruct(Input);                                //Dimiourgia meso synartisis eisodou
                                    for (int j = 0; j < WashineMachineObjects.length; j++) {
                                        WashineMachineObjects[i] = NewWashineMachine;                                   //Eisagwgi Stoixeiwn se pinaka
                                    }
                                } else if (ConstructorBuild.equals("2")) {                                               //Dimioyrgia Default Constructor
                                    WashineMachineObjects[i] = new WashineMachine();                                    //Eisagwgi Stoixeiwn se pinaka
                                } else {
                                    construct = false;
                                    break;
                                }                                                   //Exodos apo Epilogi
                                System.out.println("WASHINE MACHINE No " + k);                                          //Metritis entos loopas
                                try {
                                    //-----------------------------------WRITE OBJECT FILE----------------------------------
                                    FileOutputStream Output = new FileOutputStream("Objects.txt");
                                    ObjectOutputStream out = new ObjectOutputStream(Output);
                                    out.writeObject(WashineMachineObjects);
                                    out.close();
                                    Output.close();
                                } catch (Exception e) {
                                    System.out.println("WRITE FILE ERROR!!");
                                }
                                WashineMachineObjects[i].PrintWashings();                                               //Synartisi Ektipwsis apo dedomena pinaka}
                                WashineMachine.Counter();
                                construct = false;
                            }//Exodos apo Oloklirwsi Constructors
                            }
                        }
                        else
                        { System.out.println("Not Found!!!");}                                                          //Stin periptwsi poy auto pou psaxneis den yparxei...mnm lathous


                    } else {
                        System.out.println("Device Not Found OR Wrong Input!!");
                    }//An einai keno vgazei mnm lathous


                    // Elegxos gia synexeia anazhtisis h exodos
                    System.out.println("\nContinue Searching ?: (y) or (n)");
                    Scanner Again = new Scanner(System.in);
                    String Exit = Again.nextLine();
                    if (Exit.equals("n")) {
                        exit = false;
                        System.out.println("\n---------------------<<<<<  EXIT!!! >>>>>---------------------");
                        Devices.close();//kleisimo arxeiou kai exodos apo tin while kai apo tin synartisi
                    } else {
                        Devices.close();
                    }//Kleisimo arxeioy gia epanalypsi anoigmatos stin arxei stin periptwsi pou theloume nea anazitisi
                }
            }
         catch (Exception e)
         {
            System.out.println("FATAL ERROR!!");;
         }
    }

}
