package oops.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(33, "ayush");
    }
    // public => can be accessed everywhere
    // protected => can be accessed even in other packages, just by subclasses
    // default => can be accessed only inside the same package
    // private => can be accessed only inside the same class


    /*
    IN - BUILT PACKAGES

* lang   => contains core Java classes (Object class, String, Math, Wrapper classes, etc.)
* io     => input/output operations (files, streams, serialization, etc.)
* util   => data structures, collections framework, date/time, etc.
* applet => used for creating applets (deprecated)
* awt    => Abstract Window Toolkit, used for GUI programming
* net    => networking (sockets, URLs, IP addressing, etc.)

     */
}
