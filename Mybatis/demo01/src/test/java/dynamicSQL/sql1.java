package dynamicSQL;/*
 *   Created by coder-pig@outlook.com on 2017/4/6.
 */

import entity.college;
import entity.stu;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class sql1 {

    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession session=sqlSessionFactory.openSession(true);

    public sql1() throws IOException {
    }

    @Test
    public void test01(){
        Mapperinterface.dynamicSQL.sql1 sql=session.getMapper(Mapperinterface.dynamicSQL.sql1.class);

        stu s=new stu();
        s.setName("lz");

        sql.getComplete(s);
    }
    @Test
    public void test02(){
        Mapperinterface.dynamicSQL.sql1 sql=session.getMapper(Mapperinterface.dynamicSQL.sql1.class);

        List<stu> list=new ArrayList<stu>();

        entity.college college=new college();
        college.setId(1);

        list.add(new stu(1001,"1001name","1001addr",1,college));
        list.add(new stu(1002,"1002name","1002addr",1,college));
        list.add(new stu(1003,"1003name","1003addr",0,college));
        list.add(new stu(1004,"1004name","1004addr",0,college));
        System.out.println(sql.insertmanyitem(list));
    }
    @Test
    public void test03(){
        Mapperinterface.dynamicSQL.sql1 sql=session.getMapper(Mapperinterface.dynamicSQL.sql1.class);

        List<stu> list=new ArrayList<stu>();

        entity.college college=new college();
        college.setId(1);

        list.add(new stu(1111,"1001name","1001addr",1,college));
        list.add(new stu(1112,"1002name","1002addr",1,college));
        list.add(new stu(1113,"1003name","1003addr",0,college));
        list.add(new stu(1114,"1004name","1004addr",0,college));
        System.out.println(sql.insertmanyitem02(list));
    }
    @Test
    public void test04(){
        Mapperinterface.dynamicSQL.sql1 sql=session.getMapper(Mapperinterface.dynamicSQL.sql1.class);

        System.out.println(sql.testInnerPara(10086));
    }

}
