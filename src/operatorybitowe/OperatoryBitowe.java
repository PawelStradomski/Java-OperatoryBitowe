
package operatorybitowe;
/**
 * 
 * @author pawelstradomski
 */

public class OperatoryBitowe {

    
    public static void main(String[] args) {
        
        /*
        OPERATORY BITOWE
        0 - false
        1- true
        
        & - iloczyn bitowy
        | - suma bitowa
        ^ - XOR exclusive OR (albo)
        x << 1 - przesuniecie bitowe w lewo o 1
        x >> 2 - przesuniecie bitowe w prawo o 2
        ~ - negacja bitowa
        
        System dwojkowy przyklady:
        np:
        int 5; czyli 0 1 0 1 bo 
        liczac od prawej; 1*2^0 + 0*2^1 + 1*2^2 + 0*2^3 = 1+0+4+0 = 5
        liczac od lewej: 0*2^3 + 1*2^2 + 0*2^1 + 1*2^0 = 0+4+0+1 = 5
        
        np:
        126 = 1*10^2 + 2*10^1 + 6*10^0 = 100+20+6
        Jakakolwiek liczba do potegi 0 = 1. np 2^0=1
        
        np:
        1010 = 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 = 8+0+2+0 = 10
        
        np: 
        14&11=10 bo mnozymy &
        1110 // 14
        1011 // 11
        -----------
        1010 - 2^3 + 2^1 = 10
        
        np: 
        14|11=15 bo dodajemy |
        1110//14
        1011//11
        ----------
        1111 = 2^3 + 2^2 + 2^1 + 2^0 = 8+4+2+1 = 15
        
        np:
        chce aby nie mogl pisac na forum
        0001 - pisac na forum
        0010 - edytowac na forum
        0100 - usuwac posta na forum
        1000 - banowac na forum
        -------
        1110 = 14. Sprawdzamy czy 14 jest w koniunkcji z 1 wiec 14&1 wynik 0 wiec 
        nie moze pisac na forum
        
        np:
        chce aby mogl pisac na forum
        0001 - pisac na forum
        0010 - edytowac na forum
        0100 - usuwac posta na forum
        1000 - banowac na forum
        -------------
        1111 = 15. Sprawdzamy czy 15 jest w koniunkcji z 1 wiec 15&1 wynik 1 wiec
        moze pisac na forum
        
        np:
        XOR ma te fajna wlasciwosc, ze jak porownamy dwie takie same wartosci
        zawsze zwraca 0
        ^ XOR przyklady
        1 1 - 0
        0 0 - 0
        0 1 - 1
        1 0 - 1
        
        1010 // 10
        1011 // 11
        ----------
        0001 // 1
        
        np:
        10>>1 przesuniecie 10 w prawo o 1 rzad czyli podzial przez 2 bo 2^1=2
        10>>2 przesuniecie 10 w prawo o 2 rzedy czyli podzial przez 4 bo 2^2=4
        00001010 = 10
        00000101 = 5
        
        np:
        10<<1 przesuniecie 10 w lewo o 1 rzad czyli mnozymy razy 2 bo 2^1=2
        10<<2 przesuniecie 10 w lewo o 2 rzedy czyli mnozymy razy 4 bo 2^2=4
        00001010 = 10
        00010100 = 20
        
        np:
        ~ operator negacji, odwraca liczby dwojkowe
        
        1010 = 10
        0101 = 5 po negacji~
        
        
        */        
       
        System.out.println(14&11);
        System.out.println(14|11);
        System.out.println(14&1);
        System.out.println(15&1);
        System.out.println(10^11);
        System.out.println(5^5);
        System.out.println(10>>1);
        System.out.println(10<<1);
        System.out.println(~10);
        
    }
    
}
