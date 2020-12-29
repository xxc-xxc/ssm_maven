package com.ssm.web;

import com.ssm.domain.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author xxc
 * @Date 2020/12/29 11:35
 * @Description TODO
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("showUser")
    public String showUser(Integer id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "showUser";
    }

}
