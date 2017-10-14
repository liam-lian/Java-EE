import Mapperinterface.Demo01;
import Mapperinterface.Demo02;
import entity.stu;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class test01  {

    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    public test01() throws IOException {
    }

    @Test
    public void testSelect() throws IOException {

        SqlSession session = sqlSessionFactory.openSession();
        try {
            stu blog = session.selectOne("select", 12);
            System.out.println(blog);
        } finally {
            session.close();
        }
    }

    @Test
    public void  testInterface(){

        SqlSession sqlSession=sqlSessionFactory.openSession();
        Demo01 demo01=sqlSession.getMapper(Demo01.class);
        stu stu=demo01.SelectByID(12);
        System.out.println(stu);

//        demo01.add(new stu(1,"lzz","SZ"));
        demo01.update(new stu(1,"baba","wifiyou"));

        sqlSession.commit();

    }
    @Test
    public void  testDemo01(){

        Demo02 demo02=sqlSessionFactory.openSession().getMapper(Demo02.class);
        stu stu=demo02.SelectByName("lz");
        System.out.println(stu);
    }

    @Test
    public void TestDel(){
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        Demo01 demo01=sqlSession.getMapper(Demo01.class);

        demo01.del(1);

        sqlSession.commit();
    }
    @Test
    public void Testupdatewithpara(){
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        Demo01 demo01=sqlSession.getMapper(Demo01.class);

        demo01.updatewithPara(12,"pppp");

        sqlSession.commit();
    }

}
