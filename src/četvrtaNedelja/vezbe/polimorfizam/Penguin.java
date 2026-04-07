package četvrtaNedelja.vezbe.polimorfizam;

public class Penguin extends Animal {

    public Penguin(){
        super("Penguin","null");
    };

    public Penguin(String name){
        super("Penguin",name);

    }
    @Override
    public String advertising() {
        return "kvik";
    }

    @Override
    public String advertisingInAngry() {
        return "KVIK KVIK";
    }

    @Override
    public Movement movement() {
        return Movement.DIVES;
    }

    @Override
    public String toString(){
        return super.toString() + "PENGUIN";
    }
}
