# core-java-features

<h2>Features</h2>
<ul>
    <li>Most popular programming language since 1996 (SUN MICROSYSTEMS)</li>
    <li>Can be used for small to entreprise applications</li>
    <li>Based on C++</li>
    <li><b>Cross-platform:</b> Write Once, Run anywhere</li>
    <li>Object-oriented language</li>
    <li>Platform independent</li>
    <li>Compiled and Interpreted</li>
    <li>Simple, Robust and Secure</li>
    <li>Multithreaded</li>
    <li>Dynamic</li>
</ul>
<h2>Loops</h2>
<p>While(booleanExpression){ statement(s) }</p>
<p>do{ statement(s) } While(Boolean Expression);
<p>For(int index=0; index < 20; index++){ statement(s) }</p>
<p><b style="color:red">Break</b> statement is used to breal from an enclosing <u>for</u>, <u>while</u>, <u>do</u> and switch statement</p>
<p><b style="color:red">Continue</b> statement is like Break but it stops only the execution of current statement and causes control to return to next iteration</p>
<h2>Encapsulation</h2>
<p>It is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. </p>
<h2>Access Control modifiers</h2>
<ul>
    <li>Public</li>
    <li>Private</li>
    <li>Protected</li>
    <li>Default</li>
</ul>
<p>Static members are class level members. <br/> They don't need an already existing object to be used.</p>
<h2>Method Overloading</h2>
<p>Same method names in a class having different arguments. <br/>
<strong>Examples:</strong>
<ol>
    <li>
    public double calculatePerimeter(float width, float height){ return (width+height)*2; }
    </li>
    <li>
    public double calculatePerimeter(float width){ return width*4; }
    </li>
</ol>
</p>
<h2>Inheritance</h2>
<p>Make a class (Sub Class) inherit from another class called (Super Class) using "extends" keyword.</p>
<p>Used to avoid redundancy and avoid duplication</p>
<p>No multiple inheritance in JAVA</p>
<p>Within a package, a sub class can access all non-private members of super class.</p>
<p>Outside package, only public and protected members could be accessed by a sub class.</p>
<p>Use "final" keyword to prevent method overriding</p>
<h2>Exception Handling</h2>
<ul>
    <li>java.lang.Exception object encapsulates the error conditions and throws it back to the running code</li>
    <li>Sub class of Throwable</li>
    <li>Class "Error" denotes the fatal error</li>
    <li>Class "Exception" denotes non-fatal errors</li>
    <li>
    <pre>
    try{
        //statements
    }catch(Exception e){
        //statements to handle exception
    }finally{ //optional
        //statements to handle exception & cleanup
    }
    </pre>
    </li>
    <li>Create your own exception class by extending Exception class</li>
</ul>
<h3>List of Runtime Exceptions in JAVA</h3>
<ol> 
  <li>ArithmeticException</li> 
  <li>NullPointerException</li> 
  <li>ClassCastException</li> 
  <li>DateTimeException</li> 
  <li>ArrayIndexOutOfBoundsException</li> 
  <li>NegativeArraySizeException</li> 
  <li>ArrayStoreException</li> 
  <li>UnsupportedOperationException</li> 
  <li>NoSuchElementException</li> 
  <li>ConcurrentModificationException</li> 
 </ol>
 <h2>Interface</h2>
 <p>It is a mechanism by which Java somewhat achieves multiple inheriatnce</p>
 <p>Use of "implements" keyword</p>
 <p>"Abstract" => existing in thought or as an idea but not having a physical or concrete existance.</p>
 <p>A class which is declared abstract can't be instantiated, but only subclassed.</p> 
 <h2>Interface vs Abstract class</h2>
 <table width="100%">
 <tr>
    <th>Interface</th>
    <th>Abstract Class</th>
 </tr>
 <tr>
    <td>Contains only the method signature</td>
    <td>May have some of its methods implemented</td>
 </tr>
 <tr>
    <td>All methods are implicitly public</td>
    <td>Methods can be protedted as well</td>
 </tr>
 <tr>
    <td>All attributes are public, static and final</td>
    <td>Can have attributes with other modifiers</td>
 </tr>
 <tr>
    <td>Can extend multiple interfaces</td>
    <td>Can't be extended from more than one abstract class</td>
 </tr>
 <tr>
    <td>Does not have a constructor</td>
    <td>Can have a constructor</td>
 </tr>
 </table>
<h2>Nested Class</h2>
<p>A class defined within a class or interface is known as a nested class</p>
<p>Types:</p>
<ol>
    <li>Non static nested class</li>
    <li>Static nested class</li>
</ol>
<p>Each inner class can extend from its own parent class, irrespective of outer class extending it.</p>
<h2>Threads</h2>
<p>Threads allows a program to operate more efficiently by doing multiple things at the same time.</p>
<p>There are two ways to create a thread.<br/>
<ol>
<li>It can be created by extending the Thread class and overriding its run() method:<br/>
<pre>
public class Main extends Thread {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
</pre>
</li>

<li>
Another way to create a thread is to implement the Runnable interface:<br/>
<pre>
public class Main implements Runnable {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
</pre>
</li>
</ol>
<h3>Running Threads</h3>
<p>If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method:</p>
<pre>
public class Main extends Thread {
  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
</pre>
<h3>Synchronization</h3>
<p>Synchronized methods prevent more than one thread from accessing critical method code simultaneously</p>
<p>We make use of the keyword <b>"Synchronized"</b> for making a method or a block of code synchronized</p>
<pre>
public class Main extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()) {
        System.out.println("Waiting...");
    }
    // Update amount and print its value
    System.out.println("Main: " + amount);
    amount++;
    System.out.println("Main: " + amount);
    }
    public void run() {
        amount++;
    }
}</pre>
<h2>Collections Framework</h2>
<p>Set of interfaces and utility classes used for storing, searching and arranging objects.</p>
<ol>
<li>Lists: ordered collection of objects allowing duplicates.</li>
<li>Sets: list of <b>unique objects</b></li>
<li>Maps: contains objects as key-value pair. The keys are unique but values can be duplicated.</li>
<li>Queues: keeps elements in FIFO order (add(), remove(), poll(), peek()...)</li>
</ol>
<h2>Java Generics</h2>
<p>Java generics was introduced in JAVA 5 to deal with type-safe objects.</p>
<h2>JDBC</h2>
<p>Java Data Base Connectivity is an API for accessing and updating the databse</p>
<p>4 types of drivers: <a href="https://www.javatpoint.com/jdbc-driver" target="_blank">read more...</p>
