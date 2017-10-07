package io.dis.supervisor.parser.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Byungwook Lee on 10/7/2017
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
public class CommandTest {
    @Test
    public void getterAndSetterTest() {
        // Given
        final long id = 1L;
        final long code = 0;
        final String sentence = "test";

        // When
        final Command command = new Command();
        command.setId(id);
        command.setCode(code);
        command.setCommand(sentence);

        // Then
        assertEquals(id, command.getId());
        assertEquals(code, command.getCode());
        assertEquals(sentence, command.getCommand());
    }
}