package četvrtaNedelja.vezbe.polimorfizam;

public abstract class Animal {

    private String specie;
    private String name;

    //ovde mi trebaju konstruktori samo zbog super()
    public Animal(){};
    public Animal(String specie, String name){
        this.name = name;
        this.specie = specie;
    }


    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract String advertising();

    public abstract String advertisingInAngry();

    public abstract Movement movement();

    @Override
    public String toString(){
        return "Specie: " + this.specie + ", name: " + this.name;
    }

}
