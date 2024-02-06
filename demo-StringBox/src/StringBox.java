   public class StringBox{
    // Attribute
  private char[] characters;

    // Contructor
  public StringBox(String str) {
     this.characters = new char[str.length()];
    for ( int i = 0 ; i < str.length() ; i++) {
      characters[i] = str.charAt(i);
    }

  }
  // Getter
  public boolean isEmpty() {
    // check if the string empty
  return this.characters.length == 0;
  }

  public int length() {
    // return the char array length                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
    return this.characters.length;
  
    
  }
   public StringBox concat(String str) {
    // 
    char[] newArr = new char[this.characters.length + str.length()];
    int count = 0;
    for (int i = 0; i < characters.length ; i++) {
      newArr[count++] = characters[i];
    }
    for ( int i = 0 ; i < str.length() ; i++) {
      newArr[count++] = str.charAt(i);
    }
      
    return new StringBox(String.valueOf(newArr));
   }



   public StringBox concat2(String str) {
    // 
    char[] newArr = new char[this.characters.length + str.length()];
    int count = 0;
    for (int i = 0; i < characters.length ; i++) {
      newArr[count++] = characters[i];
    }
    for ( int i = 0 ; i < str.length() ; i++) {
      newArr[count++] = str.charAt(i);
    }
      
    return new StringBox(String.valueOf(newArr));
   }

  public StringBox replace(String from, String to);





@Override
public String toString() {
  return String.valueOf(this.characters);
}





  public static void main (String[] args) {

    StringBox string = new StringBox("hello ");
    System.out.println(string.toString()); //hello

    
    StringBox string2 = string.concat("world");
    System.out.println("String2 = " + string2);
    System.out.println("String1 = " + string);

    StringBox string3 = string2.concat2("world");
    System.out.println("String3 = " + string3);
    System.out.println("String2 = " + string2);
    

    







  }

}