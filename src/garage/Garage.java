package garage;

import java.lang.StringBuilder;
import java.util.ArrayList;

public class Garage {
    private String adress;
    private ArrayList<Fordon> fordonspark;

    public Garage(String adress) {
        this.adress = adress;
        fordonspark = new ArrayList<>();
    }

    public void laggTillFordon(Fordon f) {
        fordonspark.add(f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Garage på " + adress + " innehåller följande fordon:\n");
        for (Fordon fordon : fordonspark){
            sb.append(fordon + "\n");
        }
        String bilOlastbil = sb.toString();
        return bilOlastbil;
    }

}
