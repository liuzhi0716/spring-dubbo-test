package ecnu.controller;

import ecnu.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ecnu.api.PeopleConsumer;

/**
 * Created by 63050 on 2018/9/14.
 */
@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleConsumer peopleConsumer;

    @GetMapping("/get")
    public People getPeople(){
        People people = peopleConsumer.getPeople();
        return people;
    }
}
