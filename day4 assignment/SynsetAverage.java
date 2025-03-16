class SynsetAverage {
    public static void main(String[] args) {
        int April = 12;
        int May = 14;
        int June = 8;

        double average = (April + May + June) / 3.0;

        System.out.println("Synsets Entered for April: " + April);
        System.out.println("Synsets Entered for May: " + May);
        System.out.println("Synsets Entered for June: " + June);
        System.out.printf("Average Synset Entered: %.6f%n", average);
    }
}