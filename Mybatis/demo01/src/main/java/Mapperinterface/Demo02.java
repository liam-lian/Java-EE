package Mapperinterface;/*
 *   Created by coder-pig@outlook.com on 2017/4/6.
 */

import entity.stu;
import org.apache.ibatis.annotations.Select;

public interface Demo02 {

    @Select("select * from emp where name = #{id}")
    public stu SelectByName(String name);
}
