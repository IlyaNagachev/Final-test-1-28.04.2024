public class ToyStoreProgram {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy(1, "Teddy Bear", 10, 20.0);
        Toy toy2 = new Toy(2, "Doll", 15, 30.0);
        Toy toy3 = new Toy(3, "Car", 20, 50.0);

        toyStore.addNewToy(toy1);
        toyStore.addNewToy(toy2);
        toyStore.addNewToy(toy3);

        Toy drawnToy = toyStore.drawToy();
        if (drawnToy != null) {
            System.out.println("Congratulations! You've won a " + drawnToy.getName());
        } else {
            System.out.println("No toy was drawn this time.");
        }
    }
}