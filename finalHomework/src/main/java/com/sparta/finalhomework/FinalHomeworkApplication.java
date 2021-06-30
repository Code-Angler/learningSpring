package com.sparta.finalhomework;

import com.sparta.finalhomework.domain.Notice;
import com.sparta.finalhomework.domain.NoticeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class FinalHomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinalHomeworkApplication.class, args);
    }

}
