public class ProductA2 implements AbstractProductA {

    String info;

    public ProductA2() {
    }

    public ProductA2(int num) {
        this.info = String.valueOf(num);
    }

    @Override
    public String getInfo() {
        return info;
    }

    //In product type A define method A without parameters
    //для класса-продукта ProductA2 метод A просто удваивает строку info
    // (например, строка «123» преобразуется в строку «123123»).
    public void a () {
        info += info;
    }

}
