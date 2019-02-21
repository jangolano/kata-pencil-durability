package org.jangolano;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PencilTest {

    @Test
    public void testPencilWrite(){
        Pencil pencil = new Pencil();
        assertEquals(pencil.write("ABCD"), "ABCD");
    }
    @Test
    public void testPencilWritePointDegradation(){
        Pencil pencil = new Pencil();
        pencil.write("ABCDEFG");
        assertEquals(pencil.getPoint(),493);
    }
}
