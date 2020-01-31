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





