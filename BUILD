load("@io_bazel_rules_docker//container:container.bzl", "container_push")

container_push(
   name = "bazel-scala-test",
   image = "//api",
   format = "Docker",
   registry = "index.docker.io",
   repository = "markdj/bazel-scala-test"
)