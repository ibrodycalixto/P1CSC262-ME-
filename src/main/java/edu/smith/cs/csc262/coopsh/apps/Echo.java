package edu.smith.cs.csc262.coopsh.apps;

import java.io.File;

import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.*;

public class Echo extends Task {

    String output;

    public Echo(ShellEnvironment env, String[] args) {
        super(env, args);
        StringBuilder string = new StringBuilder();
        for(int i=0; i<args.length; i++) {
			  if (i > 0) string.append(" ");
			  string.append(args[i]);
		    }
        output = string.toString();
    }

    @Override
    protected void update() {
        this.println(output);
        this.closeOutput();
        this.exit(0);
    }
}
