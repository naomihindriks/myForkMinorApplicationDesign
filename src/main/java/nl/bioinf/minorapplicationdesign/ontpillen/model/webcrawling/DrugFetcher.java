package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

public class DrugFetcher {
    static List<Element> uppergroup;
    static HashMap<String, List<String>> drugGroups = new HashMap<>();
    static HashMap<String, List<String>> medicines = new HashMap<>();

    public static void parseDrugs() throws IOException {
        SSLHelper.bypassSSL();
        String url = "https://www.farmacotherapeutischkompas.nl/bladeren/categorie/psychiatrie";
        Document doc = Jsoup.connect(url).get();
        uppergroup = doc.getElementsByClass("pat-rich group-2").select("h2");
        checkUl(uppergroup);
        }

        private static void checkUl(List<Element> uppergroup){
            Element tag = uppergroup.get(0);
            if (tag.nextElementSibling().is("ul")) {
                medicines.put(tag.text(),tag.nextElementSibling().select("li").eachText());
            } else {
                String query = tag.nextElementSibling().tagName() + ":not(ul)";
                drugGroups.put(tag.text(),tag.nextElementSiblings().select(query).eachText());
                Elements sibling = tag.nextElementSiblings().select(query);
                uppergroup.addAll(sibling);
            }
            uppergroup.remove(0);
            if (uppergroup.size() != 0) {
                checkUl(uppergroup);
            }
        }
    }

