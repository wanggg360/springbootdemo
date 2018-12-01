package com.wg.springboot.controller;

import com.wg.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    private UserService userService;

    @RequestMapping(value = "/index.html")

    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/loginCheck.html")

    public ModelAndView loginCheck(HttpServletRequest request, String userName, String password) {

        System.out.println("##############" + userName + "    " + password);
        Boolean hasuser = userService.hasMatchUser(userName, password);

        System.out.println("##############" + userName + "    " + password);
        if (!hasuser) {
            return new ModelAndView("login", "error", "username or password is wrong");
        } else {
            return new ModelAndView("main");
        }


    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
