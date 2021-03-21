package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;

import nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO.DrugsDao;

import java.util.List;

public abstract class AbstractWebcrawler implements Webcrawler{
    List<String> information = null;
    public static DrugsDao informationStorage;

    AbstractWebcrawler(DrugsDao drugsDao){
        informationStorage = drugsDao;
    }

    public abstract List<String> getInformation();

}
