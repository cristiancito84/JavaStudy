package marathon.competitors;

public class Cat implements competitors {
    String name;

    int maxRunDistance;
    int maxJumpHeight;

    boolean onDistanceCat;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistanceCat = true;
    }

    public Cat(String name) {
        this(name, 500, 3);
    }

    @Override
    public void Run(int distance) {
        if(distance<=maxRunDistance){
            System.out.println(name+" "+"Прошел диснацию");
        } else {
            System.out.println(name+" "+"Не добежал");
            onDistanceCat=false;
        }

    }

    @Override
    public void Jump(int height) {
        if(height<=maxJumpHeight){
            System.out.println(name+" "+"допрыгнул");
        } else {
            System.out.println(name + " " + "не допрыгнул");
            onDistanceCat=false;
        }

    }

    @Override
    public boolean isDistance() {
        return onDistanceCat;
    }

    @Override
    public void info() {
        System.out.println(name+" "+ onDistanceCat);

    }
}
