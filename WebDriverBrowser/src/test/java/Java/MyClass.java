package Java;
//Method parameters(variables) and arguments(Input Data or passing data)
//We can pass 1 or 2 or more parameters
//x,y,fname are parameters and 5,4,Liam are arguments 


/*

public class MyClass {
  static void myMethod(int x, int y) {
   System.out.println(x+y); 
  }

  public static void main(String[] args) {
   // System.out.println(myMethod(5, 3));
	  myMethod(5,4);  //arguments
  }
}

*/

/* Single parameter
public class MyClass {
  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }

  public static void main(String[] args) {
    myMethod("Liam");
    myMethod("Jenny");
    myMethod("Anja");
  }
}

*/

/* return value
public class MyClass {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
   // System.out.println(myMethod(5, 3)); //we can use directly like this
  int z = myMethod(5, 3);
    System.out.println(z);
  
  }
}
// Outputs 8 (5 + 3)
*/


//Method with IF.else
/*
public class MyClass {

  // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {

    // If age is less than 18, print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");

    // If age is greater than 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!");
    }

  }

  public static void main(String[] args) {
    checkAge(20); // Call the checkAge method and pass along an age of 20
  }
}

*/

//Method overloading..Multiple methods can have the same name as long as the number and/or type of parameters are different.
public class MyClass {
static int a(int x, int y) {
  return x + y;
}

static double a(double x, double y) {  //here we can also give name 'b'
  return x + y;
}

public static void main(String[] args) {

	int i=a(8,5);
System.out.println(i);	//System.out.println(a(8,5));
    double j=a(2.5, 5.5);
    System.out.println(j);

}
}