# Práctica 2. Sistema de modernización Mutxamel FC 

## ÍNDICE 
1. [Intro](#1-intro)
2. [Estructura de clases](#2-estructura-de-clases)
   - Contenido de las clases e interfaces (.java)
3. [Programa principal (AppMutxamelFC / Copa_del_rey_App)](#3-programa-principal)
4. [Pruebas](#4-pruebas)
5. [Entrega](#5-entrega)

### 1. Intro
> El proyecto consiste en el desarrollo de una aplicación de gestión para el club **Mutxamel FC**. El sistema utiliza conceptos avanzados de **POO** como herencia, interfaces y enumeraciones para coordinar las funciones de jugadores, cuerpo técnico y acompañantes.

---

### 2. Estructura de clases
#### Contenido de las clases (.java)

- **Clase MutxamelFC.java (Base)**:
  Base abstracta que contiene los atributos comunes: nombre y edad. [Ver en GitHub](https://github.com/Meidas-cmd/UD6.-Uso-avanzado-de-clases-y-objetos/blob/main/src/main/java/Pr%C3%A1ctica_2_Sistema_modernizaci%C3%B3n/MutxamelFC.java)

- **Interfaz FuncionesIntegrantes.java**:
  Define los métodos obligatorios `concentrarse()`, `viajar(String ciudad)` y `celebrarGol()`. [Ver en GitHub](https://github.com/Meidas-cmd/UD6.-Uso-avanzado-de-clases-y-objetos/blob/main/src/main/java/Pr%C3%A1ctica_2_Sistema_modernizaci%C3%B3n/FuncionesIntegrantes.java)

- **Clase Jugador.java**:
  Gestiona la información del deportista, incluyendo su **dorsal** y **posición**. Implementa un control para que no se repitan dorsales mediante un `ArrayList` estático. [Ver en GitHub](https://github.com/Meidas-cmd/UD6.-Uso-avanzado-de-clases-y-objetos/blob/main/src/main/java/Pr%C3%A1ctica_2_Sistema_modernizaci%C3%B3n/Jugador.java)

- **Clase Entrenador.java**:
  Incluye la gestión de la **formación preferida** (validada mediante el formato N-N-N) y la planificación de entrenamientos. [Ver en GitHub](https://github.com/Meidas-cmd/UD6.-Uso-avanzado-de-clases-y-objetos/blob/main/src/main/java/Pr%C3%A1ctica_2_Sistema_modernizaci%C3%B3n/Entrenador.java)

- **Clase Masajista.java**:
  Contiene la lógica para realizar masajes a los jugadores y su titulación profesional. [Ver en GitHub](https://github.com/Meidas-cmd/UD6.-Uso-avanzado-de-clases-y-objetos/blob/main/src/main/java/Pr%C3%A1ctica_2_Sistema_modernizaci%C3%B3n/Masajista.java)

- **Clase Acompañante.java**:
  Representa a los familiares o parejas de los jugadores (especialmente para la categoría Senior). [Ver en GitHub](https://github.com/Meidas-cmd/UD6.-Uso-avanzado-de-clases-y-objetos/blob/main/src/main/java/Pr%C3%A1ctica_2_Sistema_modernizaci%C3%B3n/Acompa%C3%B1ante.java)

---

### 3. Programa principal

El proyecto incluye dos ejecutables principales para testear la lógica del sistema:

1. **AppMutxamelFC**: Realiza una simulación completa de un día de partido (concentración, entrenamiento, viaje, partido y descanso).
2. **Copa_del_rey_App**: Menú interactivo para el mantenimiento de entrenadores y consulta de equipos por categoría.

> [!IMPORTANT]
> La validación de la formación del Entrenador utiliza el método `matches("\\d-\\d-\\d")` para asegurar la integridad de los datos.

---

### 4. Pruebas

### 5. Entrega

- [X] Código fuente en GitHub: [Enlace al Repositorio](https://github.com/Meidas-cmd/UD6.-Uso-avanzado-de-clases-y-objetos/tree/main/src/main/java/Pr%C3%A1ctica_2_Sistema_modernizaci%C3%B3n)
- [X] Implementación de Interfaz `AccionesDeportivas`
- [X] Implementación de Interfaz `FuncionesIntegrantes`
- [X] Uso de Enums para `Equipos` y `Posiciones`
- [ ] Documentación Javadoc
