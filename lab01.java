import java.util.ArrayList;

public class lab01 {
    
    public static void main(String[] args){
        System.out.println(sum(5, 5));          //1.
        System.out.println(average());              //2.
        System.out.println(evenOrOdd(4));        //3.
        System.out.println(bmi(100, 180));    //4.
        System.out.println(arrayResults());         //5.
        System.out.println(isPalindrome("oko"));  //6.
        System.out.println(findNumber(10));      //1.1
        System.out.println(findPrimes());           //1.2
        System.out.println(countNumber(5));      //1.3
        System.out.println(sumNumbers(20));      //1.4
    }

    // 1. Dodawania, Odejmowania, Mnożenia oraz Dzielenia
    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    static int multipli(int a, int b){
        int sum = a * b;
        return sum;
    }
    static int subtract(int a, int b){
        int sum = a - b;
        return sum;
    }
    static int devide(int a, int b){
        int sum = a / b;
        return sum;
    }

    // 2. Obliczanie średniej
    static int average(){
        int arr[] = {2, 5, 5, 6, 7, 7, 7};
        int avg = 0;
        int total = 0;
    for (int i = 0; i < arr.length; i++){
        total += arr[i];
        avg = total / arr.length; 
        }
        return avg;
    }   

    // 3. Sprawdzenie czy liczba jest parzysta
    static String evenOrOdd(int nr){
    if(nr % 2 == 0){
        return "Is even";
    }else{
        return "Is odd";
    }
    }
    // 4. Obliczanie BMI
    static double bmi(double kg, double cm){
        double bmi = kg / (Math.pow(cm, 2) / 10000);
        return bmi;
    }
    // 5. Średnia oraz określenie oceny
    static String arrayResults(){
        int avg = 0;
        int total = 0;
        int arr[] = {50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
        for (int i = 0; i < arr.length; i++){
        total += arr[i];
        avg = total / arr.length;   
        }

        if(avg >= 80){
            return "You got A, Congrats!!!";
        }else if(avg < 80 && avg >= 60){
            return "You got B, good job";
        }else if(avg < 60 && avg >= 40){
            return "You got C";
        }else if(avg < 40 && avg >= 20){
            return "You got D, you are in danger";
        }else if(avg < 20 && avg >= 0){
            return "You got E, SEE YOU NEXT YEAR";
        }else{
            return "<No exam OR still checking...>";
        }

    }

    // 6. Sprawdza czy palindromen
    static boolean isPalindrome(String s){
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() -1 -i)){
                return false;
            }
        }
        return true;
    }

    // 1.1 Przyjmuje tablice i liczbę do znalezienia
    static String findNumber(int nr) {
        int a[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == nr) {
                return "Found: " + a[i];
            }
        }
        return "Not found";
    }

    // 1.2 Przyjmuje zakres liczb i zwraca tablice licz pierwszych
    static boolean isPrime(int nr) {
        if (nr < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(nr); i++) {
            if (nr % i == 0)
                return false;
        }
        return true;
    }

    static ArrayList<Integer> findPrimes() {
        int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                primeNumbers.add(arr[i]);
            }
        }
        return primeNumbers;
    }
    
            
    // 1.3 Przyjmuje tablice i liczbę, następnie zlicza liczbe ile razy występuje w tablicy
    static int countNumber(int nr) {
        int arr[] = {1, 2, 4, 5, 5, 5, 6, 7, 7, 6};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(nr == arr[i]){
                sum++;
            }
        }
        return sum;
    }

    
    // 1.4 Funkcja rekrutacyjna
    static int sumNumbers(int nr) {
        int sum = 0;
        for(int i = 0; i <= nr; i++) {
            sum = sum + i;
        }
        return sum;
        
    }
    
}


