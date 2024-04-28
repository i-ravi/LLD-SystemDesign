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

### UML Diagram
![UMLDiagram](https://github.com/i-ravi/SystemDesign/blob/main/ProxyDesignPattern/diagram/ProxyClassUML.png)
