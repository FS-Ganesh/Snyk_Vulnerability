package io.snyk.snyk_maven_plugin.goal;

import io.snyk.snyk_maven_plugin.command.Command;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "code-test", defaultPhase = LifecyclePhase.TEST)
public class SnykCodeTestMojo extends SnykMojo {

    @Override
    public Command getCommand() {
        return Command.CODE_TEST;
    }

}
