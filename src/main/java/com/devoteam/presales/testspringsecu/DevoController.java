package com.devoteam.presales.testspringsecu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DevoController {
    private DevoService devoservice;

    public DevoController (DevoService devoservice) {
        this.devoservice = devoservice;
    }


    public Iterable<Devo> list() {
        return devoservice.list();
    }

@RequestMapping(value = "/apiview")
    public String listdevo(Model model) {
        model.addAttribute("devolist", devoservice.list());
        model.addAttribute("entitylist", devoservice.list1());
        model.addAttribute("secteurlist", devoservice.list2());

        return "apiview";
    }
}
