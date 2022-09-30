import java.util.ArrayList;
import java.util.Scanner;


// Completed
public class EightQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // test rows and then columns
        // save diagonals for later (maybe they are harder)

        // loop through the board
        // each * we make a new queen
        // what do we want to remember about each queen?
        // where we found it

//        *.......
//        ..*.*...
//        ....*...
//        ......*.
//        .*......
//        .......*
//        .....*..
//        ........

        // array list is an array that can grow and we don't need a starting size
        ArrayList<Queen> list = new ArrayList<>();

        // loop through each square on the chess board
        for (int r = 0; r < 8; r++) {
            char[] row = sc.nextLine().toCharArray();
            for (int c = 0; c < 8; c++) {
                // how do i know if i,j has a queen in it or not?
                if (row[c] == '*') {
                    // if the current character is a *, then make a queen and add it to the list
//                    Queen q = new Queen(r,c); instead of doing this we can directly add them to the list
                    list.add(new Queen(r, c));
                }
            }
        }
//        System.out.println(list);
        // we have a list of queens,
        // how to use them to solve the problem
        // how to compare every possible queen to each other
        // use a nested for loop

        // more efficient


        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                // 8*7 - 56 possibilities of queens
                Queen q = list.get(i);
                Queen o = list.get(j); // this is the other queen
                // check if q attacks o - if yes, then-
                // not a valid solution

                // if any pair of queens share the same row or column, its invalid
                // when they are diagonal - the difference between the rows and the columns are equal
                // col-row -> gives one of our diagonal numbers \
                // the other diagonal is /  -- 5,0
                //                          -- 4,1
                //                          -- 3,2
                //                          -- 2,3
                //                          -- 1,4
                // the sum of the rows and the columns is equal
                // the diagonals are either col+row or col-row


                // this is an instance method - which belongs to a specific member of the class
                // requires a queen
                if (q.attacking(o)) {
                    System.out.println("invalid");
                    return;
                }


                if (q.row == o.row || q.col == o.col
                        || q.col - q.row == o.col - o.row
                        || q.col + q.row == o.col + o.row) {
                    System.out.println("invalid");
                    return;
                }

            }
        }
        // no queen attacks another
        if (list.size() == 8) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }


    }
    // we've created a data type named queen
    // it can hold two integers - a row and a column

    // the ordering is by convention - your code can run by a different order
    // class Name{
    // data member (row, col)
    // constructors() methods that builds queens for you
    // methods()
    // }
}

class Queen{
    int row;
    int col;
    //make a constructor - which is a method to build a queen
    public Queen(int row, int col){

        // the attacking method is part of the queen class as it is an instance method
        // this.row and row are 2 different variables
        // if the row that is passed in is not remembered then it is just discarded
        this.row = row; // this - it is a key word which refers to the current instance of the class
        this.col = col;

        // this.row belongs to a queen whereas row is the value that is passed in

    }

    // toString tells java how to convert our class into a string


    // We are inside a queen.
    // This code runs from the context of an existing queen
    boolean attacking(Queen o){
        // we are guarenteed to be inside of a queen with a row and col

        //As we saw the queen above called q - it is not called q anymore, it is called this.
        // this queen is the queen whose data members we gain implicit access to

        return row == o.row || col == o.col
                || col - row == o.col - o.row
                || col + row == o.col + o.row;

    }

    @Override
    public String toString() {
        return "Queen{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }
}
