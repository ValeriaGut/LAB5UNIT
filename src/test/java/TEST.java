import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

class TEST {
    @Test
    void isOkey1() throws IOException {
        String str = "e02fd0e4-00fd-090A-ca30-0d00a0038ba0";
        REGULAR gd = new REGULAR();
        assertEquals(true, gd.isOkey(str));
    }

    @Test
    void isOkey2() throws IOException {
        String str = "d02fd0e4-00fd-090A-ca30-0d00a0038ba0";
        REGULAR gd = new REGULAR();
        assertEquals(true, gd.isOkey(str));
    }

    @Test
    void isOkey3() throws IOException {
        String str = "02f4-01ad-090A-c130-0d05a0008ba0}";
        REGULAR gd = new REGULAR();
        assertEquals(false, gd.isOkey(str));
    }
}
