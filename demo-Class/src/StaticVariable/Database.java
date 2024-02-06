package StaticVariable;

public class Database {
  private static String[] strings = new String[0];

  // instance (final vs non-final)
  // int number -> Setter
  // final int number = 3; No -setter
  
  // final vs static final
  // 1. "final" is still instance variable , the obj. can call it by this
  // 2. "static final" is constant

  // No static No final
  // Static
  // final (instance method)
  // Static final

  public static void add(String str) {
    String[] newArr = new String[strings.length + 1];
    for (int i = 0; i < strings.length; i++) {
      newArr[i] = strings[i];
    }
    newArr[newArr.length - 1] = str;
    strings = newArr;
  }

  public static String get(int index) {
    if (isIndexValid(index)) {
      return strings[index];
    }
    return null;
  }

  public static boolean isIndexValid(int index) {
    if (index <= strings.length - 1 && index >= 0) {
      return true;
    }
    return false;
  }

  public static boolean remove(int index) {

    int count = 0;
    int i = 0;
    String[] newArr = new String[strings.length - 1];
    while (count <= newArr.length - 1) {
      if (i == index) {
        i++;
        continue;
      }
      newArr[count++] = strings[i++];
    }
    strings = newArr;
    return true;
  }

  public String read(int index) {
    return strings[index];
  }

  public static void main(String[] args) {
    // We do not need to create database obj. to operate static variable
    Database.add("hello");
    System.out.println(get(0));

    Database d1 = new Database();

    System.out.println(d1.read(0)); // hello
    Database.add("world");
    System.out.println(get(1));
    Database.remove(0);
    System.out.println(d1.read(0));

  }
}
