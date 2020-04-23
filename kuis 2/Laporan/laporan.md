Nama      : Moch Farchan Agil

Kelas     : 1F

Absen/NIM : 15/1941720204

#Screenshot program
1. Class MainLinkedList
<img src = "mainlinkedlist.PNG">

2. Class LinkedList 
<img src = "linkedlist.PNG">
<img src = "linkedlist2.PNG">
<img src = "linkedlist3.PNG">
<img src = "linkedlist4.PNG">
<img src = "linkedlist5.PNG"> 

3. Class thn2018
<img src = "2018.PNG">

4. Class thn2019
<img src = "2019.PNG">

5. Class thn2020
<img src = "2020.PNG">

#flowchart

1. main
<img src = "main.png">

2. linkedlist()

<img src = "linked list.png">

3. addfirst()

<img src = "adfirst.png">

4. addlast()

<img src = "addlast.png">

5. isempty()

<img src = "isempty.png">

#penjelasan
saya menggunakan 5 class, yaitu class main, linkedList, dan 3 class untuk menyimpan node per tahun (2018,2019,2020). Pada class main diinputkan data secara statis sesuai data yang diberikan di soal,

1. Menggunakan method addFirst untuk mengisi data pertama,sehingga data yang baru langsung dimasukkan ke head(data pertama pada linkedlist).

2. Untuk memasukkan data selanjutnya, digunakan method addLast, yaitu memasukkan data ke node next, dilakukan pengecekan, apabila linkedlist sedang kosong, maka dipanggil method addFirst, jika tidak, maka semua data dilakukan proses traverse lalu data yang baru diinputkan diakhir perulangan traverse.

3. Print data dengan menggunakan teknik traverse, yaitu data akan disimpan sementara pada variabel tertentu lalu ditampilkan, dan variabel tersebut akan diganti dengan node next nya lalu isi variabel tersebut adalah data baru yang akan ditampilkan lagi, terus berulang seperti itu hingga variabel bernilai null atau tidak ada data lagi yang bisa ditampilkan.