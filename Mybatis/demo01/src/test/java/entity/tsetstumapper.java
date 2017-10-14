package entity;/*
 *   Created by coder-pig@outlook.com on 2017/4/6.
 */

import Mapperinterface.collegeMapper;
import Mapperinterface.stuMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class tsetstumapper {

    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession session=sqlSessionFactory.openSession(true);

    public tsetstumapper() throws IOException {
    }

    @Test
    public void test01(){

        stuMapper mapper=session.getMapper(stuMapper.class);
        System.out.println(mapper.getStudent(100));

        System.out.println(mapper.getStudentandConnege01(100));
        System.out.println(mapper.getStudentandConnege02(100));
        System.out.println(mapper.getStudentByStep(100));

        collegeMapper amapper=session.getMapper(collegeMapper.class);
        System.out.println(amapper.getcollege(1));
    }

    @Test
    public void test02(){
        stuMapper mapper=session.getMapper(stuMapper.class);
        System.out.println(mapper.getStudentWithDiscrimter(3333));
    }
}
