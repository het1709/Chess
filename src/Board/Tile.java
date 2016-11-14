package Board;

import Pieces.Piece;

public class Tile {
    private int tileCoordinates;
    private Piece pieceOnTile;

    /**
     * Constructor for the tile
     * @param tileCoordinates A number between 0 - 63 (one for each square)
     * @param pieceOnTile Piece occupying the tile, if any
     */
    Tile(int tileCoordinates, Piece pieceOnTile) {
        this.tileCoordinates = tileCoordinates;
        this.pieceOnTile = pieceOnTile;
    }

    /**
     * Accessor function to return the piece occupying the tile
     * @return Piece occupying the tile
     */
    public Piece getPiece() {
        return pieceOnTile;
    }

    /**
     * Accessor function to check if the Board.Tile is empty
     * @return Whether the Board.Tile is empty or not
     */
    public boolean isEmpty() {
        return (pieceOnTile == null);
    }
}
