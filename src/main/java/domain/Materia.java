package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private List<Materia> correlativas;

    public Materia() {
        this.correlativas = new ArrayList<>();
    }

    public List<Materia> correlativas() {

        return correlativas;
    }
    public void agregrarCorrelativas(Materia ... materias){
        Collections.addAll(this.correlativas, materias);

    }


}
