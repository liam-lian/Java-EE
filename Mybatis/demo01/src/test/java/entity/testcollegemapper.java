package entity;/*
 *   Created by coder-pig@outlook.com on 2017/4/6.
 */

import Mapperinterface.collegeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class testcollegemapper {


    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession session=sqlSessionFactory.openSession(true);

    public testcollegemapper() throws IOException {
    }

    @Test
    public void test01(){
        collegeMapper collegeMapper=session.getMapper(Mapperinterface.collegeMapper.class);
        college college=collegeMapper.getCollegeandAllStu(1);
        System.out.println(college);

        System.out.println(collegeMapper.getAllstu(1));

        System.out.println(collegeMapper.getCollegeandAllStuByStep(1));
    }
}
