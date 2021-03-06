package com.rdas.spring.controller;

import com.rdas.spring.model.User;
import com.rdas.spring.exception.UserAlreadyExistsException;
import com.rdas.spring.service.UserService;
import com.rdas.spring.model.UserCreateForm;
import com.rdas.spring.validator.UserCreateFormPasswordValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by rdas on 23/07/2016.
 */
@Slf4j
@Controller
public class UserCreateController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserCreateFormPasswordValidator passwordValidator;

    @InitBinder("form")
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(passwordValidator);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndexView() {
        log.debug("Received request index view");
        return "index";
    }

    // Both get methods are same. ModelAndView  wasn't working, investigate why?
    @RequestMapping(value = "/createuserm", method = RequestMethod.GET)
    public ModelAndView createUserModelDisplay() {
        log.info("Request for user create view screen");
        return new ModelAndView("createuser", "form", new UserCreateForm());
    }


    @RequestMapping(value = "/createuser", method = RequestMethod.GET)
    public String getCreateUserModel(Model model) {
        log.debug("Received request for user create view");
        model.addAttribute("form", new UserCreateForm());
        return "createuser";
    }

    @RequestMapping(value = "/createuser", method = RequestMethod.POST)
    public String createUser(@ModelAttribute("form") @Valid UserCreateForm form, BindingResult result) {
        log.debug("Received request to create {}, with result={}", form, result);
        if (result.hasErrors()) {
            return "createuser";
        }
        try {
            userService.save(new User(form.getId(), form.getPassword2()));
        } catch (UserAlreadyExistsException e) {
            log.debug("Tried to create user with existing id", e);
            result.reject("user.error.exists");
            return "createuser";
        }
        return "redirect:/user/list";
    }
}
