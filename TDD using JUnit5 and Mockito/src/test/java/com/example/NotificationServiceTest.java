package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NotificationServiceTest {
    @Test
    public void testNotifyUserThrowsException() throws Exception {
        // 1. Create a mock object
        MessageSender mockSender = mock(MessageSender.class);

        // 2. Stub the void method to throw an exception
        doThrow(new IllegalArgumentException("Invalid message")).when(mockSender).send(anyString());

        NotificationService service = new NotificationService(mockSender);

        // 3. Verify the interaction and assert the exception is thrown
        assertThrows(IllegalArgumentException.class, () -> {
            service.notifyUser("Test Message");
        });

        verify(mockSender).send("Test Message");
    }
}
