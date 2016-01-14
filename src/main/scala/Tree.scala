/**
 * Created by vsanjekar on 5/4/15.
 */

/*
Case classes. Define eval and derive functions for expressions, represented as trees.
 */
object Expressions {
  abstract class Tree
  case class Sum(l: Tree, r: Tree) extends Tree
  case class Var(n: String) extends Tree
  case class Const(c: Int) extends Tree

  type Environment = String => Int

  def eval(t: Tree, env: Environment): Int = t match {
    case Sum(l, r) => eval(l, env) + eval(r, env)
    case Var(n) => env(n)
    case Const(c) => c
  }

  def derive(t: Tree, v: String): Tree = t match {
    case Sum(l, r) => Sum(derive(l, v), derive(r, v))
    case Var(n) if (v==n) => Const(1)
    case _ => Const(0)
  }

  def main(args: Array[String]) {
    // { case "x" => 5}
    val exp: Tree = Sum(Sum(Var("x"), Var("y")), Sum(Const(7), Var("y")))
    val env: Environment = {case "x" => 5 case "y" => 7}
    println("Expression: " + exp)
    println("Evaluate expressions with x=5, y=7: "+ eval(exp, env))
    println("Derivative of exp wrt x: "+derive(exp, "x"))
    println("Derivative of exp wrt y: "+derive(exp, "y"))
  }
}
