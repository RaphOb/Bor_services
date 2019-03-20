package com.devoteam.presales.testspringsecu;
import java.security.Principal;
import java.util.*;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.devoteam.presales.testspringsecu.UsersRepo;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

@EnableJpaRepositories(basePackageClasses = UsersRepo.class)
@RestController
public class TestspringsecuApplication extends UsersDevo {

    public TestspringsecuApplication() {
        super("raph", "o.raphou@gmail.com", "avv", "oba", 1);
    }

    @RequestMapping("/user")
    public Principal user(Model model, Principal principal) throws JSONException {
        OAuth2Authentication authentication = (OAuth2Authentication) principal;
    Map<String, Object> user = (Map<String, Object>)authentication.getUserAuthentication().getDetails();
    model.addAttribute("user",user);
        JSONObject obj = new JSONObject(user);
        String pageName = obj.getString("name");
        UsersDevo userdevo = new UsersDevo("raph", "o.raphou@gmail.com", "avv", "oba", 1);
        List<UsersDevo> users = new ArrayList<>();
        userdevo.setNom(obj.getString("family_name"));
        userdevo.setPrenom(obj.getString("given_name"));
        userdevo.setEmail(obj.getString("email"));
        users.add(userdevo);
        System.out.println(userdevo.getEmail());
       // UsersDevo userpre = new UsersDevo("raph", "o.raphou@gmail.com", "avv", "oba", 1);
        userinfo user1 = new userinfo();
       // userpre =  user1.getUser1();
       // users.add(userpre);
     // if ( userdevo.getEmail() != userpre.getEmail()) {


    return principal;
    }


    @GetMapping("/user")
    public ModelAndView method() {
        System.out.println("icila");
        return new ModelAndView("redirect:" + "/");
    }

    public static void main(String[] args) {

        SpringApplication.run(TestspringsecuApplication.class, args);

    }

}

