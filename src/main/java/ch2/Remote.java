package ch2;
import java.util.TimerTask;
import  java.util.Timer;


public class Remote {

    private DogDoor door;

    public Remote ( DogDoor door) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("Pressing the remote button");

        if(!door.isOpen()) {
            door.open();
        }

    }



}
