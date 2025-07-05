package com.sprint.cache.repository;

import com.sprint.cache.model.Livro;

public interface LivroRepository {
    Livro getByIsbn(String isbn);
}
