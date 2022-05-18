package com.example.springboottest.controller;

import com.example.springboottest.bean.movie;
import com.example.springboottest.bean.usr;
import org.springframework.web.bind.annotation.*;

@RestController
public class HolloController {

    @GetMapping("/hello")
    public String hello()
    {
        return "快啊可能";
    }

    @GetMapping ("/login")
    public String login(String usrname,String password)
    {
        System.out.println(usrname);
        System.out.println(password);
       return usrname+password;
       // return "1登录ok";
    }
//与上面是两种不同的实现方式
    //http://localhost:8080/product/125
    //像上面那样就把后面的125这个数据传给id了
    @GetMapping("/product/{id}")/*这样就是可变的，与前面的相比，这里id的值是可变的，这个时候就要在下面使用id前加@pathvariable的注解，即使
    他们的名字给改还是id*/
    public String test(@PathVariable String id)
    {
        System.out.println(id);
        //System.out.println(password);
        return "商品";
        // return "1登录ok";
    }
    @PostMapping("/product1")
    public String test1( usr usrs)
    {

        System.out.println(usrs);
        // System.out.println(id);
        //System.out.println(password);
        return "商品2";
        // return "1登录ok";
    }

    @PostMapping("/product2")
    public String test2(@RequestBody usr usrs)//这里要在usr前面加个requestbody的注解才能使用json的格式来传，否则就只有还是按usr类setget来简化
    {

        System.out.println(usrs);
       // System.out.println(id);
        //System.out.println(password);
        return "商品2";
        // return "1登录ok";
    }

    @GetMapping("/movie")
    public movie demo()
    {  movie movie1=new movie();
    movie1.setDate("513");
    movie1.setName("maybe");
    movie1.setRate(7.6);

        return movie1;
    }

}
