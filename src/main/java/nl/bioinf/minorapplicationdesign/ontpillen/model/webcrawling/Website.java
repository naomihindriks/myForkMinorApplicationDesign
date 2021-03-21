package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;

import java.util.List;

public interface Website {

    List<String> information = null;
    
    default List<String> getInformation() {
        return null;
    }
}
