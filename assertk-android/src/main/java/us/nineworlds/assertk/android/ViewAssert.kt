package us.nineworlds.assertk.android

import android.graphics.drawable.Drawable
import android.view.View
import android.view.View.*
import android.view.ViewParent
import android.view.animation.Animation
import assertk.Assert
import assertk.assertions.isEqualTo
import assertk.assertions.isSameAs
import assertk.assertions.support.expected
import us.nineworlds.assertk.util.BitmaskUtils

fun Assert<View>.hasAlpha(expectedValue: Float) = given { actual ->
  val actualAlpha = actual.alpha
  if (actualAlpha == expectedValue) return@given
  expected("Expected alpha $expectedValue but was $actualAlpha")
}

fun Assert<View>.hasAnimation(animation: Animation) = given { actual ->
  val actualAnimation = actual.animation

  assertThat(actualAnimation).isSameAs(animation)
}

fun Assert<View>.hasBackground(background: Drawable) = given { actual ->
  val actualBackground = actual.background
  assertThat(actualBackground).isSameAs(background)
}

fun Assert<View>.hasBaseline(baseline: Int) = given { actual ->
  val actualBaseline = actual.baseline
  assertThat(actualBaseline).isEqualTo(baseline)
}

fun Assert<View>.hasBottom(bottom: Int) = given { actual ->
  val actualBottom = actual.bottom

  assertThat(actualBottom).isEqualTo(bottom)
}

fun Assert<View>.hasContentDescription(contentDescription: CharSequence) = given { actual ->
  val actualContentDescription = actual.contentDescription
  if (actualContentDescription == contentDescription) return@given
  expected("Expected content description <$contentDescription> but was <$actualContentDescription>")
}

fun Assert<View>.hasContentDescription(resId: Int) = given { actual ->
  return hasContentDescription(actual.context.getString(resId))
}

fun Assert<View>.hasDrawingCacheBackgroundColor(color: Int) = given { actual ->
  val actualColor = actual.drawingCacheBackgroundColor
  if (actualColor == color) return@given
  expected("Expected drawing cache background color <$color> but was <$actualColor>")
}

fun Assert<View>.hasDrawingCacheQuality(quality: Int) = given { actual ->
  val actualQuality = actual.drawingCacheQuality
  if (actualQuality == quality) return@given
  expected("Expected drawing cache quality <$quality> but was <$actualQuality>")
}

fun Assert<View>.hasElevation(elevation: Float) = given { actual ->
  val actualElevation = actual.elevation
  if (actualElevation == elevation) return@given
  expected("Expected elevation <$elevation> but was <$actualElevation>")
}

fun Assert<View>.hasHeight(height: Int) = given { actual ->
  val actualHeight = actual.height
  if (actualHeight == height) return@given
  expected("Expected height <$height> but was <$actualHeight>")
}

fun Assert<View>.hasHorizontalFadingEdgeLength(length: Int) = given { actual ->
  val actualLength = actual.horizontalFadingEdgeLength
  if (actualLength == length) return@given
  expected("Expected horizontal fading edge length <$length> but was <$actualLength>")
}

fun Assert<View>.hasId(id: Int) = given { actual ->
  val actualId = actual.id
  if (actualId == id) return@given
  expected("Expected id <$id> but was <$actualId>")
}

fun Assert<View>.isKeepingScreenOn() = given { actual ->
  if (actual.keepScreenOn) return@given
  expected("Expected to be keeping screen on but was not.")
}

fun Assert<View>.isNotKeepingScreenOn() = given { actual ->
  if (!actual.keepScreenOn) return@given
  expected("Expected to not be keeping screen on but was.")
}

fun Assert<View>.hasLabelFor(id: Int) = given { actual ->
  if (actual.labelFor == id) return@given
  expected("Expected to have label for ID <$id> but was <${actual.labelFor}>")
}

fun Assert<View>.hasLayerType(type: Int) = given { actual ->
  if (actual.layerType == type) return@given
  expected("Expected layer type <$type> but was <${actual.layerType}>")
}

fun Assert<View>.hasLayoutDirection(direction: Int) = given { actual ->
  if (actual.layoutDirection == direction) return@given
  expected("Expected layout direction <$direction> but was <${actual.layoutDirection}>")
}

