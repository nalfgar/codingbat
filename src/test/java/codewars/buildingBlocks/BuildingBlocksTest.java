package codewars.buildingBlocks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildingBlocksTest {

    @Test
    public void testConstructror() {
        BuildingBlocks buildingBlocks = new BuildingBlocks(new int[]{2, 2, 2});

        assertEquals(2, buildingBlocks.getWidth());
        assertEquals(2, buildingBlocks.getLength());
        assertEquals(2, buildingBlocks.getLength());
    }

    @Test
    public void testVolume(){
        BuildingBlocks buildingBlocks = new BuildingBlocks(new int[]{2, 2, 2});
        assertEquals(8, buildingBlocks.getVolume());
    }

    @Test
    public void testSufraceArea(){
        BuildingBlocks buildingBlocks = new BuildingBlocks(new int[]{2, 2, 2});
        assertEquals(24, buildingBlocks.getSurfaceArea());
    }
}
