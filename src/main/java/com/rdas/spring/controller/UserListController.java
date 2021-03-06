package com.rdas.spring.controller;

import com.rdas.spring.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by rdas on 23/07/2016.
 */
@Slf4j
@Controller
@RequestMapping("/user")
public class UserListController {
    @Autowired
    private UserService userService;

    @RequestMapping("/listuser")
    public ModelAndView getListUsersView() {
        log.debug("Received request to get user list view");
        ModelMap model = new ModelMap();
        model.addAttribute("users", userService.getList());
        return new ModelAndView("listuser", model);
    }

    @RequestMapping("/list")
    public String listUsersView() {
        log.debug("Received request to get user list view");
        return "listuser";
    }
}
