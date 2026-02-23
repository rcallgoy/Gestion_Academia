package org.example;

public class Main {
    static void main() {
        ///  Introducir aqui la base del programa
        /// METOODO
        Person person1 = new Student(1, "Rafa", "Rafa@gmail.com", "DAM", "8.9" );
        Person person2 = new Teacher(2, "Lorenzo", "Lorenzo@gmail.com", "DAM", 33.333 );

        System.out.println(person1.mostrarInfo());
        System.out.println(person2.mostrarInfo());

        /// ¿Reflexión?
        /// ¿Porqué se ejecuta el método correcto aunque la variable sea de tipo persona?
        ///
    }
}