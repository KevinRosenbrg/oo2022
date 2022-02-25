import java.util.Scanner;

public class Game2 {
    // main --> pakub
    public static void main(String[] args) {
        // sout --> pakub
        // String -- sõnaline muutuja
        // char -- üks täht
        // double -- 15kohaline komakohaga number
        // float -- 7kohaline komagakohaga number xxx
        // int -- täiskohaline number 2.1mlj
        // byte -- 128kohta
        // short -- 32000kohta
        // long -- 9,223,372,036,854,775,807
        // boolean -- kahendväärtus true/false

        // Math.random() -- 0 .. 0.9999  -  0 ... 4.9999 -- 0..2 .. 1..3

        World world = new World(5,10);
        Player mangija1 = new Player(world.worldHeight, world.worldWidth);
        Player mangija2 = new Player(world.worldHeight,world.worldWidth);

        // uue instantsi loomine --- uue mälukohaga objekti tekitamine
        // kellel on kõik omadused mis on defineeritud tema klassis
        Enemy vaenlane1 = new Enemy(world.worldHeight, world.worldWidth);
        Item sword = new Item(world.worldHeight,world.worldWidth,ItemType.SWORD);
        Item hammer = new Item(world.worldHeight,world.worldWidth,ItemType.HAMMER);
        Item dagger = new Item(world.worldHeight,world.worldWidth,ItemType.DAGGER);
        world.items = Array.asList(sword, hammer, dagger);


        world.printMap(mangija1.coordinateY,
                mangija1.coordinateX, vaenlane1.coordinateY,
                vaenlane1.coordinateX);

        // klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            mangija1.movePlayer(input,world.worldHeight,world.worldWidth);
            for (Item item:world.items) {
                if (item.coordinateX == mangija1.coordinateY && item.coordinateY == mangija1.coordinateY) {
                    mangija1.addItem(item);
                    break;
                }
            }
            world.printMap(mangija1.coordinateY,
                    mangija1.coordinateX, vaenlane1.coordinateY,
                    vaenlane1.coordinateX);
            input = scanner.nextLine();
        }
    }


}