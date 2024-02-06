public class StringQueue implements Addable, Pollable { // Class Signature

  private String[] queue;

  public StringQueue() {
    this.queue = new String[0];

  }

  @Override
  public void add(String s) {
    addTail(s);

  }

  @Override
  public String pull() {
    return pullHead();
  }

  @Override
  public boolean isEmpty() {
    return this.queue.length == 0;
  }

  public void clear() {
    this.queue = new String[0];
  }

  public String peak() {
    return this.queue[0];
  }

  public String[] pollHead() {
    if(this.queue.length ==0) {
      return null;
    }
      String head = this.queue[0];
      int idx = 0;
      String[] newQueue = new String[this.queue.length - 1];
      for (int i = 0; i < this.queue.length ; i++) {
        newQueue[idx++] = this.queue[i];
      }
      return newQueue;
    }
  }

