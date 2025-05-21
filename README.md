# Conversor de monedas

Un conversor de moneda desarrollado en Java, siguiendo principios de programación orientada a objetos y utilizando la API de ExchangeRate API.

### Pre-requisitos 📋

Asegúrate de tener lo siguiente instalado en tu sistema:

```
JDK 21.0.6
IDE recomendado: Intellij IDEA
GSON 2.13.1
```

### Instalación 🔧

Sigue estos pasos para clonar y ejecutar el proyecto localmente:

1. Clonar el repositorio:

```
git clone https://github.com/123SantiagoGonzalwz1/challenge-conversor-de-monedas.git
cd challenge-conversor-de-monedas/conversor
```
2. Abrir el proyecto en IntelliJ IDEA:

* Selecciona "Open" y navega hasta la carpeta del proyecto.
* Asegúrate de tener el JDK 21 configurado como SDK del proyecto.

3. Agregar la librería GSON:

* Si estás usando IntelliJ IDEA, puedes añadir la dependencia manualmente:

```
* Ve a: File > Project Structure > Libraries
* Añade el archivo .jar de GSON descargado desde Maven Central
```

O si estás usando Maven o Gradle, agrega la dependencia en el archivo de configuración correspondiente.

4. Ejecutar el programa:

* Ubica la clase Main y ejecútala directamente desde el IDE.

* El programa solicitará la cantidad y tendras una cantidad de monedas origen/destino para realizar la conversión en un menú.

```
**************************************************************************************
                Sea bienvenid@ al Conversor de Monedas =)
                
                1) Dólar => Peso Argentino.
                2) Peso Argentino => Dólar.
                3) Dólar => Real Brasileño.
                4) Real Brasileño => Dólar.
                5) Dólar => Peso Colombiano.
                6) Peso Colombiano => Dólar.
                7) Visualizar Historial de Conversiones (max: 10 registros).
                8) Salir.
                
                Elija una opción válida, por favor: 2
**************************************************************************************

Conversion de USD a ARS con tasa de: 1143.03 // Puede variar segun la caída o subida de la moneda
Ingrese el valor que deseas convertir: 100
El valor 100 [USD] corresponde al valor final de = 114302.90 [ARS]

// Si eliges la opción 7
Historial De Conversiones: monedaOrigen= [USD], monedaDestino= [ARS], montoIngresado= 100, tasaDeConversion= 1143.03, resultado= 114302.90, fechaHoraDeRegistro= 20/05/2025 8:50
...

// Si sales
¡Gracias por usar el Conversor de Monedas!
```

## Construido con 🛠️

* [Java](https://www.exchangerate-api.com/) - Lenguaje de programación
* [GSON](https://github.com/google/gson) - Librería para trabajar con JSON
* [ExchangeRate API](https://www.exchangerate-api.com/) - API para obtener tipos de cambios

## Autores ✒️

* **Santiago González** - *Realización del Reto* - [123SantiagoGonzalwz1](https://github.com/123SantiagoGonzalwz1)

## Expresiones de Gratitud 🎁

* Comenta a otros sobre este proyecto 📢
* Invita una cerveza 🍺 o un café ☕ a alguien del equipo. 
* Da las gracias públicamente 🤓.
