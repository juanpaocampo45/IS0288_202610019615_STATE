interface Estado {
    void cambiar(Semaforo s);
}

class Verde implements Estado {
    public void cambiar(Semaforo s) {
        System.out.println("Verde -> Amarillo");
        s.estado = new Amarillo();
    }
}

class Amarillo implements Estado {
    public void cambiar(Semaforo s) {
        System.out.println("Amarillo -> Rojo");
        s.estado = new Rojo();
    }
}

class Rojo implements Estado {
    public void cambiar(Semaforo s) {
        System.out.println("Rojo -> Verde");
        s.estado = new Verde();
    }
}

class Semaforo {
    Estado estado = new Verde(); // empieza en verde

    void cambiar() {
        estado.cambiar(this);
    }
}

public class State {
    public static void main(String[] args) {
        Semaforo s = new Semaforo();

        s.cambiar();
        s.cambiar();
        s.cambiar();
        s.cambiar();
    }
}