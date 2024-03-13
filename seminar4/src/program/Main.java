package program;

import FactoryMethod.fabrici.FabricaAsistent;
import FactoryMethod.fabrici.FabricaBrancardier;
import FactoryMethod.fabrici.FabricaInfirmier;
import FactoryMethod.fabrici.FactoryAngajati;
import clase.PersonalSpital;

public class Main {

    public static void main(String[] args) {
        FactoryAngajati factoryAngajati=new FabricaBrancardier();
        procesareAngajat(factoryAngajati,"Rares",10000);
        procesareAngajat(new FabricaAsistent(),"Alex",2000);
        procesareAngajat(new FabricaInfirmier(),"Florin",5000);
    }

    public static void procesareAngajat(FactoryAngajati factory,String nume, int salariu){
        PersonalSpital angajat=factory.creareAngajat(nume,salariu);
        angajat.afisare();

    }
}