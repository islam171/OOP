void main() {

    Scanner input = new Scanner(System.in);
    String name = input.next();

    String space = String.valueOf('-').repeat(name.length());
    System.out.printf("+%s+\n", space);
    System.out.printf("|%s|\n", name);
    System.out.printf("+%s+\n", space);
}
