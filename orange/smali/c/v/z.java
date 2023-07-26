public class c.v.z extends android.util.Property {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Landroid/util/Property<", */
	 /* "TT;", */
	 /* "Ljava/lang/Float;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final android.util.Property a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/Property<", */
/* "TT;", */
/* "Landroid/graphics/PointF;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final android.graphics.PathMeasure b;
public final Float c;
public final d;
public final android.graphics.PointF e;
public Float f;
/* # direct methods */
public c.v.z ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/util/Property<", */
/* "TT;", */
/* "Landroid/graphics/PointF;", */
/* ">;", */
/* "Landroid/graphics/Path;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* const-class v0, Ljava/lang/Float; */
(( android.util.Property ) p1 ).getName ( ); // invoke-virtual {p1}, Landroid/util/Property;->getName()Ljava/lang/String;
/* invoke-direct {p0, v0, v1}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [F */
/* .line 2 */
this.d = v0;
/* .line 3 */
/* new-instance v0, Landroid/graphics/PointF; */
/* invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V */
this.e = v0;
/* .line 4 */
this.a = p1;
/* .line 5 */
/* new-instance p1, Landroid/graphics/PathMeasure; */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p1, p2, v0}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V */
this.b = p1;
/* .line 6 */
p1 = (( android.graphics.PathMeasure ) p1 ).getLength ( ); // invoke-virtual {p1}, Landroid/graphics/PathMeasure;->getLength()F
/* iput p1, p0, Lc/v/z;->c:F */
return;
} // .end method
/* # virtual methods */
public void a ( java.lang.Object p0, java.lang.Float p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;", */
/* "Ljava/lang/Float;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( java.lang.Float ) p2 ).floatValue ( ); // invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F
/* iput v0, p0, Lc/v/z;->f:F */
/* .line 2 */
v0 = this.b;
/* iget v1, p0, Lc/v/z;->c:F */
p2 = (( java.lang.Float ) p2 ).floatValue ( ); // invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F
/* mul-float v1, v1, p2 */
p2 = this.d;
int v2 = 0; // const/4 v2, 0x0
(( android.graphics.PathMeasure ) v0 ).getPosTan ( v1, p2, v2 ); // invoke-virtual {v0, v1, p2, v2}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z
/* .line 3 */
p2 = this.e;
v0 = this.d;
int v1 = 0; // const/4 v1, 0x0
/* aget v1, v0, v1 */
/* iput v1, p2, Landroid/graphics/PointF;->x:F */
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
/* aget v0, v0, v1 */
/* iput v0, p2, Landroid/graphics/PointF;->y:F */
/* .line 5 */
v0 = this.a;
(( android.util.Property ) v0 ).set ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/util/Property;->set(Ljava/lang/Object;Ljava/lang/Object;)V
return;
} // .end method
public java.lang.Float get ( java.lang.Object p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)", */
/* "Ljava/lang/Float;" */
/* } */
} // .end annotation
/* .line 2 */
/* iget p1, p0, Lc/v/z;->f:F */
java.lang.Float .valueOf ( p1 );
} // .end method
public java.lang.Object get ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( c.v.z ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lc/v/z;->get(Ljava/lang/Object;)Ljava/lang/Float;
} // .end method
public void set ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p2, Ljava/lang/Float; */
(( c.v.z ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/v/z;->a(Ljava/lang/Object;Ljava/lang/Float;)V
return;
} // .end method
