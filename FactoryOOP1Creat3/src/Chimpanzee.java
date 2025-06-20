public class Chimpanzee  extends Animal {

    String name;

    public Chimpanzee (String name) {
        this.name = name;
    }

    @Override
    public String getInfo() {
        return "Chimpanzee  " + name;
    }
}