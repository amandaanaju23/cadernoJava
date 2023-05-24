class Main {
  public static void main(String[] args) {
    System.out.println("Olá Mundo!");
    int myNum = -2;
    float myFloatNum = 5.99f;
    char myLetter = 'A';
    boolean myBool = false;
    String myText = "me amo";
    System.out.println(myNum);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText); 
    // parte dois do código
    System.out.println(myText + myBool);
    int x = 5;
    float y = x;
    System.out.println(x);
    System.out.println(y);
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int
    System.out.println(myDouble);
    System.out.println(myInt);
  }
}