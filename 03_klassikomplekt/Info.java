public class Info {
    String model;
    String processor;
    String graphics;
    int ram;
    int hdd;

    public Info(String model, String processor, String graphics, int ram, int hdd) {
        this.model = model;
        this.processor = processor;
        this.graphics = graphics;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getModel() {
        return model;
    }

    public Arvuti(Info info, int maksumus){
        this.info = info;
        this.maksumus = maksumus;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Info{" +
                "model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", graphics='" + graphics + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}