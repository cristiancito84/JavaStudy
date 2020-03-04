package marathon.Obstacles;

import marathon.competitors.competitors;

public class Wall extends Obstacles {
    int Height;

    public Wall(int height) {
        Height = height;
    }

    @Override
    public void goToWin(competitors competitors) {
        competitors.Jump(Height);

    }
}
