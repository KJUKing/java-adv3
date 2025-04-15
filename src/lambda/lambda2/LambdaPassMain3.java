package lambda.lambda2;

import lambda.MyFunction;

public class LambdaPassMain3 {
    public static void main(String[] args) {

        /**
         * getOperation("add")가 호출됨
         *
         * switch문에서 "add"에 해당하는 람다식 (a, b) -> a + b를 MyFunction 타입으로 반환
         *
         * add.apply(1, 2)는 실제로 람다식을 실행하는 것
         * 👉 이 시점에서 람다 로직이 동작
         */

        MyFunction add = getOperation("add");
        System.out.println("add.apply(1, 2) =" + add.apply(1, 2));

        MyFunction sub = getOperation("sub");
        System.out.println("sub.apply(1, 2) =" + sub.apply(1, 2));

        MyFunction xxx = getOperation("xxx");
        System.out.println("xxx.apply(1, 2) =" + xxx.apply(1, 2));

    }

    static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0;
        }
    }
}
