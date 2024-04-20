# SystemDesign
Check out my System Design Repository on GitHub! Discover expert insights, tutorials, case studies, and best practices for building scalable software architectures. Explore diagrams, real-world examples, and open-source contributions. Join me in shaping resilient systems!

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

## Observable Design Pattern
The Observable design pattern establishes a relationship between objects where one object (the observable or subject) notifies its dependents (observers) of any state changes, enabling them to react accordingly. This pattern promotes loose coupling by allowing observers to subscribe to or unsubscribe from the observable without requiring direct knowledge of its implementation. It's commonly used in event-driven architectures, GUI frameworks, and reactive programming paradigms to facilitate efficient communication and update propagation within software systems.

Applications : 
- GUI Event Handling: Buttons, checkboxes, and other UI components in graphical interfaces use the Observer pattern to notify listeners about user interactions.
- Publish-Subscribe Systems: Messaging systems where publishers notify multiple subscribers about new messages or updates.
- Model-View-Controller (MVC) Architecture: Keeping model and view components synchronized in MVC frameworks.
- Distributed Systems: Facilitating communication between distributed components by notifying them about changes or events.
- Monitoring and Logging Systems: Tracking system events and gathering performance metrics by subscribing to specific events or log entries.
- Reactive Programming: Reacting to changes in data streams in reactive programming paradigms, enabling responsive and scalable applications.
