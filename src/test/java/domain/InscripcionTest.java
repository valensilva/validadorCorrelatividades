package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class InscripcionTest {
    @Test
    public void inscripcionAprobada(){
        Materia algoritmos = new Materia();
        Materia algebra = new Materia();
        Alumno unAlumno = new Alumno();
        Inscripcion unaInscripcion = new Inscripcion(unAlumno);
        unaInscripcion.agregarMaterias(algebra,algoritmos);
        Assert.assertTrue(unaInscripcion.aprobada());
    }
    @Test
    public void inscripcionAprobadaConCorrelativas(){
        Alumno unAlumno = new Alumno();
        Materia sintaxis = new Materia();
        Materia algoritmos = new Materia();
        unAlumno.agregrarAprobadas(algoritmos);
        sintaxis.agregrarCorrelativas(algoritmos);
        Inscripcion unaInscripcion = new Inscripcion(unAlumno);
        unaInscripcion.agregarMaterias(sintaxis);
        Assert.assertTrue(unaInscripcion.aprobada());
    }
    @Test
    public void inscripcionRechazada(){
        Alumno unAlumno = new Alumno();
        Materia sintaxis = new Materia();
        Materia algoritmos = new Materia();
        sintaxis.agregrarCorrelativas(algoritmos);
        Inscripcion unaInscripcion = new Inscripcion(unAlumno);
        unaInscripcion.agregarMaterias(sintaxis);
        Assert.assertFalse(unaInscripcion.aprobada());
    }
}
