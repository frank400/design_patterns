#Open Close Principle

The OCP says that a class must be "open for extension, but close for modification", which means that a class must be open for extensions in your base behavior, but its base behavior and propose must remain untouched once it's implemented.

Most of the time to implement the OCP in Java is used an interface to define the basic behavior of that class, and so each the entity can have multiply implementations with various behaviors extensions.

In the current example is wanted to filter the articles of a given journal, but is also wanted flexibility in the means that the articles will be filtered, so a specification interface is created to define the basic behavior that a filter must have, and each filter type will implement your specification, being it by tags, dates or any other preference, but the basic interface will never be changed. This characteristic allows the developer to interact with any filter as it was the interface, polymorphism.  