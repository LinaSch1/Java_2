package Homework1;

import java.lang.reflect.Member;

public class Main {

    public static void main(String[] args) {
        Track catRun = new Cat();
        Track manRun = new Man();
        Track robotRun = new Robot();
        catRun.run(30);
        manRun.run(40);
        robotRun.run(60);

        Track catJump = new Cat();
        Track manJump = new Man();
        Track robotJump = new Robot();
        catJump.jump(1);
        manJump.jump(2);
        robotJump.jump(3);

        Object[] members = new Object[3];
        members[0] = new Cat();
        members[1] = new Man();
        members[2] = new Robot();

        Track[] letTrack = new Track[3];
        letTrack[0] = new Cat();
        letTrack[1] = new Man();
        letTrack[2] = new Robot();

/*
        for (int i = 0; i < letTrack.length; i++) {
            for (int x = 0; x < members.length; x++) {
                }
             } */
        }
    }

