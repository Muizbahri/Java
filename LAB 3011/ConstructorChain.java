// ConstructorChain.java -- Illustrates constructor chaining.
// author : Fred Swartz - 5 May 2003
// modified by Bakri
// class ConstructorChain
public class ConstructorChain{
    public static void main(String[] args){
    Child c = new Child();
    }
}
        // class Child
        class Child extends Parent{
        Child(){
        super(25);
        System.out.println("Constructing Child object.");
        }
    }
        // class Parent
        class Parent extends Grandparent{
        Parent(int x){
        System.out.println("Constructing Parent object.");
        }
    }
        // class Grandparent
        class Grandparent{
        Grandparent(){
        System.out.println("Constructing Grandparent object.");
        }
    }