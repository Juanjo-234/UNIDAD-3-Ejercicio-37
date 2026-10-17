//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double costoKWh = 0.15;
    List<Electrodomestico> inventario = new ArrayList<>();

    inventario.add(new Lavarropa("Samsung", 650.0, 1.8, 9.0, 14));
    inventario.add(new Heladera("LG", 950.0, 2.4, 110.0, true));
    inventario.add(new Lavarropa("Whirlpool", 520.0, 1.5, 7.5, 8));

    System.out.println("==========================================================================");
    System.out.println("          ESTIMACIÓN DE GASTO OPERATIVO ANUAL DE ELECTRODOMÉSTICOS         ");
    System.out.println("==========================================================================\n");

    for (Electrodomestico aparato : inventario) {
        System.out.println(aparato.obtenerDetalles());
        System.out.printf("-> Gasto eléctrico anual proyectado: $%.2f USD%n", aparato.estimarGastoElectricoAnual(costoKWh));
        System.out.println("--------------------------------------------------------------------------");
    }
}
