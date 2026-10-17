public class Heladera extends Electrodomestico{
    private double capacidadFreezerLitros;
    private boolean tecnologiaNoFrost;

    public Heladera(String marca, double precioBase, double coeficienteConsumo, double capacidadFreezerLitros, boolean tecnologiaNoFrost){
        super(marca, precioBase, coeficienteConsumo);
        this.capacidadFreezerLitros = capacidadFreezerLitros;
        this.tecnologiaNoFrost = tecnologiaNoFrost;
    }

    @Override
    public double estimarGastoElectricoAnual(double costoKWh) {
        double gastoBase = super.estimarGastoElectricoAnual(costoKWh);
        double recargoNoFrost = this.tecnologiaNoFrost ? 45.0 : 0.0;
        return gastoBase + recargoNoFrost;
    }

    @Override
    public String obtenerDetalles() {
        String noFrostStr = this.tecnologiaNoFrost ? "Sí" : "No";
        return "[Heladera] " + super.obtenerDetalles() +
                " | Freezer: " + this.capacidadFreezerLitros + " L" +
                " | No Frost: " + noFrostStr;
    }
}
