package com.hrishikeshmishra.sbt.bookpub;

import com.hrishikeshmishra.sbt.bookpub.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;

public class StartupRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(StartupRunner.class);

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... strings) throws Exception {
        log.info("Data source : " + bookRepository.count());
    }


    @Scheduled(initialDelay = 1000, fixedDelay = 10000)
    public void run() throws Exception {
        log.info("Number of book : " + bookRepository.count());
    }
}
