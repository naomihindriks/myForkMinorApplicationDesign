package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;

import java.util.ArrayList;
import java.util.List;

public class GgzStandaarden implements Website {
    List<String> information = new ArrayList<>();

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
