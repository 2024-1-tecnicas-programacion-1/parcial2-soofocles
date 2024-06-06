package parcial2;

class Automovil extends Vehiculo {
    int numeroPuertas;
    TipoCombustible tipoCombustible;

    public Automovil(String marca, String modelo, int año, int numeroPuertas, TipoCombustible tipoCombustible) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String imprimirInformacion() {
        return super.imprimirInformacion() + ", " + numeroPuertas + " puertas, combustión a " + tipoCombustible;
    }
}
