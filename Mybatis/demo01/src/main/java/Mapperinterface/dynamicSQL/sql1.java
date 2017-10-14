package Mapperinterface.dynamicSQL;/*
 *   Created by coder-pig@outlook.com on 2017/4/6.
 */

import entity.stu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface sql1 {

    public stu getComplete(stu stu);

    public int insertmanyitem(@Param("students") List<stu> stus);
    public int insertmanyitem02(@Param("students") List<stu> stus);

    public stu testInnerPara(Integer id);

}
