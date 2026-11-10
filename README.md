![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Sumativa – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Tabata Zuleta Lazo
- **Sección:** 004A
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema
**Llanquihue Tour** es un programa de consola desarrollado en Java que representa información básica de una empresa de turismo. El programa crea y muestra un cliente y su reserva, un trabajador y su rol, y un proveedor con sus datos comerciales.

El modelo utiliza encapsulamiento mediante atributos privados y métodos de acceso. `Cliente` y `Trabajador` heredan de `Persona`. `Persona` y `Proveedor` se relacionan con objetos `Rut` y `Direccion` para representar sus datos. La clase `Rut` valida que el valor tenga el formato de números, guion y dígito verificador, admitiendo `k` o `K`.

La ejecución de ejemplo imprime los objetos en consola. En la estructura mostrada no aparecen carpetas para lectura de archivos, utilidades ni interfaces.

---

## 🧱 Estructura general del proyecto

```plaintext
Administracion_Llanquihue_Tour/
├── .idea/                              # Configuración del proyecto en IntelliJ IDEA
├── out/                                # Archivos generados al compilar
├── src/
│   ├── app/
│   │   └── Main.java                   # Clase principal y método main
│   └── model/
│       ├── datos/
│       │   ├── Direccion.java          # Datos de dirección
│       │   └── Rut.java                # Representación y validación del formato de RUT
│       └── rol/
│           ├── Cliente.java             # Cliente, reserva y tour
│           ├── Persona.java             # Datos comunes de una persona
│           ├── Proveedor.java           # Datos de proveedor
│           └── Trabajador.java          # Persona, rol y sueldo líquido
├── .gitignore
├── Administracion_Llanquihue_Tour.iml  # Archivo de configuración de IntelliJ IDEA
└── README.md                            # Documentación del proyecto
```

---


**Repositorio GitHub:** https://github.com/Taa-aaT/Llanquihue-Tour.git
**Fecha de entrega:** 09/11/2026

---
