import java.util.Objects;

public class Employee {
    //поля
    private String fio;
    private int otdel;
    private int zp;

    private int id;
    //статичная
    private static int counter = 1;
    //конструктор
    public Employee(String fio, int otdel, int zp){
        this.fio=fio;
        this.otdel=otdel;
        this.zp=zp;
        this.id = counter++;
    }

    //геттеры
    public int getOtdel(){return otdel;}
    public int getZp(){return zp;}
    public String getFio() {
        return fio;
    }

    //сеттеры
    public void setZp(int zp) {
        this.zp = zp;
    }

    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && Objects.equals(getFio(), employee.getFio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFio(), id);
    }

    @Override
    public String toString() {
        return "Employee#" + id +"{"+
                "fio='" + fio +
                ", otdel=" + otdel +
                ", zp=" + zp +
                '}';
    }
}
