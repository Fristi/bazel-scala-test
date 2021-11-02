load("@io_bazel_rules_docker//scala:image.bzl", "scala_image")
load("@io_bazel_rules_docker//container:container.bzl", "container_push")



scala_image(
  name = "example",
  srcs = glob(["src/**/*.scala"]),
  main_class = "Hello",
  visibility = ["//visibility:public"]
)

container_push(
   name = "bazel-scala-test",
   image = ":example",
   format = "Docker",
   registry = "index.docker.io",
   repository = "markdj",
   tag = "1"
)