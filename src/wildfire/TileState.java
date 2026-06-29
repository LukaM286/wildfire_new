package wildfire;

/**
 * Every cell in the grid can be one of these four states.
 *
 *   GRASS    - cannot catch fire
 *   FOREST   - tree,  catch fire
 *   BURNING  - currently on fire (counts down burnTicks)
 *   BURNED   - burned out / ash, fire is done
 *   enum is like a list
 */
public enum TileState {
    GRASS,
    FOREST,
    BURNING,
    BURNED
}
