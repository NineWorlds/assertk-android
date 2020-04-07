package us.nineworlds.assertk.android

import android.graphics.drawable.Drawable
import android.view.View
import android.view.animation.Animation
import assertk.Assert
import assertk.assertions.isEqualTo
import assertk.assertions.isNotNull
import assertk.assertions.isSameAs
import assertk.assertions.support.expected

fun Assert<View>.hasAlpha(expectedValue: Float) = given { actual ->
  isNotNull()
  val actualAlpha = actual.alpha
  if (actualAlpha == expectedValue) return@given
  expected("Expected alpha $expectedValue but was $actualAlpha")
}

fun Assert<View>.hasAnimation(animation: Animation) = given { actual ->
  isNotNull()
  val actualAnimation = actual.animation

  assertThat(actualAnimation).isSameAs(animation)
}

fun Assert<View>.hasBackground(background: Drawable) = given { actual ->
  isNotNull()
  val actualBackground = actual.background
  assertThat(actualBackground).isSameAs(background)
}

fun Assert<View>.hasBaseline(baseline: Int) = given { actual ->
  isNotNull()
  val actualBaseline = actual.baseline
  assertThat(actualBaseline).isEqualTo(baseline)
}

