package Java;
//iN THIS WE COVER OBJECTS,VARIABLES,METHODS,STATIC

/*
Object(object creation should be in main method):when we run our java file execution starts from main method.. 
whatever we mention outside main method(instance variables,methods) we need to call them in 2 ways
1)creating object.
2) by giving variables and methods as static.
used to access instance variables and non static methods in main method.new keyword initiates new object.


//accesing variable directly(static variables)
class TestStudent2{ 
 static int id=100;  
 String name;   
 public static void main(String args[]){  
  TestStudent2 s1=new TestStudent2();  
    
  
  System.out.println(id);//printing members with a white space  
 }  
}  


//accessing variable by object
class TestStudent2{ 
 int id=100;  
 String name;   
 public static void main(String args[]){  
  TestStudent2 s1=new TestStudent2();  
    
  
  System.out.println(s1.id);//printing members with a white space  
 }  
}  


//calling method diectly
public class Variables {
static int a=10;

static void display() {
	 System.out.println(a);
}

public static void main(String[] args) {
	display();
}

}


//calling method by creating object
public class Variables {
static int a=10;

static void display() {
	 System.out.println(a);
}

public static void main(String[] args) {
	display();
}

}

*/