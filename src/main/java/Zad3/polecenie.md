# Zadanie 3

Implementacji wymaga funkcja **solve** znajdująca się w pakiecie **Zad3**. Na wejściu przyjmuje ona listę zakodowanych numerów miejsc w samolocie. Pierwsze 7 znaków to zapisany binarnie rząd, gdzie **B=1**, a **F=0**. Ostatnie 3 znaki to kolumna, gdzie **R=1**, a **L=0**. Aby obliczyć numer miejsca należy pomnożyć numer rzędu przez 8, a następnie dodać numer kolumny. Funkcja powinna zwrócić największy numer miejsca na liście oraz przejść zaimplementowane już testy.

Przykład:

    BFFFBBFRRR: rząd 70, kolumna 7, numer miejsca 567
    FFFBBBFRRR: rząd 14, kolumna 7, numer miejsca 119
    BBFFBBFRLL: rząd 102, kolumna 4, numer miejsca 820
