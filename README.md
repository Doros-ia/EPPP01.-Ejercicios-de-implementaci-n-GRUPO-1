<div align="center">

# 🦇 GOTHAM CODE DIVISION
### GRUPO 1 — SMARTTOLL: SISTEMA DE PEAJE

![Java](https://img.shields.io/badge/Java-Desarrollo-F89820?style=for-the-badge&logo=openjdk&logoColor=white)
![Proyecto](https://img.shields.io/badge/Proyecto-SmartToll-FACC15?style=for-the-badge&labelColor=18181B)
![Grupo](https://img.shields.io/badge/Grupo-01-7C3AED?style=for-the-badge&labelColor=18181B)

*“Incluso en Gotham, cada vehículo debe pagar su peaje.”*

---

</div>

## 🦇 1. Integrantes del grupo

| N.º | Apellidos y nombres |
|:---:|---|
| 1 | Brishy Anahy Ashanga Yumbo |
| 2 | Fher Dorian Calderón Carvajal |
| 3 | Jefferson Sebastian Navas Ortiz |
| 4 | Karina Paola Sánchez Bastidas |

---

## 🚧 2. Ejercicio asignado: SmartToll — Peaje

### 📌 Descripción

El sistema **SmartToll** permite registrar los vehículos que ingresan a un peaje y calcular la tarifa correspondiente según el tipo de vehículo y los datos ingresados.

El programa solicita la cantidad de vehículos que se van a registrar y, para cada uno, solicita la siguiente información:

- **Placa:** identificación del vehículo.
- **Tipo de vehículo:**
  - `1` — Moto.
  - `2` — Automóvil.
  - `3` — Camión.
- **Número de ejes:** cantidad de ejes del vehículo.
- **Hora de ingreso:** hora de ingreso al peaje, expresada en formato de 24 horas.

El sistema debe validar los datos ingresados y utilizar una estructura `switch` para seleccionar la tarifa correspondiente al vehículo. Además, debe utilizar un ciclo para procesar todos los vehículos registrados.

### 🎯 Objetivo

Desarrollar un programa en Java que permita registrar vehículos en un peaje, calcular sus tarifas y presentar estadísticas generales sobre los ingresos obtenidos.

### ⚙️ Requerimientos del programa

El sistema debe cumplir con los siguientes requerimientos:

1. Solicitar la cantidad de vehículos que se van a registrar.
2. Validar que la cantidad de vehículos sea mayor que cero.
3. Solicitar la placa, el tipo de vehículo, el número de ejes y la hora de ingreso.
4. Validar los datos ingresados antes de procesarlos.
5. Utilizar `switch` para seleccionar la tarifa correspondiente.
6. Utilizar un ciclo para procesar todos los vehículos.
7. Acumular el total de dinero recaudado.
8. Contabilizar los camiones que tengan más de cuatro ejes.
9. Identificar la placa del vehículo que haya pagado la tarifa más alta.
10. Mostrar los resultados finales al terminar el registro.

### 📊 Resultados esperados

Al finalizar el registro, el programa debe presentar:

- El total de dinero recaudado por el peaje.
- La cantidad de camiones con más de cuatro ejes.
- La placa del vehículo que pagó la tarifa más alta.
- El valor de la tarifa más alta registrada.

### 📁 Abrir carpeta del ejercicio

<p align="center">
  <a href="./Ejercicio%201/">
    <img src="https://img.shields.io/badge/ABRIR_EXPEDIENTE-EJERCICIO_1-FACC15?style=for-the-badge&labelColor=18181B" alt="Abrir carpeta del Ejercicio 1">
  </a>
</p>

---

## 💻 3. Instrucciones de ejecución

### 📋 Requisitos

- Tener instalado el **JDK de Java**.
- Contar con un editor de código o una terminal.
- Disponer del archivo `SmartToll.java`.

### ▶️ Pasos para ejecutar el programa

**Paso 1.** Abrir una terminal dentro de la carpeta donde se encuentra el archivo `SmartToll.java`.

**Paso 2.** Compilar el programa con el siguiente comando:

```bash
javac SmartToll.java
