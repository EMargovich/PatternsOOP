public class Lion extends Animal {
    String name;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public String getInfo() {
        return "Lion " + name;
    }
}
