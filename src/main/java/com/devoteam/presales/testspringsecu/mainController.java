package com.devoteam.presales.testspringsecu;

import com.devoteam.presales.DriveQuickstart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.security.GeneralSecurityException;


@Controller
public class mainController {

    @ResponseBody
    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public String index(@RequestParam(required = false) String query) throws IOException, GeneralSecurityException {
        DriveQuickstart drive = new DriveQuickstart("c:/temp/credentials.json");

        String res = drive.checkFile(query);

        return res;
    }


}
