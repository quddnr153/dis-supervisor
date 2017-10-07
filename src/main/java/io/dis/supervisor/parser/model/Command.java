package io.dis.supervisor.parser.model;

/**
 * @author Byungwook Lee on 10/7/2017
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
public class Command {
    private long id;
    private long code;
    private String command;

    public long getId() {
        return id;
    }

    public Command setId(long id) {
        this.id = id;
        return this;
    }

    public long getCode() {
        return code;
    }

    public Command setCode(long code) {
        this.code = code;
        return this;
    }

    public String getCommand() {
        return command;
    }

    public Command setCommand(String command) {
        this.command = command;
        return this;
    }
}
