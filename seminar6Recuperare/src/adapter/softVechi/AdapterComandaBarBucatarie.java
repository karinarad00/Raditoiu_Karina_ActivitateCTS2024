package adapter.softVechi;

import adapter.softNou.Bar;
import adapter.softNou.Bautura;

public class AdapterComandaBarBucatarie extends Bar implements SoftBucatarie {
    @Override
    public void printareBon() {
        super.tiparireNotaDePlata();
    }

    @Override
    public void adaugareProdus(Produs produs) {
        Bautura b=new Bautura(produs.getPret(),produs.getDenumire(),0);
        super.adaugaBautura(b);
    }
}
