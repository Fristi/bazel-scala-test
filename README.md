bazel-scala-test
---

A proof of concept to see if bazel is a feasbile replacement for sbt

- [x] Build as Scala 2.13.x
- [x] Build docker image
- [x] Split up the project in multiple modules
- [x] Add dependency zio
- [x] Run a test using zio-test
- [x] Use twirl templates
- [x] IDEA integration (https://ij.bazel.build/)
- [x] Metals integration
- [ ] Build as Scala 3.x (work in progress: https://github.com/bazelbuild/rules_scala/issues/1269)
- [ ] Dependency updates
- [x] Code coverage

## Notes

### Docker publish

Run `bazel run :bazel-scala-test`

Set `respoitory` to `:org/:name`

### Testing

Run `bazel test //services:services_test`

### Run API

Run `bazel run //api:api`

### Coverage

Probably works with SonarQube https://github.com/Zetten/bazel-sonarqube

Run `bazel coverage //services:services_test` to get .dat files on tests

### Metals support

Run `coursier launch -r sonatype:snapshots org.jetbrains.bsp:bazel-bsp:1.0.1 -M org.jetbrains.bsp.bazel.install.Install` in the root. This will install the bazelbsp. 

Make sure all directories related to metals and vscode are deleted (.vscode, .bloop, .metals, etc)

After that open VSCode -> Metals -> New Project -> Restart build server

This will enable code completion in the project.

## Pros and cons

### Pros

- Build as a graph, once build nodes are cached based on inputs (scala version, dependencies, directory digest)
- Tests are cached based on inputs
- Remote cache for local builds (productivity)
- Can make a mono-repo a thing which would ease sharing clients amongst projects and also changes across projects

### Cons

- Tooling might be a struggle
- Knowledge about another build tool next to SBT
- SBT is the defacto, so could be limiting on using certain features