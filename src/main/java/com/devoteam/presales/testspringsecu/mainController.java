package com.devoteam.presales.testspringsecu;

import com.devoteam.presales.DriveQuickstart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.security.GeneralSecurityException;

@RestController
public class mainController {

@ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(@RequestParam(required = false) String query) throws IOException, GeneralSecurityException {
        DriveQuickstart drive = new DriveQuickstart("c:/temp/credentials.json");

        String res = drive.checkFile(query);

        return res;
    }
@Autowired
    UsersDevo users;
}
