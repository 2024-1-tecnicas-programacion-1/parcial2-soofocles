package parcial2;

class Motocicleta extends Vehiculo {
    TipoMotocicleta tipoMotocicleta;
    
    public Motocicleta(String marca, String modelo, int año, TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, año);
        this.tipoMotocicleta = tipoMotocicleta;
    }
    
    @Override
    public String imprimirInformacion() {
        return super.imprimirInformacion() + ", " + tipoMotocicleta;
    }
}
