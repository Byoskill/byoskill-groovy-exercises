package chatroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChatroomTest {
    
    @Test
    public void test() {
        final Chatroom chatroom = new Chatroom();
        final Participant p1 = new Participant(chatroom, "P1");
        final Participant p2 = new Participant(chatroom, "P2");
        final Participant p3 = new Participant(chatroom, "P3");
        
        p1.sendMessage("Hello, I'm P1");
        p2.sendMessage("Hello, I'm P2");
        p3.sendMessage("Hello, I'm P3");
        
    }

}