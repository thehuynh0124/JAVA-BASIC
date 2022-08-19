package bai4;

public class TacGia {
    private String Name;
    private String BirthYear;

    public TacGia(String name, String birthYear) {
        Name = name;
        BirthYear = birthYear;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirthYear() {
        return BirthYear;
    }

    public void setBirthYear(String birthYear) {
        BirthYear = birthYear;
    }
}
