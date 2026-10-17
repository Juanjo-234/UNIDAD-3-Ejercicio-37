public class Lavarropa extends Electrodomestico{
    private double capacidadKg;
    private int programasLavado;

    public Lavarropa(String marca, double precioBase, double coeficienteConsumo, double capacidadKg, int programasLavado){
        super(marca, precioBase, coeficienteConsumo);
        this.capacidadKg = capacidadKg;
        this.programasLavado = programasLavado;
    }

    @Override
    public double estimarGastoElectricoAnual(double costoKWh) {
        double gastoBase = super.estimarGastoElectricoAnual(costoKWh);
        double recargoAguaCaliente = this.capacidadKg * 12.5; // Costo adicional estimado por uso de resistencia térmica
        return gastoBase + recargoAguaCaliente;
    }

    @Override
    public String obtenerDetalles() {
        return "[Lavarropa] " + super.obtenerDetalles() +
                " | Capacidad: " + this.capacidadKg + " Kg" +
                " | Programas: " + this.programasLavado;
    }
}
