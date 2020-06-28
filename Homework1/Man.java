package Homework1;

public class Man implements Track {
    public void jump(int weight) {
        if (weight >= this.weight){
            System.out.println("Человек перепрыгнул");
        } else {
            System.out.println("Человек не перепрыгнул");
        }
    }

    public void run(int distance) {
        if (distance >= this.distance) {
            System.out.println("Человек пробежал");
        } else {
            System.out.println("Человек не пробежал");
        }
    }
}
