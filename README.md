# Bienvenidxs a las sesiones de coding

El objetivo principal de estas sesiones será resolver problemas de código. A medida que vayamos avanzando, veremos
si podemos aplicar patrones o poner en práctica algún tema que nos interese.

Hoy os presento el siguiente ejercicio: **Defusing the bomb**

## Defusing the bomb

### ¿En qué consiste?

Para desactivar la bomba hay que cortar unos cables. Estos cables son de color blanco, negro, morado, rojo, verde o
naranja.

Las reglas para desarmarla son las siguientes:
```
 - Si cortas un cable blanco, no se puede cortar un cable blanco o negro.
 - Si cortas un cable rojo, tienes que cortar uno verde.
 - Si cortas un cable negro, no está permitido cortar uno blanco, verde o naranja.
 - Si cortas un cable naranja, debes cortar uno rojo o negro.
 - Si cortas uno verde, tienes que cortar uno naranja o blanco.
 - Si cortas un cable morado, no puedes cortar un cable morado, verde, naranja o blanco.
```
Si se tiene algo mal en el orden incorrecto, la bomba explotará. Además a tener en cuenta: puede haber varios cables
del mismo color y estas instrucciones son para un cable a la vez. Una vez que cortas un cable puedes olvidarte de los
anteriores.

La entrada de datos:
```
    Se recibirá una secuencia de cables que se cortaron en ese orden y debemos determinar si la persona logró desarmar
    la bomba o si explotó.
```

### Escenario 1
```
    blanco
    rojo
    verde
    blanco
```

### Resultado escenario 1
```
    Bomb defused
```

### Escenario 2
```
    blanco
    naranja
    verde
    blanco
```

### Resultado escenario 2
```
    BOOM!
```

### Nota
Si deseas subir tu solución, simplemente crea una rama: `tunombre-nombrekata` por ejemplo `vero-vigenere`

## Antiguas Katas
- Vigenère cipher and decipher [VIGENERECIPHER.md](old-katas/VIGENERECIPHER.md)
- Leap years [LEAPYEARS.md](old-katas/LEAPYEARS.md)
- Pyramid sliding [PYRAMIDSLIDING.md](old-katas/PYRAMIDSLIDING.md)
- Nearest prime numbers and gossip bus drivers [NEARESTPRIMENUMBERS_GOSSIPBUSDRIVERS.md](old-katas/NEARESTPRIMENUMBERS_GOSSIPBUSDRIVERS.md)
- Harry Potter Bookstore [HARRYPOTTER.md](old-katas/HARRYPOTTER.md)
- Letter value sum [LETTERVALUESUM.md](old-katas/LETTERVALUESUM.md)
