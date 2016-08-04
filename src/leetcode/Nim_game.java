package leetcode;


/**
 * You are playing the following Nim Game with your friend: 
 * There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones.
 * The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
 * Both of you are very clever and have optimal strategies for the game. 
 * Write a function to determine whether you can win the game given the number of stones in the heap.
 * 
 * For example, if there are 4 stones in the heap, 
 * then you will never win the game: no matter 1, 2, or 3 stones you remove, 
 * the last stone will always be removed by your friend.
 *
 */

public class Nim_game {

	public static void main(String[] args) {

		System.out.println(canWin(5));
		
	}

	private static boolean canWin(int n) {

		//	if the number of stones can be divided by 4, then you definitely lose.
		//	because whenever you take 1, 2 or 3, your opponent can always take 3, 2 or 1 and take the last stone.
		//	but if the number can not be divided by 4, then you definitely win.
		//
		//	let the number be 5 for example, at the first time, you take 1 stone, and let the number of the left stones be divided by 4
		//	and next whenever your opponent take, you can always make the left stones be divided by 4,
		//	which means that you can take the last stone.
		return (n % 4 != 0);

	}

}