fun Assert<View>.hasLeft(left: Int) = given { actual ->
  if (actual.left == left) return@given
  expected("Expected left <$left> but was <${actual.left}>")
}

fun Assert<View>.hasMeasuredHeight(height: Int) = given { actual ->
  if (actual.measuredHeight == height) return@given
  expected("Expected measured height <$height> but was <${actual.height}>")
}

fun Assert<View>.hasMeasuredHeightAndState(heightState: Int) = given { actual ->
  if (actual.measuredHeightAndState == heightState) return@given
  expected("Expected measured height and state <$heightState> but was <${actual.measuredHeightAndState}>")
}

fun Assert<View>.hasMeasuredState(state: Int) = given { actual ->
  if (actual.measuredState == state) return@given
  expected("Expected measured state <$state> but was <${actual.measuredState}>")
}

fun Assert<View>.hasMeasuredWidth(width: Int) = given { actual ->
  if (actual.measuredWidth == width) return@given
  expected("Expected measured width <$width> but was <${actual.measuredWidth}>")
}

fun Assert<View>.hasMeasuredWidthAndState(widthState: Int) = given { actual ->
  if (actual.measuredWidthAndState == widthState) return@given
  expected("Expected measured width and state <$widthState> but was <${actual.measuredWidthAndState}>")
}

fun Assert<View>.hasMinimumHeight(height: Int) = given { actual ->
  if (actual.minimumHeight == height) return@given
  expected("Expected minimum height <$height> but was <${actual.minimumHeight}>")
}

fun Assert<View>.hasMinimumWidth(width: Int) = given { actual ->
  if (actual.minimumWidth == width) return@given
  expected("Expected minimum width <$width> but was <${actual.minimumWidth}>")
}

fun Assert<View>.hasNextFocusDownId(id: Int) = given { actual ->
  if (actual.nextFocusDownId == id) return@given
  expected("Expected next focus down ID <$id> but was <${actual.nextFocusDownId}>")
}

fun Assert<View>.hasNextFocusForwardId(id: Int) = given { actual ->
  if (actual.nextFocusForwardId == id) return@given
  expected("Expected next focus forward ID <$id> but was <${actual.nextFocusForwardId}>")
}

fun Assert<View>.hasNextFocusLeftId(id: Int) = given { actual ->
  if (actual.nextFocusLeftId == id) return@given
  expected("Expected next focus left ID <$id> but was <${actual.nextFocusLeftId}>")
}

fun Assert<View>.hasNextFocusRightId(id: Int) = given { actual ->
  if (actual.nextFocusRightId == id) return@given
  expected("Expected next focus right ID <$id> but was <${actual.nextFocusRightId}>")
}

fun Assert<View>.hasNextFocusUpId(id: Int) = given { actual ->
  if (actual.nextFocusUpId == id) return@given
  expected("Expected next focus up ID <$id> but was <${actual.nextFocusUpId}")
}

fun Assert<View>.hasOverScrollMode(mode: Int) = given { actual ->
  if (actual.overScrollMode == mode) return@given
  expected("Expected over scroll mode <$mode> but was <${actual.overScrollMode}>")
}

fun Assert<View>.hasPaddingBottom(padding: Int) = given { actual ->
  if (actual.paddingBottom == padding) return@given
  expected("Expected padding bottom <$padding> but was <${actual.paddingBottom}>")
}

fun Assert<View>.hasPaddingEnd(padding: Int) = given { actual ->
  if (actual.paddingEnd == padding) return@given
  expected("Expected padding end <$padding> but was <${actual.paddingEnd}>")
}

fun Assert<View>.hasPaddingLeft(padding: Int) = given { actual ->
  if (actual.paddingLeft == padding) return@given
  expected("Expected padding left <$padding> but was <${actual.paddingLeft}>")
}

fun Assert<View>.hasPaddingRight(padding: Int) = given { actual ->
  if (actual.paddingRight == padding) return@given
  expected("Expected padding right <$padding> but was <${actual.paddingRight}>")
}

fun Assert<View>.hasPaddingStart(padding: Int) = given { actual ->
  if (actual.paddingStart == padding) return@given
  expected("Expected padding start <$padding> but was <${actual.paddingStart}>")
}

fun Assert<View>.hasPaddingTop(padding: Int) = given { actual ->
  if (actual.paddingTop == padding) return@given
  expected("Expected padding top <$padding> but was <${actual.paddingTop}>")
}

