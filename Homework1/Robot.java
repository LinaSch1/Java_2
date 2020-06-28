package Homework1;

public class Robot implements Track {
    public void jump(int weight) {
        if (weight >= this.weight){
            System.out.println("Робот перепрыгнул");
        } else {
            System.out.println("Робот не перепрыгнул");
        }
    }

    public void run(int distance) {
        if (distance >= this.distance) {
            System.out.println("Робот пробежал");
        } else {
            System.out.println("Робот не пробежал");
        }
    }
}