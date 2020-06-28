package Homework1;

public class Cat implements Track {
    public void jump(int weight) {
        if (weight >= this.weight){
            System.out.println("Кот перепрыгнул");
        } else {
            System.out.println("Кот не перепрыгнул");
        }
    }
    public void run(int distance){
        if (distance >= this.distance){
            System.out.println("Кот пробежал");
        } else {
            System.out.println("Кот не пробежал");
        }
    }
    }

