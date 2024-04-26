public class ToyStoreProgram {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy(1, "Плюшевая игрушка", 10, 20.0);
        Toy toy2 = new Toy(2, "Кукла", 15, 30.0);
        Toy toy3 = new Toy(3, "Робот", 20, 50.0);
        Toy toy4 = new Toy(4, "Машинка", 5, 10.0);

        toyStore.addNewToy(toy1);
        toyStore.addNewToy(toy2);
        toyStore.addNewToy(toy3);
        toyStore.addNewToy(toy4);

        Toy drawnToy = toyStore.drawToy();
        if (drawnToy != null) {
            System.out.println("Поздравляем! Ваш приз: " + drawnToy.getName());
        } else {
            System.out.println("К сожалению, игрушки кончились(((");
        }
    }
}