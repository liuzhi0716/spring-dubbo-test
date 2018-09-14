package ecnu.entity;

import java.io.Serializable;

/**
 * Created by 63050 on 2018/9/14.
 */
public class People implements Serializable{
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
