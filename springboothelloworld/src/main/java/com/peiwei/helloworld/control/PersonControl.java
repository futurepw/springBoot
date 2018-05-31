package com.peiwei.helloworld.control;

import com.peiwei.helloworld.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonControl {
    @RequestMapping("/test")
    public String index(Model model){
        Person single = new Person("赵二",11);
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("张三",11);
        Person p2 = new Person("李四",11);
        Person p3 = new Person("王五",23);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "/index";
    }
}
