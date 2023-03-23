# Bienvenidxs a las sesiones de coding

El objetivo principal de estas sesiones será resolver problemas de código. A medida que vayamos avanzando, veremos
si podemos aplicar patrones o poner en práctica algún tema que nos interese.

Hoy os presento los siguientes ejercicios:

**Nearest Prime Numbers** (Nivel fácil)

**Gossiping bus drivers** (Nivel intermedio)

## Nearest Prime Numbers

### ¿En qué consiste?

Un número primo es cualquier número entero mayor que 1 que solo se puede dividir por 1 o por sí mismo.
Para esta Kata, se generará dos números: el primo más cercano debajo de la entrada y el primo más cercano por encima.

Se proporcionará como input un número en cada línea, llamado n. El formato de salida será p1 < n < p2
donde p1 es el primo menor y p2 el primo mayor. Si n ya es un primo, diremos que n es primo.

### Escenario 1
Dado el input:
```
270  
541  
993  
649
```
El resultado será:
```
269 < 270 < 271  
541 is prime
991 < 993 < 997  
647 < 649 < 653
```

### Bonus
Dado el input:
```
2010741
1425172824437700148
```
El resultado será:
```
2010733 < 2010741 < 2010881
1425172824437699411 < 1425172824437700148 < 1425172824437700887
```

## Gossiping bus drivers

### ¿En qué consiste?

A los conductores de buses les encanta cotillear así que aprovechan las paradas para hacerlo. En este caso, vamos
a calcular después de cuántas paradas todos los conductores saben todos los chismes.
Se os proporcionará una serie de rutas de autobús con un conductor asignado/a y cada uno de ellos tendrá con un cotilleo.

Así pues, cuando 2 o más conductores están en la misma parada (aunque sea la salida), pueden intercambiar todos los chismes que conocen.
Una ruta de autobús se vería de la siguiente manera: `3 1 2 4` y se repetiría durante todo el día.

Todos los conductores tardan 1 minuto en ir de una parada a otra y el intercambio de chismes ocurre instantáneamente.
Todos los conductores conducen 8 horas al día, por lo que tiene un máximo de 480 minutos para escuchar todos los chismes.

### Escenario 1
Con el siguiente input:
```
3 1 2 3
3 2 3 1 
4 2 3 4 5
```
El resultado será:
```
5 stops
```

### Escenario 2
Con el siguiente input:
```
2 1 2
5 2 8
```
El resultado será:
```
Never
```

### Reto 1
Input:
```
7 11 2 2 4 8 2 2
3 0 11 8
5 11 8 10 3 11
5 9 2 5 0 3
7 4 8 2 8 1 0 5
3 6 8 9
4 2 11 3 3
```

### Reto 2
Input:
```
12 23 15 2 8 20 21 3 23 3 27 20 0
21 14 8 20 10 0 23 3 24 23 0 19 14 12 10 9 12 12 11 6 27 5
8 18 27 10 11 22 29 23 14
13 7 14 1 9 14 16 12 0 10 13 19 16 17
24 25 21 4 6 19 1 3 26 11 22 28 14 14 27 7 20 8 7 4 1 8 10 18 21
13 20 26 22 6 5 6 23 26 2 21 16 26 24
6 7 17 2 22 23 21
23 14 22 28 10 23 7 21 3 20 24 23 8 8 21 13 15 6 9 17 27 17 13 14
23 13 1 15 5 16 7 26 22 29 17 3 14 16 16 18 6 10 3 14 10 17 27 25
25 28 5 21 8 10 27 21 23 28 7 20 6 6 9 29 27 26 24 3 12 10 21 10 12 17
26 22 26 13 10 19 3 15 2 3 25 29 25 19 19 24 1 26 22 10 17 19 28 11 22 2 13
8 4 25 15 20 9 11 3 19
24 29 4 17 2 0 8 19 11 28 13 4 16 5 15 25 16 5 6 1 0 19 7 4 6
16 25 15 17 20 27 1 11 1 18 14 23 27 25 26 17 1
```
