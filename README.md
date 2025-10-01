# 📚 CEA de Tutorias – Arquitectura Hexagonal

Este proyecto implementa un **sistema de tutorías** utilizando **Arquitectura Hexagonal (Ports & Adapters)**.  
La finalidad es mostrar cómo estructurar el dominio, la aplicación y la infraestructura de manera desacoplada, con soporte para eventos, repositorios en memoria y adaptadores de notificación.

---

## 🏗️ Estructura del Proyecto
```
src/main/java/udc/tutorias
│
├── domain                  # Capa de dominio (reglas de negocio)
│   ├── eventos             # Eventos de dominio
│   │   ├── TutoriaProgramadaEvento.java
│   │   └── TutoriaCanceladaEvento.java
│   │
│   ├── excepciones         # Excepciones específicas
│   │   ├── DocenteNoDisponibleException.java
│   │   ├── InvarianteDominioException.java
│   │   └── TutoriaNoEncontradaException.java
│   │
│   ├── model               # Modelos de dominio
│   │   ├── Asignatura.java
│   │   ├── Carrera.java
│   │   ├── Docente.java
│   │   ├── Estudiante.java
│   │   ├── Tutoria.java
│   │   └── Universidad.java
│   │
│   ├── servicios           # Servicios de dominio
│   │   ├── DisponibilidadDocenteService.java
│   │   ├── NotificacionService.java
│   │   └── ValidacionHorarioService.java
│
├── application             # Capa de aplicación
│   ├── puertos_entrada     # Interfaces que exponen casos de uso
│   │   ├── ServicioProgramarTutoria.java
│   │   └── ServicioCancelarTutoria.java
│   │
│   └── puertos_salida      # Interfaces de repositorios
│       ├── TutoriaRepository.java
│       ├── DocenteRepository.java
│       └── EstudianteRepository.java
│
├── infraestructura         # Capa de infraestructura
│   └── adaptadores
│       ├── controladores   # Simulación de entrada (API)
│       │   └── TutoriaController.java
│       │
│       ├── repositorios    # Implementación de puertos de salida
│       │   ├── TutoriaRepositoryJpa.java
│       │   ├── DocenteRepositoryMongo.java
│       │   └── EstudianteRepositoryPostgres.java
│       │
│       └── notificaciones  # Adaptadores de salida (notificación)
│           ├── EmailNotificacionAdapter.java
│           └── SmsNotificacionAdapter.java
│
└── Main.java               # Clase de arranque para pruebas

```

---

## ⚙️ Flujo de Ejecución

1. **Programar una tutoría**
    - Se crea un objeto `Tutoria` con `String id`, `Docente`, `Estudiante` y `Asignaturas`.
    - El `TutoriaController` usa el servicio de programación.
    - La tutoría se guarda en `TutoriaRepositoryJpa` (simulación en memoria).
    - Se dispara el evento `TutoriaProgramadaEvento`.
    - El `EmailNotificacionAdapter` muestra el mensaje en consola.

2. **Cancelar una tutoría**
    - El controlador recibe el `id` (`String`).
    - Se elimina de `TutoriaRepositoryJpa`.
    - Se dispara `TutoriaCanceladaEvento`.
    - El adaptador de notificación envía mensaje en consola.

---

## 🧩 Ejemplo de Ejecución

Ejecutando `Main.java` se obtiene en consola:
```
📧 Email enviado: Tutoria programada con ID T1
📧 Email enviado: Tutoria cancelada con ID T1
```
---
## 👨‍💻 Autor
Alexis Juliette Cera Paez

Proyecto desarrollado como práctica de **Arquitectura Hexagonal en Java**.