fun Assert<View>.hasParent(parent: ViewParent) = given { actual ->
  if (actual.parent == parent) return@given
  expected("Expected parent <$parent> but was <${actual.parent}>")
}

fun Assert<View>.hasParentForAccessibility(parent: ViewParent) = given { actual ->
  if (actual.parentForAccessibility == parent) return@given
  expected("Expected parent for accessibility <$parent> but was <${actual.parentForAccessibility}>")
}

fun Assert<View>.hasPivotX(pivotx: Float) = given { actual ->
  if (actual.pivotX == pivotx) return@given
  expected("Expected x pivot <$pivotx> but was <${actual.pivotX}>")
}

fun Assert<View>.hasPivotY(pivoty: Float) = given { actual ->
  if (actual.pivotY == pivoty) return@given
  expected("Expected y pivot <$pivoty> but was <${actual.pivotY}>")
}

fun Assert<View>.hasRight(right: Int) = given { actual ->
  if (actual.right == right) return@given
  expected("Expected right <$right> but was <${actual.right}")
}

fun Assert<View>.hasRootView(view: View) = given { actual ->
  if (actual.rootView == view) return@given
  expected("Expected root view <$view> but was <${actual.rootView}>")
}

fun Assert<View>.hasRotation(rotation: Float) = given { actual ->
  if (actual.rotation == rotation) return@given
  expected("Expected rotation <$rotation> but was <${actual.rotation}>")
}

fun Assert<View>.hasRotationX(rotationx: Float) = given { actual ->
  if (actual.rotationX == rotationx) return@given
  expected("Expected x rotation <$rotationx> but was <${actual.rotationX}>")
}

fun Assert<View>.hasRotationY(rotationy: Float) = given { actual ->
  if (actual.rotationY == rotationy) return@given
  expected("Expected y rotation <$rotationy> but was <${actual.rotationY}>")
}

fun Assert<View>.hasScaleX(scaleX: Float) = given { actual ->
  if (actual.scaleX == scaleX) return@given
  expected("Expected x scale <$scaleX> but was <${actual.scaleX}>")
}

fun Assert<View>.hasScaleY(scaleY: Float) = given { actual ->
  if (actual.scaleY == scaleY) return@given
  expected("Expected y scale <$scaleY> but was <${actual.scaleY}")
}

fun Assert<View>.hasScrollBarDefaultDelayBeforeFade(fade: Int) = given { actual ->
  if (actual.scrollBarDefaultDelayBeforeFade == fade) return@given
  expected("Expected scroll bar default delay before fade <$fade> but was <${actual.scrollBarDefaultDelayBeforeFade}>")
}

fun Assert<View>.hasScrollBarFadeDuration(duration: Int) = given { actual ->
  if (actual.scrollBarFadeDuration == duration) return@given
  expected("Expected scroll bar duration <$duration> but was <${actual.scrollBarFadeDuration}")
}

fun Assert<View>.hasScrollBarSize(size: Int) = given { actual ->
  if (actual.scrollBarSize == size) return@given
  expected("Expected scroll bar size <$size> but was <${actual.scrollBarSize}")
}

fun Assert<View>.hasScrollBarStyle(style: Int) = given { actual ->
  if (actual.scrollBarStyle == style) return@given
  expected("Expected scroll bar style <$style> but was <${actual.scrollBarStyle}>")
}

fun Assert<View>.hasScrollX(scroll: Int) = given { actual ->
  if (actual.scrollX == scroll) return@given
  expected("Expected x scroll <$scroll> but was <${actual.scrollX}>")
}

fun Assert<View>.hasScrollY(scroll: Int) = given { actual ->
  if (actual.scrollY == scroll) return@given
  expected("Expected y scroll <$scroll> but was <${actual.scrollY}>")
}

fun Assert<View>.hasSolidColor(color: Int) = given { actual ->
  if (actual.solidColor == color) return@given
  expected("Expected solid color <$color> but was <${actual.solidColor}>")
}

fun Assert<View>.hasSystemUiVisibility(visibility: Int) = given { actual ->
  if (actual.systemUiVisibility == visibility) return@given
  expected("Expected system UI visibility <$visibility> but was <${actual.systemUiVisibility}>")
}

