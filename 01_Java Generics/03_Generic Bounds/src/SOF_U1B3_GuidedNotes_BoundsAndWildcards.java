/**
 * SOF_U1B3 Guided Notes (20-ish minutes)
 * Topic: Generic Bounds + Wildcards
 *
 * RULES FOR THIS LESSON PACK:
 * - Do NOT use java.util collections (List/Set/Map/etc.).
 * - Do NOT use any existing generic-based APIs (Comparable<T>, Iterable<T>, Class<T>, Objects, Streams, Optional, etc.).
 * - Arrays are allowed. System.arraycopy is allowed.
 *
 * HOW TO USE THESE NOTES:
 * - Students read + fill blanks (____) and complete tiny TODO snippets.
 * - Compile/run later using the lab runner file.
 */
public class SOF_U1B3_GuidedNotes_BoundsAndWildcards {

  /*
   * 1) WHY GENERICS EXIST (and why bounds/wildcards exist)
   *
   * - Generics give you ________ safety at compile time.
   * - Without generics, you fall back to Object + ________ (casts).
   *
   * Core idea: A type parameter like <T> is a ________ for a real type.
   */

  /*
   * 2) TYPE PARAMETER BOUNDS: <T extends Something>
   *
   * Bound vocabulary:
   * - "Upper bound": T must be Something or a ________ of Something.
   * - Syntax: <T extends ________>
   *
   * Example:
   *   <T extends HasId> means T must implement HasId.
   *
   * Why use bounds?
   * - It lets you safely call methods defined by the bound (e.g., id()) on T.
   */

  // TODO: Fill in the missing pieces in the comment, then read it out loud.
  /*
   * If we write: <T extends HasId>
   * then inside that generic method, T is guaranteed to have method: ________
   */

  /*
   * 3) WILDCARDS: ?
   *
   * Wildcards are about "a family of types", not one specific T.
   *
   * - ? extends X  -> "some unknown subtype of X" (read-only-ish)
   * - ? super X    -> "some unknown supertype of X" (write-in-ish)
   *
   * Nerd motto: PECS
   * - Producer Extends (if you only pull values out)
   * - Consumer Super (if you push values in)
   */

  /*
   * 4) KEY TRAP: Invariance
   *
   * Even if Dog extends Animal:
   *   SimpleSet<Dog> is NOT a SimpleSet<Animal>
   *
   * Because generics in Java are ________ (invariant).
   *
   * Wildcards are how we safely talk about related generic types.
   */

  /*
   * 5) A SAFE READ METHOD USING ? extends
   *
   * If you have:
   *   SimpleSet<? extends Animal>
   *
   * You can:
   * - safely read Animals out (treat results as Animal)
   *
   * You cannot:
   * - safely add a Dog or Cat into it (because the actual subtype is unknown)
   */

  /*
   * 6) A SAFE WRITE METHOD USING ? super
   *
   * If you have:
   *   SimpleSet<? super Dog>
   *
   * You can:
   * - safely add Dog (and subclasses of Dog)
   *
   * When you read from it, you only know you have an ________ (not a Dog),
   * because the set might actually be SimpleSet<Animal> or SimpleSet<Object>.
   */

  /*
   * 7) BOUNDED GENERIC METHODS vs BOUNDED CLASSES
   *
   * - Bounded class: class Thing<T extends X> { ... }
   * - Bounded method: static <T extends X> void method(T value) { ... }
   *
   * Bounded methods are great when only ONE method needs the constraint.
   */

  /*
   * 8) MINI CHECK FOR UNDERSTANDING (answer in your own words)
   *
   * Q: Why does "? extends Animal" block adding new Animals?
   * A: Because the actual type could be ________, and adding a plain Animal
   *    might break type safety.
   */

  /*
   * 9) TODAY’S “NOT THE MAIN TOPIC” SIDE QUEST:
   * We’re building our own Set (SimpleSet<E>) WITHOUT using Java Collections.
   *
   * Goal: Use our Set to practice bounds + wildcards in realistic code.
   */

  // No code required here. This file is for guided reading + quick checks.
}
