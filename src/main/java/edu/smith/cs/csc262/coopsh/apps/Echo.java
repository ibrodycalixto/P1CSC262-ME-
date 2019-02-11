package edu.smith.cs.csc262.coopsh.apps;

import java.io.File;

import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.Task;

public class Echo extends Task {

    String argument;

    public Echo(ShellEnvironment env, String[] args) {
        super(env, args);
        this.argument = args;
    }

    @Override
    public void update() {
        this.println(argument);
        this.closeOutput();
        this.exit(0);
    }
}