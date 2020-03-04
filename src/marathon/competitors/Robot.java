package marathon.competitors;

public class Robot implements competitors {
    String name;

    int maxRunDistance;
    int maxJumpHeight;

    boolean onDistanceR;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistanceR = true;
    }

    public Robot(String name) {
        this(name, 500, 3);
    }

    @Override
    public void Run(int distance) {
        if(distance<=maxRunDistance){
            System.out.println(name+" "+"Прошел диснацию");
        } else {
            System.out.println(name+" "+"Не добежал");
            onDistanceR=false;
        }

    }

    @Override
    public void Jump(int height) {
        if(height<=maxJumpHeight){
            System.out.println(name+" "+"допрыгнул");
        } else {
            System.out.println(name + " " + "не допрыгнул");
            onDistanceR=false;
        }

    }

    @Override
    public boolean isDistance() {
        return onDistanceR;
    }

    @Override
    public void info() {
        System.out.println(name+" "+ onDistanceR);

    }
}