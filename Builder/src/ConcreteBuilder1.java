public class ConcreteBuilder1 extends Builder {
    String product;

    @Override
    public void buildStart() {
        product = "";
    }

    @Override
    public String getResult() {
        return product;
    }

    @Override
    public void buildPartA() {
        product += "-1-";
    }

    @Override
    public void buildPartB() {
        product += "-2-";
    }

    @Override
    public void buildPartC() {
        product += "-3-";
    }
}
