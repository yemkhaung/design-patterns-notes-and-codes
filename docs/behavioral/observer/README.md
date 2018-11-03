# Observer Design Pattern

* Name : *Observer Design Patternæ
* Category : *Behavioral*

## When To Use

* Changes in one model/object are needed to notify other models/objects

For example,
* *Stocker market*: thousands of stock updates to individual stock update trackers.
* *Multi-thread communication*: Changes in one thread operation are notified to other threads.

## What is Observer Design Pattern?
There are *Two* main components in Observer design pattern,

* Subject/Publisher: the model that **sends** updates to observers
* Observer/Subscriber: the model that **receives** updates from the publisher.

thus, provides loose coupling between *Subject* and *Observers*