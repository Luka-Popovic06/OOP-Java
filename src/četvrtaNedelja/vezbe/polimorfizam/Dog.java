package četvrtaNedelja.vezbe.polimorfizam;

public class Dog extends Animal{
    private String breed;

    public Dog(){
        super("Dog","Bob");
        this.breed = "null";
    }

    public Dog(String breed,String name){
        super("Dog",name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String advertising() {
        return "vuf vuf";
    }

    @Override
    public String advertisingInAngry() {
        return "VUF VUF";
    }

    @Override
    public Movement movement() {
        return Movement.WALKS;
    }

    @Override
    public String toString(){
        return super.toString()+", breed: " + this.breed;
    }
}
