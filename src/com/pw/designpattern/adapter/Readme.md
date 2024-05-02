# Adapter

The Adapter pattern is a structural design pattern that allows objects with incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces.

Imagine a situation where two classes or components perform similar tasks but have different method names, parameter types, or structures. The Adapter pattern allows these incompatible interfaces to work together by providing a wrapper (the adapter) that translates the interface of one class into an interface that the client expects.

* Target is the interface expected by the client.
* Adaptee is the class that needs to be adapted.
* Adapter is the class that implements the Target interface and wraps the Adaptee class.
* Client class is the class that uses the adapter to interact with the Adaptee through the Tareget interface.


![1_1bM1cq6RZrHGeNuK_sTJOQ.webp](..%2F..%2F..%2F..%2F..%2Fimages%2F1_1bM1cq6RZrHGeNuK_sTJOQ.webp)

* FriendCellPhone is the class you want to adapt/reuse (the Adaptee), which has a method named ring rather than creating new implementaion of CellPhone interface.
* CellPhoneAdapter is the adapter class that implements the CellPhone interface and wraps an instance of FriendCellPhone. The call method in the adapter delegates the call to the ring method of the FriendCellPhone class.
* AdapterMain class serves as the client that demonstrates the usage of the Adapter pattern in action.

