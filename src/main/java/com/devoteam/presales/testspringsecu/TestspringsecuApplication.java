package com.devoteam.presales.testspringsecu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Principal;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.*;



@SpringBootApplication
@RestController
public class TestspringsecuApplication {

    @Autowired
    UsersRepo usersRepo;

    @RequestMapping("/user")
    public Principal user(Principal principal) throws JSONException,  Exception {
        OAuth2Authentication authentication = (OAuth2Authentication) principal;

        return principal;
    }



    public static void main(String[] args) {

        SpringApplication.run(TestspringsecuApplication.class, args);

    }

    @Bean
    CommandLineRunner runner (DevoService devoservice) {
        return args -> {
            // read json and write to db
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Devo>> typeReference = new TypeReference<List<Devo>>(){};
            FileInputStream  inputStream = new FileInputStream("C:\\Users\\oraph\\Desktop\\users.json");
            try {
                List<Devo> devos = mapper.readValue(inputStream,typeReference);
                devoservice.save(devos);
                System.out.println("Users Saved!");
            } catch (IOException e){
                System.out.println("Unable to save users: " + e.getMessage());
            }
        };
    }

}

