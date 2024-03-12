<h1>Screenshots</h1> 

## Before Optimization Result

`/all-student`
![Results Table /all-student](https://media.discordapp.net/attachments/1216986392614142003/1217094265369264148/image.png?ex=6602c65d&is=65f0515d&hm=2d2a3d198ad3f9da73e9aa459dd0d051a1d2b1c1b8be641f937556c8eaba7982&=&format=webp&quality=lossless&width=864&height=467)
![Results jtl /all-student](https://media.discordapp.net/attachments/1216986392614142003/1217095136459100160/image.png?ex=6602c72d&is=65f0522d&hm=797fed350e84cf7759141f776137ca8e063757de85eab3d065ba5d35a4297471&=&format=webp&quality=lossless&width=950&height=467)
----------
`/all-student-name`
![Results Table /all-student-name](https://media.discordapp.net/attachments/1216986392614142003/1217095469780439080/image.png?ex=6602c77c&is=65f0527c&hm=44416d4344180ed6c979ac523db6b318b8faab8dac184c2b279698b1d138aad3&=&format=webp&quality=lossless&width=865&height=466)
![Results jtl /all-student-name](https://media.discordapp.net/attachments/1216986392614142003/1217095692364021810/image.png?ex=6602c7b1&is=65f052b1&hm=db4f4ec0aa7c62e7984f10cd8d564abe106e34dffd43f629b18b79cde72780a0&=&format=webp&quality=lossless&width=946&height=467)
----------
`/highest-gpa`
![Results Table /highest-gpa](https://media.discordapp.net/attachments/1216986392614142003/1217096275581730857/image.png?ex=6602c83c&is=65f0533c&hm=5c0d579722cafcf53aa57e2048088e7bd35528b8f702dd8d9d27226d994ddba8&=&format=webp&quality=lossless&width=859&height=467)
![Results jtl /highest-gpa](https://media.discordapp.net/attachments/1216986392614142003/1217096420969021562/image.png?ex=6602c85f&is=65f0535f&hm=b9aa9eb65645283a46a3ad89fcfadd37d6ec61454fd6fa63dfefdd14bb2fd572&=&format=webp&quality=lossless&width=954&height=467)

## After Optimization Result

`/all-student`
![Results After Optimization /all-student](https://media.discordapp.net/attachments/1216986392614142003/1217096739211841686/image.png?ex=6602c8ab&is=65f053ab&hm=f868484505b8867d383e8d3b4fe713bd4321861b09a181a029d91afe3a94cc73&=&format=webp&quality=lossless&width=960&height=465)
#### Saya berhasil meningkatkan waktu eksekusi program hingga 50%

----------
`/all-student-name`
![Results After Optimization /all-student-name](https://media.discordapp.net/attachments/1216986392614142003/1217097471474405396/image.png?ex=6602c959&is=65f05459&hm=78551c7596e9e82ffaf1573137e6fade1ca10baecc3b0a57d0ebcb2ad9ba3634&=&format=webp&quality=lossless&width=550&height=270)
#### Saya berhasil meningkatkan waktu eksekusi program hingga ~20%

----------
`highest-gpa`
![Results After Optimization /highest-gpa](https://cdn.discordapp.com/attachments/1216986392614142003/1217098456204578886/image.png?ex=6602ca44&is=65f05544&hm=8ed53f5d6ad2146924f557530f820adfd81e1e6850dfb2a205ea9b36507084ec&)
#### Saya tidak melihat adanya peningkatan yang signifikan dalam waktu eksekusi program

----------
<h1>Reflection</h1>

### 1. What is the difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance?
JMeter dapat berguna jika kita ingin menguji kinerja keseluruhan aplikasi kita. Profiler IntelliJ dapat berguna jika kita ingin melacak bagian mana dari aplikasi kita yang memakan waktu paling banyak.

### 2. How does the profiling process help you in identifying and understanding the weak points in your application?
Proses profiler dapat mengidentifikasi fungsi atau metode yang memakan waktu paling banyak untuk dieksekusi yang dapat membantu kita mengidentifikasi bagian dari aplikasi kita yang perlu dioptimalkan atau direfactor.

### 3. Do you think IntelliJ Profiler is effective in assisting you to analyze and identify bottlenecks in your application code?
Ya, karena kita dapat melihat berapa banyak waktu yang dibutuhkan oleh setiap fungsi atau metode dalam waktu eksekusi keseluruhan aplikasi kita.

### 4. What are the main challenges you face when conducting performance testing and profiling, and how do you overcome these challenges?
Tantangan utamanya adalah memahami cara menggunakan Profiler IntelliJ. Saya harus membaca dokumentasinya dan menonton beberapa tutorial untuk memahami cara menggunakannya.

### 5. What are the main benefits you gain from using IntelliJ Profiler for profiling your application code?
Selain kemampuannya untuk melacak bagian dari aplikasi kita yang memakan waktu paling banyak, manfaat utama dari Profiler IntelliJ adalah hasil dari profilnya ditampilkan di samping kode. Hal ini memudahkan kita untuk melihat bagian dari kode yang memakan waktu paling banyak saat kita sedang membaca kode tersebut.

### 6. How do you handle situations where the results from profiling with IntelliJ Profiler are not entirely consistent with findings from performance testing using JMeter?
Perbedaan hasil antara Profiler IntelliJ dan JMeter mungkin disebabkan oleh fakta bahwa Profiler memantau waktu eksekusi secara langsung sedangkan JMeter hanya menguji kinerja keseluruhan aplikasi.

### 7. What strategies do you implement in optimizing application code after analyzing results from performance testing and profiling? How do you ensure the changes you make do not affect the application's functionality?
Untuk optimasi, saya menggunakan metode parallelStream() untuk membuat program berjalan lebih cepat. Saya juga menggunakan Profiler IntelliJ untuk melacak bagian mana dari program yang memakan waktu paling banyak dan mengoptimalkan bagian tersebut. Untuk memastikan bahwa program masih berfungsi seperti yang diinginkan, saya memeriksa hasil sebelum dan sesudah optimasi karena aplikasi ini tidak memiliki unit test.