abstract class shape{
    abstract int numberofsides();
    }

class rectangle extends shape {
    int numberofsides(){
    return(4);
    }
}

class triangle extends shape {
    int numberofsides(){
        return(3);
    }
}

class hexagon extends shape{
    int numberofsides(){
        return(6);
    }
}

public class Polymorphism {
public static void main(String[] args) {
    shape obj;
    obj = new rectangle();
    System.out.println("Sides of Rectangle:-"+obj.numberofsides());
    obj = new triangle();
    System.out.println("Sides of Triangle:-"+obj.numberofsides());
    obj = new hexagon(); 
    System.out.println("Sides of Hexagon:-"+obj.numberofsides());
   } 
}
