public abstract class i.f.v extends i.f.u {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static final Integer a ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-gez p0, :cond_0 */
	 } // :cond_0
	 int v0 = 3; // const/4 v0, 0x3
	 /* if-ge p0, v0, :cond_1 */
	 /* add-int/lit8 p0, p0, 0x1 */
} // :cond_1
/* const/high16 v0, 0x40000000 # 2.0f */
/* if-ge p0, v0, :cond_2 */
/* int-to-float p0, p0 */
/* const/high16 v0, 0x3f400000 # 0.75f */
/* div-float/2addr p0, v0 */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* add-float/2addr p0, v0 */
/* float-to-int p0, p0 */
} // :cond_2
/* const p0, 0x7fffffff */
} // :goto_0
} // .end method
public static final java.util.Map a ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Li/d<", */
/* "+TK;+TV;>;)", */
/* "Ljava/util/Map<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
final String v0 = "pair"; // const-string v0, "pair"
i.h.c.k .c ( p0,v0 );
/* .line 1 */
(( i.d ) p0 ).c ( ); // invoke-virtual {p0}, Li/d;->c()Ljava/lang/Object;
(( i.d ) p0 ).d ( ); // invoke-virtual {p0}, Li/d;->d()Ljava/lang/Object;
java.util.Collections .singletonMap ( v0,p0 );
final String v0 = "java.util.Collections.si\u2026(pair.first, pair.second)"; // const-string v0, "java.util.Collections.si\u2026(pair.first, pair.second)"
i.h.c.k .b ( p0,v0 );
} // .end method
public static final java.util.Map a ( java.util.Map p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/Map<", */
/* "+TK;+TV;>;)", */
/* "Ljava/util/Map<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
final String v0 = "$this$toSingletonMap"; // const-string v0, "$this$toSingletonMap"
i.h.c.k .c ( p0,v0 );
/* .line 2 */
/* check-cast p0, Ljava/util/Map$Entry; */
java.util.Collections .singletonMap ( v0,p0 );
final String v0 = "with(entries.iterator().\u2026ingletonMap(key, value) }"; // const-string v0, "with(entries.iterator().\u2026ingletonMap(key, value) }"
i.h.c.k .b ( p0,v0 );
} // .end method
