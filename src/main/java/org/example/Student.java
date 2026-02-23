package org.example;

public class Student extends Person {


    /// Atributos
    private String curso;
    private String notaMedia;

    ///  ---Constructores---
    ///  Constructor Vacio
    public Student() {
    }

    /// Constructor completo con todos los parametros(contando con los de la clase padre)
    public Student(int id, String name, String email, String curso, String notaMedia) {
        super(id, name, email);
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    ///
    public Student(String name, String email, String curso, String notaMedia) {
        super(name, email);
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    /// ---Metodos---
    @Override
    public String mostrarInfo() {
        return "Curso:" + curso + "\n" +
                "NOMBRE:" + notaMedia;
    }

    /// Getter y setters
    public String getCurso() {return curso;    }

    public void setCurso(String curso) {this.curso = curso;    }

    public String getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(String notaMedia) {
        this.notaMedia = notaMedia;
    }
}
