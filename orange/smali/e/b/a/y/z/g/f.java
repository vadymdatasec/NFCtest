public abstract class e.b.a.y.z.g.f implements e.b.a.y.x.y0 implements e.b.a.y.x.t0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Landroid/graphics/drawable/Drawable;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/x/y0<", */
	 /* "TT;>;", */
	 /* "Le/b/a/y/x/t0;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final android.graphics.drawable.Drawable b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TT;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.y.z.g.f ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
e.b.a.e0.r .a ( p1 );
/* check-cast p1, Landroid/graphics/drawable/Drawable; */
this.b = p1;
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
/* instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2 */
/* check-cast v0, Landroid/graphics/drawable/BitmapDrawable; */
(( android.graphics.drawable.BitmapDrawable ) v0 ).getBitmap ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
(( android.graphics.Bitmap ) v0 ).prepareToDraw ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V
/* .line 3 */
} // :cond_0
/* instance-of v1, v0, Le/b/a/y/z/i/f; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
/* check-cast v0, Le/b/a/y/z/i/f; */
(( e.b.a.y.z.i.f ) v0 ).e ( ); // invoke-virtual {v0}, Le/b/a/y/z/i/f;->e()Landroid/graphics/Bitmap;
(( android.graphics.Bitmap ) v0 ).prepareToDraw ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V
} // :cond_1
} // :goto_0
return;
} // .end method
public final android.graphics.drawable.Drawable get ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TT;" */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.b;
(( android.graphics.drawable.Drawable ) v0 ).getConstantState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
/* if-nez v0, :cond_0 */
/* .line 3 */
v0 = this.b;
/* .line 4 */
} // :cond_0
(( android.graphics.drawable.Drawable$ConstantState ) v0 ).newDrawable ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;
} // .end method
public java.lang.Object get ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( e.b.a.y.z.g.f ) p0 ).get ( ); // invoke-virtual {p0}, Le/b/a/y/z/g/f;->get()Landroid/graphics/drawable/Drawable;
} // .end method
