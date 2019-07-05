package com.devoteam.presales.bor.api;

import com.devoteam.presales.bor.ListJson.ListAudience;
import com.devoteam.presales.bor.ListJson.ListEntities;
import com.devoteam.presales.bor.ListJson.ListUser;
import com.devoteam.presales.bor.models.Audience;
import com.devoteam.presales.bor.models.Entity;
import com.devoteam.presales.bor.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TestApiController {

    @RequestMapping(path = "/users")
    public List<User> userList() {
        return new ArrayList<>(ListUser.users);
    }

    @RequestMapping(path = "/entities")
    public List<Entity> entityList() {
        return new ArrayList<>(ListEntities.entities);
    }

    @RequestMapping(path = "/audiences")
    public List<Audience> audienceList() {
        return new ArrayList<>(ListAudience.audiences);
    }
}
//todo creer controler pour call  createbor, regarde material
