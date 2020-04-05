package com.dong.controller.Login;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

@Log
@RestController
@RequestMapping("/AppProject")
public class LoginController {

    @RequestMapping("/login")
    public String LoginByUserAndPassWord() {
        log.info("***********正在访问rest接口!");
        return "访问成功!";
    }

    /**
     * 此时通过请求路径传递参数
     *
     * @param name
     * @return
     */
//    @RequestMapping(value = "/get/{name}",method = RequestMethod.POST)
    @RequestMapping(value = "/get/{name}", method = RequestMethod.GET)
    public String LoginForGet(@PathVariable("name") String name) {
        return "使用get请求访问成功!" + name + "通过请求路径获取参数!";
    }

    /**
     * 通过请求参数
     *
     * @return
     */
    @RequestMapping(value = "/getAddress")
    public String LoginForGet(@RequestParam("address") String address, @RequestParam("name") String name) {
        return "使用get请求访问成功!" + address + "===>" + name + "获取请求参数!";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String LoginForPost() {
        System.out.println("正在用post请求访问!");
        return "使用post请求访问成功!";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String deleteByUser() {
        return "删除信息成功!";
    }

    @GetMapping("/getMap")
    public String LoginForGetMapping() {
        return "getmapping访问成功!";
    }

    @PostMapping("/postMap")
    public String LoginForPostMapping() {
        return "postmapping访问成功!";
    }
}
