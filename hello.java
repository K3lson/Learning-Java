class hello {
    public static void main(final String[] args) {
      System.out.println("Hello World!");
      //we can also do calculations in java
      System.out.println(4 * 4);
      /*now lets talk about java variables
       * String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false
      */
        
      String name = "Kelvin";
      final int myNum = 28;
      //the final is a constant and it changes any variable to a constant
      //myNum = 3;
      System.out.println("Hello " + name);
      System.out.println(myNum);
    }
  }