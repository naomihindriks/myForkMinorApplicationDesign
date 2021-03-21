package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;

import java.util.ArrayList;
import java.util.List;

public class Farmaco implements Website {
    List<String> information = new ArrayList<>();

    @Override
    public List<String> getInformation() {
        String description = getDescription();
        String stopIndication = getStopIndication();
        String interactions = getInteractions();

        information.add(description);
        information.add(stopIndication);
        information.add(interactions);
        return information;
    }

    private String getDescription() {
        return null;
    }

    private String getStopIndication() {
        return null;
    }

    private String getInteractions() {
        return null;
    }
}
