﻿# Kata-Peajes-y-vehiculos

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



