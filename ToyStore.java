import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ToyStore {
    private List<Toy> toys = new ArrayList<>();

    public void addNewToy(Toy toy) {
        toys.add(toy);
    }

    public Toy drawToy() {
        Random random = new Random();
        double totalFrequency = toys.stream().mapToDouble(Toy::getFrequency).sum();
        double randomNumber = random.nextDouble() * totalFrequency;

        for (Toy toy : toys) {
            if (randomNumber < toy.getFrequency()) {
                toy.setQuantity(toy.getQuantity() - 1);
                toys.remove(toy);
                saveToyToFile(toy);
                return toy;
            }
            randomNumber -= toy.getFrequency();
        }

        return null;
    }

    private void saveToyToFile(Toy toy) {
        try (FileWriter writer = new FileWriter("winning_toys.txt", true)) {
            writer.write("ID: " + toy.getId() + ", Name: " + toy.getName() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}