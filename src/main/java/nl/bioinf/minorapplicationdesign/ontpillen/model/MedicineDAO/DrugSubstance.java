package nl.bioinf.minorapplicationdesign.ontpillen.model.MedicineDAO;

import java.util.List;

public class DrugSubstance extends Drug {
    List<String> brandNames;
    String description;
    List<String> sideEffects;
    List<UseIndication> useIndications;
    List<StopIndication>  stopIndications;
}
