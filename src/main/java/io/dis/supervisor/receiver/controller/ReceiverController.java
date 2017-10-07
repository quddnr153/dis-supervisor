package io.dis.supervisor.receiver.controller;

import io.dis.supervisor.parser.bo.ParserBo;
import io.dis.supervisor.parser.model.Command;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Byungwook Lee on 10/7/2017
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Slf4j
@RestController
public class ReceiverController {
    @Autowired
    private ParserBo parserBo;

    @GetMapping("/receiver")
    public Command receiveSentence(@RequestParam(value = "sentence") final String clientSentence) {
        if (clientSentence.isEmpty()) {
            throw new IllegalArgumentException("Sentence sent by client should not be empty.");
        }

        log.info("Get receiveSentence. sentence = {}", clientSentence);

        return parserBo.parseSentence(clientSentence);
    }
}
