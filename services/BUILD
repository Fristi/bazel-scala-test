load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_test")

scala_library(
  name = "services",
  srcs = glob(["main/**/*.scala"]),
  visibility = ["//visibility:public"]
)

scala_test(
  name = "services_test",
  srcs = glob(["test/**/*.scala"]),
  deps = [
    "@maven//:dev_zio_zio_2_13",
    "@maven//:dev_zio_zio_test_2_13",
    "@maven//:dev_zio_zio_test_junit_2_13",
    "//services"
  ]
)