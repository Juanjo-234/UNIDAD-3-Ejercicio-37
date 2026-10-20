Este programa está diseñado para modelar un sistema de gestión y eficiencia energética de electrodomésticos aplicando los pilares fundamentales de la programación orientada a objetos en Java: herencia, encapsulamiento, reutilización mediante la palabra clave super y polimorfismo a través de la sobrescritura de métodos (@Override) para el cálculo dinámico de costos operativos y consumo eléctrico anual.

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base Electrodomestico: Concentra los atributos protegidos comunes a cualquier aparato (marca, precioBase y coeficienteConsumo en kWh por hora), provee un constructor centralizado y define la lógica base para estimar el gasto eléctrico anual en función de tarifas de servicio.

Desarrolla las clases hijas (Lavarropa y Heladera): Extienden de Electrodomestico incorporando atributos y reglas de funcionamiento propias (como la capacidad en kilogramos y los programas de lavado para el lavarropas; la capacidad del freezer en litros y el indicador tecnológico No Frost para la heladera).

Implementa el cálculo de costo operativo anual: Cada subclase o la superclase pondera el consumo eléctrico aplicando tasas y factores de recargo según la categoría de uso o exigencia operativa del aparato.

Ejecuta la prueba en el main: Crea una lista polimórfica de electrodomésticos especializados, calcula sus gastos operativos proyectados y despliega un resumen consolidado por consola.
