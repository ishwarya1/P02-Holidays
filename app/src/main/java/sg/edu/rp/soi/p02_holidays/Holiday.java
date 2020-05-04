package sg.edu.rp.soi.p02_holidays;

public class Holiday {
    public Holiday(String name, String date, int res) {
        this.name=name;
        this.date=date;
        this.res=res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    String name;
    String date;
    int res;


}
