package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;

import nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO.InMemoryDrugDao;

import java.util.ArrayList;
import java.util.List;

public class Apotheek extends AbstractWebcrawler {

    Apotheek(InMemoryDrugDao inMemoryDrugDao) {
        super(inMemoryDrugDao);
    }

    List<String> information = new ArrayList<>();

    @Override
    public List<String> getInformation() {
        String description = getDescription();
        String sideEffects = getSideEffects();
        String stopIndication = getStopIndication();
        String interactions = getInteractions();

        information.add(description);
        information.add(sideEffects);
        information.add(stopIndication);
        information.add(interactions);
        return information;
    }

    private String getInteractions() {
        return null;
    }

    private String getStopIndication() {
        return null;
    }

    private String getSideEffects() {
        return null;
    }

    private String getDescription() {
        return null;
    }
}
