package com.example.github_actions_cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsCicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsCicdApplication.class, args);
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome!";
    }

}
