package nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DrugsDao {
    Map<Integer, Drug> Drugs = new HashMap();

    String getDrugByName();
    List<Drug> listDrugs();
    List<Drug> listDrugsRecursive();
    void addDrug(Drug drug);
}
