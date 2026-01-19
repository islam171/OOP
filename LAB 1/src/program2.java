void main() {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    double diagonal = Math.sqrt(2) * a;
    int area = a*a;
    int perimeter = 4*a;

    System.out.printf("Area: %s\n", area);
    System.out.printf("Perimeter: %s\n", perimeter);
    System.out.printf("Diagonal: %s\n", diagonal);
}