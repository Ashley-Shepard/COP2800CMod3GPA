// PalmerPenguinsM3.java
// Ashley Shepard
// 05.30.2026
// Program to calculate and display Palmer Penguin statistics

public class PalmerPenguinsM3 {
    
    // constants to represent the species and count
    static final String SP_CHINSTRAP = "Chinstrap";
    static final String SP_GENTOO = "Gentoo";
    static final String SP_ADELIE = "Adelie";
    
    static final int NUM_CHINSTRAP = 68;
    static final int NUM_GENTOO = 123;
    static final int NUM_ADELIE = 151;
    static final int TOTAL_SPECIES = 3;
    
    public static void main(String[] args) {
    
        // calculate total penguins
        int totalPenguins = NUM_CHINSTRAP + NUM_GENTOO + NUM_ADELIE;
        
        // output the species names with introductory text
        System.out.println("Introducing the Palmer Penguins: ");
        System.out.println("\t" + SP_CHINSTRAP + "!");
        System.out.println("\t" + SP_GENTOO + "!");
        System.out.println("and last but not least... ");
        System.out.println("\t" + SP_ADELIE + "!");
        
        System.out.println("There are a total of " + TOTAL_SPECIES +
                            " penguin species in this dataset.");
        System.out.println("There are a total of " + totalPenguins +
                            " penguins in this dataset.");

        // output with percentages
        System.out.printf("%s: %d (%.2f%%)\n", SP_CHINSTRAP, 
            NUM_CHINSTRAP, 
            ((double) NUM_CHINSTRAP / totalPenguins * 100));
            
        System.out.printf("%s: %d (%.2f%%)\n", SP_GENTOO, 
            NUM_GENTOO, 
            ((double) NUM_GENTOO / totalPenguins * 100));
            
        System.out.printf("%s: %d (%.2f%%)\n", SP_ADELIE, 
            NUM_ADELIE, 
            ((double) NUM_ADELIE / totalPenguins * 100));

        System.out.println(); // Blank line separation

        // --- Branching Analysis Section ---
        System.out.println("Branching Analysis:");
        
        // Determine the single most populous species
        if (NUM_CHINSTRAP > NUM_GENTOO && NUM_CHINSTRAP > NUM_ADELIE) {
            System.out.println(SP_CHINSTRAP + 
                               " penguins are the most populous.");
        } 
        else if (NUM_GENTOO > NUM_CHINSTRAP && NUM_GENTOO > NUM_ADELIE) {
            System.out.println(SP_GENTOO + 
                               " penguins are the most populous.");
        } 
        else if (NUM_ADELIE > NUM_CHINSTRAP && NUM_ADELIE > NUM_GENTOO) {
            System.out.println(SP_ADELIE + 
                               " penguins are the most populous.");
        } 
        else {
            // Unconditional else handles all tie scenarios
            System.out.println("There is a tie between species " +
                               "for the most populous.");
        }

        System.out.println(); // Blank line separation

        // --- Switch Statement Analysis Section ---
        System.out.println("Switch Statement Analysis:");
        
        String chosenSpecies = SP_GENTOO; // Change here to test others
        double pct = 0.0;

        switch (chosenSpecies) {
            case SP_CHINSTRAP:
                pct = ((double) NUM_CHINSTRAP / totalPenguins) * 100;
                System.out.printf("%s: %d (%.2f%%)\n", SP_CHINSTRAP, 
                                  NUM_CHINSTRAP, pct);
                break;

            case SP_GENTOO:
                pct = ((double) NUM_GENTOO / totalPenguins) * 100;
                System.out.printf("%s: %d (%.2f%%)\n", SP_GENTOO, 
                                  NUM_GENTOO, pct);
                break;

            case SP_ADELIE:
                pct = ((double) NUM_ADELIE / totalPenguins) * 100;
                System.out.printf("%s: %d (%.2f%%)\n", SP_ADELIE, 
                                  NUM_ADELIE, pct);
                break;

            default:
                System.out.println("Species not recognized.");
                break;
        }
    }
}