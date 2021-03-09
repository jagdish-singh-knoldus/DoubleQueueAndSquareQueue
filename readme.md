# Queue, DoubleQueue and SquareQueue


## Introduction

This project is used to display Queue, DoubleQueue and SquareQueue in SBT using Scala programming Language.


## Technology

Queue, DoubleQueue and SquareQueue is implemented in Scala programming language. Scalatest was used for testing Last Element, Table, Stack List and Queue List's implementation and SBT for project building.


## Requirements

* Java 11
* Scala 2.13.5
* sbt 1.4.7


## Commands

###clean

This command cleans the sbt project by deleting the target directory. The command output relevant messages.

 
 sbt clean 
 

###compile
This command compiles the scala source classes of the sbt project.


 sbt compile 
 
###Run
Enter the project folder and type:

 sbt run 
 


### Tests

Code is developed by applying [TDD](https://en.wikipedia.org/wiki/Test-driven_development) and tests are located in
folder */src/test/scala-2.13*,  For running all tests enter the project folder and type:

 
 sbt test
 

## Library dependencies

* scalatest - test driven development
* scoverage

More details about project libraraies (e.g. version etc..) can be found in file *build.sbt*




## Functionality


### Queue List

This functionality supports Queue implementation.

e.g.


 (1,2,3,4)
 enqueue(5)
 (1,2,3,4,5)
 
 

### DoubleQueue

This functionality supports Doubling of each element before enqueue into the list .

e.g.


Double(5) == 10
 

### SquareQueue

This functionality supports squaring of each element before enqueue into the list.

e.g.


Square(2) == 4
 
A number of samples is given in test file are:
* QueueSpec
* DoubleQueueSpec


Source files that are implementing this functionality are:

* Queue.scala
* DoubleQueue.scala
