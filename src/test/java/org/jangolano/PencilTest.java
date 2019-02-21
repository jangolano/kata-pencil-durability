package org.jangolano;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PencilTest {

    @Test
    public void testPencilWrite(){
        Pencil pencil = new Pencil();
        assertEquals(pencil.write("ABCD"), "ABCD");
    }
}
