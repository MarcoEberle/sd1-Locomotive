# Locomotive

This is my solution to the assignment **Locomotive** of class **software developement 1**, written in Java.

More information can be seen in the comments of the source code.

### Requirements:

This program consists of three classes: Class **Lokomotive** which has a name, type and length and is part of a Class **Train** that also has a name. The Train consists out of exact one Locomitve and >= 0 Cars. Class **Car** is a wagon that can be added to a Locomotive.

#### Class Train

A Train has one Locomotive and a name. The name represents the whole Train with its Locomotive and Cars.
On a Train there can be Cars added, the amoount of passengers and the total length to be seen. Also removing the first wagon or relinking another Trains Cars to the end of this Train is possible. In addition all Cars can be reverted so that the first Car will be last and so on.

#### Class Locomotive

A Locomotive has a name, length, type and a first Car. 


#### Class Car

A Car has a length, amount of passengers and saves its next Car. A Car only has its next Car, not the Car before!
