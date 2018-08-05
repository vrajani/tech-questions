#Functional Interface

Functional Interface in Java represents an interface with one method except static , default and overridden method from Object. 

The annotation @FunctionalInterface helps the compiler to identify error when there are more than one abstract method defined in the interface.
However, using the annotation is not required but is standard practice to help one avoid violating the functional interface definition.

#### Example

``` 
@FunctionalInterface
public interface MyFunctionalInterface {
	public void oneMethod(int i, double d);
} 
****
@FunctionalInterface
public interface MyFunctionalInterface {
	public void oneMethod(int i, double d);
	public String toString();    // valid coz toString from Object 
	public boolean equals(Object o); //valid
}

@FunctionalInterface
public interface MyFunctionalInterface {
	public void oneMethod(int i, double d);
	public String toString();
	public boolean equals(Object o);
	public static int getSum(int a,int b){// valid->method static
		return a+b;
	}
	public default int getMulty(int c,int d){//valid->method default
		return c+d;
	}


**INVALID**
@FunctionalInterface
public interface MyFunctionalInterface {
	public void oneMethod(int i, double d);
	public void secondMethod(int k,int j);
}

```