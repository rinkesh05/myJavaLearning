public class ChessMoveValidator {
    public static void main(String[] args) {
        int startX = 4;
        int startY = 4;
        int endX = 6;
        int endY = 5;
        String pieceType = "Knight";

        if (startX >= 1 && startX <= 8 && startY >= 1 && startY <= 8 && endX >= 1 && endX <= 8 && endY >= 1 && endY <= 8) {
            if (pieceType.equals("Rook")) {
                if (startX == endX || startY == endY) {
                    System.out.println("Move Allowed: Rook moves in straight lines.");
                } else {
                    System.out.println("Move Denied: Rook cannot move diagonally.");
                }
            } else if (pieceType.equals("Knight")) {
                int dx = Math.abs(startX - endX);
                int dy = Math.abs(startY - endY);
                if ((dx == 1 && dy == 2) || (dx == 2 && dy == 1)) {
                    System.out.println("Move Allowed: Valid L-shaped Knight movement.");
                } else {
                    System.out.println("Move Denied: Invalid path for Knight.");
                }
            } else {
                System.out.println("Error: Rule set for this piece is not configured.");
            }
        } else {
            System.out.println("Error: Position coordinates are out of the 8x8 board boundaries.");
        }
    }
}
