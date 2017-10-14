package Mapperinterface;/*
 *   Created by coder-pig@outlook.com on 2017/4/6.
 */

import entity.college;
import entity.stu;

import java.util.List;

public interface collegeMapper {

    public college getcollege(Integer id);

    public college getCollegeandAllStu(Integer id);

    public college getCollegeandAllStuByStep(Integer id);

    public List<stu> getAllstu(Integer id);
}
