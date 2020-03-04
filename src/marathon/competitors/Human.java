package marathon.competitors;

public class Human implements competitors {
    String name;

    int maxRunDistance;
    int maxJumpHeight;

    boolean active;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;

        this.active = true;

    }
    public Human(String name) {
        this(name, 2000, 8);

    }

    @Override
    public void Run(int distance) {
        if(distance<=maxRunDistance){
        System.out.println(name+" "+"Прошел диснацию");
    } else {
        System.out.println(name+" "+"Не добежал");
        active=false;

    }
    }

    @Override
    public void Jump(int height) {
        if (height<=maxJumpHeight){
            System.out.println(name+" "+"Преодолел");
        } else{
            System.out.println(name+" "+"Не справился ");
        }

    }

    @Override
    public boolean isDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + active);

    }
}
