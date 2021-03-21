package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;

import java.util.ArrayList;
import java.util.List;

public class RichtlijnenNhg implements Website {
    List<String> information = new ArrayList<>();

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
