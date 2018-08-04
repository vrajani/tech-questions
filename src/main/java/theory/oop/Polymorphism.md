# Polymorphism
Polymorphism is the ability of an object to take on many forms.
The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.

Any Java object that can pass more than one IS-A test is considered to be polymorphic.

#### Example

```
public interface Vegetarian{}
public class Animal{}
public class Deer extends Animal implements Vegetarian{}
```
 
Hence, deer passes following IS-A test,

- A Deer IS-A Animal
- A Deer IS-A Vegetarian
- A Deer IS-A Deer
- A Deer IS-A Object 

## Polymorphism and Abstract class

When a class extends the parent class, and the object is of type
child class but is referred as the parent class type object, then
by polymorphism property, and overridden behaviour takes precedence
over parent behaviour.

#### Example

```
public class Animal{
   public void eat(){
       System.out.println("Animal eats");
   }
}

public class Deer extends Animal {
   public void eat(){
       System.out.println("Deer eats");
   }
}

public static void main(){
    Animal d1 = new Deer();
    d1.eat();
    
    Deer d2 = new Deer();
    d2.eat();
}

OUTPUT:

Deer eats
Deer eats
```


This behavior is referred to as virtual method invocation, and these methods are referred to as virtual methods. An overridden method is invoked at run time, no matter what data type the reference is that was used in the source code at compile time.

## Polymorphism and Interface

With the interface and its implementation, it identifies the actual implementation of the object at the instantiation and call the underlying method implementation.

#### Example

```
public interface Vegetarian{
    void eatsVeggies();
}

public class Deer implements Vegetarian {
   public void eatsVeggies(){
       System.out.println("Deer eats Veggies");
   }
}

public class Rabbit implements Vegetarian {
   public void eatsVeggies(){
       System.out.println("Rabbit eats Veggies");
   }
}

public class Soltion{

    public static void main(){
        Vegetarian v1 = new Deer();
        v1.eat();
        
        Vegetarian v2 = new Rabbit();
        v2.eat();
    }
}

OUTPUT:
Deer eats Veggies
Rabbit eats Veggies
```
