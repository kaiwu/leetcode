[![Build Status](https://travis-ci.com/kaiwu/leetcode.svg?token=ZwFSe1TRqKYsKzkMHMxQ&branch=master)](https://travis-ci.com/kaiwu/leetcode)

# Leetcode Solutions in Scala #

This project was created with a few purposes

First it is to promote language [Scala](http://scala-lang.org) and
its functional approach to solve problems, Scala is expressive, succinct
meanwhile far too much underrated. Second let's just admit one `cannot`
judge the engineering calibers of another in one hour technical interview,
I personally have had and failed a few and I want to do something to alleviate
this madness of the industry. Use `Search` from the [scaladoc](https://kaiwu.github.io/leetcode/)
(or in [China](https://www.darkanchor.com/leetcode/index.html)) and type in
some method names to get the point ...

The listed solutions are by no means complete or optimal, if you would
agree the causes, and feel like to contribute solutions, fixes or scaladocs
to better illustrate everything, all [PRs](https://github.com/kaiwu/leetcode/pulls)
are welcome !

To maintain its goal please take a few notes too,

- Respect Scala [CoC](https://www.scala-lang.org/conduct/).
- Solutions shall pass *all* of their tests in leetcode, using plain Scala and its std library only.
- Solutions need to bundle their own unit tests, this project uses [uTest](https://github.com/lihaoyi/utest).
- Always prefer `functional programming`, which requires immutable data, pure functions etc,
  and keep it to the point.
- Always prefer a generic solution, which captures the gist of a pattern or an algorithm, even if it implies
  some tradeoffs and becomes slightly suboptimal in terms of computational or space efficiency.
- Try to achieve performance only after doing it right, iterate above notes for clarification,
  although this might defeat the original leetcode intention, one might be surprised that functional
  programming can be performant too.
- Extra boilerplates are needed in package object so that [Scaladoc](https://kaiwu.github.io/leetcode/)
  can better serve us.
- Last not the least, use [Scalafmt](https://scalameta.org/scalafmt/)
