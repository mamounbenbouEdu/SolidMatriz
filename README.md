# Práctica 1 - Matriz en Java con Principios SOLID

Este proyecto consiste en representar y trabajar con una matriz de enteros en Java, aplicando los principios SOLID, especialmente SRP, OCP y DIP.


## 🚀 Funcionalidades

- Crear una matriz de enteros (clase `Matriz`)
- Imprimir la matriz en consola
- Obtener su transpuesta
- Diseño limpio y mantenible basado en buenas prácticas

## 🧠 Principios SOLID Aplicados

- **SRP (Responsabilidad única):** la clase `Matriz` solo representa una estructura de datos
- **OCP (Abierto/cerrado):** la lógica de impresión y transposición puede extenderse sin modificar la clase base
- **DIP (Inversión de dependencias):** `Main` depende de una interfaz (`MatrizService`), no de la implementación concreta

## 🛠 Requisitos

- Java 17 o superior
- IntelliJ IDEA u otro IDE compatible

## 📥 Cómo ejecutar

1. Clona el repositorio o descárgalo como ZIP
2. Abre el proyecto en IntelliJ IDEA
3. Ejecuta la clase `Main.java`

---
