## Observable Design Pattern
The Observable design pattern establishes a relationship between objects where one object (the observable or subject) notifies its dependents (observers) of any state changes, enabling them to react accordingly. This pattern promotes loose coupling by allowing observers to subscribe to or unsubscribe from the observable without requiring direct knowledge of its implementation. It's commonly used in event-driven architectures, GUI frameworks, and reactive programming paradigms to facilitate efficient communication and update propagation within software systems.

Applications : 
- GUI Event Handling: Buttons, checkboxes, and other UI components in graphical interfaces use the Observer pattern to notify listeners about user interactions.
- Publish-Subscribe Systems: Messaging systems where publishers notify multiple subscribers about new messages or updates.
- Model-View-Controller (MVC) Architecture: Keeping model and view components synchronized in MVC frameworks.
- Distributed Systems: Facilitating communication between distributed components by notifying them about changes or events.
- Monitoring and Logging Systems: Tracking system events and gathering performance metrics by subscribing to specific events or log entries.
- Reactive Programming: Reacting to changes in data streams in reactive programming paradigms, enabling responsive and scalable applications.

### UML Diagram
![UMLDiagram](https://github.com/i-ravi/SystemDesign/blob/main/ObservableDesignPattern/diagram/ObseverUML.png)
