package trinity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    void append() {
        LinkedList<String> ll1 = new LinkedList<String>();
        ll1.append("Test");
        assertEquals("Test", ll1.delete());
        
    }
    

}