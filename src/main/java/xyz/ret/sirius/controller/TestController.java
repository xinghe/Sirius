package xyz.ret.sirius.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.ret.sirius.model.User;
import xyz.ret.sirius.service.impl.UserServiceImpl;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 * Created by fury on 17-2-11.
 */
@Controller
@RequestMapping(value = "/test/")
public class TestController {
    @Resource
    UserServiceImpl userService;

    @RequestMapping("")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "test1")
    public void test1(Writer writer) {
        List<User> users = userService.getUsers();
        try {
            for(User user : users) {
                writer.write(user.getId()+"\t"+user.getName()+"\t"+user.getDetail()+"\n");
            }
        } catch (IOException e) {}
    }
}
