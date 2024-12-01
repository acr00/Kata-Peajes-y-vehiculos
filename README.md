# Kata-Peajes-y-vehiculos

 <img src="https://github.com/acr00/Kata-Peajes-y-vehiculos/blob/main/uml.PNG?raw=true" alt="Peajes y Vehiculos UML">

 +-------------------+
| Vehiculo         |
+-------------------+
| - placa: String   |
+-------------------+
| + getPlaca()      |
| + setPlaca()      |
| + calcularPeaje() |
+-------------------+
     ^      ^      ^
     |      |      |
+-------------------+
| Camion           |
+-------------------+
| - ejes: int       |
+-------------------+
| + getEjes()       |
| + setEjes()       |
| + calcularPeaje() |
+-------------------+

+-------------------+
| Coche            |
+-------------------+
| + calcularPeaje() |
+-------------------+

+-------------------+
| Moto             |
+-------------------+
| + calcularPeaje() |
+-------------------+

+-------------------+
| EstacionPeajes   |
+-------------------+
| - id: int         |
| - nombre: String  |
| - ciudad: String  |
| - totalPeajes: double|
| - vehiculos: List<Vehiculo>|
+-------------------+
| + getId()         |
| + setId()         |
| + getNombre()     |
| + setNombre()     |
| + getCiudad()     |
| + setCiudad()     |
| + getTotalPeajes()|
| + setTotalPeajes()|
| + getVehiculos()  |
| + setVehiculos()  |
| + cobrarPeaje()   |
| + imprimirImporte()|
+-------------------+


