package Java;

public class StaticMethVar {

}

/*
Static Variable:
1)If variable is in static method.. we need not to mention variable as static. and can directly use
and we can't use that variable outside of the method.
2)We can't use the non static variable in static methods(main is also static method)
-If variable is in Global and not set as static.



3)If both methods are static. 
If method is static. we need not to create object because main also static method.That's why we can't call non static method directly.
-this and super cannot be used in static context.


2a)class A{  
 int a=40;//non static  
   
 public static void main(String args[]){  
  System.out.println(a);  
 }  
}    



/*
//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  
class Counter{  
int count=0;//will get memory each time when the instance is created  
  
Counter(){  
count++;//incrementing value  
System.out.println(count);  
}  
  
public static void main(String args[]){  
//Creating objects  
Counter c1=new Counter();  
Counter c2=new Counter();  
Counter c3=new Counter();  
}  
} 
output:
1
1
1




//Java Program to illustrate the use of static variable which  
//is shared with all objects.  
class Counter2{  
static int count=0;//will get memory only once and retain its value  

Counter2(){  
count++;//incrementing the value of static variable  
System.out.println(count);  
}  

public static void main(String args[]){  
//creating objects  
Counter2 c1=new Counter2();  
Counter2 c2=new Counter2();  
Counter2 c3=new Counter2();  
}  
}  

output:
1
2
3

*/