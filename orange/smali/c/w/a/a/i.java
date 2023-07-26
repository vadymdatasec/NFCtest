public class c.w.a.a.i implements android.animation.TypeEvaluator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Landroid/animation/TypeEvaluator<", */
	 /* "[", */
	 /* "Lc/h/g/d;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public c.h.g.d a;
/* # direct methods */
public c.w.a.a.i ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public c.h.g.d a ( Float p0, Object[] p1, Object[] p2 ) {
	 /* .locals 4 */
	 /* .line 1 */
	 v0 = 	 c.h.g.e .a ( p2,p3 );
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 2 */
		 v0 = this.a;
		 v0 = 		 c.h.g.e .a ( v0,p2 );
		 /* if-nez v0, :cond_0 */
		 /* .line 3 */
		 c.h.g.e .a ( p2 );
		 this.a = v0;
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 4 */
} // :goto_0
/* array-length v1, p2 */
/* if-ge v0, v1, :cond_1 */
/* .line 5 */
v1 = this.a;
/* aget-object v1, v1, v0 */
/* aget-object v2, p2, v0 */
/* aget-object v3, p3, v0 */
(( c.h.g.d ) v1 ).a ( v2, v3, p1 ); // invoke-virtual {v1, v2, v3, p1}, Lc/h/g/d;->a(Lc/h/g/d;Lc/h/g/d;F)V
/* add-int/lit8 v0, v0, 0x1 */
/* .line 6 */
} // :cond_1
p1 = this.a;
/* .line 7 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "Can\'t interpolate between two incompatible pathData"; // const-string p2, "Can\'t interpolate between two incompatible pathData"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public java.lang.Object evaluate ( Float p0, java.lang.Object p1, java.lang.Object p2 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p2, [Lc/h/g/d; */
/* check-cast p3, [Lc/h/g/d; */
(( c.w.a.a.i ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lc/w/a/a/i;->a(F[Lc/h/g/d;[Lc/h/g/d;)[Lc/h/g/d;
} // .end method
