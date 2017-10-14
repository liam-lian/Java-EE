package Mapperinterface;/*
 *   Created by coder-pig@outlook.com on 2017/4/6.
 */

import entity.stu;

public interface stuMapper {


    public stu getStudent(Integer id);

    public stu getStudentandConnege01(Integer id);

    public stu getStudentandConnege02(Integer id);

    public stu getStudentByStep(Integer id);


    public stu getStudentWithDiscrimter(Integer id);
}
