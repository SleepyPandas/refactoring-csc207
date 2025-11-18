package theater;

/**
 * Represents a play in the theater, with a name and type.heatrical play.
 *
 * <p>Contains the human-readable name of the play and its type (e.g. "tragedy",
 * "comedy", etc.). Fields are public for direct access in this small example.
 * In larger designs prefer private fields with getters/setters.</p>
 */

public class Play {

    /**
     * The title or name of the play.
     */
    private final String name;

    /**
     * The genre or type of the play (for example, "tragedy" or "comedy").
     */
    private final String type;

    /**
     * Create a Play with the given name and type.
     *
     * @param name the title of the play
     * @param type the genre/type of the play
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
