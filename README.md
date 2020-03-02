# Java 

## Queue 

Implementiere einen IntQueue! Eine Queue ist eine Schlange, wie eine Warteschlange, 
in der immer Elemente in der Reihenfolge abgearbeitet werden wie sie aufgenommen werden - dem `First in first out` Prinzip.
Die Klasse Queue sollte folgende Methoden haben: 
* void enqueue(int newElement) 
    * fügt ein neues Element hinten in die Schlange ein
* int size()
    * gibt die Anzahl der Elemente in der Queue zurück
* int dequeue()
    * gibt das erste Elemente der Schlange zurück und entfernt dieses daraus
* int[] dequeue(int n)
    * gibt die ersten n Elemente der Schlange zurück und entfernt diese daraus 
    
Wird auf eine leere Queue `dequeue()` aufgerufen sollte eine `QueueTooSmallException` geworfen werden. 

Leg in der Main Methode eine Queue an und schreib ein paar Beispiel-Verwendungen.  
