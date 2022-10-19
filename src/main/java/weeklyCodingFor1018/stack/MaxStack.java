package weeklyCodingFor1018.stack;

public class MaxStack {

    public static void main(String[] args) {

        StackImpl s = new StackImpl();

        s.push(8);
        s.push(7);
        s.push(9);
        s.push(4);

        System.out.println(s.getMax());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.getMax());
    }
}
