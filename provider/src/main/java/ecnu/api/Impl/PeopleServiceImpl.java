package ecnu.api.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import ecnu.entity.People;
import ecnu.api.PeopleService;

/**
 * Created by 63050 on 2018/9/14.
 */
@Service
public class PeopleServiceImpl implements PeopleService {
    @Override
    public People getPeople(Integer id) {
        People people = new People();
        people.setId(1);
        people.setName("刘");
        return people;
    }
}