fun Assert<View>.hasTag(key: Int, tag: Any) = given { actual ->
  val actualObject = actual.getTag(key)
  if (actualObject == tag) return@given
  expected("Expected tag <$tag> at key <$key> but was <$actualObject>")
}

fun Assert<View>.hasTag(tag: Any) = given { actual ->
  val actualObject = actual.tag
  if (actualObject == tag) return@given
  expected("Expected tag <$tag> but was <$actualObject>")
}

fun Assert<View>.hasTextAlignment(textAlignment: Int) = given { actual ->
  if (actual.textAlignment == textAlignment) return@given
  expected("Expected text alignment <$textAlignment> but was <${actual.textAlignment}>")
}

fun Assert<View>.hasTextDirection(textDirection: Int) = given { actual ->
  if (actual.textDirection == textDirection) return@given
  expected("Expected text direction <$textDirection> but was <${actual.textDirection}>")
}

fun Assert<View>.hasTop(top: Int) = given {actual ->
  if (actual.top == top) return@given
  expected("Expected top <$top> but was <${actual.top}>")
}

fun Assert<View>.hasTranslationX(translation: Float) = given { actual ->
  if (actual.translationX == translation) return@given
  expected("Expected x translation <$translation> but was <${actual.translationX}>")
}

fun Assert<View>.hasTranslationY(translation: Float) = given { actual ->
  if (actual.translationY == translation) return@given
  expected("Expected y translation <$translation> but was <${actual.translationY}>")
}

fun Assert<View>.hasTranslationZ(translation: Float) = given { actual ->
  if (actual.translationZ == translation) return@given
  expected("Expected z translation <$translation> but was <${actual.translationZ}>")
}

fun Assert<View>.hasVerticalFadingEdgeLength(fadingEdgeLength: Int) = given { actual ->
  if (actual.verticalFadingEdgeLength == fadingEdgeLength) return@given
  expected("Expected vertical fading edge length <$fadingEdgeLength> but was <${actual.verticalFadingEdgeLength}>")
}

fun Assert<View>.hasVerticalScrollbarPosition(position: Int) = given { actual ->
  if (actual.verticalScrollbarPosition == position) return@given
  expected("Expected vertical scroll bar position <$position> but was <${actual.verticalScrollbarPosition}>")
}

fun Assert<View>.hasVerticalScrollbarWidth(width: Int) = given { actual ->
  if (actual.verticalScrollbarWidth == width) return@given
  expected("Expected veritical scroll bar width <$width> but was <${actual.verticalScrollbarWidth}>")
}

fun Assert<View>.hasVisiblity(visibility: Int) = given { actual ->
  if (actual.visibility == visibility) return@given
  expected("Expected visibility <$visibility> but was <${actual.visibility}>")
}

fun Assert<View>.isVisible() = given { actual ->
  if (actual.visibility == VISIBLE) return@given
  expected("Expected to be visible but was ${visibilityToString(actual.visibility)}")
}

fun Assert<View>.isNotVisible() = given { actual ->
  if (actual.visibility != VISIBLE) return@given
  expected("Expected to not visible but was ${visibilityToString(actual.visibility)}")
}

fun Assert<View>.isInvisible() = given { actual ->
  if (actual.visibility == INVISIBLE) return@given
  expected("Expected to be invisible but was ${visibilityToString(actual.visibility)}")
}

fun Assert<View>.isNotInVisible() = given { actual ->
  if (actual.visibility != INVISIBLE) return@given
  expected("Expected to be not invisible but was ${visibilityToString(actual.visibility)}")
}

fun Assert<View>.isGone() = given { actual ->
  if (actual.visibility == GONE) return@given
  expected("Expected to be gone but was ${visibilityToString(actual.visibility)}")
}

fun Assert<View>.isNotGone() = given { actual ->
  if (actual.visibility != GONE) return@given
  expected("Expected to be not gone but was ${visibilityToString(actual.visibility)}")
}

fun Assert<View>.hasWidth(width: Int) = given { actual ->
  if (actual.width == width) return@given
  expected("Expected width <$width> but was <${actual.width}>")
}

fun Assert<View>.hasWindowVisibility(visibility: Int) = given { actual ->
  if (actual.windowVisibility == visibility) return@given
  expected("Expected window visibility <${visibilityToString(visibility)}> but was <${visibilityToString(actual.windowVisibility)}>")
}

