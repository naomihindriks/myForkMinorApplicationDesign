package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;

import java.util.List;

public interface Webcrawler extends Website {
    Website websiteToCrawl = null;
    List<String> information = null;
}
