package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;

import nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO.InMemoryDrugDao;

import java.util.List;

public abstract class AbstractWebcrawler implements Website{
    public static InMemoryDrugDao informationStorage;

    AbstractWebcrawler(InMemoryDrugDao inMemoryDrugDao){
        informationStorage = inMemoryDrugDao;
    }

    @Override
    public abstract List<String> getInformation();

}
