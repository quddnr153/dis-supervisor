package io.dis.supervisor.parser.bo;

import io.dis.supervisor.parser.model.Command;

import org.springframework.stereotype.Service;

/**
 * @author Byungwook Lee on 10/7/2017
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Service
public class ParserBoImpl implements ParserBo {
    @Override
    public Command parseSentence(final String sentence) {
        if (sentence.isEmpty()) {
            throw new IllegalArgumentException("sentence should not be empty.");
        }

        return new Command().setId(1L).setCode(0).setCommand(sentence.toLowerCase());
    }
}
