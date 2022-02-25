public class World {
    int worldHeight;
    int worldWidth;
    List<Item> items;

    public World(int height, int width) {
        this.worldHeight = height;
        this.worldWidth = width;
    }

    public void printMap(int playerCoordinateY, int playerCoordinateX,
                         int enemyCoordinateY, int enemyCoordianteX) {
        // fori --> pakub
        char symbol;   // deklareerib 1x muutuja, mitte iga kord deklareerib selle muutuja
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) { // primitiiv || andmebaasipäring
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                for (Item item : items) {
                    if (items.get(i).coordinateY == y && items.get(i).coordinateX == x) {
                        symbol = 'I';
                        break;
                    }
                }
                if (playerCoordinateY == y && playerCoordinateX == x) {
                    symbol = 'x';
                }
                if (enemyCoordinateY == y && enemyCoordianteX == x) {
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}