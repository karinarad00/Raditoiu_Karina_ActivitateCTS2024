package FactoryMethod.clase;

import clase.PersonalSpital;

public class Infirmier extends PersonalSpital {
    public Infirmier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println("Infirmier "+super.getNume()+" are salariul "+super.getSalariu());
    }
}
