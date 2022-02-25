public class Enemy {
    // (muutuja aktiivne) parem klõps -> refactor -> rename
    int coordinateY;
    int coordinateX;

    // new Enemy(1,6)
    public Enemy(int worldHeight, int worldWidth) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }
}