package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private List<Materia> materiasAprobadas;


    public Alumno() {

        this.materiasAprobadas = new ArrayList<>();
    }
    public void agregrarAprobadas(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);

    }
    public List<Materia> materiasAprobadas() {

        return materiasAprobadas;
    }

}
