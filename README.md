# Bienvenidxs a las sesiones de coding

El objetivo principal de estas sesiones será resolver problemas de código. A medida que vayamos avanzando, veremos
si podemos aplicar patrones o poner en práctica algún tema que nos interese.

Hoy os presento el siguiente ejercicio: **Leap Years** (años bisiestos).

### ¿En qué consiste?

Por el siglo XV, se usaba el calendario Juliano que definía los años bisiestos como todos los años divisibles por 4.
Sin embargo, a finales del siglo XVI se descubrió que el año se había desviado del año solar en aproximadamente 10 días.
Es por ello que se define el calendario gregoriano para reducir el número de años bisiestos y alinear el año al año solar.

El calendario gregoriano es bastante preciso, pero podría hacerse más preciso agregando una regla adicional
que elimine los años divisibles por 4000 como años bisiestos.
Pero supongo que cruzaremos ese puente cuando lleguemos a él ;) .


### Escenario 1
```
Como usuario, quiero saber si un año es bisiesto.

Los criterios de aceptación son los siguientes:

1. Todos los años divisibles por 400 son años bisiestos, ejemplo: 2400.
2. Todos los años divisibles por 100 pero no por 400 NO son años bisiestos, ejemplos: 1700, 1900 ni 2100.
3. Todos los años divisibles por 4 pero no por 100 SON años bisiestos, ejemplos: 2008, 2012, 2016.
4. Todos los años que no son divisibles por 4 NO son años bisiestos, ejemplos: 2017, 2018, 2019.

```

### Escenario 2
```
Como usuario, dado un rango de años quiero saber todos los años que son bisiestos.

Aplicaremos los mismos criterios que antes.

Por ejemplo: el rango será de 1800-2400

Como resultado se devolverá:

[1804, 1808, 1812, 1816, 1820, 1824, 1828, 1832, 1836, 1840, 1844, 1848, 1852, 1856, 1860, 1864, 1868, 1872, 1876, 1880,
1884, 1888, 1892, 1896, 1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960, 1964,
1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044,
2048, 2052, 2056, 2060, 2064, 2068, 2072, 2076, 2080, 2084, 2088, 2092, 2096, 2104, 2108, 2112, 2116, 2120, 2124, 2128,
2132, 2136, 2140, 2144, 2148, 2152, 2156, 2160, 2164, 2168, 2172, 2176, 2180, 2184, 2188, 2192, 2196, 2204, 2208, 2212,
2216, 2220, 2224, 2228, 2232, 2236, 2240, 2244, 2248, 2252, 2256, 2260, 2264, 2268, 2272, 2276, 2280, 2284, 2288, 2292,
2296, 2304, 2308, 2312, 2316, 2320, 2324, 2328, 2332, 2336, 2340, 2344, 2348, 2352, 2356, 2360, 2364, 2368, 2372, 2376,
2380, 2384, 2388, 2392, 2396, 2400]

```

Nota: Este ejercicio lo haremos aplicando Test Driven Development.
