package application;

public aspect Aspect {
	pointcut green() : call(static void Main.botonVerdePresionado());
    after() : green() {
    	System.out.println("**** Boton verde presionado!!. ****");
    }
    
    pointcut blue() : call(static void Main.botonAzulPresionado());
    after() : blue() {
    	System.out.println("**** Boton azul presionado!!. ****");
    }
    
    pointcut red() : call(static void Main.botonRojoPresionado());
    after() : red() {
    	System.out.println("**** Boton rojo presionado!!. ****");
    }
}
