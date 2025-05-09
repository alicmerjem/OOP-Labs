package week8lab;
import java.util.*;

public class Locker<T> {
    // add all the fields
    private int lockerNumber;
    private boolean isLocked;
    private T item;

    // constructors
    public Locker(int lockerNumber, T item) {
        this.lockerNumber = lockerNumber;
        this.item = item;
        this.isLocked = true; // we set this by default
    }

    // implement methods unlock, lock and viewitem
    public void unlock() {
        isLocked = false;
    }

    public void lock() {
        isLocked = true;
    }

    public void viewItem() {
        if (!isLocked) {
            System.out.println("mixedtasks.Locker " + lockerNumber + " contains: " + item);
        }
        else {
            System.out.println("mixedtasks.Locker" + lockerNumber + " is locked. Cannot view items.");
        }
    }

}
