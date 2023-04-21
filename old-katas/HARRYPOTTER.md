# Bienvenidxs a las sesiones de coding

El objetivo principal de estas sesiones será resolver problemas de código. A medida que vayamos avanzando, veremos
si podemos aplicar patrones o poner en práctica algún tema que nos interese.

Hoy os presento el siguiente ejercicio:

**Bookstore discount for Harry Potter series**

## Bookstore discount for Harry Potter series

### ¿En qué consiste?

Érase una vez una serie de 5 libros sobre un héroe llamado Harry (al menos cuando se inventó este Kata, solo había 5).
Los niños de todo el mundo pensaron que era fantástico y, por supuesto, también el editor. Así pues, una de las muchas librerías,
estableció el siguiente modelo de precios para aprovechar los poderes mágicos de Harry.

Una copia de cualquiera de los cinco libros cuesta 8€. Sin embargo, si compras dos libros diferentes de la serie, obtienes
un 5% de descuento en esos dos libros. Si compras 3 libros diferentes, obtienes un 10% de descuento. Con 4 libros diferentes,
obtienes un 20% de descuento. Si vas por completo y compras los 5, obtienes un gran descuento del 25%.

Tened en cuenta que si compras, digamos, cuatro libros, de los cuales 3 son títulos diferentes, se obtiene un 10% de descuento en los
3 que forman parte de un conjunto, pero el cuarto libro todavía costará 8€.

### Escenario casos básicos
```
assert_equal(0, price([]))
assert_equal(8, price([1]))
assert_equal(8, price([2]))
assert_equal(8, price([3]))
assert_equal(8, price([4]))
assert_equal(8 * 3, price([1, 1, 1]))
```

### Escenario con simples descuentos
```
assert_equal(8 * 2 * 0.95, price([0, 1]))
assert_equal(8 * 3 * 0.9, price([0, 2, 4]))
assert_equal(8 * 4 * 0.8, price([0, 1, 2, 4]))
assert_equal(8 * 5 * 0.75, price([0, 1, 2, 3, 4]))
```

### Escenario con múltiples descuentos
```
assert_equal(8 + (8 * 2 * 0.95), price([0, 0, 1]))
assert_equal(2 * (8 * 2 * 0.95), price([0, 0, 1, 1]))
assert_equal((8 * 4 * 0.8) + (8 * 2 * 0.95), price([0, 0, 1, 2, 2, 3]))
assert_equal(8 + (8 * 5 * 0.75), price([0, 1, 1, 2, 3, 4]))
```

### Escenario con casos extremos
```
assert_equal(2 * (8 * 4 * 0.8), price([0, 0, 1, 1, 2, 2, 3, 4]))
assert_equal(3 * (8 * 5 * 0.75) + 2 * (8 * 4 * 0.8), 
    price([0, 0, 0, 0, 0, 
           1, 1, 1, 1, 1, 
           2, 2, 2, 2, 
           3, 3, 3, 3, 3, 
           4, 4, 4, 4])
)
```
