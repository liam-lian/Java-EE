package Mapperinterface;/*
 *   Created by coder-pig@outlook.com on 2017/4/6.
 */

import entity.stu;
import org.apache.ibatis.annotations.Param;

public interface Demo01 {

    public stu SelectByID(Integer id);

    public void add(stu stu);
    public void del(Integer id);
    public void update(stu stu);

    public void updatewithPara(@Param("id") Integer id,@Param("n") String  name);
}
