public class ConcreteBuilder2 extends  Builder {
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
        product += "=*=";
    }

    @Override
    public void buildPartB() {
        product += "=**=";
    }

    @Override
    public void buildPartC() {
        product += "=***=";
    }
}
