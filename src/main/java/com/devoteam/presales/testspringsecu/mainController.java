package com.devoteam.presales.testspringsecu;

import com.devoteam.presales.DriveQuickstart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.security.GeneralSecurityException;
import com.devoteam.presales.testspringsecu.UsersRepo;

@RestController
public class mainController {
@Autowired
public UsersRepo userRepository;

@GetMapping(path = "/all")
public @ResponseBody Iterable<UsersDevo> getAllUsers(){
    return userRepository.findAll();
}

@ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(@RequestParam(required = false) String query) throws IOException, GeneralSecurityException {
        DriveQuickstart drive = new DriveQuickstart("c:/temp/credentials.json");

        String res = drive.checkFile(query);

        return res;
    }


}
