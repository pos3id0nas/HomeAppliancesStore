public class HomeAppliancesStore
{
    public static void main(String[] args)
        {
            //Dhmiourgia Constructors Stin Main Kai ektypwsh Meta Apo Ka8e Dhmioyrgia
            Fridge Pitsos = new Fridge(25,25,30,"Pitsos","KL23456","A+++",100,"Mauro",500,"Exei","Den Exei");
            Pitsos.PrintFridges();
            Fridge Phillips =new Fridge(30,100,50,"Philips","GP3429","A+++",200,"Asimi",500,"Exei","Exei");
            Phillips.PrintFridges();

            WashineMachine Kenwood = new WashineMachine(100,80,80,"Kenwood","KW23000","A++",30,"Gkri",8,100,300);
            Kenwood.PrintWashings();
            WashineMachine Philips = new WashineMachine(60,100,80,"Phillips","PL3200","A+++",60,"Mavro",8,135,350);
            Philips.PrintWashings();

            Oven Bosh = new Oven(30,50,80,"Bosh","BS2198","A++++",50,"Mavro",50,"Aerio",500);
            Bosh.PrintOvens();
            Oven Zanussi = new Oven(50,80,100,"zanussi","ZS5467","A+++",80,"Mple",10,"Ilektrikos",450);
            Zanussi.PrintOvens();

            AirCondition Toyatomi = new AirCondition(100,30,30,"Toyatomi","TY7524","A+++",18000,65,300,"Exei","Exei");
            Toyatomi.PrintAC();
            AirCondition Tesla = new AirCondition(120,20,20,"Tesla","TS0747","A++++",10000,30,400,"Exei","Exei");
            Tesla.PrintAC();
            //Ektypwsi Counter
            Fridge.Fridges();
            WashineMachine.Washings();
            Oven.Ovens();
            AirCondition.AirConditions();

        }
}
