## Demonstrations

### Action

Execute the `unit-test` default build profile with Maven by running `mvn clean test`.

### Process

Maven will only run phases up to and including the `test` phase, hence the `integration-test` phase is skipped.

### Result

The following is shown as part of the console output:
```console
-------------------------------------------------------
T E S T S
-------------------------------------------------------
Running hello.HelloUnitTest
================================================
Greetings from the hello the Unit Test!
================================================
```
Note that the [Maven Failsafe Plugin](http://maven.apache.org/surefire/maven-failsafe-plugin/) does not log any output, thus the integration tests are skipped.

### Action

Execute the `integration-test` profile with Maven by running `mvn clean verify -P integration-test`.  Note that we are executing the `verify` life cycle phase.

### Process

The `integration-test` profile is configured to skip unit testing, hence the surefire-plugin does not run its tests.  In addition the `build-helper-maven-plugin` has added the `src/integration-test/java` directory, ensuring that test contained in this directory that follow the [Maven Failsafe Plugin Inclusion / Exclusion](maven.apache.org/surefire/maven-failsafe-plugin/examples/inclusion-exclusion.html) conventions are run.  In this case we are using the `*IT.java` pattern for the integration tests, such that they are included automatically.

### Result

The following is shown as part of the console output:
```console
[INFO] --- maven-surefire-plugin:2.18:test (default-test) @ separating-integration-and-unit-test-execution ---
[INFO] Tests are skipped.

...

-------------------------------------------------------
T E S T S
-------------------------------------------------------
Running integration.HelloIT
================================================
Greetings from the hello the Integration Test!
================================================
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec - in integration.HelloIT
```
