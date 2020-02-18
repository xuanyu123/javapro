package model;

/**
 * @author xuanyu
 * @date 2020-02-18 11:47 下午
 */
public class Student {
    private Character Sno;
    private Character Sname;
    private Character Ssex;
    private Integer Sage;
    private Character Clno;

    public Student() {
    }

    public Student(Character sno, Character sname, Character ssex, Integer sage, Character clno) {
        Sno = sno;
        Sname = sname;
        Ssex = ssex;
        Sage = sage;
        Clno = clno;
    }

    public Character getSno() {
        return Sno;
    }

    public void setSno(Character sno) {
        Sno = sno;
    }

    public Character getSname() {
        return Sname;
    }

    public void setSname(Character sname) {
        Sname = sname;
    }

    public Character getSsex() {
        return Ssex;
    }

    public void setSsex(Character ssex) {
        Ssex = ssex;
    }

    public Integer getSage() {
        return Sage;
    }

    public void setSage(Integer sage) {
        Sage = sage;
    }

    public Character getClno() {
        return Clno;
    }

    public void setClno(Character clno) {
        Clno = clno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sno=" + Sno +
                ", Sname=" + Sname +
                ", Ssex=" + Ssex +
                ", Sage=" + Sage +
                ", Clno=" + Clno +
                '}';
    }
}
