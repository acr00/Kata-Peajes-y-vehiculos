# Kata-Peajes-y-vehiculos

 <img src="https://github.com/acr00/Kata-Peajes-y-vehiculos/blob/main/uml.PNG?raw=true" alt="Peajes y Vehiculos UML">

  <img src="https://github.com/acr00/Kata-Peajes-y-vehiculos/blob/main/CapturaPeaje.PNG?raw=true" alt="Peajes y Vehiculos UML">

 

# Sistema de Peaje
Este proyecto implementa un sistema de peaje en Java, que permite gestionar el cobro de peajes para diferentes tipos de vehículos en una estación de peaje.

## Características
- Manejo de diferentes tipos de vehículos (coches, motos, camiones)
- Cálculo automático de peajes basado en el tipo de vehículo
- Registro de vehículos que pasan por la estación de peaje
- Generación de informes de peajes cobrados

## Estructura del Proyecto
El proyecto consta de las siguientes clases principales:

- `Vehiculo`: Clase abstracta base para todos los tipos de vehículos
- `Coche`: Representa un coche con un peaje fijo
- `Moto`: Representa una moto con un peaje fijo
- `Camion`: Representa un camión con un peaje basado en el número de ejes
- `EstacionPeaje`: Gestiona el cobro de peajes y el registro de vehículos

## Cómo usar
1. Clona el repositorio o descarga los archivos del proyecto.
2. Abre el proyecto en tu IDE de Java preferido.
3. Añade, compila y ejecuta la clase principal (por ejemplo, `Main.java`) para iniciar el sistema.

## Ejemplo de uso
```java

EstacionPeaje estacion = new EstacionPeaje("Estación Central", "Ciudad Capital");
Vehiculo coche = new Coche("ABC123");
Vehiculo moto = new Moto("XYZ789");
Vehiculo camion = new Camion("DEF456", 3);
estacion.cobrarPeaje(coche);
estacion.cobrarPeaje(moto);
estacion.cobrarPeaje(camion);
estacion.imprimirImporte();
```


