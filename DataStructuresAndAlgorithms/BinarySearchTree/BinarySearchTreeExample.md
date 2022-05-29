# Proje 3

## Questions
**[7, 5, 1, 8, 3, 6, 0, 9, 4, 2]** dizisinin Binary-Search-Tree aşamalarını yazınız.

**Örnek:** root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

---
## Answers
- Root 7 secilir. 
- 5 degeri 7 degerinden küçük olduğu için sol tarafa yazilir.
- 1 degeri 5 degerinden kucuk oldugu icin 5 degerinin soluna yazilir.
- 8 degeri 7 degerinden buyuk oldugu icin 7 degerinin sagina yazilir.
- 3 degeri 7 ve 5'ten kucuk ancak 1 degerinden buyuk oldugu icin 1 degerinin sagina yazilir.
- 6 degeri 7 degerinden kucuk ve 5 degerinden buyuk oldugu icin 5 degerinin sagina yazilir.
- 0 degeri 7,5 ve 1 degerinden kucuk oldugu icin 1 degerinin soluna yazilir.
- 9 degeri 7 ve 8'den buyuk oldugu icin 8 degerinin sagina yazilir.
- 4 degeri 7 ve 5'den kucuk 1 ve 3'ten buyuk oldugu icin 3 degerinin sagina yazilir.
- 2 degeri 7 ve 5 degerlerinden kucuk, 1 degerinden buyuk ancak 3 degerinden kucuk oldugu icin 3 degerinin soluna yazilir.

```
                        7
                5              8
        1               6               9
0               3
        2               4
```



