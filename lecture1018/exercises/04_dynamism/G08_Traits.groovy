/* TRAITS
    - Structural construct, that allows:
        - Composition of behavior
        - Runtime implementataion of the interfaces !
        - Behavior overriding
        - Compatibilty with static type checking/compilation 
    TLDR;
        - Interfaces with default method implementation and state. 

*/

trait Flying {
    void fly() {println "I am flying!"}
}

trait Quacking {
    void quack() {println "Quack!"}
}

class Duck implements Flying, Quacking {}

def duck = new Duck()
duck.fly()
duck.quack()



//TASK uncomment, see and explain
trait Aging {
   int age = 0
   void birthday() {age+=1}
}

duck = duck as Aging
10.times {
   duck.birthday()
}

println "Duck's age: ${duck.age}"
duck.quack()


//TASK uncomment, see and explain
trait ExtraQuacking extends Quacking {
   void quack() {println ((1..3).collect {"Quack!"})}
}

/*
trait A { void methodFromA() {} }
trait B { void methodFromB() {} }

class C {}

def c = new C()
c.methodFromA()                     
c.methodFromB()                     
def d = c.withTraits A, B           
d.methodFromA()                     
d.methodFromB()     
*/


// withTrait will wrap c into something which implements A and B

def myDuck = new Duck().withTraits ExtraQuacking
myDuck.quack()

//NOTE A proper class implementing the trait could have been used instead
 