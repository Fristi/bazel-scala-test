load("@io_bazel_rules_twirl//twirl:twirl.bzl", "twirl_templates")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")

twirl_templates(
  name = "template_source",
  source_directory = "views",
  additional_imports = [
    "play.twirl.api.TwirlFeatureImports._",
    "play.twirl.api.TwirlHelperImports._",
    "play.twirl.api.Html",
    "play.twirl.api.JavaScript",
    "play.twirl.api.Txt",
    "play.twirl.api.Xml",
  ],
  srcs = glob(["views/**/*.scala.html"])
    + glob(["views/**/*.scala.xml"])
    + glob(["views/**/*.scala.txt"]),
)

scala_library(
    name = "templates",
    srcs = [":template_source"],
    visibility = ["//visibility:public"],
    deps = [
        "@maven//:com_typesafe_play_twirl_api_2_13",
        "@maven//:org_scala_lang_modules_scala_xml_2_13"
    ]
)