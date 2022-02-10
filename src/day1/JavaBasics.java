/*Java Editions
 * Java SE-Desktop
 * Java EE-Web/Enterprise
 * Java ME-Mobile
 * Java JFX-Internet
 * 
 * 
 * Applications
 * Mobile 
 * Web APplications
 * Desktop/Standalone Applications
 * Enterprise Applications-Banking Applications
 * 
 * 
 * Java 1.0  -  1995
 * Java 8-2014
 * Java 17 - Latest Version
 * 
 * 
 * Identifiers:Names given for classes,Methods,Interfaces
 * class/interface=UpperCamelCase
 * methods-lowerCamelCase
 * packages-lower case
 * constants-UPPERCASE
 * lower/UPPER case alphabets, numbers, _, $
 * Starting letter shouldn't be a number
 * 
 * 
 * Variables-
 * Instance-defined inside class,using object can be accessed
 * Local-defined inside method,can't access from other class or method
 * Static-declared as static inside class, using class name can be accessed
 * Local variables do not have default values but instance variables have default variables
 * 
 * Data types:
 * primitive
 * 			-int--4 byte
 * 			-byte--1 byte
 * 			-long--8 byte
 * 			-float--4 byte
 * 			-double--8 byte
 * 			-char--4 byte  'c'
 * 			-boolean--true/false
 * 			-short--2 byte
 * Non Primitive
 * 				-String
 * 				-Array
 * 				-null
 * 
 * 
 * 
 * Access Modifiers:
 * Public - Always
 * private - only within in the class
 * Protected -within same package and sub classes from other package
 * Default - Within class & same Package
 */

package day1;
public class JavaBasics {
	
	String name;
   public int age;
	char c;
	double salary;
	boolean isAvailable;
	Employee em=new Employee();
	
	static String skills[];
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaBasics jb=new JavaBasics();
		String n="Naveen";
		System.out.println(jb.add(n));
		System.out.println(jb.name);
		System.out.println(jb.age);
		System.out.println(jb.c);
		System.out.println(JavaBasics.skills);
		
	}
	String add(String name) {
		//Local Variable
		String str="Hello ";
		return str+name;
	}

}
