public class OperatoryLogiczne {
    public static void main(String[] args) {

        boolean num1 = true;
        boolean num2 = false;
        boolean num3 = false;
        boolean num4 = true;

        // && - sprawdza wartość 1 i 2 wyrazenia. Zwróci true wtedy gdy 2 wyrazenia są równe true
        System.out.println(num1 && num4); //true
        System.out.println(num2 && num3); //false

        // || lub -> true gdy jedno wyrażenie jest równe true

        System.out.println(num1 || num2); //true
        System.out.println(num2 || num3); //false

        // ! negacja zwraca wartość przeciwną do wyrażenie przed, którym sie znajduje

        System.out.println(!num1); //false
        System.out.println(!num2); //true
        System.out.println(!num1 && num4); //false



    }
}
