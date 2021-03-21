package nl.bioinf.minorapplicationdesign.ontpillen.model.webcrawling;


import java.util.List;
import nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO.Drug;
import nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO.DrugsGroup;
import nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO.InMemoryDrugDao;

public class Farmaco extends AbstractWebcrawler {

    Farmaco(InMemoryDrugDao inMemoryDrugDao) {
        super(inMemoryDrugDao);
    }


    @Override
    public List<String> getInformation() {
        String drugs = getDrugs(informationStorage);
        information.add(drugs);
        return information;
    }


    private String getDrugs(InMemoryDrugDao informationStorage) {
        Drug drug = new DrugsGroup();
        informationStorage.addDrug(null);
        return null;
    }
}
