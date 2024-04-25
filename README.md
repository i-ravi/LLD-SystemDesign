# LLD System Design
Check out my LLD System Design Repository on GitHub! Discover expert insights, tutorials, case studies, and best practices for building scalable software architectures. Explore diagrams, real-world examples, and open-source contributions. Join me in shaping resilient systems!

## Proxy Design Pattern
The Proxy design pattern provides a surrogate or placeholder for another object to control access to it. It acts as an intermediary, allowing clients to interact with the proxy instead of the actual object. This enables additional functionalities such as lazy initialization, access control, logging, or caching without altering the core functionality of the original object. The Proxy pattern enhances modularity, security, and performance by managing object creation and access transparently to the client. It's commonly employed in scenarios involving remote services, expensive resource management, or implementing access control mechanisms.

Applications : 
- Remote Proxies: Access objects in different address spaces.
- Virtual Proxies: Lazy initialization or resource-heavy object creation.
- Protection Proxies: Implement access control mechanisms.
- Logging Proxies: Capture and log method invocations.
- Caching Proxies: Cache frequently accessed operations.
- Synchronization Proxies: Coordinate concurrent access to resources.
- Smart References: Manage additional functionalities like reference counting or error handling.

### Class Diagram
![ClassDiagram](https://github.com/i-ravi/SystemDesign/blob/main/ProxyDesignPattern/diagram/ProxyClassDiagram.png)

## Observable Design Pattern
The Observable design pattern establishes a relationship between objects where one object (the observable or subject) notifies its dependents (observers) of any state changes, enabling them to react accordingly. This pattern promotes loose coupling by allowing observers to subscribe to or unsubscribe from the observable without requiring direct knowledge of its implementation. It's commonly used in event-driven architectures, GUI frameworks, and reactive programming paradigms to facilitate efficient communication and update propagation within software systems.

Applications : 
- GUI Event Handling: Buttons, checkboxes, and other UI components in graphical interfaces use the Observer pattern to notify listeners about user interactions.
- Publish-Subscribe Systems: Messaging systems where publishers notify multiple subscribers about new messages or updates.
- Model-View-Controller (MVC) Architecture: Keeping model and view components synchronized in MVC frameworks.
- Distributed Systems: Facilitating communication between distributed components by notifying them about changes or events.
- Monitoring and Logging Systems: Tracking system events and gathering performance metrics by subscribing to specific events or log entries.
- Reactive Programming: Reacting to changes in data streams in reactive programming paradigms, enabling responsive and scalable applications.

### Class Diagram
![ClassDiagram](https://github.com/i-ravi/SystemDesign/blob/main/ObservableDesignPattern/diagram/ObseverClassDiagram.png)

## Null Object Design Pattern
The Null Object design pattern provides an alternative to using null references in code by introducing a Null Object that represents a neutral or "do nothing" behavior. This pattern helps to avoid null pointer exceptions and simplifies code by ensuring that objects always have a defined behavior, even in cases where they would traditionally be null. It's particularly useful in scenarios where null checks are common, such as handling optional or absent values, and can improve code readability and maintainability by promoting consistent behavior across objects.

Applications:
- Default Configurations: Providing default settings in configuration systems when specific configurations are missing.
- Optional Dependencies: Offering optional dependencies in dependency injection frameworks without requiring explicit null checks.
- Empty Collections: Representing empty collections or streams in data processing pipelines or algorithms.
- Error Handling: Returning Null Objects instead of throwing exceptions for graceful error handling.
- Fallback Mechanisms: Using Null Objects as fallbacks for disabled or unavailable features in feature toggling frameworks.

### Class Diagram
![ClassDiagram](https://github.com/i-ravi/LLD-SystemDesign/blob/main/NullObjectDesignPattern/diagram/NullObjectClassDiagram.png)

# Chain Responsibility Pattern
The Chain of Responsibility design pattern allows an object to pass a request along a chain of handlers until it's handled by one of them. Each handler decides either to process the request or pass it to the next handler in the chain. This pattern promotes loose coupling between senders and receivers of a request, as any handler can handle the request without knowing the full chain.

Applications:
- Middleware Processing: In web frameworks, middleware components form a chain to handle HTTP requests, where each middleware can process, modify, or pass the request to the next middleware.
- Event Handling: UI frameworks use a chain of responsibility pattern to propagate events through a hierarchy of event handlers until they're handled by the appropriate component.
- Logging and Error Handling: Logging frameworks and error handling systems utilize chains of responsibility to handle log messages or errors at various levels of severity or abstraction.
- Authorization and Authentication: Security systems employ chains of responsibility to handle authorization and authentication requests, with each handler verifying different aspects of the request.
- Workflow Processing: Workflow engines define sequences of steps as chains of responsibility to process workflows, with each step performing specific tasks or validations before passing control to the next step.
