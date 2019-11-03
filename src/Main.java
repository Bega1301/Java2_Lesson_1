public class Main {

    public static void main(String[] args) {



        Dog dog = new Dog ();
        dog.setName("Sam");
        dog.setBreed("Ovcharka");
        dog.setColor(Color.BLACK);
        dog.setShelter(new Shelter("Bishkek","Toktogula, 75"));
        dog.setCommands(new String[]{"сидеть","лежать", "лаять"});



        Dog dog1 = new Dog("Tom","Bouldog", Color.BROWN, new Shelter ("Osh", "Masalieva, 13"));

        Dog dog2 = new Dog ("Kim",  "Spaniel", Color.GREY, new Shelter ("Naryn", "Glavnaya, 15"),
               new String[]{ "прыгать","бегать","ловить"});

        System.out.println(dog.getInfo());
        System.out.println(dog1.getInfo());
        System.out.println(dog2.getInfo());

        dog.makeVoice("gav",5);
        dog1.makeVoice("gav-gav");



    }
}
