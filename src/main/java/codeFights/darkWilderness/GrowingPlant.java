package codeFights.darkWilderness;

public class GrowingPlant {
    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int height = 0;
        int days = 0;

        while (height < desiredHeight) {
            days++;
            height += upSpeed;
            if (height < desiredHeight){
                height -= downSpeed;
            }
        }
        return days;
    }

}
