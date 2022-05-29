# Proje 1

## Questions
1. **[22,27,16,2,18,6]** -> Insertion Sort
    1. Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
    2. Big-O gösterimini yazınız.
    3. Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
    4. Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.


2. **[7,3,5,8,2,9,4,15,6]** dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

---
## Answers
1. [22,27,16,2,18,6]
    1. [2,27,16,22,18,6]

       [2,6,16,22,18,27]

       [2,6,16,18,22,27]
    2. Big O Notation 
    : O(n^2)
    3. Time Complexity 
        1. Average case : n^2 
        2. Worst case : n^2
        3. Best case : n
    4. Dizi sralandiktan sonra 18 sayisi dizinin ortasinda oldugundan average case kapsamina girer.

2. [7,3,5,8,2,9,4,15,6]
 - Adim 1 : [2,3,5,8,7,9,4,15,6]
- Adim 2 : [2,3,4,8,7,9,5,15,6]
- Adim 3 : [2,3,4,5,7,9,8,15,6]
- Adim 4 : [2,3,4,5,6,9,8,15,7]
