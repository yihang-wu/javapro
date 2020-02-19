package neuedu.pojo;

import neuedu.util.Colum;

public class Dept {
    private Integer deptno;
    private String dname;
    @Colum("loc")
    private String locl;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocl() {
        return locl;
    }

    public void setLocl(String locl) {
        this.locl = locl;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", locl='" + locl + '\'' +
                '}';
    }
}
