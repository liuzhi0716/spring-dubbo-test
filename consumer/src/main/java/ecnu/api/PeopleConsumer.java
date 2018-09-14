package ecnu.api;

import com.alibaba.dubbo.config.annotation.Reference;
import ecnu.entity.People;
import org.springframework.stereotype.Component;

/**
 * Created by 63050 on 2018/9/14.
 */
@Component
public class PeopleConsumer {

    @Reference
    PeopleService peopleService;

    public People getPeople(){
        Integer id  = 1;
        People people = peopleService.getPeople(id);
        System.out.println(people.getId()+people.getName());
        return people;
    }
}
