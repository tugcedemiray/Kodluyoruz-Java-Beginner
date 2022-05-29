# Proje 2

## Questions
**[16,21,11,8,12,22]** -> Merge Sort
- Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
- Big-O gösterimini yazınız.

---
## Answers
1. Dizi -> [16,21,11,8,12,22] 
- Adim 1 : [16,21,11] [8,12,22]
- Adim 2 : [16] [21,11] [8,12] [22]
- Adim 3 : [16] [21] [11] [8] [12] [22]
- Adim 4 : [16] [11,21] [8,12] [22]
- Adim 5 : [11,16,21] [8,12,22]
- Adim 6 : [8,11,12,16,21,22]
2. Big O Notation : O(nlogn)