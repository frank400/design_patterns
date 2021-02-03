#Interface Segregation Principle

The ISP states that no client should be forced by an interface to implement methods that it will not use, that way each interface must force only the basic methods for the clients that implements it.

The YAGNI("You ain't going to need it") helps to keep only the necessary methods in the interface if keeped in mind.

In this example is implemented a series of printers that have various functionalities, such as print, scan and fax, but instead of implement only one interface for all that functionalities, is created one interface for each one, and each printer type implements only the needed ones.