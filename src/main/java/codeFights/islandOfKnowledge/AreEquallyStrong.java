package codeFights.islandOfKnowledge;

public class AreEquallyStrong {
    public static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        int youSum = yourLeft + yourRight;
        int friendSum = friendsLeft + friendsRight;

        if (youSum != friendSum){
            return false;
        } else if (youSum == friendSum && pairEqual(yourLeft, yourRight, friendsLeft, friendsRight)){
            return true;
        }
        return false;
    }

    private static boolean pairEqual(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        if ((yourLeft == friendsLeft && yourRight == friendsRight) || (yourLeft == friendsRight && yourRight == friendsLeft)){
            return true;
        }
        return false;
    }
}
