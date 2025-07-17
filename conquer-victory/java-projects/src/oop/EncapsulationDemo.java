package oop;

class Demo {
    private int age = 22;
    private int bio_age = 17;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBio_age() {
        return bio_age;
    }

    public void setBio_age(int ageValue) {
        bio_age = ageValue;
    }
}

// Encapsulation - Binding data members and methods into a single entity
public class EncapsulationDemo {
    public static void main(String[] args) {
        System.out.println("Encapsulation Demo");
        Demo obj = new Demo();
        obj.setAge(50);
        obj.setBio_age(37);
        System.out.println(obj.getAge());
        System.out.println(obj.getBio_age());
    }
}
