package Java;

/*
Class A{
static int a=10; //instance variable

static void display(){
System.out.println(a); //here compiler automatically takes this.a //which means variable a is of current class
}
public static void main(String[] args) {
display();
}
}
 
//
Class A{
static int a=10; //instance variable

static void display(){
int a=20; //local variable
System.out.println(a); //local variable is priority 20
}
public static void main(String[] args) {
display();
}  
}

//
Class A{
static int a=10; //instance variable

static void display(){
int a=20; //local variable
System.out.println(this.a); //variable a is of current class.So now object creation is mandatory
}
public static void main(String[] args) {
A b=new A();
b.display();
}  
}
o/p:10

//
Class A{
static int a=10; //instance variable

static void display(){
int a=20; //local variable
System.out.println(a); //local variable is priority  20
System.out.println(this.a); //variable a is of current class 10
}
public static void main(String[] args) {
A b=new A();
b.display();
}  
}



//using this keyword
 
 class Student{  
int rollno;  
String name;  
float fee;  
Student(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis2{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  
 
//using 2 classes
public class Constructor {

	int rollno;  
	String name;  
	float fee;  
	void display(int rollno,String name,float fee){
		System.out.println(rollno+" "+name+" "+fee);}  
}  
class TestThis1{  
	public static void main(String args[]){  
		Constructor s=new Constructor();  
		s.display(111,"ankit",5000f);  
		s.display(112,"sumit",6000f);  
	}}  


//using single class
class TestThis1{  
int rollno;  
String name;  
float fee;  
void display(int rollno,String name,float fee){
System.out.println(rollno+" "+name+" "+fee);}   
public static void main(String args[]){  
TestThis1 s=new TestThis1();  
s.display(111,"ankit",5000f);  
s.display(112,"sumit",6000f);  
}}  

*/