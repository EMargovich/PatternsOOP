public class Gorilla extends Animal {

    String name;

    public Gorilla(String name) {
        this.name = name;
    }

    @Override
    public String getInfo() {
        return "Gorilla " + name;
    }
}