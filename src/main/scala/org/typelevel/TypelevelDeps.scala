package org
package typelevel

import sbt._
import sbtcatalysts.CatalystsPlugin.autoImport._

/** Default Typelevel dependencies.*/
object Dependencies {

  /**
   * Versions for libraries and packages
   *
   * Format: Package -> version
   */
  val versions = Map[String, String](
    "algebra"        -> "0.7.0",
    "catalysts"      -> "0.0.5",
    "cats"           -> "1.0.0-RC1",
    "cats-effect"    -> "0.5",
    "cats-mtl"       -> "0.1.0",
    "kittens"        -> "1.0.0-RC1",
    "mouse"          -> "0.12",
    "discipline"     -> "0.8",
    "export-hook"    -> "1.2.0",
    "kind-projector" -> "0.9.3",
    "machinist"      -> "0.6.1",
    "macro-compat"   -> "1.1.1",
    "monocle"        -> "1.5.0-cats-M2",
    "paradise"       -> "2.1.0",
    "refined"        -> "0.8.4",
    "scalacheck"     -> "1.13.5",
    "scalatest"      -> "3.0.3",
    "scalac"         -> "2.12.3",
    "scalac_2.13"    -> "2.13.0-M1",
    "scalac_2.12"    -> "2.12.3",
    "scalac_2.11"    -> "2.11.11",
    "scalac_2.10"    -> "2.10.6",
    "shapeless"      -> "2.3.2",
    "simulacrum"     -> "0.11.0",
    "specs2"         -> "3.9.2"
  )

  /**
   * Library definitions and links to their versions.
   *
   * Note that one version may apply to more than one library.
   * Format: Library name -> version key, org, library
   */
  val libraries = Map[String, (String, String, String)](
    "algebra"               -> ("algebra"         , "org.typelevel"                , "algebra"),
    "algebra-laws"          -> ("algebra"         , "org.typelevel"                , "algebra-laws"),
    "catalysts"             -> ("catalysts"       , "org.typelevel"                , "catalysts"),
    "catalysts-checklite"   -> ("catalysts"       , "org.typelevel"                , "catalysts-checklite"),
    "catalysts-lawkit"      -> ("catalysts"       , "org.typelevel"                , "catalysts-lawkit"),
    "catalysts-macros"      -> ("catalysts"       , "org.typelevel"                , "catalysts-macros"),
    "catalysts-platform"    -> ("catalysts"       , "org.typelevel"                , "catalysts-platform"),
    "catalysts-scalatest"   -> ("catalysts"       , "org.typelevel"                , "catalysts-scalatest"),
    "catalysts-specbase"    -> ("catalysts"       , "org.typelevel"                , "catalysts-specbase"),
    "catalysts-speclite"    -> ("catalysts"       , "org.typelevel"                , "catalysts-speclite"),
    "catalysts-specs2"      -> ("catalysts"       , "org.typelevel"                , "catalysts-specs2"),
    "catalysts-testkit"     -> ("catalysts"       , "org.typelevel"                , "catalysts-testkit"),
    "cats-core"             -> ("cats"            , "org.typelevel"                , "cats-core"),
    "cats-kernel"           -> ("cats"            , "org.typelevel"                , "cats-kernel"),
    "cats-free"             -> ("cats"            , "org.typelevel"                , "cats-free"),
    "cats-laws"             -> ("cats"            , "org.typelevel"                , "cats-laws"),
    "cats-macros"           -> ("cats"            , "org.typelevel"                , "cats-macros"),
    "cats-testkit"          -> ("cats"            , "org.typelevel"                , "cats-testkit"),
    "alleycats"             -> ("cats"            , "org.typelevel"                , "alleycats"),
    "cats-effect"           -> ("cats-effect"     , "org.typelevel"                , "cats-effect"),
    "cats-mtl"              -> ("cats-mtl"        , "org.typelevel"                , "cats-mtl"),
    "kittens"               -> ("kittens"         , "org.typelevel"                , "kittens"),
    "mouse"                 -> ("mouse"           , "org.typelevel"                , "mouse"),
    "discipline"            -> ("discipline"      , "org.typelevel"                , "discipline"),
    "export-hook"           -> ("export-hook"     , "org.typelevel"                , "export-hook"),
    "machinist"             -> ("machinist"       , "org.typelevel"                , "machinist"),
    "macro-compat"          -> ("macro-compat"    , "org.typelevel"                , "macro-compat"),
    "monocle-core"          -> ("monocle"         , "com.github.julien-truffaut"   , "monocle-core"),
    "monocle-generic"       -> ("monocle"         , "com.github.julien-truffaut"   , "monocle-generic"),
    "monocle-macro"         -> ("monocle"         , "com.github.julien-truffaut"   , "monocle-macro"),
    "monocle-state"         -> ("monocle"         , "com.github.julien-truffaut"   , "monocle-state"),
    "monocle-law"           -> ("monocle"         , "com.github.julien-truffaut"   , "monocle-law"),
    "refined"               -> ("refined"         , "eu.timepit"                   , "refined"),
    "refined-scalacheck"    -> ("refined"         , "eu.timepit"                   , "refined-scalacheck"),
    "refined-scalaz"        -> ("refined"         , "eu.timepit"                   , "refined-scalaz"),
    "refined-scodec"        -> ("refined"         , "eu.timepit"                   , "refined-scodec"),
    "scalatest"             -> ("scalatest"       , "org.scalatest"                , "scalatest"),
    "scalacheck"            -> ("scalacheck"      , "org.scalacheck"               , "scalacheck"),
    "shapeless"             -> ("shapeless"       , "com.chuusai"                  , "shapeless"),
    "simulacrum"            -> ("simulacrum"      , "com.github.mpilquist"         , "simulacrum"),
    "specs2-core"           -> ("specs2"          , "org.specs2"                   , "specs2-core"),
    "specs2-scalacheck"     -> ("specs2"          , "org.specs2"                   , "specs2-scalacheck")
  )

  /**
   * Compiler plugins definitions and links to their versions
   *
   * Note that one version may apply to more than one plugin.
   *
   * Format: Library name -> version key, org, librar, crossVersion
   */
  val scalacPlugins = Map[String, (String, String, String, CrossVersion)](
    "kind-projector"    -> ("kind-projector"  , "org.spire-math"      , "kind-projector" , CrossVersion.binary),
    "paradise"          -> ("paradise"        , "org.scalamacros"     , "paradise"       , CrossVersion.full)
  )

  // Some helper methods to combine libraries
  /**
   * Sets all settings required for the macro-compat library.
   *
   * @param v Versions map to use
   * @return All settings required for the macro-compat library
   */
  def macroCompatSettings(v: Versions): Seq[Setting[_]] =
    addCompileLibs(v, "macro-compat") ++ addCompilerPlugins(v, "paradise") ++
      scalaMacroDependencies(v)
}
