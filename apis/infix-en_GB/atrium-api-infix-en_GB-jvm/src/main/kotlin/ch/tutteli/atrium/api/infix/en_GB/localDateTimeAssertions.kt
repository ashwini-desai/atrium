//TODO rename file to localDateTimeExpectations with 0.18.0
@file:Suppress(
    "FINAL_UPPER_BOUND" /* remove once https://youtrack.jetbrains.com/issue/KT-34257 is fixed */,
    "JAVA_MODULE_DOES_NOT_READ_UNNAMED_MODULE" /* TODO remove once https://youtrack.jetbrains.com/issue/KT-35343 is fixed */
)

package ch.tutteli.atrium.api.infix.en_GB

import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.logic.*
import java.time.DayOfWeek
import java.time.LocalDateTime

/**
 * Creates an [Expect] for the property [LocalDateTime.year][[LocalDateTime.getYear] of the subject of `this` expectation,
 * so that further fluent calls are assertions about it.
 *
 * @return The newly created [Expect] for the extracted feature.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.LocalDateTimeExpectationSamples.yearFeature
 *
 * @since 0.12.0
 */
val Expect<LocalDateTime>.year: Expect<Int>
    get() = _logic.year().transform()

/**
 * Expects that the property [LocalDateTime.year][LocalDateTime.getYear] of the subject of `this` expectation
 * holds all assertions the given [assertionCreator] creates for it and
 * returns an [Expect] for the current subject of `this` expectation.
 *
 * @return an [Expect] for the subject of `this` expectation.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.LocalDateTimeExpectationSamples.year
 *
 * @since 0.12.0
 */
infix fun Expect<LocalDateTime>.year(assertionCreator: Expect<Int>.() -> Unit): Expect<LocalDateTime> =
    _logic.year().collectAndAppend(assertionCreator)

/**
 * Creates an [Expect] for the property [LocalDateTime.monthValue][LocalDateTime.getMonthValue]
 * of the subject of `this` expectation, so that further fluent calls are assertions about it.
 *
 * @return The newly created [Expect] for the extracted feature.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.LocalDateTimeExpectationSamples.monthFeature
 *
 * @since 0.12.0
 */
val Expect<LocalDateTime>.month: Expect<Int>
    get() = _logic.month().transform()

/**
 * Expects that the property [LocalDateTime.monthValue][LocalDateTime.getMonthValue]of the subject of `this` expectation
 * holds all assertions the given [assertionCreator] creates for it and
 * returns an [Expect] for the current subject of `this` expectation.
 *
 * @return an [Expect] for the subject of `this` expectation.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.LocalDateTimeExpectationSamples.month
 *
 * @since 0.12.0
 */
infix fun Expect<LocalDateTime>.month(assertionCreator: Expect<Int>.() -> Unit): Expect<LocalDateTime> =
    _logic.month().collectAndAppend(assertionCreator)

/**
 * Creates an [Expect] for the property [LocalDateTime.dayOfWeek][LocalDateTime.getDayOfWeek]
 * of the subject of `this` expectation, so that further fluent calls are assertions about it.
 *
 * @return The newly created [Expect] for the extracted feature.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.LocalDateTimeExpectationSamples.dayOfWeekFeature
 *
 * @since 0.12.0
 */
val Expect<LocalDateTime>.dayOfWeek: Expect<DayOfWeek>
    get() = _logic.dayOfWeek().transform()

/**
 * Expects that the property [LocalDateTime.dayOfWeek][LocalDateTime.getDayOfWeek]of the subject of `this` expectation
 * holds all assertions the given [assertionCreator] creates for it and
 * returns an [Expect] for the current subject of `this` expectation.
 *
 * @return an [Expect] for the subject of `this` expectation.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.LocalDateTimeExpectationSamples.dayOfWeek
 *
 * @since 0.12.0
 */
infix fun Expect<LocalDateTime>.dayOfWeek(assertionCreator: Expect<DayOfWeek>.() -> Unit): Expect<LocalDateTime> =
    _logic.dayOfWeek().collectAndAppend(assertionCreator)

/**
 * Creates an [Expect] for the property [LocalDateTime.dayOfMonth][LocalDateTime.getDayOfMonth]
 * of the subject of `this` expectation, so that further fluent calls are assertions about it.
 *
 * @return The newly created [Expect] for the extracted feature.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.LocalDateTimeExpectationSamples.dayFeature
 *
 * @since 0.12.0
 */
val Expect<LocalDateTime>.day: Expect<Int>
    get() = _logic.day().transform()

/**
 * Expects that the property [LocalDateTime.dayOfMonth][LocalDateTime.getDayOfMonth] of the subject of `this` expectation
 * holds all assertions the given [assertionCreator] creates for it and
 * returns an [Expect] for the current subject of `this` expectation.
 *
 * @return an [Expect] for the subject of `this` expectation.
 *
 * @sample ch.tutteli.atrium.api.infix.en_GB.samples.LocalDateTimeExpectationSamples.day
 *
 * @since 0.12.0
 */
infix fun Expect<LocalDateTime>.day(assertionCreator: Expect<Int>.() -> Unit): Expect<LocalDateTime> =
    _logic.day().collectAndAppend(assertionCreator)

