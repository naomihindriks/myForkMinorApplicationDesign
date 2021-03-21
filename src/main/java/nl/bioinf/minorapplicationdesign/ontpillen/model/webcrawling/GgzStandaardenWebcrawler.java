package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;

import nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO.DrugsDao;
import nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO.InMemoryDrugDao;

import java.util.ArrayList;
import java.util.List;

public class GgzStandaardenWebcrawler extends AbstractWebcrawler {
    List<String> information = new ArrayList<>();

    GgzStandaardenWebcrawler(DrugsDao drugsDao) {
        super(drugsDao);
    }

    @Override
    public List<String> getInformation() {
        String sideEffects = getSideEffects();

        information.add(sideEffects);
        return information;
    }

    private String getSideEffects() {
        return null;
    }
}
