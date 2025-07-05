package com.sprint.cache.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Livro {
    private String isbn;
    private String titulo;

    @Override
    public String toString() {
        return "Livro{" + "isbn='" + isbn + '\'' + ", title='" + titulo + '\'' + '}';
    }

}
