public abstract class e.b.a.y.z.e.f implements e.b.a.y.v {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/v<", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.b.a.y.z.e.f ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public abstract android.graphics.Bitmap a ( Object p0, android.graphics.Bitmap p1, Integer p2, Integer p3 ) {
} // .end method
public final e.b.a.y.x.y0 a ( android.content.Context p0, e.b.a.y.x.y0 p1, Integer p2, Integer p3 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Landroid/content/Context;", */
	 /* "Le/b/a/y/x/y0<", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;II)", */
	 /* "Le/b/a/y/x/y0<", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* .line 1 */
v0 = e.b.a.e0.t .b ( p3,p4 );
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* .line 2 */
	 e.b.a.d .a ( p1 );
	 (( e.b.a.d ) p1 ).c ( ); // invoke-virtual {p1}, Le/b/a/d;->c()Le/b/a/y/x/f1/g;
	 /* .line 3 */
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* const/high16 v1, -0x80000000 */
	 /* if-ne p3, v1, :cond_0 */
	 /* .line 4 */
	 p3 = 	 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
} // :cond_0
/* if-ne p4, v1, :cond_1 */
/* .line 5 */
p4 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
/* .line 6 */
} // :cond_1
(( e.b.a.y.z.e.f ) p0 ).a ( p1, v0, p3, p4 ); // invoke-virtual {p0, p1, v0, p3, p4}, Le/b/a/y/z/e/f;->a(Le/b/a/y/x/f1/g;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
/* .line 7 */
p4 = (( java.lang.Object ) v0 ).equals ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( p4 != null) { // if-eqz p4, :cond_2
/* .line 8 */
} // :cond_2
e.b.a.y.z.e.e .a ( p3,p1 );
} // :goto_0
/* .line 9 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Cannot apply transformation on width: "; // const-string v0, "Cannot apply transformation on width: "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p3 = " or height: "; // const-string p3, " or height: "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p4 ); // invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p3 = " less than or equal to zero and not Target.SIZE_ORIGINAL"; // const-string p3, " less than or equal to zero and not Target.SIZE_ORIGINAL"
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
