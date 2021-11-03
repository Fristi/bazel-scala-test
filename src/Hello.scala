import zio._
import zio.console._
import java.io.IOException

object Hello extends App {
  val program: ZIO[Console, IOException, Unit] = for {
    _ <- putStrLn("Hello, what is you name?")
    name <- getStrLn
    _ <- putStrLn(s"Hello $name, welcome to ZIO!")
  } yield ()

  override def run(args: List[String]) = program.exitCode
}