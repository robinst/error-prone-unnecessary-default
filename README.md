# error-prone minimal example for UnnecessaryDefaultInEnumSwitch

Example to reproduce a problem with the
[UnnecessaryDefaultInEnumSwitch](https://errorprone.info/bugpattern/UnnecessaryDefaultInEnumSwitch)
bug pattern.

Steps to reproduce:

1. Clone this repo
2. Run `bazel build :hello`

Expected: The build should error with "Switch handles all enum values"
Actual: The build succeeds

See [Hello.java](src/main/java/example/Hello.java) for the source code.
What's interesting is that if you change it to this:

```java
case BAR -> {
}
case BAZ -> {
}
```

It does error as expected.
