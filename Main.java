import java.util.Scanner; 

public class Main {

    public static int check(Scanner scanner, int min, int max) {
        while (true) {
        System.out.print("Введите число (" + min + "-" + max + "): ");
        
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            if (choice >= min && choice <= max) {
                return choice; // возвращаем корректное число
            } else {
                System.out.println("Ошибка! Число должно быть от " + min + " до " + max + ".");
            }
        } else {
            System.out.println("Ошибка! Это не число. Введите цифру " + min + "-" + max + ".");
            scanner.next(); // «съедаем» букву
        }
    }
}

    public static void Menu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== (^-^) Какое задание вы бы хотели посмотреть? (^-^) =====");
        System.out.println(" 1 - № 1\n 2 - № 2\n 3 - № 3\n 4 - № 4");
        System.out.print("Введите число: ");
        int choice = check(scanner, 1, 4);
        int choice2;

        switch(choice){
            case 1: 
                System.out.println("Выберите задание:\n 1 - № 3\n 2 - № 4\n 3 - № 8\n 4 - № 9\n 5 - № 10");
                System.out.print("Введите число: ");
                choice2 = check(scanner, 1, 5);
                switch(choice2){
                    case 1: 
                    int x;
                    
                    


                        


                }
                break;
            case 2:
                System.out.println("Выберите задание:\n 1 - № 2\n 2 - № 5\n 3 - № 6\n 4 - № 7\n 5 - № 10");
                break;
            case 3:
                System.out.println("Выберите задание:\n 1 - № 1\n 2 - № 4\n 3 - № 6\n 4 - № 7\n 5 - № 9");
                break;
            case 4:
                System.out.println("Выберите задание:\n 1 - № 1\n 2 - № 2\n 3 - № 5\n 4 - № 8\n 5 - № 10");
                break;
            default: 
                System.out.println("Ошибка!! Введите цифру 1-4!");
                break;
        }


    }

    // ============================ 1 задание ============================
    public static void forCharToNum(Scanner scanner) {
        System.out.print("Введите цифру (0-9): ");
        char x = scanner.next().charAt(0);
        scanner.close();

        int result = charToNum(x);
        System.out.println("Результат: " + result);
    }

     public static int charToNum(Scanner scanner, char x){
        return x - '0'; 
    }

    public static boolean isPositive (int x){
        return x>0;
    }

    public static boolean isDivisor (int a, int b){
        if (a == 0 && b == 0) return false;
        return a%b == 0 || b%a==0;
    }

    public static boolean isEqual(int a, int b, int c){
        return a==b && b == c;
    }

     public static int lastNumSum(int a, int b){
        int sum = a % 10 + b % 10;
        System.out.println(a + " + " + b + " = " + sum);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<3; i++){
            System.out.print("Введите число: ");
            b = scanner.nextInt();
            a = sum;
            sum = a % 10 + b % 10;
            System.out.println(a + " + " + b + " = " + sum);
        }

        return sum;
     }


// ============================ 2 задание ============================
 public static double safeDiv (int x, int y){
    if (x == 0 || y == 0) return 0;
    return x/y; 
 }

 public static int max3(int x, int y, int z){
    if (x>y && x>z) return x;
    if (y>z && y>x) return y;
    return z;
 }

  public static boolean sum3(int x, int y, int z){
    return x+y == z || x+z == y || y+z==x;

  }

  public static int sum2(int x, int y){
    int i = 20;

    if ( x+y>9 && x+y<20) return i;
    else return x+y;
  }

  public static void printDays(String x){
    switch(x){
        case "Понедельник": System.out.println("Понедельник\nВторник\nСреда\nЧетверг\nПятница\nСуббота\nВоскресенье"); 
            break;
        case "Вторник": System.out.println("Вторник\nЧетверг\nПятница\nСуббота\nВоскресенье"); 
            break;
        case "Среда": System.out.println("Среда\nПятница\nСуббота\nВоскресенье"); 
            break;
        case "Четверг": System.out.println("Четверг\nПятница\nСуббота\nВоскресенье"); 
            break;
        case "Пятница": System.out.println("Пятница\nСуббота\nВоскресенье"); 
            break;
        case "Суббота": System.out.println("Суббота\nВоскресенье"); 
            break;
        case "Воскресенье": System.out.println("Воскресенье"); 
            break;
        default: System.out.println("А нет такого дня недели!!! :(");
    }

  }


  // ============================ 3 задание ============================
    public static String listNums(int x){
        if (x<0) System.out.println("Ошибка!! Числа начинаются с 0! :((("); 

        String res = "";
        for (int i=0; i<x+1; i++){
            res += i + " ";
        }
        return res;
    }

    public static int pow(int x, int y){
        int n = x;
        for (int i=1; i<y; i++){
            x *=n;
        }
        return x;
    }

    public static boolean equalNum(int x){
        int y = x%10;
        x /= 10;
        while (x!=0){
            if(y != x%10) return false;
            x/=10;
        }
        return true;
    }

    public static void square(int x){
            for (int i=0; i<x; i++){
                for (int j = 0;j<x; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }

    public static void rightTriangle(int x){
        for (int i=0; i<x; i++){
                for (int j = x; j>i+1; j--){
                    System.out.print(" ");
                }

                for (int w = i+1;w>0; w--){
                    System.out.print("*");
                }

                System.out.println();
            }
    }

     // ============================ 4 задание ============================

     public static int findFirst(int[] arr, int x){
        for (int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        System.out.println("Такого числа в массиве нет :(");
        return -1;
     }

     public static int findLast(int[] arr, int x){
        int n = 0;
            for (int i=0; i<arr.length; i++){
                if(arr[i] == x){
                n = i;
                }
            }
            if (n>0) return n;
            else {
                System.out.println("Такого числа в массиве нет :(");
                return -1;
            }
    }

    public static int[] add(int[] arr, int[] ins, int pos){
        int[] res = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            res[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            res[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            res[i + ins.length] = arr[i];
        }

        return res;
    }

     public static int[] concat(int[] arr1,int[] arr2){
        int[] res = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length ; i++) {
            res[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            res[i + arr1.length] = arr2[i];
        }

        return res;
    }

     public static int[] deleteNegative(int[] arr){
        int n = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>0) n++;
        }

        int[] res = new int[n];
        n = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>0){
                res[n] = arr[i];
                n++;
            }
        }

        return res;
     }


	public static void main(String[] args) {
        int[] arr = {-100, 20, 1, -2, 3, -4, 7, 4};
        int[] arr2 = {5, 9, 8};
        int[] result = deleteNegative(arr);
        //System.out.println(Arrays.toString(result));
        Menu();
	}

}