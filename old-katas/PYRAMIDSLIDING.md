# Bienvenidxs a las sesiones de coding

El objetivo principal de estas sesiones será resolver problemas de código. A medida que vayamos avanzando, veremos
si podemos aplicar patrones o poner en práctica algún tema que nos interese.

Hoy os presento el siguiente ejercicio: **Pyramid sliding** (Deslizamiento piramidal).

### ¿En qué consiste?

El deslizamiento piramidal es un deporte divertido, pero tienes que ser rápido o te quemarás.

En esta kata tienes que encontrar el camino más rápido para bajar de la pirámide.

Una pirámide se representa así:
```
    1
  2   3
4   5   6
```
Donde siempre se empieza desde arriba y tienes que encontrar el camino hacia abajo. Por lo tanto,
sólo puede deslizar hacia abajo y solo se puede deslizar hacia los 2 campos adyacentes hacia abajo

Por ejemplo: `1 -> [2, 3], 2 -> [4, 5] y 3 -> [5, 6]` como sus únicos movimientos posibles.

Lo que se proporcionará será una N que indicará las capas de la pirámide y a continuación N Arrays donde cada
uno será + 1 más largo que el anterior.

**_Lo que se busca es la suma del camino más corto._**


### Escenario 1
Dado el siguiente input:
```
4
1
2 3
4 5 6
7 8 9 10
```
El resultado será:
`14`


### Reto 1
Con el input:
```
4
3
7 4 
2 4 6 
8 5 9 3
```
El resultado será:
`16`

### Reto 2
Si el input es:
```
15
75
95 64
17 47 82
18 35 87 10
20 4 82 47 65
19 1 23 75 3 34
88 2 77 73 7 63 67
99 65 4 28 6 16 70 92
41 41 26 56 83 40 80 70 33
41 48 72 33 47 32 37 16 94 29
53 71 44 65 25 43 91 52 97 51 14
70 11 33 28 77 73 17 78 39 68 17 57
91 71 52 38 17 14 91 43 58 50 27 29 48
63 66 4 68 89 53 67 30 73 16 69 87 40 31
4 62 98 27 23 9 70 98 73 93 38 53 60 4 23
```
El resultado será:
`447`


### Reto 3
Si el input es: https://pastebin.com/1A9u3epn

El resultado será:
`130572`
