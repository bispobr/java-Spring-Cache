package com.sprint.cache.service;

import com.sprint.cache.repository.LivroRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private final LivroRepository livroRepository;

    public AppRunner(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(".... Fetching books");
        logger.info("isbn-1234 -->" + livroRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-4567 -->" + livroRepository.getByIsbn("isbn-4567"));
        logger.info("isbn-1234 -->" + livroRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-4567 -->" + livroRepository.getByIsbn("isbn-4567"));
        logger.info("isbn-1234 -->" + livroRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-1234 -->" + livroRepository.getByIsbn("isbn-1234"));
    }
}
