package FactoryMethod.fabrici;

import clase.PersonalSpital;

public interface FactoryAngajati {

    public PersonalSpital creareAngajat(String nume, int salariu);
}
