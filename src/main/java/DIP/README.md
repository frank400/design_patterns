# Dependency Inversion Principle

The DIP states two rules:

1.  A High-Level module shouldn't depend on Low-level modules. Both should depend on abstractions.

2. Abstractions shouldn't depend on details. Details should depend on abstractions.

In this example is used an application to find peoples that live on a given postal code to demonstrate how the method to find those peoples shouldn't depend on the class that store the peoples related to its postal codes, both will be dependent on a interface between these module levels, PostalCodeBrowser.