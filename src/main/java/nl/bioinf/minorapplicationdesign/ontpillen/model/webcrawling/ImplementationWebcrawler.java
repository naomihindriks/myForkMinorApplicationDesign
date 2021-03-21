package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;


import nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO.DrugsDao;
import nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO.InMemoryDrugDao;

public class ImplementationWebcrawler {
    static DrugsDao informationStorage = new InMemoryDrugDao();


    public void runWebcrawlers(){
        ApotheekWebcrawler apotheekWebcrawler = new ApotheekWebcrawler(informationStorage);
        apotheekWebcrawler.getInformation();

        FarmacoWebcrawler farmacoWebcrawler = new FarmacoWebcrawler(informationStorage);
        farmacoWebcrawler.getInformation();

        RichtlijnenNhgWebcrawler richtlijnenNhgWebcrawler = new RichtlijnenNhgWebcrawler(informationStorage);
        richtlijnenNhgWebcrawler.getInformation();

        GgzStandaardenWebcrawler ggzStandaardenWebcrawler = new GgzStandaardenWebcrawler(informationStorage);
        ggzStandaardenWebcrawler.getInformation();
    }
}
