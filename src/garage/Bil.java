package garage;

public class Bil extends Fordon{
    private String Kategori;

    public String getKategori(){
        return Kategori;
    }
    public Bil(String RegNr, boolean Uthyrd, int Kostnad, String Kategori){
        super(RegNr, Uthyrd, Kostnad);
    }

}
