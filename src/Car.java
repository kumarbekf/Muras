public class Car {
    private String neme;
    private int jyl;
    private String tusu;

    public Car(String neme, int jyl, String tusu) {
        this.neme = neme;
        this.jyl = jyl;
        this.tusu = tusu;


    }

    public String getNeme() {
        return neme;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public int getJyl() {
        return jyl;
    }

    public void setJyl(int jyl) {
        this.jyl = jyl;
    }

    public String getTusu() {
        return tusu;
    }

    public void setTusu(String tusu) {
        this.tusu = tusu;

    }

    @Override
    public String toString() {
        return "Car{" + "neme='" + neme + '\'' + " jyl='" + jyl + '\'' + " tusu='" + tusu + '\'' + '}';
    }
}
