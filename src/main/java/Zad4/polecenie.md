# Zadanie 4

Implementacji wymaga funkcja **solve** znajdująca się w pakiecie **Zad4**. Na wejściu przyjmuje ona listę liczb. Liczba jest prawidłowa jeżeli suma dwóch dowolnych liczb poprzedzających daną liczbę o nie więcej niż 25 miejsc jest jej równa. Pierwsze 25 liczb nie jest ani prawidłowych, ani nieprawidłowych. Funkcja powinna zwrócić pierwszą napotkaną nieprawidłową liczbę oraz przejść zaimplementowane już testy.

Przykład:

    Pierwsze 25 liczb to liczby od 1 do 25 w kolejności losowej. 
    Kolejna liczba, aby była prawidłowa musi być sumą dwóch z tych liczb:

	26 byłaby prawidłową następną liczbą, ponieważ może to być 1 + 25 (lub 2 + 24 i inne).
	49 byłaby prawidłową następną liczbą, ponieważ jest to suma 24 i 25.
	100 nie byłoby prawidłową liczbą; żadne dwie z poprzednich 25 liczb nie sumują się do 100.
	50 również byłoby nieprawidłową liczbą; chociaż 25 pojawia się w poprzednich 25 liczbach, dwie liczby w parze muszą być różne.
