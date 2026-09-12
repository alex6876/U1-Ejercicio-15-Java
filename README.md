# 🚰 Ejercicio — Control de Tanque de Agua

---

## 📝 Descripción

El sistema implementa la clase TanqueDeAgua para monitorear el volumen de líquido disponible en un depósito, asegurando que el nivel de agua nunca supere la capacidad máxima establecida y controlando el flujo de llenado y consumo.

---

## 🚀 Funcionalidades e Implementación

### 📦 Clase TanqueDeAgua

* **Atributos:**
* **capacidadMaximaLitros** (double): Volumen máximo de almacenamiento permitido expresado en litros.
* **nivelActualLitros** (double): Cantidad de agua disponible actualmente en el tanque expresada en litros.


* **Métodos Implementados:**
* **Constructor TanqueDeAgua:** Inicializa la capacidad máxima y asigna el nivel actual verificando que no supere la capacidad total; de lo contrario, iguala el nivel al límite máximo.
* **llenar(double litros):** Agrega la cantidad de litros especificada al tanque actualizando el nivel de agua disponible e informando en consola el valor acumulado.
* **consumir(double litros):** Descuenta la cantidad de litros especificada. Si el tanque ya se encuentra vacío, despliega un aviso indicando la falta de agua.
* **mostrar():** Imprime en pantalla la capacidad máxima en litros y el nivel actual de almacenamiento.



---

## 💻 Programa Principal (main)

El flujo principal ejecuta la siguiente simulación de uso de depósito:

1. Instancia un tanque con una capacidad máxima de 1000 litros y un nivel inicial de 500 litros.
2. Simula un consumo de 250 litros, actualizando el nivel restante.
3. Carga 568 litros adicionales al tanque.
4. Despliega en pantalla el estado final con la capacidad del tanque y los litros almacenados resultantes.
