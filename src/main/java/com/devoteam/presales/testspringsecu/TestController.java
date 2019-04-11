package com.devoteam.presales.testspringsecu;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Controller
public class TestController {
    @Autowired
    UsersRepo usersRepo;

    @GetMapping(path = "/checkifdevo")
    public String logout(Model model, Principal principal, HttpServletRequest request, HttpServletResponse response) throws JSONException {
        OAuth2Authentication authentication = (OAuth2Authentication) principal;
        Map<String, Object> user = (Map<String, Object>) authentication.getUserAuthentication().getDetails();
        model.addAttribute("user", user);
        JSONObject obj = new JSONObject(user);

        List<User> users = new ArrayList<>();
        User userdevo = new User();
        userdevo.setNom(obj.getString("family_name"));
        userdevo.setPrenom(obj.getString("given_name"));
        userdevo.setEmail(obj.getString("email"));
        users.add(userdevo);
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Iterable<User> iterator = usersRepo.findAll();
        int i = 0;
        for (User u : iterator) {

            if (u.getEmail().equals(userdevo.getEmail())) {
                i++;
            }
        }
        if (i == 1) {
            return "redirect:/apiview.html";
        }
        new SecurityContextLogoutHandler().logout(request, response, auth);
        return "redirect:/unauthorized.html";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return usersRepo.findAll();
    }

}
