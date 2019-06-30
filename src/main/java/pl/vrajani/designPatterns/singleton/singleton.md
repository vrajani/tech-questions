# Singleton Design Pattern

Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in
the java virtual machine.

Singleton pattern is one of the simpler design pattern and one of the most common example for it is the logger object
for any logging framework. It gets easily very tricky when you have an application that runs in a multi-threaded
environment.

The idea is that at any given time there must be atmost one instance of class available on the JVM.