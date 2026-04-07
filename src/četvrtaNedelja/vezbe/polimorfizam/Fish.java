package četvrtaNedelja.vezbe.polimorfizam;

public class Fish extends Animal {

    public String subspecies;
    public Fish(){
        super("Fish","null");
    }
    public Fish(String name,String subspecies){
        super("Fish",name);
        this.subspecies = subspecies;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    @Override
    public String advertising() {
        return "blub";
    }

    @Override
    public String advertisingInAngry() {
        return "BLUB";
    }

    @Override
    public Movement movement() {
        return Movement.SWIMS;
    }

    @Override
    public String toString(){
        return super.toString() + ", subspecies: "+this.subspecies;
    }
}
