package com.TestApplication.demo;



import com.TestApplication.demo.Services.LoggedUserManagementService;
import com.TestApplication.demo.Services.LoginCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;
    private String username;
    private String password;


    public LoginProcessor(
            LoggedUserManagementService loggedUserManagementService,
            LoginCountService loginCountService
    ) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }


    public boolean login(){
        String username = this.getUsername();
        String password = this.getPassword();
        loginCountService.increment();
        boolean loginResult = false;
        if ("natalie".equals(username) && "password".equals(password)){
            loginResult=true;
            loggedUserManagementService.setUsername(username);
            return loginResult;
        }

        return loginResult;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
