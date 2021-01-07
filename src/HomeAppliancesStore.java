import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;


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


            Fridge PITSOS = new Fridge("FRIDGE",300, "Black", "YES", "YES", 100, 200, 50, "PITSOS", "P56THJ0", 500, "AAAA");
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
            CreateFile();
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
                //Diavazei Eidos Syskeyis (eleuthero input)
                System.out.println("Type The Device That You Are Looking For :");
                Scanner Dev = new Scanner(System.in);
                String Device = Dev.nextLine();


                if (Device != null && !Device.isEmpty())                                                                //An i syskeui poy pliktrologisame einai keno
                {
                    Device = Device.toLowerCase();                                                                      //metatropi syskeuis se mikra grammata gia kaluteri anazitisi
                    String line;
                    if (Device.equals("fridge"))                                                                        //An i syskeui einai Fridge klp stis paromoies else if
                    {
                        int num = 0;
                        String[] FridgeARR = new String[0];
                        while ((line = br.readLine()) != null) {
                            line = line.toLowerCase();
                            FridgeARR = line.split(" ");
                            if (line.contains(Device))
                            {
                                String PrintDevice = Device.substring(0, 1).toUpperCase() + Device.substring(1);
                                System.out.println("The File Contains : " + FridgeARR[1] + " " + PrintDevice + "s");
                                int fr = Integer.parseInt(FridgeARR[1]);
                                num = fr;
                            }


                        }
                        boolean construct = true;
                        while (construct)                                                                               //Elegxos Exodou apo epiloges
                        {

                            int k;
                                for (k = 1; k <= num; k++)                                                              //For loop gia epanalipsi oswn Object Grafei to arxeio
                                {
                                    int i = k - 1;
                                    System.out.println("\nBuild Constructors (1) - Leave Constructor Default (2) - Exit (3):");
                                    Scanner Constr = new Scanner(System.in);
                                    String ConstructorBuild = Constr.next();
                                    Fridge[] NewFridge = new Fridge[12];
                                    if (ConstructorBuild.equals("1")) {
                                        Scanner Input = new Scanner(System.in);
                                        NewFridge[i] = new Fridge();
                                        NewFridge[i].NewFridgeConstruct(Input);
                                    } else if (ConstructorBuild.equals("2")) {
                                        NewFridge[i] = new Fridge();                                                    //Eisagwgi Stoixeiwn se pinaka
                                    } else {
                                        break;
                                    }                                                                                   //Exodos apo Epilogi

                                    System.out.println("\nFRIDGE No " + k);                                             //Metritis entos loopas
                                    NewFridge[i].PrintFridges();                                                        //Synartisi Ektipwsis apo dedomena pinaka}
                                    //-----------------------------------WRITE OBJECT FILE----------------------------------
                                    NewFridge[i].FileWriteF();                                                          //Synartisi Eggrafis se Arxeio
                                }
                                Fridge.Counter();
                                construct = false;                                                                      //Exodos apo Oloklirwsi Constructors
                            }
                        }
                        else if (Device.equals("oven")) {
                        int num = 0;
                        String[] OvenARR = new String[0];                                                               //Diavazei to arxeio <<Devices>> grammi grammi
                        while ((line = br.readLine()) != null) {                                                        //tis opoies metatrepei oles se mikra se periptwsi pou yparxei kati kefalaio
                            line = line.toLowerCase();                                                                  //Kai Pernaei tin grammi xwrismeni se kena ---> sto antistoixo String Array kathe string
                            OvenARR = line.split(" ");
                            if (line.contains(Device)) {                                                                //Kai elegxei An i grammi periexei tin Syskeui pou psaxnoume
                                String PrintDevice = Device.substring(0, 1).toUpperCase() + Device.substring(1);
                                System.out.println("The File Contains : " + OvenARR[1] + " " + PrintDevice + "s");
                                int ov = Integer.parseInt(OvenARR[1]);
                                num = ov;
                            }
                        }

                        boolean construct = true;
                        while (construct)                                                                               //Elegxos Exodou apo epiloges
                        {
                            int k;
                            for (k = 1; k <= num; k++)                                                                  //For loop gia epanalipsi oswn Object tha Grafoun sto arxeio
                            {
                                int i = k - 1;
                                System.out.println("\nBuild Constructors (1) - Leave Constructor Default (2) - Exit (3):");
                                Scanner Constr = new Scanner(System.in);
                                String ConstructorBuild = Constr.next();
                                Oven[] NewOven = new Oven[12];
                                if (ConstructorBuild.equals("1")) {                                                     //Epilogi Stoiseiwn Xeirokinita
                                    Scanner Input = new Scanner(System.in);
                                    NewOven[i] = new Oven();
                                    NewOven[i].NewOvenConstruct(Input);
                                } else if (ConstructorBuild.equals("2")) {
                                    NewOven[i] = new Oven();                                                            //Eisagwgi Stoixeiwn Default
                                } else {
                                    break;
                                }                                                                                       //Exodos apo Epilogi

                                System.out.println("\nOVEN No " + k);                                                   //Metritis entos loopas
                                NewOven[i].PrintOvens();                                                                //Synartisi Ektipwsis apo dedomena pinaka}
                                //-----------------------------------WRITE OBJECT FILE----------------------------------
                                NewOven[i].FileWriteO();                                                                //Synartisi Eggrafis se Arxeio
                            }
                            Oven.Counter();
                            construct = false;                                                                          //Exodos apo Oloklirwsi Constructors
                        }
                    } else if (Device.equals("aircondition")) {
                            int num = 0;
                        String[] AirConditionARR = new String[0];
                        while ((line = br.readLine()) != null) {
                            line = line.toLowerCase();
                            AirConditionARR = line.split(" ");
                            if (line.contains(Device)) {
                                String PrintDevice = Device.substring(0, 1).toUpperCase() + Device.substring(1);
                                System.out.println("The File Contains : " + AirConditionARR[1] + " " + PrintDevice + "s");
                                int air = Integer.parseInt(AirConditionARR[1]);
                                num = air;
                            }

                        }

                        boolean construct = true;
                        while (construct)                                                                               //Elegxos Exodou apo epiloges
                        {
                            int k;
                            for (k = 1; k <= num; k++)                                                                  //For loop gia epanalipsi oswn Object Grafei to arxeio
                            {
                                int i = k - 1;
                                System.out.println("\nBuild Constructors (1) - Leave Constructor Default (2) - Exit (3):");
                                Scanner Constr = new Scanner(System.in);
                                String ConstructorBuild = Constr.next();
                                AirCondition[] NewAirCondition = new AirCondition[12];
                                if (ConstructorBuild.equals("1")) {
                                    Scanner Input = new Scanner(System.in);
                                    NewAirCondition[i] = new AirCondition();
                                    NewAirCondition[i].NewACConstruct(Input);
                                } else if (ConstructorBuild.equals("2")) {
                                    NewAirCondition[i] = new AirCondition();
                                } else {
                                    break;
                                }                                                                                       //Exodos apo Epilogi

                                System.out.println("\nAIR CONDITION No " + k);                                          //Metritis entos loopas
                                NewAirCondition[i].PrintAC();                                                           //Synartisi Ektipwsis apo dedomena pinaka
                                //-----------------------------------WRITE OBJECT FILE----------------------------------
                                NewAirCondition[i].FileWriteAC();                                                       //Synartisi Eggrafis se Arxeio
                            }
                            AirCondition.Counter();
                            construct = false;                                                                          //Exodos apo Oloklirwsi Constructors
                        }
                    } else if (Device.equals("washinemachine")) {
                            int num=0;
                        String[] WashineMachineARR = new String[0];
                        while ((line = br.readLine()) != null) {
                            line = line.toLowerCase();
                            WashineMachineARR = line.split(" ");
                            if (line.contains(Device)) {
                                String PrintDevice = Device.substring(0, 1).toUpperCase() + Device.substring(1);
                                System.out.println("The File Contains : " + WashineMachineARR[1] + " " + PrintDevice + "s");
                                int was = Integer.parseInt(WashineMachineARR[1]);                                       //Metatropi String se Int
                                num = was;
                            }
                        }
                        boolean construct = true;
                        while (construct)                                                                               //Elegxos Exodou apo epiloges
                        {
                            int k;
                            for (k = 1; k <= num; k++)                                                                  //For loop gia epanalipsi oswn Object Grafei to arxeio
                            {
                                int i = k - 1;
                                System.out.println("\nBuild Constructors (1) - Leave Constructor Default (2) - Exit (3):");
                                Scanner Constr = new Scanner(System.in);
                                String ConstructorBuild = Constr.next();
                                WashineMachine[] NewWashineMachine = new WashineMachine[12];
                                if (ConstructorBuild.equals("1"))                                                       //Dimiourgia meso synartisis eisodou
                                {
                                    Scanner Input = new Scanner(System.in);
                                    NewWashineMachine[i] = new WashineMachine();
                                    NewWashineMachine[i].NewWashineMachineConstruct(Input);
                                } else if (ConstructorBuild.equals("2"))                                                  //Default Constructor
                                {
                                    NewWashineMachine[i] = new WashineMachine();                                        //Eisagwgi Stoixeiwn se pinaka
                                } else {
                                    // construct = false;                                                               //Exodos apo Epilogi
                                    break;
                                }

                                System.out.println("\nWASHINE MACHINE No " + k);                                        //Metritis entos loopas
                                NewWashineMachine[i].PrintWashings();                                                   //Synartisi Ektipwsis apo dedomena pinaka}
                                //-----------------------------------WRITE OBJECT FILE----------------------------------
                                NewWashineMachine[i].FileWriteWM();                                                     //Synartisi Eggrafis se Arxeio
                            }
                            WashineMachine.Counter();
                            construct = false;                                                                          //Exodos apo Oloklirwsi Constructors
                        }
                    } else {
                        System.out.println("Not Found!!!");
                    }                                                                                                   //Stin periptwsi poy auto pou psaxneis den yparxei...mnm lathous


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
            { e.printStackTrace(); System.out.println("FATAL ERROR!!");}
            }

            public static void CreateFile()
            {
                try {
                File myFile = new File("Objects.txt");
                if (myFile.delete() ) {
                    myFile.createNewFile();
                    System.out.println("Success!");
                } else {
                    System.out.println("Failure!");
                }
            } catch ( IOException ioe ) { ioe.printStackTrace(); }
            }
        }


