package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;

import nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO.DrugsDao;
import nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO.InMemoryDrugDao;

import java.util.ArrayList;
import java.util.List;

public class RichtlijnenNhgWebcrawler extends AbstractWebcrawler {
    List<String> information = new ArrayList<>();

    RichtlijnenNhgWebcrawler(DrugsDao drugsDao) {
        super(drugsDao);
    }

    @Override
    public List<String> getInformation() {
        String description = getDescription();
        information.add(description);
        return information;
    }

    private String getDescription() {
        return null;
    }
}
