import java.io.*;

class AItinerary {
    public static void main(String[] args) {
        System.out.println("Plan Your Trip");

        String numberOfPplStr = lireClavier("How many are you ? (in numerics) ");
        int numberOfPpl = Integer.parseInt(numberOfPplStr);

        String noun = "is ";
        if (numberOfPpl > 1) {
            noun = "are ";
        }

        boolean answer = question("Are you hungry ? ");
        String cuisine = "";
        String hunger = "not ";
        String ifCuisine = "";

        if (answer) {
            cuisine = lireClavier("What kind of cuisine ? (ex: Japanese) ");
            hunger = "";
            ifCuisine = "and want to eat " + cuisine + " ";
        }

        String timePeriod = lireClavier("From what time to what time are you available ? (# pm/am to # pm/am) ");
        String budget = lireClavier("How much do you want to spend ? (in euros) ");
        String reason = lireClavier("Tourism or leisure (or both) ? (tourism/leisure/both) ");

        System.out.println(
            "Generating a plan for " + numberOfPpl + " that " + noun + hunger + "hungry " +
            ifCuisine + "from " + timePeriod + " and have a " + budget + " euros budget for " + reason + "..."
        );
    }

    static String lireClavier(String message) {
        try {
            System.out.print(message);
            BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
            return clavier.readLine();
        } catch (Exception e) {
            return "erreur dans fonction lireClavier";
        }
    }

    static boolean question(String message) {
        String answer = lireClavier(message + " (yes/no) : ");
        return answer.equalsIgnoreCase("yes");
    }
}

