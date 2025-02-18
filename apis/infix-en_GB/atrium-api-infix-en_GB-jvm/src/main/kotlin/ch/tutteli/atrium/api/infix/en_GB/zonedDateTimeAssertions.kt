//TODO rename file to zonedDateTimeExpectations with 0.18.0
@file:Suppress(
    "FINAL_UPPER_BOUND" /* remove once https://youtrack.jetbrains.com/issue/KT-34257 is fixed */,
    "JAVA_MODULE_DOES_NOT_READ_UNNAMED_MODULE" /* TODO remove once https://youtrack.jetbrains.com/issue/KT-35343 is fixed */
)

package ch.tutteli.atrium.api.infix.en_GB

import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.logic.*
import java.time.DayOfWeek
import java.time.ZonedDateTime

/**
 * Creates an [Expect] for the property [ZonedDateTime.year][ZonedDateTime.getYear] of the subject of `this` expectation,
 * so that further fluent calls are assertions about it.
 *
 * @return The newly created [Expect] for the extracted feature.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.ZonedDateTimeExpectationSamples.yearFeature
 *
 * @since 0.12.0
 */
val Expect<ZonedDateTime>.year: Expect<Int>
    get() = _logic.year().transform()

/**
 * Expects that the property [ZonedDateTime.year][ZonedDateTime.getYear] of the subject of `this` expectation
 * holds all assertions the given [assertionCreator] creates for it and
 * returns an [Expect] for the current subject of `this` expectation.
 *
 * @return an [Expect] for the subject of `this` expectation.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.ZonedDateTimeExpectationSamples.year
 *
 * @since 0.12.0
 */
infix fun Expect<ZonedDateTime>.year(assertionCreator: Expect<Int>.() -> Unit): Expect<ZonedDateTime> =
    _logic.year().collectAndAppend(assertionCreator)

/**
 * Creates an [Expect] for the property [ZonedDateTime.monthValue][ZonedDateTime.getMonthValue]
 * of the subject of `this` expectation, so that further fluent calls are assertions about it.
 *
 * @return The newly created [Expect] for the extracted feature.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.ZonedDateTimeExpectationSamples.monthFeature
 *
 * @since 0.12.0
 */
val Expect<ZonedDateTime>.month: Expect<Int>
    get() = _logic.month().transform()

/**
 * Expects that the property [ZonedDateTime.monthValue][ZonedDateTime.getMonthValue] of the subject of `this` expectation
 * holds all assertions the given [assertionCreator] creates for it and
 * returns an [Expect] for the current subject of `this` expectation.
 *
 * @return an [Expect] for the subject of `this` expectation.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.ZonedDateTimeExpectationSamples.month
 *
 * @since 0.12.0
 */
infix fun Expect<ZonedDateTime>.month(assertionCreator: Expect<Int>.() -> Unit): Expect<ZonedDateTime> =
    _logic.month().collectAndAppend(assertionCreator)

/**
 * Creates an [Expect] for the property [ZonedDatetime.dayOfWeek][ZonedDateTime.getDayOfWeek]
 * of the subject of `this` expectation, so that further fluent calls are assertions about it.
 *
 * @return The newly created [Expect] for the extracted feature.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.ZonedDateTimeExpectationSamples.dayOfWeekFeature
 *
 * @since 0.12.0
 */
val Expect<ZonedDateTime>.dayOfWeek: Expect<DayOfWeek>
    get() = _logic.dayOfWeek().transform()

/**
 * Expects that the property [ZonedDatetime.dayOfWeek][ZonedDateTime.getDayOfWeek] of the subject of `this` expectation
 * holds all assertions the given [assertionCreator] creates for it and
 * returns an [Expect] for the current subject of `this` expectation.
 *
 * @return an [Expect] for the subject of `this` expectation.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.ZonedDateTimeExpectationSamples.dayOfWeek
 *
 * @since 0.12.0
 */
infix fun Expect<ZonedDateTime>.dayOfWeek(assertionCreator: Expect<DayOfWeek>.() -> Unit): Expect<ZonedDateTime> =
    _logic.dayOfWeek().collectAndAppend(assertionCreator)

/**
 * Creates an [Expect] for the property [ZonedDateTime.dayOfMonth][ZonedDateTime.getDayOfMonth]
 * of the subject of `this` expectation, so that further fluent calls are assertions about it.
 *
 * @return The newly created [Expect] for the extracted feature.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.ZonedDateTimeExpectationSamples.dayFeature
 *
 * @since 0.12.0
 */
val Expect<ZonedDateTime>.day: Expect<Int>
    get() = _logic.day().transform()

/**
 * Expects that the property [ZonedDateTime.dayOfMonth][ZonedDateTime.getDayOfMonth] of the subject of `this` expectation
 * holds all assertions the given [assertionCreator] creates for it and
 * returns an [Expect] for the current subject of `this` expectation.
 *
 * @return an [Expect] for the subject of `this` expectation.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.ZonedDateTimeExpectationSamples.day
 *
 * @since 0.12.0
 */
infix fun Expect<ZonedDateTime>.day(assertionCreator: Expect<Int>.() -> Unit): Expect<ZonedDateTime> =
    _logic.day().collectAndAppend(assertionCreator)
