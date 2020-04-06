                                                  # Core-Utilities
                                                  
                              Libreria para integrar en las apps y agilizar el proceso
                              

<a target="_blank" href="https://android-arsenal.com/api?level=21"><img src="https://img.shields.io/badge/API-21%2B-orange.svg"></a>
[![](https://jitpack.io/v/TioComeGfas/Core-Utilities.svg)](https://jitpack.io/#TioComeGfas/Core-Utilities)
                              
# API

+ minima: 21 
+ maxima: 29

# Terceros

+ Storage: https://github.com/sromku/android-storage
+ Bottom Dialog: https://github.com/javiersantos/BottomDialogs
+ Alerter: https://github.com/diogobernardino/Alerter
+ TSnackBar: https://github.com/AndreiD/TSnackBar
+ Spots Dialog: https://github.com/TioComeGfas/spots-dialog

# Gradle

Agrégar en su raíz build.gradle al final de los repositorios:

```Gradle
allprojects {
    repositories {
	maven { url 'https://jitpack.io' }
    }
}
```

Agregar la dependencia

```Gradle
dependencies {
    implementation 'com.github.TioComeGfas:Core-Utilities:1.3'
}
```

# Utilidades backend

+ Compare: calculo del menor, maximo o promedio de un arreglo

```Java

int[] array = {2,8,3,7,9,1};
int valueMaxInteger = CompareInteger.newInstance().maximo(array); //maximo de un arreglo
int valueMinInteger = CompareInteger.newInstance().minimo(array); //minimo de un arreglo
int valuePromInteger = CompareInteger.newInstance().promedio(array); //promedio de un arreglo

//Comparacion de otros tipos de datos
// Byte: CompareByte
// Double: CompareDouble
// Float: CompareFloat
// Integer: CompareInteger
// Long: CompareLong
```

+ Compress: compresion y descompresion de archivos .zip

```Java
//compresion de archivos

String path; //ruta del archivo
File file = new File(path);
Zip.newInstance().compress(path); //ruta absoluta
Zip.newInstance().compress(path,nameFile); //ruta del archivo y el nombre del archivo a comprimir

//descompresion de archivos

String path; //ruta del archivo
File file = new File(path);
Zip.newInstance().decompress(path); //ruta absoluta
Zip.newInstance().decompress(path,nameFile); //ruta del archivo y el nombre del archivo a comprimir
```

+ Convertion: conversion de tipos de datos

```Java
//conversion de string a integer
String number = "2";
ParseInteger.newInstance().parse(number);



```




