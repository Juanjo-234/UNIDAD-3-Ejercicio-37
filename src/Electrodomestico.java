public class Electrodomestico {
 protected String  marca;
 protected double precioBase;
 protected double coeficienteConsumo;

 public Electrodomestico(String marca, double precioBase, double coeficienteConsumo){
     this.marca = marca;
     this.precioBase= precioBase;
     this.coeficienteConsumo = coeficienteConsumo;
 }

    public double estimarGastoElectricoAnual(double costoKWh) {
        double consumoAnualKWh = this.coeficienteConsumo * 365;
        return consumoAnualKWh * costoKWh;
    }

    public String obtenerDetalles() {
        return "Marca: " + this.marca + " | Precio Base: $" + this.precioBase + " USD";
    }
}
