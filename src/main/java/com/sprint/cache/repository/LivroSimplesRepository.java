package com.sprint.cache.repository;

import com.sprint.cache.model.Livro;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class LivroSimplesRepository implements LivroRepository {
    @Override
    @Cacheable("livro")
    public Livro getByIsbn(String isbn) {
        simulaServicoLento();
        return new Livro(isbn, "livro");
    }


    private void simulaServicoLento() {
        try {
            long tempo = 3000L;
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
