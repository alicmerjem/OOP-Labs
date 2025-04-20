public class Locker<T> {
  private int lockerNumber;
  private boolean isLocked;

  // constructors
  public Locker(int lockerNumber, T item) {
    this.lockerNumber = lockerNumber;
    this.item = item;
    this.isLocked = true; // setting by default
  }

  public void unlock() {
    isLocked = false;
  }

  public void lock() {
    isLocked = true;
  }

  public void viewItem() {
    if(!isLocked) {
      System.out.println("Locker " + lockerNumber + " contains: " + item);
    } else {
      System.out.println("Locker " + lockNumber + " is locked. Access denied.");
    }
  }
}
