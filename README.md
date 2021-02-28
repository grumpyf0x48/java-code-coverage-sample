# A simple project showing how to configure Jacoco Maven Plugin

The configuration of [Jacoco](https://github.com/jacoco/jacoco) Maven Plugin to analyse code coverage is not always well
described.

Most of the time, the need to define a Maven property between Jacoco Plugin and Surefire Plugin is not explained and you
won't get any coverage result without that :-(

The configuration used in this project is taken from [Vogella](https://www.vogella.com/tutorials/Jacoco/article.html)
article.

## Run tests

```console
mvn test
```

## See the code coverage

```console
firefox target/site/jacoco/index.html &
```

## Improve the coverage

Uncomment the ignored tests.
