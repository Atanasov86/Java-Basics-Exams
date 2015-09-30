import java.util.Scanner;

public class StraightFlush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputCardLine = scanner.nextLine();
        String[] inputCards = inputCardLine.split("[,\\s]+");
        boolean isExistStraightFlush = false;
        for (int card1 = 0; card1 < inputCards.length; card1++) {
            for (int card2 = card1 + 1; card2 < inputCards.length; card2++) {
                for (int card3 = card2 + 1; card3 < inputCards.length; card3++) {
                    for (int card4 = card3 + 1; card4 < inputCards.length; card4++) {
                        for (int card5 = card4 + 1; card5 < inputCards.length; card5++) {
                            int card1Faces = getCardValue(inputCards[card1]);
                            String card1Suit = getCardSuit(inputCards[card1]);

                            int card2Faces = getCardValue(inputCards[card2]);;
                            String card2Suit = getCardSuit(inputCards[card2]);

                            int card3Faces = getCardValue(inputCards[card3]);;
                            String card3Suit = getCardSuit(inputCards[card3]);

                            int card4Faces = getCardValue(inputCards[card4]);
                            String card4Suit = getCardSuit(inputCards[card4]);

                            int card5Faces = getCardValue(inputCards[card5]);
                            String card5Suit = getCardSuit(inputCards[card5]);
                            boolean isStraightFlush =
                                    ((card2Faces == card1Faces + 1) && (card1Suit.equals(card2Suit))) &&
                                            ((card3Faces == card2Faces + 1) && (card2Suit.equals(card3Suit))) &&
                                            ((card4Faces == card3Faces + 1) && (card3Suit.equals(card4Suit))) &&
                                            ((card5Faces == card4Faces + 1) && (card4Suit.equals(card5Suit)));
                            if (isStraightFlush){
                                String straightFlush = String.format("[%s, %s, %s, %s, %s]",
                                        inputCards[card1],
                                        inputCards[card2],
                                        inputCards[card3],
                                        inputCards[card4],
                                        inputCards[card5]);
                                isExistStraightFlush = true;
                                System.out.println(straightFlush);
                            }
                        }
                    }
                }
            }
        }

        if (!isExistStraightFlush){
            System.out.println("No Straight Flushes");
        }
    }

    private static String getCardSuit (String card){
        if (card.endsWith("D")){
            return "D";
        } else if (card.endsWith("S")){
            return "S";
        } else if (card.endsWith("H")){
            return "H";
        } else {
            return "C";
        }
    }

    private static int getCardValue(String card){
        switch (card.substring(0,1)){
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "1":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default: return 0;
        }
    }

}
