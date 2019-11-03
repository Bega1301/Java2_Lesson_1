import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        Random r = new Random();
        int low = 1;
        int high = 10;
        return r.nextInt(high - low) + low;

    }


    public String getInfo() {
        return getAge() + " "+ getColor() +" "+ getShelter().getName() +" "+ getShelter().getAddress();
    }

}







