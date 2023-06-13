# En Yakın Sayıları Bulma

Bu Java programı, kullanıcının girdiği bir sayıya en yakın büyük ve küçük sayıları bir diziden bulan ve sonuçları ekrana yazdıran bir programdır.

## Kurulum

- Java JDK'nın bilgisayarınıza yüklü olduğundan emin olun.
- Bu repo'yu klonlayın veya zip dosyası olarak indirin.

## Nasıl Çalıştırılır

- Bir Java derleyici veya entegre geliştirme ortamı (IDE) kullanarak projeyi açın.
- Main.java dosyasını bulun ve açın.
- Programı derleyin ve çalıştırın.

## Programın İşleyişi

- Bir int dizisi (array) tanımlanır ve örnek sayılarla başlangıç değerleri atanır.
- Kullanıcıdan bir sayı (number) girmesi istenir.
- İki yardımcı değişken (minTemp, minMaxTemp) en küçük farka sahip olan sayıyı ve (maxTemp, maxMinTemp) en büyük farka sahip olan sayıyı tutmak için kullanılır.
- Bir döngü kullanarak, dizi elemanlarıyla kullanıcının girdiği sayı arasındaki farklar hesaplanır.
- Eğer fark pozitif ve mevcut en büyük fark değerinden daha küçükse, yeni en büyük fark değeri (maxTemp) ve buna karşılık gelen sayı (maxMinTemp) güncellenir.
- Eğer fark negatif ve mevcut en küçük fark değerinden daha büyükse, yeni en küçük fark değeri (minTemp) ve buna karşılık gelen sayı (minMaxTemp) güncellenir.
- Döngü tamamlandığında, en yakın küçük sayı (minMaxTemp) ve en yakın büyük sayı (maxMinTemp) ekrana yazdırılır.

Bu program, bir dizideki elemanlardan kullanıcının girdiği bir sayıya en yakın büyük ve küçük sayıları bulan ve sonuçları ekrana yazdıran bir programdır.

Umarım bu bilgi size yardımcı olur. İyi çalışmalar!

# Finding Closest Numbers

This Java program finds the closest greater and smaller numbers to a user-input number in an array and prints the results on the screen.

## Installation

- Ensure that Java JDK is installed on your computer.
- Clone this repository or download it as a ZIP file.

## How to Run

- Open the project using a Java compiler or an integrated development environment (IDE).
- Locate the Main.java file and open it.
- Compile and run the program.

## Program Workflow

- An int array named array is defined and initialized with sample numbers.
- The user is prompted to enter a number (number).
- Two helper variables (minTemp, minMaxTemp) are used to store the number with the smallest difference and (maxTemp, maxMinTemp) are used to store the number with the largest difference.
- A loop is used to calculate the differences between the array elements and the user-input number.
- If the difference is positive and smaller than the current largest difference value, the largest difference value (maxTemp) and the corresponding number (maxMinTemp) are updated.
- If the difference is negative and greater than the current smallest difference value, the smallest difference value (minTemp) and the corresponding number (minMaxTemp) are updated.
- Once the loop is completed, the closest smaller number (minMaxTemp) and the closest greater number (maxMinTemp) are printed on the screen.

This program finds the closest greater and smaller numbers to a user-input number in an array and prints the results on the screen.

I hope this information helps you. Happy coding!
