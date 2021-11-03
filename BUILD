load("@io_bazel_rules_docker//scala:image.bzl", "scala_image")
load("@io_bazel_rules_docker//container:container.bzl", "container_push")


scala_image(
  name = "example",
  srcs = glob(["src/**/*.scala"]),
  main_class = "Hello",
  deps = [
    "@maven//:dev_zio_zio_2_12"
  ]
)

container_push(
   name = "bazel-scala-test",
   image = ":example",
   format = "Docker",
   registry = "index.docker.io",
   repository = "markdj",
   tag = "1"
)