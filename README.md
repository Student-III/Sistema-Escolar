# Sistema-Escolar
# README.md Actualizado para GitHub

# 🎓 Sistema Escolar — Implementación de Listas Enlazadas y ArrayList en Java

Proyecto académico en **Java** que implementa una **lista simplemente enlazada genérica** desde cero (`LinkedList<T>`), junto con el uso de `ArrayList` de la librería estándar, aplicados a un sistema escolar básico con entidades `Estudiante` y `Profesor`.

El objetivo principal es comprender el funcionamiento interno de las estructuras de datos dinámicas, la **programación genérica**, el uso de **interfaces**, el **manejo de excepciones** y las **buenas prácticas de validación** en el diseño de clases.

---

## 📑 Tabla de Contenidos

- [Descripción General](#-descripción-general)
- [Características](#-características)
- [Estructura del Proyecto](#-estructura-del-proyecto)
- [Tecnologías Utilizadas](#-tecnologías-utilizadas)
- [Instalación y Ejecución](#-instalación-y-ejecución)
- [Descripción de Clases](#-descripción-de-clases)
  - [Estudiante](#estudiante)
  - [Profesor](#profesor)
  - [Node](#node)
  - [IList](#ilist)
  - [LinkedList](#linkedlist)
  - [SistemaEscolar](#sistemaescolar)
- [Validaciones y Manejo de Excepciones](#-validaciones-y-manejo-de-excepciones)
- [Casos de Uso](#-casos-de-uso)
- [Casos de Prueba](#-casos-de-prueba)
- [Salida del Programa](#-salida-del-programa)
- [Mejoras Futuras](#-mejoras-futuras)
- [Autor](#-autor)
- [Licencia](#-licencia)

---

## 📖 Descripción General

Este repositorio contiene un **sistema escolar** desarrollado como proyecto académico. Se compone de dos partes fundamentales:

1. **Estructura de datos personalizada:** Una implementación propia de una **lista simplemente enlazada genérica** (`LinkedList<T>`) que implementa la interfaz `IList<T>`, con operaciones de inserción, eliminación, búsqueda y recorrido.

2. **Aplicación del sistema escolar:** Uso de `ArrayList<Estudiante>` y `LinkedList<Profesor>` para gestionar y mostrar información de estudiantes y profesores desde la clase principal (`SistemaEscolar`).

Cada entidad del dominio (`Estudiante`, `Profesor`) incluye **validaciones robustas** que garantizan la integridad de los datos, lanzando excepciones cuando se introducen valores inválidos.

---

## ✨ Características

- ✅ Lista enlazada genérica implementada desde cero (`LinkedList<T>`).
- ✅ Interfaz genérica `IList<T>` que define el contrato de la lista.
- ✅ Nodo genérico `Node<T>` con referencia al siguiente elemento.
- ✅ Operaciones completas: `add`, `add(index)`, `remove`, `get`, `size`, `clear`, `isEmpty`.
- ✅ Entidades `Estudiante` y `Profesor` con encapsulamiento y validaciones en el constructor.
- ✅ Uso de `ArrayList` para comparar con la implementación propia.
- ✅ Manejo de excepciones mediante `UnsupportedOperationException`.
- ✅ Código organizado en el paquete `com.mycompany.sistemaescolar`.

---

## 📁 Estructura del Proyecto

```
SistemaEscolar/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── sistemaescolar/
│                       ├── Estudiante.java       # Entidad Estudiante con validaciones
│                       ├── Profesor.java         # Entidad Profesor con validaciones
│                       ├── Node.java             # Nodo genérico para la lista enlazada
│                       ├── IList.java            # Interfaz genérica de lista
│                       ├── LinkedList.java       # Implementación propia de lista enlazada
│                       └── SistemaEscolar.java   # Clase principal (main)
│
└── README.md
```

---

## 🛠 Tecnologías Utilizadas

| Tecnología | Versión | Uso |
|------------|---------|-----|
| Java       | 21+     | Lenguaje principal |
| NetBeans   | 29+     | IDE de desarrollo (opcional) |
| Git        | 5.0+   | Control de versiones |

---

## 🚀 Instalación y Ejecución

### Requisitos previos

- **JDK 17** o superior instalado.
- **NetBeans**, **IntelliJ IDEA** o **Eclipse** (opcional).
- **Git** para clonar el repositorio.

### Pasos

1. **Clonar el repositorio:**

```bash
git clone https://github.com/Student-III/SistemaEscolar.git
cd SistemaEscolar
```

2. **Compilar el proyecto:**

```bash
javac -d out src/main/java/com/mycompany/sistemaescolar/*.java
```

3. **Ejecutar la clase principal:**

```bash
java -cp out com.mycompany.sistemaescolar.SistemaEscolar
```

---

## 📚 Descripción de Clases

### `Estudiante`

Representa a un estudiante del sistema escolar.

**Atributos:**

| Campo  | Tipo    | Descripción                          |
|--------|---------|--------------------------------------|
| name   | String  | Nombre del estudiante                |
| edad   | int     | Edad (0 – 150)                       |
| anno   | String  | Año escolar (ej. "1ro", "2do")       |
| nota   | float   | Nota (1.0 – 5.9)                     |

**Validaciones en el constructor:**

- `name` no puede ser `null` ni estar en blanco (`isBlank()`).
- `edad` debe estar entre `0` y `150`.
- `anno` no puede ser `null`.
- `nota` debe estar entre `1.0` (inclusive) y `6.0` (exclusive).

**Ejemplo de uso:**

```java
Estudiante e1 = new Estudiante("Leo", 21, "2do", 4.2f);
```

---

### `Profesor`

Representa a un profesor del sistema escolar.

**Atributos:**

| Campo       | Tipo    | Descripción                     |
|-------------|---------|---------------------------------|
| name        | String  | Nombre del profesor             |
| edad        | int     | Edad (0 – 150)                  |
| asignatura  | String  | Asignatura que imparte          |

**Validaciones en el constructor:**

- `name` no puede ser `null` ni estar en blanco (`isBlank()`).
- `edad` debe estar entre `0` y `150`.
- `asignatura` no puede ser `null`.

**Ejemplo de uso:**

```java
Profesor p1 = new Profesor("Lucian", 30, "Base de datos");
```

---

### `Node<T>`

Nodo genérico que almacena la información y una referencia al siguiente nodo.

**Atributos:**

| Campo | Tipo       | Descripción                    |
|-------|------------|--------------------------------|
| info  | T          | Información almacenada         |
| next  | Node<T>    | Referencia al siguiente nodo   |

**Constructores:**

```java
public Node(T info);
public Node(T info, Node<T> next);
```

**Métodos:**

- `getInfo()` / `setInfo(T info)`
- `getNext()` / `setNext(Node<T> next)`

---

### `IList<T>`

Interfaz genérica que define el contrato de la lista.

```java
public interface IList<T> {
    void add(T t);
    void add(T t, int index);
    T remove(int index);
    T get(int index);
    int size();
    void clear();
    boolean isEmpty();
}
```

---

### `LinkedList<T>`

Implementación propia de una **lista simplemente enlazada** que implementa `IList<T>`.

**Atributos:**

| Campo | Tipo     | Descripción                       |
|-------|----------|-----------------------------------|
| first | Node<T>  | Referencia al primer nodo         |
| size  | int      | Cantidad de elementos en la lista |

**Métodos principales:**

| Método                  | Descripción                                                    |
|-------------------------|----------------------------------------------------------------|
| `add(T t)`              | Agrega un elemento al final de la lista                        |
| `add(T t, int index)`   | Agrega un elemento en la posición indicada (0 ≤ index ≤ size)  |
| `remove(int index)`     | Elimina y retorna el elemento en la posición indicada          |
| `get(int index)`        | Retorna el elemento en la posición indicada                    |
| `size()`                | Retorna la cantidad de elementos                               |
| `clear()`               | Vacía la lista y reinicia el contador `size = 0`               |
| `isEmpty()`             | Indica si la lista está vacía                                  |

**Nota:** `remove(int index)` actualmente presenta una limitación conocida (ver sección de [Bugs conocidos](#-bugs-conocidos)).

---

### `SistemaEscolar`

Clase principal con el método `main`. Crea instancias de estudiantes y profesores, las agrega a un `ArrayList` y a una `LinkedList`, y las recorre para mostrar su información por consola.

Incluye líneas comentadas que permiten **probar casos de validación** (por ejemplo, nombres vacíos, edades fuera de rango, etc.).

---

## ⚠️ Validaciones y Manejo de Excepciones

| Excepción                        | Cuándo se lanza                                                |
|----------------------------------|----------------------------------------------------------------|
| `UnsupportedOperationException`  | Cuando un atributo no cumple las validaciones del constructor  |
| `UnsupportedOperationException`  | Cuando se accede a un índice fuera de rango en `LinkedList`    |

**Ejemplo de captura:**

```java
try {
    Estudiante e = new Estudiante("", 21, "2do", 4.2f);
} catch (UnsupportedOperationException ex) {
    System.out.println("Error: " + ex.getMessage());
}
```

**Mensajes de error actuales:**

- `"Intoduzca una nombre valido"` (Estudiante / Profesor)
- `"Intoduzca una edad valida"`
- `"Intoduzca una anno valido"`
- `"Intoduzca una nota valida"`
- `"Intoduzca una asignatura valida"`

> 💡 **Sugerencia:** Reemplazar `UnsupportedOperationException` por `IllegalArgumentException` (más apropiada para validación de argumentos) y corregir las tildes y typos en los mensajes.

---

## 🎯 Casos de Uso

1. **Registrar estudiantes** en un `ArrayList`.
2. **Registrar profesores** en una `LinkedList` propia.
3. **Recorrer** ambas estructuras y mostrar la información por consola.
4. **Validar** datos de entrada mediante excepciones.
5. **Comparar** el comportamiento de `ArrayList` (librería estándar) vs `LinkedList` (implementación propia).
6. **Activar casos de error** descomentando las líneas correspondientes en `SistemaEscolar.java`.

---

## 🧪 Casos de Prueba

El proyecto permite probar validaciones descomentando líneas en `SistemaEscolar.java`:

### Casos positivos (activos por defecto)

```java
Estudiante e1 = new Estudiante("Leo       ", 21, "2do", 4.2f);
Estudiante e2 = new Estudiante("Dan carlos", 21, "3ro", 3.5f);
Estudiante e3 = new Estudiante("Marianelys", 21, "1ro", 5.0f);

Profesor p1 = new Profesor("Lucian", 30, "Base de datos");
Profesor p2 = new Profesor("Marcos", 28, "Estructura de datos");
Profesor p3 = new Profesor("Dariel", 32, "Calculo 1");
```

### Casos negativos (comentados)

```java
// Estudiante e4 = new Estudiante("", 21, "2do", 4.2f);        // nombre vacío
// Estudiante e5 = new Estudiante("Pepe", -1, "2do", 4.2f);    // edad negativa
// Estudiante e6 = new Estudiante("Miguel", 151, "2do", 4.2f); // edad > 150

// Profesor p4 = new Profesor("", 30, "Base de datos");        // nombre vacío
// Profesor p5 = new Profesor("Lucian", 30, "");               // asignatura vacía
// Profesor p6 = new Profesor("Dariel", 180, "Calculo 1");     // edad > 150
```

### Excepciones en `LinkedList`

| Caso                          | Excepción esperada               |
|-------------------------------|----------------------------------|
| `get(-1)`                     | `UnsupportedOperationException`  |
| `get(size)`                   | `UnsupportedOperationException`  |
| `add(t, -1)`                  | `UnsupportedOperationException`  |
| `add(t, size + 1)`            | `UnsupportedOperationException`  |
| `remove(-1)`                  | `UnsupportedOperationException`  |
| `remove(size)`                | `UnsupportedOperationException`  |

---

## 🖥 Salida del Programa

Al ejecutar `SistemaEscolar` con los datos por defecto:

```
Nombre de estudiante:Leo        Edad:21 Anno:2do Nota:4.2
Nombre de estudiante:Dan carlos Edad:21 Anno:3ro Nota:3.5
Nombre de estudiante:Marianelys Edad:21 Anno:1ro Nota:5.0
Nombre de profesores:Lucian Edad:30 Asignatura:Base de datos
Nombre de profesores:Marcos Edad:28 Asignatura:Estructura de datos
Nombre de profesores:Dariel Edad:32 Asignatura:Calculo 1
```

---

## 🐛 Bugs Conocidos

| # | Bug                                                       | Estado       | Corrección sugerida |
|---|-----------------------------------------------------------|--------------|---------------------|
| 1 | `LinkedList.remove(0)` no elimina el primer elemento      | 🔴 Pendiente | Cambiar `index>0` por `index>=0` en `remove(int index)` |
| 2 | Los mensajes de error tienen typos y faltan tildes        | 🟡 Revisar   | "Introduzca", "válido/a", "un año" |
| 3 | `UnsupportedOperationException` no es la excepción ideal  | 🟡 Revisar   | Usar `IllegalArgumentException` para validaciones |
| 4 | Setters no validan los datos                              | 🟡 Revisar   | Reutilizar validaciones del constructor |
| 5 | `anno` no valida cadena vacía (solo `null`)               | 🟡 Revisar   | Añadir `anno.isBlank()` |
| 6 | `asignatura` no valida cadena vacía (solo `null`)         | 🟡 Revisar   | Añadir `asignatura.isBlank()` |

---

## 🚧 Mejoras Futuras

- [ ] Cambiar `UnsupportedOperationException` por `IllegalArgumentException` en validaciones.
- [ ] Corregir typos y tildes en los mensajes de error.
- [ ] Validar cadenas vacías con `isBlank()` en `anno` y `asignatura`.
- [ ] Agregar validaciones en los **setters** de `Estudiante` y `Profesor`.
- [ ] Implementar `toString()` en todas las entidades.
- [ ] Añadir `equals()` y `hashCode()` a `Estudiante` y `Profesor`.
- [ ] Implementar `Iterator<T>` para recorrer la lista con `for-each`.
- [ ] Añadir pruebas unitarias con **JUnit 5**.
- [ ] Documentar todas las clases con **Javadoc**.
- [ ] Agregar `pom.xml` para Maven o `build.gradle` para Gradle.
- [ ] Implementar lista doblemente enlazada como variante.
- [ ] Añadir persistencia en archivos o base de datos.

---

## 👨‍💻 Autor

**Leosbel Novales Sierra**  
Estudiante de Ingeniería Informática  
📧 leosung25@gmail.com  
🔗 [GitHub](https://github.com/Student-III)

---


## ⭐ Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar este proyecto:

1. Haz un **fork** del repositorio.
2. Crea una rama: `git checkout -b feature/nueva-funcionalidad`.
3. Realiza tus cambios y haz commit: `git commit -m "Añade nueva funcionalidad"`.
4. Sube los cambios: `git push origin feature/nueva-funcionalidad`.
5. Abre un **Pull Request**.

---

> **Nota:** Este proyecto es de carácter académico y tiene como finalidad reforzar los conceptos de estructuras de datos, programación genérica y manejo de excepciones en Java.
