package edu.smith.cs.csc262.coopsh.apps;

import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.*;

public class Head extends Task {
  int display = 0;
  public Head(ShellEnvironment env, String[] args) {
    super(env, args);
    display = Integer.parseInt(args[0]);
  }
  @Override
	protected void update() {
		InputLine line = this.input.poll();
    //decrement display number
    display = display-1;

		if (line == null) {
			// still waiting for more...
			return;
		}

    if (display != 0) {
      this.println(line);
    }
		// only output and print when we've seen the whole file!
    if (line.isEndOfFile()) {
      this.closeOutput();
      this.exit(0);
      return;
    }
  }
}
