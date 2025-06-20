public class Orangutan extends Animal {

    String name;

    public Orangutan(String name) {
        this.name = name;
    }

    @Override
    public String getInfo() {
        return "Orangutan " + name;
    }
}
