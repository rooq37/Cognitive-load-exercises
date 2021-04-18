
# Zadanie 2  
  
Implementacji wymaga funkcja **solve** znajdująca się w pakiecie **Zad2**. Na wejściu przyjmuje ona listę napisów. Przykładowy napis wygląda następująco: ````1-3 a: abcde```` Po lewej stronie znaku **:** znajduje się reguła, którą musi spełnić napis po prawej stronie. Reguła określa minimalną i maksymalną liczbę razy, jaką dana litera musi się znaleźć w napisie po prawej stronie. W wymienionym przykładzie reguła brzmi **Napis musi zawierać nie mniej niż jedną literę "a", ale nie więcej niż trzy litery "a"**. Funkcja powinna zwrócić liczbę rekordów zgodnych z prawdą (spełniających swoją regułę) oraz przejść zaimplementowane już testy.

Przykład:

	1-3 a: abcde
	1-3 b: cdefg
	2-9 c: ccccccccc
	W powyższym przykładzie 2 napisy są prawidłowe. Środkowy napis, cdefg, nie jest; nie zawiera instancji b, a wymaga co najmniej 1. Pierwszy i trzeci napis są prawidłowe: zawierają jedno a lub dziewięć c, oba w granicach odpowiednich reguł.
