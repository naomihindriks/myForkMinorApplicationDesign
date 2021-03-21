package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class DrugFetcher {


    public static void parseDrugs() throws IOException {
        SSLHelper.bypassSSL();
        String url = "https://www.farmacotherapeutischkompas.nl/bladeren/categorie/psychiatrie";
        Document doc = Jsoup.connect(url).get();
        Elements groups = doc.getElementsByClass("pat-rich group-2").select("h2");
        HashMap<String, List<String>> drugGroups = new HashMap<>();
        HashMap<String, List<String>> medicines = new HashMap<>();
        for (Element h2Tag : groups
             ) {
            Elements subgroups = h2Tag.siblingElements().select("h3");
            drugGroups.put(h2Tag.text(), subgroups.eachText());
            for (Element subgroup: subgroups
                 ) {
                List<String> drugs = subgroup.siblingElements().select("li").eachText();
                medicines.put(subgroup.text(), drugs);
                }
            }
        }
    }

