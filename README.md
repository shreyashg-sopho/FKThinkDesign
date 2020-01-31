# FKThinkDesign
#PRACTICAL OBJECT ORIENTED DESIGN IN RUBY BY SANDI METZ

CHAPTER 1 and 4 have no codes.
CHAPTER 5 not implemented in java as Java has no duck types.


OBJECT ORIENTED DESIGN 

SOLID Design :
S - Single Responsibility
O - Open closed principle
L - Liskov Substitution
I - Interface Segregation
D - Dependency Inversion
Do not repeat yourself.
Law of Demeter: A given object should assume as little as possible about the structure or properties of anything else.




DESIGNING CLASS WITH SINGLE RESPOSIBILITY 

Class should be the smallest possible useful thing.
Applications that are easy to change are the ones that are easy to resue.
Hoe to identify if gear class contains the right behaviour?
Ask it questions such as....
Gear, what is your ratio?....Sounds a correct question to gear class.
Gear, what is your tire size?....Sounds irrelevant !


MANAGING DEPENDENCIES

An object has a dependency when it knows:
The name of another class
The name of a message that it intends to send to someone other than self (methods on other objects).
The arguments that a message requires.
The order of those arguments.
The more one class knows about another, the more tightly it is coupled.
Some classes are more likely than others to have changes in requirements
Concrete classes are more likely to change than abstract classes
Changing a class that has many dependents will result in widespread consequences



CREATING FLEXIBLE INTERFACES

Using a kitchen analogy: your objects should "order off a menu" instead of "cooking in the kitchen".
Ask "what" instead of asking or telling "how".
Objects that have a simple context are easy to test, objects with a complicated context are more difficult to test.
Law of Demeter : Talk only to your immiediate neighbour.
The problem with Demeter violations (like customer.bicycle.wheel.rotate) is that they show that code (customer) knows too much about how other code works. It's a practical case of tight coupling.



ACQURING BEHAVIOUR THROUGH INTERFACES

Subclasses are specializations of their superclasses
Everything the parent class is, plus some more.




SHARING ROLE BEHAVIOUS WITH MODULES

Method Lookup Flow

Including a module inserts it's method "above" it's superclass, in the object hierarchy.
Therefore, if a method exists anywhere in the hierarchy between subclass and superclass, and also in an included module, the superclass method wins out.
Writing Inheritable Code

Recognize the antipatterns
Insist on the abstraction
Honor the contract (Liskov Substitution Principle)
Use the template method pattern
Preemptively decouple classes (avoid super)
Create shallow hierarchies

Insist On The Abstraction
Create shallow Hierarchies




COMBINING OBJECTS WITH COMPOSITION

Composition describes "x" has a realationship with.
Composition: objects "inside" have no meaning outside that context.
Aggregation: like composition except objects "inside" have meaning outside that context.



DESIGNING COST EFFECTIVE TESTS
3 Skills Needed to Write Changeable Code:
Understand OO design
Skilled at refactoring code
Ability to write high-value tests

Tests free you to refactor with impunity.
Intentional Testing

Benefits of testing
Finding bugs
Supplying documentation ("Tests provide the only reliable documentation of design.")
Deferring design decisions ("When your tests depend on interfaces you can refactor the underlying code with reckless abandon.")
Supporting abstractions
Exposing design flaws
Knowing what to text and when to text.







