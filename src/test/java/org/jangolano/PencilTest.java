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

    @Test
    public void testWriteDullPencil(){
       Pencil pencil = new Pencil();
       assertEquals(pencil.write("Rp4TptSAfWIODaWai9r2JX15MqDsSw5YeQd92O5qtffHMAZUDQv3UHfW8RN5Eh4r05JIYLxkX6nQfpioG530nZklYX69LZjUayI56m3Hdfo2BG6tfvadJm16E9LQmnlGxIlevzUXOgiCrsqEGc2hydU6R5UhQjTW1R2ajVjff4gzZTmy2XM7rGWeGk4vZmhT3pPDkEfMzMHJxJOcp4tpOSN34Kybzy15zJf7V77TXHIwvkKzlplPN4ZBZlJ4eNYMMUNN4jxi0Zn7qRSraKmRFw9Ihnc5BjpYLwpziOFqnr0v7lEjThYa3mUjTvlDjfMzF4diwY1j4utZj8Pkr2CGrWSQGuGC5D778RIQJzVTxXqt4IByizB3e40thB1noDjsdQKnDj90V1UCrQBO10jK9zK8TiA7HHe5oWUF8ye5uCfE2LVKNzatzIN8PoCJ4gyQxsdx7XOB6BWSaxQHYfa6tNwaL5s49lXlWX6fHtWPDabOipgu7kztxj2oit1ALgkbZOutDLP7F2lle"),
               "Rp4TptSAfWIODaWai9r2JX15MqDsSw5YeQd92O5qtffHMAZUDQv3UHfW8RN5Eh4r05JIYLxkX6nQfpioG530nZklYX69LZjUayI56m3Hdfo2BG6tfvadJm16E9LQmnlGxIlevzUXOgiCrsqEGc2hydU6R5UhQjTW1R2ajVjff4gzZTmy2XM7rGWeGk4vZmhT3pPDkEfMzMHJxJOcp4tpOSN34Kybzy15zJf7V77TXHIwvkKzlplPN4ZBZlJ4eNYMMUNN4jxi0Zn7qRSraKmRFw9Ihnc5BjpYLwpziOFqnr0v7lEjThYa3mUjTvlDjfMzF4diwY1j4utZj8Pkr2CGrWSQGuGC5D778RIQJzVTxXqt4IByizB3e40thB1noDjsdQKnDj90V1UCrQBO10jK9zK8TiA7HHe5oWUF8ye5uCfE2LVKNzatzIN8PoCJ4gyQxsdx7XOB6BWSaxQHYfa6tNwaL5s49lXlWX6fHtWPDabOipgu7kzt");

    }
}
