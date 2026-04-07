package četvrtaNedelja.vezbe.polimorfizam;

public class TestPolimorfizam {
    public static void main(String[] args){

        Animal[] animals = {
                new Dog("Lol","king"),
                new Penguin("NJSN"),
                new Fish("Nemo","shark")
        };

        //1.Nacin
        for(Animal animal : animals){
            if(animal instanceof Dog dog ){
                System.out.println(dog);
            }else if(animal instanceof Penguin penguin){
                System.out.println(penguin);
            }else if(animal instanceof Fish fish){
                System.out.println(fish);
            }
        }
        System.out.println();
        System.out.println("//////////////////////////////////////");
        //2.nacin
        for (Animal a : animals){
            System.out.println(a);
        }
    }
}
