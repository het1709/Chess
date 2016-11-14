package Pieces;

import Board.Tile;

public abstract class Piece {
    private Tile tile;
    private boolean inPlay;

    /**
     * Constructor for the Piece class
     * @param tile Tile the Piece starts on
     */
    Piece(Tile tile) {
        this.tile = tile;
        this.inPlay = true;
    }

    /**
     * Accessor function for the `tile` variable
     * @return Tile the piece occupies
     */
    public Tile getTile() {
        return tile;
    }

    /**
     * Accessor function for the `inPlay` variable
     * @return Whether the piece is in play or not, i.e., whether it's "dead" or not
     */
    public boolean isInPlay() {
        return inPlay;
    }

    /**
     * Mutator function for the `tile` variable
     * @param tile New tile the piece should occupy
     */
    public void setTile(Tile tile) {
        this.tile = tile;
    }

    /**
     * Mutator function for the
     * @param inPlay Whether the piece is in play
     */
    public void setPlay(boolean inPlay) {
        this.inPlay = inPlay;
    }

    public abstract boolean isMoveValid(Tile endTile);

    public abstract void showPossibleMoves();
}

