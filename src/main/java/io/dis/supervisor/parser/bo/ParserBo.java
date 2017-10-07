package io.dis.supervisor.parser.bo;

import io.dis.supervisor.parser.model.Command;

/**
 * @author Byungwook Lee on 10/7/2017
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
public interface ParserBo {
    Command parseSentence(final String sentence);
}
