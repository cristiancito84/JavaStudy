package marathon.Obstacles;

import marathon.competitors.competitors;

public class RunningRoad extends Obstacles {
    int Length;

    public RunningRoad(int length) {
        Length = length;
    }

    @Override
    public void goToWin(competitors competitors) {
        competitors.Run(Length);

    }
}
