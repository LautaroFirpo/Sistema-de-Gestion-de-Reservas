# 🏨 Gestión de Reservas Hoteleras

Proyecto académico desarrollado para la materia **Programación Orientada a Objetos** en la **Universidad Nacional de José C. Paz (UNPAZ)**.

## 📖 Descripción

Aplicación desarrollada en Java para administrar reservas hoteleras utilizando los principios de la Programación Orientada a Objetos.

El sistema carga la información desde un archivo de texto, almacena las reservas en una estructura `HashMap` y permite realizar distintas operaciones de consulta y procesamiento mediante un menú interactivo por consola.

## ✨ Características

* Lectura de reservas desde archivo de texto.
* Gestión de reservas simples y premium.
* Búsqueda de reservas por código.
* Cálculo del importe final de cada reserva.
* Obtención del total recaudado.
* Consultas utilizando Java Streams.
* Organización del proyecto por capas (Modelo, Repositorio y Servicio).

## 🛠️ Tecnologías Utilizadas

* Java 21
* Programación Orientada a Objetos

  * Herencia
  * Polimorfismo
  * Encapsulamiento
  * Abstracción
* Java Streams API
* HashMap
* Lectura de archivos de texto

## 📂 Estructura del Proyecto

```text
src
├── ar.com.unpaz.inicio
│   └── Main.java
│
├── ar.com.unpaz.model
│   ├── Reserva.java
│   ├── ReservaSimple.java
│   └── ReservaPremium.java
│
├── ar.com.unpaz.repositorio
│   └── ILecturaArchivo.java
│
├── ar.com.unpaz.repositorioImp
│   └── LecturaArchivoRepositorio.java
│
├── ar.com.unpaz.servicio
│   └── ILogicaReserva.java
│
└── ar.com.unpaz.servicioImp
    └── LogicaReserva.java
```

## 📋 Funcionalidades Implementadas

* Mostrar todas las reservas registradas.
* Buscar reservas por código.
* Calcular la recaudación total.
* Mostrar reservas ordenadas según distintos criterios.
* Obtener estadísticas sobre las reservas almacenadas.
* Procesar información utilizando Streams de Java.

## 🚀 Ejecución

1. Clonar el repositorio:

```bash
git clone https://github.com/usuario/repositorio.git
```

2. Abrir el proyecto en Eclipse, IntelliJ IDEA o NetBeans.

3. Verificar que exista el archivo:

```text
reservas.txt
```

4. Ejecutar:

```text
Main.java
```

5. Utilizar el menú interactivo desde la consola.

## 🎓 Objetivo Académico

Este proyecto tiene como finalidad aplicar conceptos fundamentales de Programación Orientada a Objetos, manejo de colecciones, lectura de archivos y procesamiento de datos mediante Streams en Java.

## 👨‍💻 Autor

**Lautaro**
Licenciatura en Gestión de Tecnologías de la Información
Universidad Nacional de José C. Paz (UNPAZ)
