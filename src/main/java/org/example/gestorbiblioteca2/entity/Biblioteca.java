package org.example.gestorbiblioteca2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libros")
public class Biblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro", nullable = false, unique = true)
    private long id;

    @Column(name = "titulo", nullable = false, length = 100)
    private String title;

    @Column(name = "autor", nullable = false, length = 50)
    private String author;

    @Column(name = "editorial", nullable = false, length = 50)
    private String editorial;

    @Column(name="fecha", nullable = false)
    private LocalDate birthDate;

    @Column(name = "edicion", nullable = false, length = 50)
    private String edition;

    public Biblioteca(String title, String author, String editorial, LocalDate birthDate, String edition) {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.birthDate = birthDate;
        this.edition = edition;
    }
}
