package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DrugFetcher {
    static List<Element> uppergroup;
    static HashMap<String, List<String>> drugGroups = new HashMap<>();
    static HashMap<String, List<String>> medicines = new HashMap<>();

    public static void main(String[] args) throws IOException {
        SSLHelper.bypassSSL();
        String url = "https://www.farmacotherapeutischkompas.nl/bladeren/categorie/psychiatrie";
        Document doc = Jsoup.connect(url).get();
        uppergroup = doc.getElementsByClass("pat-rich group-2").select("h2");
        checkUl(uppergroup);
        System.out.println(drugGroups);
        System.out.println(medicines);

        }

        private static void checkUl(List<Element> uppergroup){
            Element h2Tag = uppergroup.get(0);
            if (h2Tag.nextElementSibling().is("ul")) {
                medicines.put(h2Tag.text(),h2Tag.nextElementSibling().select("li").eachText());
            } else {
                String query = h2Tag.nextElementSibling().tagName() + ":not(ul)";
//                System.out.println(h2Tag.text() + h2Tag.nextElementSiblings().select(query).eachText());
                drugGroups.put(h2Tag.text(),h2Tag.nextElementSiblings().select(query).eachText());
                Element sibling = h2Tag.nextElementSibling();
                uppergroup.add(sibling);
            }
            uppergroup.remove(0);
            if (uppergroup.size() != 0) {
                checkUl(uppergroup);
            }

        }
    }

