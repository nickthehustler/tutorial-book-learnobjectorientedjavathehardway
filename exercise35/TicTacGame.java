import java.util.Scanner;

public class TicTacGame {
  public static void main( String[] args){
    TicTacBoard board = new TicTacBoard();
    Scanner kb = new Scanner(System.in);
    int r, c;
    boolean skip = false;

    do {
      if(board.almostOver()){
        // Copy current board to futureBoard
        TicTacBoard futureBoard = new TicTacBoard();
        int futureColumn = 3;
        int futureRow = 3;
        for(int i = 0; i < 3; i++){
          for(int j = 0; j < 3; j++){
            if(!board.canAdd(i,j)){
              futureBoard.add(board.get(i,j),i,j);
            }
            else{
              futureRow = i;
              futureColumn = j;
            }
          }
        }

        // Create GamePiece futureX
        GamePiece futureX = new GamePiece(futureRow, futureColumn, "X");

        // Add GamePiece futureX to futureBoard
        futureX.addSelfToBoard(futureBoard);

        // Check if a Win has occurred
        if(!futureBoard.isWinner("X") && !futureBoard.isWinner("O")) {
          skip = true;
          board = futureBoard;
        }
        else {
          futureBoard.decrementTurns();
        }
      }

      if(!skip){
        System.out.println("\n" + board);
        System.out.print("'"+ board.currentPlayer() + "', your turn: ");
        r = kb.nextInt();
        c = kb.nextInt();
        if(!board.canAdd(r,c)){
          System.out.println("\nSorry, you can't go there. Try again.");
          continue;
        }
        TicTacPiece XO = new TicTacPiece(r,c);
        XO.addSelfToBoard(board);
      }
    } while(!board.isOver());

    System.out.println("\n" + board);

    if(board.isWinner("X"))
      System.out.println("X wins!");
    else if(board.isWinner("O"))
      System.out.println("O wins!");
    else
      System.out.println("It's a tie!");
  }
}
