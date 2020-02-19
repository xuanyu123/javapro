package model;

/**
 * @author xuanyu
 * @date 2020-02-18 11:47 下午
 */
public class Student {
    private String Sno;
    private String Sname;
    private String Ssex;
    private Integer Sage;
    private String Clno;

    public Student() {
    }

    public Student(String sno, String sname, String ssex, Integer sage, String clno) {
        Sno = sno;
        Sname = sname;
        Ssex = ssex;
        Sage = sage;
        Clno = clno;
    }

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSsex() {
        return Ssex;
    }

    public void setSsex(String ssex) {
        Ssex = ssex;
    }

    public Integer getSage() {
        return Sage;
    }

    public void setSage(Integer sage) {
        Sage = sage;
    }

    public String getClno() {
        return Clno;
    }

    public void setClno(String clno) {
        Clno = clno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sno='" + Sno + '\'' +
                ", Sname='" + Sname + '\'' +
                ", Ssex='" + Ssex + '\'' +
                ", Sage=" + Sage +
                ", Clno='" + Clno + '\'' +
                '}';
    }
}
