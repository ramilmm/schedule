package com.springapp.mvc.controllers;

import mvc.common.Ad;
import mvc.services.AdService;
import mvc.services.DayService;
import mvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserService userService;
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private DayService dayService;
    @Autowired
    private AdService adService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String renderMain(ModelMap model) {
        List<Ad> ads = adService.getAll();
        for (int i = 0; i < ads.size(); i++) {
            System.out.println(ads.get(i));
        }
        model.addAttribute("adverts",ads);

        return "timetable/timetable-vk";
    }


}
