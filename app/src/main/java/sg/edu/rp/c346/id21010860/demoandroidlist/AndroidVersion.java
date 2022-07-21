package sg.edu.rp.c346.id21010860.demoandroidlist;

public class AndroidVersion {


    public AndroidVersion(String name, String version) {
        this.name = name;
        this.version = version;
    }

    private String name;
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public String getVersion() {
        return version;
    }
    @Override
    public String toString() {
        return name +": " + version;
    }
}
