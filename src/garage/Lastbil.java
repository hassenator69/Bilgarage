package garage;

public class Lastbil extends Fordon{
    private int Lastutrymme;

    public int getLastutrymme(){
        return Lastutrymme;
    }
    public Lastbil(String RegNr, boolean Uthyrd, int Kostnad, int Lastutrymme){
        super(RegNr, Uthyrd, Kostnad);
    }
}