fun Assert<View>.hasX(x: Float) = given { actual ->
  if (actual.x == x) return@given
  expected("Expected x <$x> but was <${actual.x}>")
}

fun Assert<View>.hasY(y: Float) = given { actual ->
  if (actual.y == y) return@given
  expected("Expected y <$y> but was <${actual.y}>")
}

fun Assert<View>.hasZ(z: Float) = given { actual ->
  if (actual.z == z) return@given
  expected("Expected z <$z> but was <${actual.z}>")
}

fun Assert<View>.hasFocus() = given { actual ->
  if (actual.hasFocus()) return@given
  expected("Expected to have focus but was not focused")
}

fun Assert<View>.hasNoFocus() = given { actual ->
  if (!actual.hasFocus()) return@given
  expected("Expected to not have focus but was focused")
}

fun Assert<View>.hasFocusable() = given { actual ->
  if (actual.hasFocusable()) return@given
  expected("Expected to have focusable but was not")
}

fun Assert<View>.isInFocusedWindow() = given { actual ->
  if (actual.hasWindowFocus()) return@given
  expected("Expected to be in focused Window but was not")
}

fun Assert<View>.isNotInFocusedWindow() = given { actual ->
  if (!actual.hasWindowFocus()) return@given
  expected("Expected to not be in focused Window but was")
}

fun Assert<View>.isActivated() = given { actual ->
  if (actual.isActivated) return@given
  expected("Expected to be activated but was not")
}

fun Assert<View>.isNotActivated() = given { actual ->
  if (!actual.isActivated) return@given
  expected("Expected to not be activated but was")
}

fun Assert<View>.isClickable() = given { actual ->
  if (actual.isClickable) return@given
  expected("Expected to be clickable but was not")
}

fun Assert<View>.isNotClickable() = given { actual ->
  if (!actual.isClickable) return@given
  expected("Expected to not be clickable but was")
}

fun Assert<View>.isDirty() = given { actual ->
  if (actual.isDirty) return@given
  expected("Expected to be dirty but was not")
}

fun Assert<View>.isNotDirty() = given { actual ->
  if (!actual.isDirty) return@given
  expected("Expected not to be dirty but was")
}

fun Assert<View>.isUsingDrawingCache() = given { actual ->
  if (actual.isDrawingCacheEnabled) return@given
  expected("Expected to use drawing cache but was not")
}

fun Assert<View>.isNotUsingDrawingCache() = given { actual ->
  if (!actual.isDrawingCacheEnabled) return@given
  expected("Expected to not be using drawing cache but was")
}

fun Assert<View>.isDuplicatingParentState() = given { actual ->
  if (actual.isDuplicateParentStateEnabled) return@given
  expected("Expected to be duplicating parent state but was not")
}

fun Assert<View>.isNotDuplicatingParentState() = given { actual ->
  if (!actual.isDuplicateParentStateEnabled) return@given
  expected("Expected to not be duplicating parent state but was")
}

fun Assert<View>.isEnabled() = given { actual ->
  if (actual.isEnabled) return@given
  expected("Expected to be enabled but was disabled")
}

fun Assert<View>.isDisabled() = given { actual ->
  if (!actual.isEnabled) return@given
  expected("Expected to be disabled but was enabled")
}

fun Assert<View>.isFocusable() = given { actual ->
  if (actual.isFocusable) return@given
  expected("Expected to be focusable but was not")
}

fun Assert<View>.isNotFocusable() = given { actual ->
  if (!actual.isFocusable) return@given
  expected("Expected to not be focusable but was")
}

fun Assert<View>.isFocusableInTouchMode() = given { actual ->
  if (actual.isFocusableInTouchMode) return@given
  expected("Expected to be focusable in touch mode but was not")
}

fun Assert<View>.isNotFocusableInTouchMode() = given { actual ->
  if (!actual.isFocusableInTouchMode) return@given
  expected("Expected to not be focusable in touch but was")
}



fun visibilityToString(visibility: Int): String {
  return BitmaskUtils.buildNamedValueString(visibility.toLong())
    .value(VISIBLE.toLong(), "visible")
    .value(INVISIBLE.toLong(), "invisible")
    .value(GONE.toLong(), "gone")
    .get()
}

