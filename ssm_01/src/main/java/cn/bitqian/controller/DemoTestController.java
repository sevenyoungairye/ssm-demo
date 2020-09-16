package cn.bitqian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author echo lovely
 * @date 2020/9/15 10:25
 */
@Controller
public class DemoTestController {

    @RequestMapping(value = "test")
    @ResponseBody
    public void test() {
        System.out.println("mvc test1...");
    }

}
