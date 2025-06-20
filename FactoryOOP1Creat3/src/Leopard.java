public class Leopard extends Animal {

    String name;

    public Leopard(String name) {
        this.name = name;
    }

    @Override
    public String getInfo() {
        return "Leopard " + name;
    }
}


