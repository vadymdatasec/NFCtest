public abstract class i.i.g extends i.i.f {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static final Integer a ( Integer p0, Integer p1 ) {
		 /* .locals 0 */
		 /* if-ge p0, p1, :cond_0 */
		 /* move p0, p1 */
	 } // :cond_0
} // .end method
public static final Integer a ( Integer p0, Integer p1, Integer p2 ) {
	 /* .locals 2 */
	 /* if-gt p1, p2, :cond_2 */
	 /* if-ge p0, p1, :cond_0 */
} // :cond_0
/* if-le p0, p2, :cond_1 */
} // :cond_1
/* .line 1 */
} // :cond_2
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Cannot coerce value to an empty range: maximum "; // const-string v1, "Cannot coerce value to an empty range: maximum "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p2 = " is less than minimum "; // const-string p2, " is less than minimum "
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* const/16 p1, 0x2e */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static final Integer b ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* if-le p0, p1, :cond_0 */
/* move p0, p1 */
} // :cond_0
} // .end method
public static final i.i.b c ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = i.i.b.e;
int v1 = -1; // const/4 v1, -0x1
(( i.i.a ) v0 ).a ( p0, p1, v1 ); // invoke-virtual {v0, p0, p1, v1}, Li/i/a;->a(III)Li/i/b;
} // .end method
public static final i.i.e d ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* const/high16 v0, -0x80000000 */
/* if-gt p1, v0, :cond_0 */
/* .line 1 */
p0 = i.i.e.g;
(( i.i.d ) p0 ).a ( ); // invoke-virtual {p0}, Li/i/d;->a()Li/i/e;
/* .line 2 */
} // :cond_0
/* new-instance v0, Li/i/e; */
/* add-int/lit8 p1, p1, -0x1 */
/* invoke-direct {v0, p0, p1}, Li/i/e;-><init>(II)V */
} // .end method
