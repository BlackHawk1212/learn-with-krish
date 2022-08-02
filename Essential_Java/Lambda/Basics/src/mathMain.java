public class mathMain {
    public static void main(String[] args){

        /*Math math = new Add();
        int add = math.calculate(10,20);

        math = new Sub();
        int sub = math.calculate(20,10);

        System.out.println(add);
        System.out.println(sub);

        Calculator cal = new Calculator();
        int sub1 = cal.perform(math, 200, 100);
        System.out.println(sub1);

        //Lambda Expression
        Math mathMul = (int a, int b) -> { return  a * b; };
        int mul = mathMul.calculate(20,10);
        System.out.println(mul);

        Math mathAdd = (int a, int b) -> { return a + b; };
        int add1 = mathAdd.calculate(200,200);
        System.out.println(add1);

        Math mathSub = (a, b) -> { return a - b; };
        int sub2 = mathSub.calculate(200,100);
        System.out.println(sub2);

        Math mathMul1 = (a, b) -> a * b;
        int mul1 = mathMul1.calculate(20,10);
        System.out.println(mul1);


        Math div = (a,b) -> a / b;
        int result = cal.perform(div, 10, 5);
        System.out.println(result);*/


        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 100; i++){
                    System.out.println("Run " + i);
                }
            }
        };

        Runnable r1 = () -> {
            for(int i = 1; i <= 100; i++){
                System.out.println("Run Lambda " + i);
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();
        for(int i = 1; i <= 100; i++){
            System.out.println("Main " + i);
        }

    }
}
