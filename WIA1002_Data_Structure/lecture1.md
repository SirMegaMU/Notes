# Generics

capability to parameterize types

~~~java
int a ; // type
Integer b; // class
~~~

- Generics classes, interfaces, methods
- toggle generics 
  > ArrayList<Object> 

specify allowable types of objects that a *class* or *method* can work with.

~~~java
// classes and interfaces 
public class ClassName<E> (...)
// methods
public static <E> ReturnType MethodName(<E> parameter){...}
~~~

## Bounded Generic Type 

Bounded generic type is a generic type specified as a _subtype of another type_

~~~java
<E extends GeometricObject>
~~~

## raw type 

a generic _class/interface_ used 
- *without specifying a concrete type*
- *without a type parameter*

## Wildcard Generic Types 



