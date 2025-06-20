public class Main {
    public static void main(String[] args) {
        int[] inds = {0, 1, 2,0 };
        String[] names = {"Tom", "Bill", "Maggi", "Sup"};
        Animal[] animals;

        CatCreator catZooCreator = new CatCreator();
        animals = catZooCreator.getZoo(inds, names);

        showZoo(animals);

        ApeCreator apeCreator = new ApeCreator();
        animals = apeCreator.getZoo(inds, names);

        showZoo(animals);
    }

    private static void showZoo (Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getInfo());
        }
    }
}
