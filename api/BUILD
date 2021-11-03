load("@io_bazel_rules_docker//scala:image.bzl", "scala_image")

scala_image(
  name = "api",
  srcs = glob(["**/*.scala"]),
  visibility = ["//visibility:public"],
  main_class = "Hello",
  deps = [
    "@maven//:dev_zio_zio_2_13",
    "//services"
  ]
)