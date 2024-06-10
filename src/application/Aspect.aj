package application;

public aspect Aspect {
	pointcut green() : call(static void Main.botonVerdePresionado());
    after() : green() {
    	System.out.println("**** Ventana cambiada a color verde!!. ****");
    }
    
    pointcut blue() : call(static void Main.botonAzulPresionado());
    after() : blue() {
    	System.out.println("**** Ventana cambiada a color azul!!. ****");
    }
    
    pointcut red() : call(static void Main.botonRojoPresionado());
    after() : red() {
    	System.out.println("**** Ventana cambiada a color rojo!!. ****");
    }
}
