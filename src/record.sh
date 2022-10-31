belmokhtar@localhost:~/.jdks/corretto-17.0.3/bin
$ cat T.java
public record T (String s){}

belmokhtar@localhost:~/.jdks/corretto-17.0.3/bin
$ ./javac T.java

belmokhtar@localhost:~/.jdks/corretto-17.0.3/bin
$ ls *.class
T.class

belmokhtar@localhost:~/.jdks/corretto-17.0.3/bin
$ ./javap T.class
Compiled from "T.java"
public final class T extends java.lang.Record {
  public T(java.lang.String);
  public final java.lang.String toString();
  public final int hashCode();
  public final boolean equals(java.lang.Object);
  public java.lang.String s();
}


