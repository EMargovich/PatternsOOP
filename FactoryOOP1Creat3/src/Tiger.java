public class Tiger extends Animal {
    String name;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public String getInfo() {
        return "Tiger " + name;
    }
}
