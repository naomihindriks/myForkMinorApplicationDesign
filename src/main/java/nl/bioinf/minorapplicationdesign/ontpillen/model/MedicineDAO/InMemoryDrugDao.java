package nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryDrugDao implements DrugsDao{
    Map<Integer, Drug> Drugs = new HashMap();

    @Override
    public String getDrugByName() {
        return null;
    }

    @Override
    public List<Drug> listDrugs() {
        return null;
    }

    @Override
    public List<Drug> listDrugsRecursive() {
        return null;
    }

    @Override
    public void addDrug(Drug drug) {

    }
}