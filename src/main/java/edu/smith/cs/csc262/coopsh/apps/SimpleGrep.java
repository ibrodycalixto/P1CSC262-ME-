package edu.smith.cs.csc262.coopsh.apps;

import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.*;

public class SimpleGrep extends Task {
    String target;
    public SimpleGrep(ShellEnvironment env, String[] args) {
        super(env, args);
        target = args[0];
    }

    @Override
    protected void update() {
      InputLine line = this.input.poll();
      if (line==null) {
        return;
      }
      if (line.isEndOfFile()) {
        this.closeOutput();
        this.exit(0);
        return;
      }
      //otherwise, search and print line if word found
      String[] words = line.get().split("\\s+");
      for (String word:words) {
        if(word.equals(target)) {
          this.println(line);
        }
      }
    }
}
