/**
* Example of an Object Oriented Programming (OOP) resource class
*
* In OOP, objects are a bundle of code that provides both STATE and BEHAVIOR.  
*
* When instantiated (created) an instance will have its initial state set, 
* according to one or more constructors.  This state is kept hidden from outside
* classes by designating data fields as "private", thus preventing direct 
* access.  Instead, outside classes may only manipulate an instance through its 
* publicly exposed methods.  This approach is referred to as the principle of 
* DATA ENCAPSULATION.
* 
* (Members of a class can always access other members, regardless of visibility)
*/

public class OOPObject{

  /** 
   * Properties 
   * The attributes (data) associated with each instance  (object STATE)
   * Typically, a listing of private variable declarations
   */
   private String sampleString;
  
  /** 
   * Constructors
   * Instructions for initializing a new instance
   * Responsible for setting initial STATE
   * A default, no-argument constructor is inserted by Java iff no constructor
   * explicitly provided
   */ 
  public OOPObject(){
    sampleString = "Initial value";
  }
  
  /** 
   * Methods
   * Specifications for what each instance "can do"  (object BEHAVIOR)
   * Typically, a list of public accessors and mutators (getters and setters)
   * Used by outside classes to interact with instances of this class
   */
  
  // A data getter
  public String getSampleString(){
    return sampleString;
  }

  // A data setter
  public void setSampleString(String s) {
    sampleString = s;
  }
}
