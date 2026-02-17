package org.example;

public class Person {

    /// DECLARAR una VARIABLE
    /// ATRIBUTOS
    private int id;
    private String name;
    private String email;

    /// Los frameworks  ORM (Hibernate/JPA) utilizan reflexion para crear instancias
    /// de las clases cuando recuperan datos de la base de datos
    public Person() {
    }

    /// -----  CONSTRUCTOR con todos los PARAMETROS ------
    /// Este constructor se usa cuando creamos un objetos con todsos los datos conocidos
    public Person(int id, String name, String email /* SON PARAMETROS */) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    ///  CONSTRUCTOR sin el id
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /// METODOS
    /// Permisos / Retorno / Nombre / (Parametros)
    public String mostrarInfo(){
        return "ID:" + id + "\n" +
                "NOMBRE:" + name + "\n" +
                "EMAIL:" + email;
    }


    ///  --- Getters y Setters ---

    public int getId() {
        return id;

    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}


