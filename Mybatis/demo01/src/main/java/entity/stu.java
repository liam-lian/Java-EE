package entity;/*
 *   Created by coder-pig@outlook.com on 2017/4/6.
 */


public class stu {


    private Integer id;
    private String name;
    private int stuGender;
    private String addr;

    college college;

    public entity.college getCollege() {
        return college;
    }

    public void setCollege(entity.college college) {
        this.college = college;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getStuGender() {
        return stuGender;
    }

    public void setStuGender(int stuGender) {
        this.stuGender = stuGender;
    }


    public stu(Integer id, String name,  String addr,int stuGender, entity.college college) {
        this.id = id;
        this.name = name;
        this.stuGender = stuGender;
        this.addr = addr;
        this.college = college;
    }

    public stu(Integer id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    public stu() {
    }


    @Override
    public String toString() {
        return "stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + stuGender +
                ", addr='" + addr + '\'' +
                ", college=" + college +
                '}';
    }
}
