package org.example;

/// LOMBOK
public class Teacher extends Person{

    /// ATRIBUTOS
    private String speciallity;
    private double salary;

    /// CONSTRUCTORES
    public Teacher(){
    }

    public Teacher(int id, String name, String email, String speciallity, double salary) {
        super(id, name, email);
        this.speciallity = speciallity;
        this.salary = salary;

    }

    public Teacher(String name, String email, String speciallity, double salary) {
        super(name, email);
        this.speciallity = speciallity;
        this.salary = salary;
    }

    /// METHODS
    ///
    /// Sintaxis return:
    ///
    /// /// JSON (Difícil)
    /// return "Profesor{" +
    ///         "id=" + getId() +
    ///         ", nombre= '" + getName() + '\'' +
    ///         ", email='" + getEmail() + '\'' +
    ///         ", especialidad='" + speciallity + '\'' +
    ///         ", salario='" + salary + '\'' +
    ///         "}";
    ///
    /// ///  Opción sencilla
    /// ///return "Profesor =" + getId() + getName() + getEmail() + getSpeciallity() + getSalary();
    @Override
    public String mostrarInfo(){

        return "Profesor{" +
                "id=" + getId() +
                ", nombre= '" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", especialidad='" + speciallity + '\'' +
                ", salario='" + salary + '\'' +
                "}";
    }




}
