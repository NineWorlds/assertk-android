package us.nineworlds.assertk.util

import java.util.*

/**
 * This class originally from Assertj-Android
 *
 * https://raw.githubusercontent.com/square/assertj-android/master/assertj-android/src/main/java/org/assertj/android/internal/BitmaskUtils.java
 */
class BitmaskUtils {

  class BitMaskStringBuilder constructor(private val value: Long) {
    private val parts: MutableMap<Long, String> = LinkedHashMap()
    fun flag(flag: Long, flagName: String): BitMaskStringBuilder {
      if (value and flag != 0L) {
        if (parts.containsKey(flag)) {
          parts[flag] = parts[flag].toString() + "|" + flagName
        } else {
          parts[flag] = flagName
        }
      }
      return this
    }

    fun get(): String = if (value == 0L) { "none" } else { parts.values.joinToString(separator = ", ") }

  }

  class NamedValueStringBuilder constructor(private val value: Long) {
    private val valueNames: MutableMap<Long, String> = LinkedHashMap()
    fun value(value: Long, name: String): NamedValueStringBuilder {
      val dupe = valueNames[value]
      check(dupe == null) { "Duplicate value $value with name $dupe and $name" }
      valueNames[value] = name
      return this
    }

    val orValue: String
      get() {
        var name = valueNames[value]
        if (name == null) {
          name = value.toString()
        }
        return name
      }

    fun get(): String {
      return valueNames[value] ?: throw IllegalStateException("Unknown value: $value")
    }

  }

  companion object {
    /**
     * Convenience builder for printing out a human-readable list of all of the individual values
     * in a bitmask.
     */
    fun buildBitMaskString(value: Long): BitMaskStringBuilder {
      return BitMaskStringBuilder(value)
    }

    /** Convenience builder for printing out a human-readable string of a bitmask.  */
    fun buildNamedValueString(value: Long): NamedValueStringBuilder {
      return NamedValueStringBuilder(value)
    }
  }

  init {
    throw AssertionError("No instances.")
  }
}