public class App {
    public static void main(String[] args) {
        ArrayQueue<Character> customQueue = new ArrayQueue<>();
        customQueue.print();
        customQueue.offer('A');
        customQueue.offer('B');
        customQueue.poll();
        customQueue.print();
        customQueue.offer('C');
        customQueue.offer('D');
        customQueue.offer('E');
        customQueue.offer('F');
        System.out.println("-------------------------");
        customQueue.print();
        System.out.println("El primero en la fila es: "+ customQueue.peek());
        customQueue.offer('s');
        customQueue.offer('g');
        customQueue.print();
    }
}