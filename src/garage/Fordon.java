package garage;

public class Fordon {
    /**Det är i denna klass som Driver-klassen kallar på när behöver veta information om fordonen.
     *
     Dessa private används för att begränsa åtkomsten till denna klass endast, alltså gör det så att andra klasser inte kan nå dessa objekt.
     Det är även här objekten deklarera, alltså blir tilldelade en variabel.*/
    private String RegNr;
    private boolean Uthyrd;
    private int Kostnad;

    /**Anledningen till att dessa är public är för att dessa ska kunna nås från andra klasser, när "get" kommandot kallas på så kommer den att hämta objekten som
     * privatiserades. Get används alltså så att man endast kan nå objekten genom att kalla på get*/

    public String getRegNr() {
        return RegNr;
    }

    public boolean getUthyrd() {
        return Uthyrd;
    }

    public int getKostnad() {
        return Kostnad;
    }

    /** anledningen till att void används här är för att vi inte vill returnera något,
     * utan här gör vi ett påstående att hyra ut betyder att uthyrd är true (fordonet är uthyrt)*/

    public void hyraUt() {
        this.Uthyrd = true;
    }

    /** anledningen till att void används här är för att vi inte vill returnera något,
     * utan här gör vi ett påstående att hyra ut betyder att uthyrd är true (fordonet är uthyrt)*/

    public void lamnaTillbaka() {
        this.Uthyrd = false;
    }

    /** konstruktorn här används för att initiera objekten och ge dem specifika attribut.*/

    public Fordon(String RegNr, boolean Uthyrd, int Kostnad) {
        this.RegNr = RegNr;
        this.Uthyrd = Uthyrd;
        this.Kostnad = Kostnad;
    }

    /**toString metoden är vad Driver-klassen kallar på när den, i detta fall, vill skriva ut information om ett fordon.
     Skulle uthyrd = true så skriver den istället att fordonet är uthyrt men även reg nummer och kostnad.
     *I detta fall kommer den skriva ut att fordonet är redo att hyras ut ifall uthyrd = false tillsammans med pris och reg nummer.
     * IntelliJ antar att Uthyrd är true när inget anges, varav det endast står "Uthyrd" vid if-satsen.
     */
    public String toString() {
        String hyrStatus = new String();
        if (Uthyrd){
            hyrStatus = "Fordonet är för närvarande uthyrt.";
        }
        else
        {
            hyrStatus = "Fordonet är redo att hyra ut.";
        }
        return "Ett fordon med registreringsnummer " + RegNr + " som kostar " + Kostnad + " kr per dag att hyra. " + hyrStatus;
    }
}
