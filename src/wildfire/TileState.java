package wildfire;

/**
 * Every cell in the grid can be one of these four states.
 *
 *   GRASS    - open land, cannot catch fire
 *   FOREST   - tree, CAN catch fire
 *   BURNING  - currently on fire (counts down burnTicks)
 *   BURNED   - burned out / ash, fire is done here
 *   enum is like a list
 */
public enum TileState {
    GRASS,
    FOREST,
    BURNING,
    BURNED
}
