package com.example.springcours.controller;

import com.example.springcours.model.Info;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path="/api",produces="application/json")
@CrossOrigin(origins="*")
public class testController {
    @GetMapping("/test")
    public ArrayList<String> getList(){
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("A");
        mylist.add("B");
        mylist.add("C");
        return mylist;
    }
    @GetMapping("/info")
    public ArrayList<Info> Info(){

        ArrayList<Info> infoList = new ArrayList<>();

        Info test1 = new Info();
        test1.setId("1");
        test1.setName("Henry");
        test1.setAge("25");

        Info test2 = new Info();
        test2.setId("2");
        test2.setName("Richard");
        test2.setAge("58");

        infoList.add(test1);
        infoList.add(test2);
        return infoList;
    }

    @GetMapping("/info/{name}")
    public Info getData(@PathVariable("name") String name){
        Info info = new Info();
        info.setId(name);
        info.setName(name);
        info.setAge(name);
        return info;
    }
}