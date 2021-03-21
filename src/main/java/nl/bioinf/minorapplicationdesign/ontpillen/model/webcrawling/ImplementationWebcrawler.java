package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;


import nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO.DrugsDao;
import nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO.InMemoryDrugDao;

public class ImplementationWebcrawler implements Webcrawler {
    static DrugsDao informationStorage = new InMemoryDrugDao();


    public static void main(String[] args) {

        Apotheek apotheek = new Apotheek(informationStorage);
        apotheek.getInformation();

        Farmaco farmaco = new Farmaco(informationStorage);
        farmaco.getInformation();

        RichtlijnenNhg richtlijnenNhg = new RichtlijnenNhg(informationStorage);
        richtlijnenNhg.getInformation();

        GgzStandaarden ggzStandaarden = new GgzStandaarden(informationStorage);
        ggzStandaarden.getInformation();
    }

}
