bazel-scala-test
---

A proof of concept to see if bazel is a feasbile replacement for sbt

- [x] Build as Scala 2.13.x
- [x] Build docker image
- [x] Split up the project in multiple modules
- [x] Add dependency zio
- [x] Run a test using zio-test
- [ ] Use twirl templates
- [x] IDEA integration ()
- [ ] Build as Scala 3.x
- [ ] Dependency updates
- [ ] Code coverage

## Notes

### Docker publish

Run `bazel run :bazel-scala-test`

Set `respoitory` to `:org/:name`

### Testing

Run `bazel test //services:services_test`

### Run API

Run `bazel run //api:api`