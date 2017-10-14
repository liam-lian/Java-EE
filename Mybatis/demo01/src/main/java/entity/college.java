package entity;/*
 *   Created by coder-pig@outlook.com on 2017/4/6.
 */

import java.util.ArrayList;
import java.util.List;

public class college {


    private int id;
    private String name;

    List<stu> students=new ArrayList<stu>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "college{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
