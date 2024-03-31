package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private List<Materia> materias;
    private Alumno alumno;

    public Inscripcion(Alumno alumno) {
        this.materias = new ArrayList<>();
        this.alumno = alumno;
    }

    public void agregarMaterias(Materia ...  materias){

        Collections.addAll(this.materias, materias);
    }

    public boolean materiaAprobada(Materia materia){

        return alumno.materiasAprobadas().contains(materia);
    }

    public boolean aprobada(){
      return this.materias.stream()
              .flatMap(materia -> materia.correlativas().stream())
              .allMatch(materia -> alumno.materiasAprobadas().contains(materia));
    }
}
