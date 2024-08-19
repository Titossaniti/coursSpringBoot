package com.example.springcours.controller;

import com.example.springcours.model.Info;
import org.springframework.web.bind.annotation.*;

        import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path="/api", produces="application/json")
@CrossOrigin(origins="*")
public class testController {

    private List<Info> InfoList() {
        List<Info> infoList = new ArrayList<>();

        Info info1 = new Info();
        info1.setId("1");
        info1.setName("Henry");
        info1.setAge("25");

        Info info2 = new Info();
        info2.setId("2");
        info2.setName("Richard");
        info2.setAge("58");

        Info info3 = new Info();
        info3.setId("3");
        info3.setName("Richard");
        info3.setAge("34");

        infoList.add(info1);
        infoList.add(info2);
        infoList.add(info3);

        return infoList;
    }

    @GetMapping("/test")
    public List<String> getList() {
        return List.of("A", "B", "C");
    }

    @GetMapping("/info")
    public List<Info> getAllInfo() {
        return InfoList();
    }

    @GetMapping("/info/{name}")
    public List<Info> getInfoByName(@PathVariable String name) {
        List<Info> result = new ArrayList<>();
        for (Info info : InfoList()) {
            if (info.getName().equalsIgnoreCase(name)) {
                result.add(info);
            }
        }

        return result;
    }
}
