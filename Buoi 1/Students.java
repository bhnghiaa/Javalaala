package cigg;

public class Students {
    private
    String name;
    private
    int age;
    private String Class;
    public Students(String name, int age, String Class) {
        this.name = name;
        this.age = age;
        this.Class = Class;
    }
    public float dToan, dLy, dHoa;
    public float getdToan()
    {
        return dToan;
    }
    public float getdLy()
    {
        return dLy;
    }
    public float getdHoa()
    {
        return dHoa;
    }

}
