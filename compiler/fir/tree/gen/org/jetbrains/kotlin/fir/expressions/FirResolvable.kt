/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.expressions

import org.jetbrains.kotlin.fir.FirElement
import org.jetbrains.kotlin.fir.FirSourceElement
import org.jetbrains.kotlin.fir.references.FirReference
import org.jetbrains.kotlin.fir.visitors.*

/*
 * This file was generated automatically
 * DO NOT MODIFY IT MANUALLY
 */

interface FirResolvable : FirElement {
    override val source: FirSourceElement?
    val calleeReference: FirReference

    override fun <R, D> accept(visitor: FirVisitor<R, D>, data: D): R = visitor.visitResolvable(this, data)

    override fun replaceSource(newSource: FirSourceElement?)

    fun replaceCalleeReference(newCalleeReference: FirReference)

    fun <D> transformCalleeReference(transformer: FirTransformer<D>, data: D): FirResolvable
}
