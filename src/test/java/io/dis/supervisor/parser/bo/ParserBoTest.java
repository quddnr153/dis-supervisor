package io.dis.supervisor.parser.bo;

import io.dis.supervisor.parser.model.Command;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * @author Byungwook Lee on 10/7/2017
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@RunWith(MockitoJUnitRunner.class)
public class ParserBoTest {
    @InjectMocks
    private ParserBo parserBo = new ParserBoImpl();

    @Test
    public void parseSentence() throws Exception {
        // Given
        final String sentence = "Sentence Test";

        // When
        Command actual = parserBo.parseSentence(sentence);

        // Then
        assertEquals(sentence.toLowerCase(), actual.getCommand());
    }

}