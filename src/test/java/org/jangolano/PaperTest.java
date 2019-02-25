package org.jangolano;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PaperTest {

    @Test
    public void testSettingText(){
        Paper paper = new Paper();
        paper.appendText("ABCD ");
        paper.appendText("EFG");
        assertEquals(paper.getText(), "ABCD EFG");

    }

}
