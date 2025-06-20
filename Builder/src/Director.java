public class Director {
    private Builder b;

    public Director(Builder b) {
        this.b = b;
    }

    public String getResult() {
        return b.getResult();
    }

    public void construct(String templat) {
        b.buildStart();

        for (int i = 0; i < templat.length(); i++) {
            switch(templat.charAt(i)) {
                case 'A' -> b.buildPartA();
                case 'B' -> b.buildPartB();
                case 'C' -> b.buildPartC();
                default -> {}
            }
        }
    }
}
