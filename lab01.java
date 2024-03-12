public class lab01 {
    
    public static void main(String[] args){
        int x = sum(2, 2);
        System.out.println(x);
        arrayResults();
        //palindrom("Zupa");
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
    static int array(){
        int avg = 0;
        int total = 0;
    int [] arr = {5, 6, 3, 4, 5, 6, 7};
    for (int i = 0; i < arr.length; i++){
        total += arr[i];
        avg = total / arr.length; 
    }

    // 3. Sprawdzenie czy liczba jest parzysta
    if(avg % 2 == 0){
        System.out.println("Is even");
    }else{
        System.out.println("Is odd");
    }
    return avg;
}
    // 4. Obliczanie BMI
    static double bmi(double a, double b){
        double bmi = a / Math.pow(b, 2);
        return bmi;
}
    // 5. Średnia oraz określenie oceny
    static void arrayResults(){
        int avg = 20;
        int total = 0;
        int [] arr = {50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
    for (int i = 0; i < arr.length; i++){
        total += arr[i];
        avg = total / arr.length;   
    }

    if(avg >= 80){
        System.out.println("You got A, Congrats!!!");
    }else if(avg < 80 && avg >= 60){
        System.out.println("You got B, good job");
    }else if(avg < 60 && avg >= 40){
        System.out.println("You got C");
    }else if(avg < 40 && avg >= 20){
        System.out.println("You got D, you are in danger");
    }else if(avg < 20 && avg >= 0){
        System.out.println("You got E, SEE YOU NEXT YEAR");
    }else{
        System.out.println("<No exam OR still checking...>");
    }

    }

   /* static void palindrom(String word){
        char [] charArray = word.toCharArray();
        char [] newArray = {};
        String newWord = newArray.toString();
        for (int i = 0; i <= charArray.length; i++){
            newArray.add(charArray[2]);
        }
        System.out.println(charArray[0]);
            
        }
        if(word == newWord){
            System.out.println("Word is palindrom.");
        }else{
            System.out.println("Word is no palindrom.");
        }*/
}


