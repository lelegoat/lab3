import static org.junit.Assert.*;

import org.junit.*;

public class LinkedListTests {
    @Test
    public void testAppend(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(0);
        linkedList.append(2);

        assertEquals(1, linkedList.root.value);
        assertEquals(0, linkedList.root.next.value);
        assertEquals(2, linkedList.root.next.next.value);
        assertEquals(3,linkedList.length());
    }
    
}
