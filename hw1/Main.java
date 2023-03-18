package hw1;

import java.util.*;

public class Main {
    public static int calTotalScore(ArrayList<Round> rounds) {
        int total = 0;
        for (int i = 0; i < rounds.size(); i++) {
            Round curRound = rounds.get(i);
            total += curRound.sum;
            // spare bonus
            if (curRound.isSpare && i != 9) {
                total += (rounds.get(i + 1)).ball_1;
            }

            // strike bonus
            if (curRound.isStrike && i != 9) {
                if ((rounds.get(i + 1)).isStrike) {
                    if (i != 8) {
                        total += 10;
                        total += (rounds.get(i + 2)).ball_1;
                    } else {
                        total += 10;
                        total += (rounds.get(i + 1).ball_2);
                    }
                } else
                    total = (rounds.get(i + 1)).ball_1 + (rounds.get(i + 1)).ball_2 + total;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // make list
        ArrayList<Round> rounds = new ArrayList<Round>();
        for (int i = 0; i < 10; i++) {
            String line = sc.nextLine();
            String[] nums = line.split(" ");
            Round round = new Round();
            switch (nums.length) {
                case 1:
                    round.setScore(Integer.valueOf(nums[0]));
                    break;
                case 2:
                    round.setScore(Integer.valueOf(nums[0]), Integer.valueOf(nums[1]));
                    break;
                case 3:
                    round.setScore(Integer.valueOf(nums[0]), Integer.valueOf(nums[1]), Integer.valueOf(nums[2]));
            }
            rounds.add(round);
        }
        sc.close();

        int total = calTotalScore(rounds);
        System.out.println(total);

    }
}
