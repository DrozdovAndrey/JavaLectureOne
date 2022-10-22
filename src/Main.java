import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short age = 10;
        int salary = 123456;
        System.out.println(age);
        System.out.println(salary);
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e);
        System.out.println(pi);
        char ch = '1';
        System.out.println(Character.isDigit(ch));  // true
        ch = 'a';
        System.out.println(Character.isDigit(ch));  // false
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); //false
        String msg = "Hello world";
        System.out.println(msg);
        // Не явная типизация
        var a = 123;
        System.out.println(a);
        var d = 123.456;
        System.out.println(d);
        System.out.println(getType(a)); //Integer
        System.out.println(getType(d)); //Double
        d = 1022;
        System.out.println(d);
//        d = "mistake";
//        error: incompatible types:
//        String cannot be converted to double
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648
        // массивы
        int[] arr = new int[10];
        System.out.println(arr.length);  // 10
        arr = new int[] {1,2,3,4,5};
        System.out.println(arr.length);  // 10
        int[] arr1[] = new int[3][5];
        for (int[] line: arr1) {
            for (int item: line) {
                System.out.printf("%d", item);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("%d", arr1[i][j]);
            }
            System.out.println();
        }
        int i = 123; double dob = i;
        System.out.println(i); //123
        System.out.println(dob); //123.0
        dob = 3.1415; i = (int)dob;
        System.out.println(dob); //3.1415
        System.out.println(i); //3
        dob = 3.945; i = (int)dob;
        System.out.println(dob); //3.945
        System.out.println(i); //3
        byte b = Byte.parseByte("123");
        System.out.println(b);
//        byte b = Byte.parseByte("1234");
//        System.out.println(b);
        int[] a1 = new int[10];
//        double[] d1 = a;
        // Получение данных из терминала
        Scanner sc = new Scanner(System.in);
        System.out.printf("name: ");
        String name = sc.nextLine();
        System.out.printf("Hi, %s", name);
        System.out.println();
        System.out.println("Введите символ: ");
        char ch1 = sc.next().charAt(0);
        System.out.printf("Вы ввели символ: %c\n",ch1);
        System.out.printf("int a: ");
        int x1 = sc.nextInt();
        System.out.printf("double a: ");
        double y1 = sc.nextDouble();
        System.out.printf("%d + %f = %f", x1, y1, x1 + y1);
        System.out.println();

        //Проверка на соответствие получаемого типа
        System.out.printf("int a: ");
        boolean flag = sc.hasNextInt();
        System.out.println(flag);
        int i2 = sc.nextInt();
        System.out.println(i2);
        sc.close();

        //Форматированный вывод
        int a3 = 1, b3= 2;
        int c3 = a3 + b3;
        String res = a3 + " + " + b3 + " = " + c3;
        System.out.println(res);
        String res1 = String.format("%d + %d = %d \n", a3,b3,c3);
        System.out.printf("%d + %d = %d \n", a3,b3,c3);
        System.out.println(res1);
        float pip = 3.1415f;
        System.out.printf("%f\n", pip); // 3.141500
        System.out.printf("%.2f\n", pip); // 3.14
        System.out.printf("%.3f\n", pip); // 3.141
        System.out.printf("%e\n", pip); //3.141500e+00
        System.out.printf("%.2e\n", pip); // 3.14e+00
        System.out.printf("%.3e\n", pip); //3.141e+00
        // Область видимости переменной
//        {
//            int i4 = 123;
//            System.out.println(i);
//        }
//        System.out.println(i); // error: cannot find symbol
        // Функции и методы
        sayHi();
        System.out.println(sum(1,3));
        System.out.println(factor(3));
        // Управляющие конструкции
        int a4 = 1;
        int b4 = 2;
        int c4;
        if (a4>b4){
            c4=a4;
        }else {
            c4=b4;
        }
        System.out.println(c4);
        c4 = 0;
        if (a4>b4) c4=a4;
        if (b4>a4) c4=b4;
        System.out.println(c4);
        int min = a4<b4 ? a4 : b4;
        System.out.println(min);
        // оператор выбора
        int month = 1;
        String text1 = "";
        switch (month){
            case 1:
                text1 = "Autumn";
                break;
            default:
                text1 = "mistake";
        }
        System.out.println(text1);
        //Циклы
        //while
        int value = 321;
        int count = 0;
        while (value != 0){
            value/=10;
            count++;
        }
        System.out.println(count);
        //do while

        do {
            value/=10;
            count++;
        } while (value != 0);
        System.out.println(count);
        //for
        int s = 0;
        for (int j = 0; j <=10 ; j++) {
            s+=i;
        }
        System.out.println(s);

        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                System.out.println("* ");
            }
            System.out.println();
        }

        int arr2[] = new int[10];
        for (int item: arr2
             ) {
            System.out.printf("%d", item);
        }
        System.out.println();
        try (FileWriter fw = new FileWriter("file.txt", false)){
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }



    }
    static String getType(Object o){
        return  o.getClass().getSimpleName();
    }
    static void sayHi(){
        System.out.println("hi");
    }
    static int sum (int a, int b){
        return a+b;
    }
    static double factor(int n){
        if (n==1) return 1;
        return n*factor(n-1);
    }

}