public class variableExample {
    public static void main(String[] args) {
        //변수 선언
        int value = 10;
        int result = value + 30;

        System.out.println(result);

        //바이트와 인트의 차이
        //최대값 넘어가면 최소값부터 다시 시작함
        byte var1 = 125;
        int var2 = 125;

        for (int i = 0; i <5; i++) {
            var1++;
            var2++;

            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
        }

        //유니코드 확인
        char c = 'A';
        int uniCode = c;

        System.out.println(uniCode);

        //char 타입 변수
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //강제형변환 시 데이터 손실이 일어나지 않게 유효성 검사
        int i = 128;

        if((i < Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
            System.out.println("byte 타입으로 변환할 수 없습니다.");
            System.out.println("값을 다시 확인해 주세요.");
        } else {
            byte b = (byte) i;
            System.out.println(b);
        }

    }
}
