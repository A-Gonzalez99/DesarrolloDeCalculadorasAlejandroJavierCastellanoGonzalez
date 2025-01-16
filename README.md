
<h1>Calculadoras Java y Kotlin</h1>
Esta calculadora está desarrollada en **Java** 
para Android utilizando un diseño de interfaz de usuario (UI) 
basado en **XML**, donde el archivo XML define los componentes 
visuales (botones, pantallas) y su disposición, mientras que el 
código Java maneja la lógica de cálculos e interacciones del usuario. 
La otra versión de la calculadora se desarrolla en **Kotlin** usando **Jetpack Compose**, 
una biblioteca moderna y declarativa que facilita la creación de UI. 
A diferencia de la versión con Java y XML, 
Compose utiliza un enfoque más flexible y sencillo para manejar el estado
y actualizar la UI con funciones como `remember` y `mutableStateOf`,
implementando la lógica de manera declarativa.

<h2>Cómo Ejecutar la Aplicación</h2>
1. Clona o descarga este repositorio a tu máquina local.
git clone 
```
https://github.com/A-Gonzalez99/DesarrolloDeCalculadorasAlejandroJavierCastellanoGonzalez.git
```
2. Abre el Android Studio.
3. Selecciona la calculadora que deseas usar (Kotlin o Java)
4. Haz clic en Run en Android Studio para compilar y ejecutar la app en un emulador o en un dispositivo físico.

<h2>Calculadora en Kotlin</h2>
<h3>El jetpack compose consiste en:</h3>
- Dos TextField para ingresar los números.
- Un Button para realizar la operación de suma.
- Un Text para mostrar el resultado.
<p align="center">
  <img src="https://i.ibb.co/fHXmS9j/Screenshot-20250116-182509.png" width="200" />
  <img src="https://i.ibb.co/Bf8h23G/Screenshot-20250116-182545.png" width="200" />
  <img src="https://i.ibb.co/JyjGkwT/Screenshot-20250116-182604.png" width="200" />
</p>


<h2>Calculadora en Java</h2>
<h3>>El layout xml consiste en:</h3>
- Dos TextInputEditText para ingresar los números.
- Un Button para realizar la operación de suma.
- Un TextView para mostrar el resultado.
