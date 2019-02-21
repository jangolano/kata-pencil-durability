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

    @Test
    public void testPencilSharpen(){
        Pencil pencil = new Pencil();
        pencil.write("ABCDEFG");
        pencil.sharpen();
        assertEquals(pencil.getPoint(), 500);
    }

    @Test
    public void testPencilLength(){
        Pencil pencil = new Pencil();
        pencil.write("ABCDEFG");
        pencil.sharpen();
        assertEquals(pencil.getLength(), 19);
    }

    @Test
    public void testPencilLenghtZero(){
        Pencil pencil = new Pencil();
        for(int i=0;i<=21;i++){
            pencil.sharpen();
        }
        assertEquals(pencil.length, 0);
        assertEquals(pencil.getPoint(), 0);
    }
}
