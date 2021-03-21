package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;

import nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO.InMemoryDrugDao;

import java.util.ArrayList;
import java.util.List;

public class RichtlijnenNhg extends AbstractWebcrawler {
    List<String> information = new ArrayList<>();

    RichtlijnenNhg(InMemoryDrugDao inMemoryDrugDao) {
        super(inMemoryDrugDao);
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
