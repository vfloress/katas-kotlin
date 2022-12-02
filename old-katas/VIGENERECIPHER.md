# Bienvenidxs a las sesiones de coding

El objetivo principal de estas sesiones será resolver problemas de código. A medida que vayamos avanzando, veremos
si podemos aplicar patrones o poner en práctica algún tema que nos interese.

Hoy os presento un pequeño ejercicio: **Vigenère cipher**.

### ¿En qué consiste?
Tendremos la siguiente tabla que forma un diccionario con las letras del alfabeto.

|     | A   | B   | C   | D   | E   | F   | G   | H   | I   | J   | K   | L   | M   | N   | O   | P   | Q   | R   | S   | T   | U   | V   | W   | X   | Y   | Z   |
|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|
| A   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   |
| B   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   |
| C   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   |
| D   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   |
| E   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   |
| F   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   |
| G   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   |
| H   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   |
| I   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   |
| J   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   |
| K   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   |
| L   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   |
| M   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   |
| N   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   |
| O   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   |
| P   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   |
| Q   | q   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   |
| R   | r   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   |
| S   | s   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   |
| T   | t   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   |
| U   | u   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   |
| V   | v   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   |
| W   | w   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   |
| X   | x   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   |
| Y   | y   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   |
| Z   | z   | a   | b   | c   | d   | e   | f   | g   | h   | i   | j   | k   | l   | m   | n   | o   | p   | q   | r   | s   | t   | u   | v   | w   | x   | y   |

A continuación se decide una palabra secreta que es la que codificará el mensaje. Idealmente esta palabra no debería ser escrita en ningún sitio.

Y para codificar el mensaje, lo primero que habría que hacer es escribirlo de la siguiente manera:

```
estoesunaprueba
```

Entonces añadimos la palabra secreta que será **_coding_**, repitiendola las veces necesarias:

```
codingcodingcod
estoesunaprueba
```

Ahora miramos en la parte superior de la tabla la letra del mensaje y la letra de la clave en la columna de la izquierda, cogemos el valor de esta intersección. Así vamos iterando hasta la última letra a codificar.

```
codingcodingcod
estoesunaprueba
ggwwrywbdxeagpd
```

El resultado de la codificación sería: **ggwwrywbdxeagpd**

Nota: si quisieramos decodificar el mensaje, lo único que tendríamos que hacer es utilizar la palabra secreta y buscarla en la columna de la izquierda
luego recorremos hasta encontrar la letra del mensaje cifrado y ver a qué letra le corresponde en la parte superior.


### Primera iteración:

Vamos a codificar el siguiente mensaje con la palabra clave **QUEENS**: 

```
QUEHAREMOSESTANOCHECEREBRO
```

El cifrado debe ser:

```
GOILNJUGSWRKJURSPZUWIVRTHI
```

Otro ejemplo mensaje con palabra clave **ROSALIA**:

```
BABYNOMELLAMEQUEYOESTOYOCUPAOLVIDANDOTUSMALE
```

El cifrado debe ser:

```
SOTYYWMVZDAXMQLSQOPATFMGCFXAFZNIOINUCLUDUACS
```

### Segunda iteración:

Vamos a decodificar el siguiente mensaje con la palabra clave **KITTY**:

```
CPHPKOBAXKYVXR
```

El resultado descifrado es:

```
SHOWMETHEMONEY
```
