# Observer

The Observer Pattern a behavioral design pattern commonly used in object-oriented programming to establish a one-to-many dependency between objects. In this pattern, one object (called the subject or observable) maintains a list of its dependents (observers) and notifies them of any state changes, usually by calling one of their methods.

Here’s how it works:

* Subject: This is the object that holds the state and manages the list of observers. It provides methods to attach, detach, and notify observers.
* Observer: This is the interface that defines the method(s) that the subject calls to notify the observer of any state changes. Typically, observers implement this interface.
* Concrete Subject: This is the concrete implementation of the subject interface. It maintains the state and sends notifications to observers when the state changes.
* Concrete Observer: This is the concrete implementation of the observer interface. It registers itself with a subject to receive notifications and implements the update method to respond to state changes.

![1_KPYBm9u0vhBkwUuE71KoLA.webp](..%2F..%2F..%2F..%2F..%2Fimages%2F1_KPYBm9u0vhBkwUuE71KoLA.webp)

In the context of a YouTube channel subscriber scenario, the YouTube channel is the subject, and the subscribers are the observers. When an event happens in a YouTube channel, it notifies all its subscribers about the new video so they can watch it.

Let’s implement this example in code,

```java
public enum EventType {
}

public class YoutubeEvent {
}
```
* EventType: The EventType enum defines the types of events that can occur, such as NEW_VIDEO , LIVE_STREAM and more.
* Event: The YoutubeEvent class represents the events that occur in the system. It contains information such as the type of event and the topic.

```java
public interface Subject {
}

public interface Observer {
}
```

* Subject: The Subject interface declares methods to manage subscribers (addSubscriber and removeSubscriber) and to notify them (notifyAllSubscribers) when an event occurs.
* Observer: The Observer interface declares a method (notifyMe) that subjects call to notify observers of any change in state.

```java
public class YoutubeChannel implements Subject{
}
```

* Concrete Subject: The YoutubeChannel class implements the Subject interface. It maintains a list of subscribers and notifies them when a new event occurs.

```java
public class YoutubeSubscriber implements Observer{
}
```

* Concrete Observer: The YoutubeSubscriber class implements the Observer interface. It defines the behavior to be performed when notified by a subject.

```java
public class ObserverMain{
}
```