package com.ecm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecm.model.User;
import com.ecm.service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
        return "index";
    }

    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public String register(User user, Model model) {
        if (null == user.getUserName() || "".equals(user.getUserName())) {
            model.addAttribute("message", "用户名不能为空！！");
            return "error";
        }
        if (null == user.getPassword() || "".equals(user.getPassword())) {
            model.addAttribute("message", "密码不能为空！！");
            return "error";
        }
        if (user.getAge() < 18) {
            model.addAttribute("message", "用户年龄不满18！！");
            return "error";
        }
        if (1 == userService.register(user)) {
            model.addAttribute("user", user);
            model.addAttribute("message", "恭喜注册成功！！");
            return "success";
        }
        model.addAttribute("message", "未知错误！");
        return "error";
    }

    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String login(User user, Model model) {
        if (null == user.getUserName() || "".equals(user.getUserName())) {
            model.addAttribute("message", "用户名不能为空！！");
            return "error";
        }
        if (null == user.getPassword() || "".equals(user.getPassword())) {
            model.addAttribute("message", "密码不能为空！！");
            return "error";
        }
        user = userService.login(user);
        if (user != null && user.getId() > 0) {
            model.addAttribute("user", user);
            model.addAttribute("message", "登录成功！！");
            return "success";
        }
        model.addAttribute("message", "未知错误！");
        return "error";
    }
}