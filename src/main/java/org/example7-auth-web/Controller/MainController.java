package com.TestApplication.demo.Controller;


import com.TestApplication.demo.Services.LoggedUserManagementService;
import com.TestApplication.demo.Services.LoginCountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
public class MainController {
    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;
    private final Logger logger = Logger.getLogger(MainController.class.getName());
    public MainController(
            LoginCountService loginCountService,
            LoggedUserManagementService loggedUserManagementService
    ) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    @GetMapping("/main")
    public String home(
            @RequestParam(required = false) String Logout,
            Model model
    ){
        logger.info(Logout);
        if (Logout!=null){
            loggedUserManagementService.setUsername(null);
        }
        logger.info(loggedUserManagementService.getUsername());
        String username = loggedUserManagementService.getUsername();
        if (username == null){
            return "redirect:/";
        }
        int count = loginCountService.getCount();
        model.addAttribute("username", username);
        model.addAttribute("count", count);
        return "main.html";
    }

}
