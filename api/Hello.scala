import zio._
import zio.console._
import java.io.IOException

object Hello extends App {
  val program: ZIO[Console, IOException, Unit] = for {
    _ <- putStrLn("Hello, what is you name?")
    name <- getStrLn
    _ <- putStrLn(txt.template(name).toString())
    _ <- putStrLn(s"Oh and 1 + 2 = ${Calculator.add(1, 2)}")
  } yield ()

  override def run(args: List[String]) = program.exitCode
}