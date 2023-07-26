public abstract class e.f.b.d.d implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public static Double a ( java.lang.Iterable p0 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/lang/Iterable<", */
		 /* "+", */
		 /* "Ljava/lang/Number;", */
		 /* ">;)D" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 e.f.b.d.d .a ( p0 );
	 /* move-result-wide v0 */
	 /* return-wide v0 */
} // .end method
public static Double a ( java.util.Iterator p0 ) {
	 /* .locals 10 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/util/Iterator<", */
	 /* "+", */
	 /* "Ljava/lang/Number;", */
	 /* ">;)D" */
	 /* } */
} // .end annotation
v0 = /* .line 2 */
e.f.b.a.p .a ( v0 );
/* .line 3 */
/* check-cast v0, Ljava/lang/Number; */
(( java.lang.Number ) v0 ).doubleValue ( ); // invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D
/* move-result-wide v0 */
/* const-wide/16 v2, 0x1 */
/* move-wide v4, v2 */
/* .line 4 */
v6 = } // :goto_0
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 5 */
/* check-cast v6, Ljava/lang/Number; */
(( java.lang.Number ) v6 ).doubleValue ( ); // invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D
/* move-result-wide v6 */
/* add-long/2addr v4, v2 */
/* .line 6 */
v8 = e.f.b.e.a .a ( v6,v7 );
if ( v8 != null) { // if-eqz v8, :cond_0
	 v8 = 	 e.f.b.e.a .a ( v0,v1 );
	 if ( v8 != null) { // if-eqz v8, :cond_0
		 /* sub-double/2addr v6, v0 */
		 /* long-to-double v8, v4 */
		 /* div-double/2addr v6, v8 */
		 /* add-double/2addr v0, v6 */
		 /* .line 7 */
	 } // :cond_0
	 e.f.b.d.e .a ( v0,v1,v6,v7 );
	 /* move-result-wide v0 */
} // :cond_1
/* return-wide v0 */
} // .end method
