# RESULTS
## Before Optimization

<details>
  <summary>All-Student</summary>
  Result in Table
<img width="902" alt="result in table" src="https://github.com/bangjai123/exercise-profiling/assets/120235144/fe416500-4889-4b1f-99a9-39587677a70e">

  Result in log
<img width="834" alt="log" src="https://github.com/bangjai123/exercise-profiling/assets/120235144/2393feef-aabd-4554-af49-7b0ddbde18ae">

  
</details>

<details>
<summary>All-Student-name</summary>
  Result in table
  <img width="898" alt="result in table" src="https://github.com/bangjai123/exercise-profiling/assets/120235144/7f3d498c-c871-467e-8f17-f8a4c1f4ab04">

  Result in log
  <img width="833" alt="log" src="https://github.com/bangjai123/exercise-profiling/assets/120235144/2b3105a4-747f-41dc-bb27-be6e1446cb19">


</details>

<details>
  <summary>highest-gpa</summary>

  Result in table
<img width="899" alt="result table" src="https://github.com/bangjai123/exercise-profiling/assets/120235144/9dcf7a05-4003-4c5e-81f6-fb1fd36b753c">

  Result in log
<img width="834" alt="log" src="https://github.com/bangjai123/exercise-profiling/assets/120235144/30a83ea2-3b22-4066-a8ef-55c4205e43df">

</details>

## After Optimization

<details>
  <summary>All-Student</summary>

<img width="892" alt="after optimization" src="https://github.com/bangjai123/exercise-profiling/assets/120235144/8a0842c3-7235-4d30-ae14-155a6930e55a">

</details>

<details>
  <summary>All-Student-name</summary>

<img width="887" alt="after optimization" src="https://github.com/bangjai123/exercise-profiling/assets/120235144/3b18541d-0067-409f-a396-e7e3dfa7a96f">

</details>

<details>
  <summary>highest-gpa</summary>
  
<img width="890" alt="after optimization" src="https://github.com/bangjai123/exercise-profiling/assets/120235144/c8f2c82c-9307-4916-ad48-4cf9f59f166a">

</details>

## Conclusion

hasil optimisasi memiliki performa yang lebih baik dari kode sebelum optimisasi

# REFLEKSI
<details>
  <summary>Refleksi</summary>

  1. Prinsip kerja Jmeter adalah mengukur performa aplikasi secara umum seperti waktu dan throughput. Tujuan dari penggunaan Jmeter adalh mengukur performa aplikasi secara kelesuruhan. Di sisi lain, profiling pada Intellij bekerja dengan menguku beban kerja dari bagian-bagian (method) dalam aplikasi. Dengan demikian, programmer dapat mengetahui method mana dari programnya yang menyebabkan performan kurang bagus. Dengan demikian, profiling Intellij dapat digunakan ketika kita membutuhkan analisis mendalam dari tiap method
     
  2. Profiling pada Intellij menjabarkan kerja tiap method secara rinci, mulai dari beban memorinya hingga CPU timenya. Dengan demikian, kita dapat mengamati mana method yang menjadi beban dalam aplikasi. Kita dapat lebih terforkus untuk memperbaiki method yang memang bermasalah.

  3. Menurut saya iya. Seperti yang telah disebutkan sebelumnya, profiling pada Intellij memberikan analisis performa hingga ke tingkat method yang ada pada aplikasi kita. Dengan demikian, menemukan bottleneck pada kode, akan sangat terbantu dengan adanya Intellij profiler

  4. Menurut saya, challenge terbesarnya adalah pada menentukan sebenarnya hasilnya sudah mewakili performa secara nyata atau belum. Terkadang, performance testing dan profiling memiliki hasil yang berbeda satu sama lain. Programmer tidak cukup hanya melakukan testing maupun profiling satu kali. Selain itu, karena saya baru mempelajarinya, saya masih sedikit kesulitan dalam membacara resultnya. Mungkin, dengan berjalannya waktu saya akan lebih terbiasa

  5. Dengan profiler, kita bisa mendapatkan keuntungan seperti analisis yang mendalam dari perilaku kode kita, kita bisa mengidentifikasi bottleneck, dan mendapatkan visualisasi yang jelas

  6. Dari banyaknya testing, kita dapat melihat kecenderungan data dari hasil testing tersebut. Oleh karena itu, saya melihat kecenderungan tersebut dalam menentukan apakah hasil yang saya dapatkan telah sesuai dengan yang saya inginkan.

  7. Pertama, saya menguji kode yang sudah ada. lalu, saya melihat pada profiler, bagian mana yang menjadi bottleneck dari kode saya. Lalu saya memperbaiki bagian yang paling berdampak terlebih dahulu. Setelah berhasil melakukan refactoring, saya kembali melakukan performance testing dan profiling untuk melihat apakah refactor saya berhasil. Terkait dengan fungsionalitas, ini berhubungan dengan materi sebelumnya pada mata kuliah ini, yaitu TDD. Setiap kali melakukan perubahan, sebaiknya dilakukan testing, apakah perilaku aplikasinya berubah atau tidak. Jika tidak berubah, dan performanya lebih baik, maka refaktorisasi dianggap berhasil
     
</details>
