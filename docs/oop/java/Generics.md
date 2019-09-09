# Generics


#### Initialize Generic Array
```$xslt
    GenericArrayTest(Class<T> type, int size){
        T[] array1=(T[])new Object[size]; //Can put any object 
        T[] array2=new Object[size]; // can put any object
        T[] array3=(T[])Array.newInstance(type, size); // can only put of Type T or type that extends T.
    }
```