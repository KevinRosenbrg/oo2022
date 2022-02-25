public class Item {
    int coordinateY;
    int coordianteX;
    double strength;
    ItemType itemType;


    public Item(int worldHeight, int worldWidth, ItemType itemType) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
        this.itemType = itemType;
        determineStrength(itemType); // ctrl + alt + m

        private void extracted(ItemType itemType) {
            switch (itemType) {
                case SWORD:
                    this.strength = 3;
                    break;
                case HAMMER:
                    this.strength = 2;
                case DAGGER:
                    this.strength = 1;
                    break;
            }
        }
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1; // cast
    }
}