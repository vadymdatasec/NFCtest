public class e.b.a.y.z.i.f extends android.graphics.drawable.Drawable implements e.b.a.y.z.i.k implements android.graphics.drawable.Animatable implements c.w.a.a.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.b.a.y.z.i.e b;
	 public Boolean c;
	 public Boolean d;
	 public Boolean e;
	 public Boolean f;
	 public Integer g;
	 public Integer h;
	 public Boolean i;
	 public android.graphics.Paint j;
	 public android.graphics.Rect k;
	 public java.util.List l;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Lc/w/a/a/b;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.y.z.i.f ( ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Le/b/a/x/b;", */
/* "Le/b/a/y/v<", */
/* "Landroid/graphics/Bitmap;", */
/* ">;II", */
/* "Landroid/graphics/Bitmap;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Le/b/a/y/z/i/e; */
/* new-instance v8, Le/b/a/y/z/i/n; */
/* .line 2 */
e.b.a.d .a ( p1 );
/* move-object v1, v8 */
/* move-object v3, p2 */
/* move v4, p4 */
/* move v5, p5 */
/* move-object v6, p3 */
/* move-object v7, p6 */
/* invoke-direct/range {v1 ..v7}, Le/b/a/y/z/i/n;-><init>(Le/b/a/d;Le/b/a/x/b;IILe/b/a/y/v;Landroid/graphics/Bitmap;)V */
/* invoke-direct {v0, v8}, Le/b/a/y/z/i/e;-><init>(Le/b/a/y/z/i/n;)V */
/* .line 3 */
/* invoke-direct {p0, v0}, Le/b/a/y/z/i/f;-><init>(Le/b/a/y/z/i/e;)V */
return;
} // .end method
public e.b.a.y.z.i.f ( ) {
/* .locals 1 */
/* .line 4 */
/* invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
/* iput-boolean v0, p0, Le/b/a/y/z/i/f;->f:Z */
int v0 = -1; // const/4 v0, -0x1
/* .line 6 */
/* iput v0, p0, Le/b/a/y/z/i/f;->h:I */
/* .line 7 */
e.b.a.e0.r .a ( p1 );
/* check-cast p1, Le/b/a/y/z/i/e; */
this.b = p1;
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 2 */
/* .line 2 */
(( e.b.a.y.z.i.f ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->b()Landroid/graphics/drawable/Drawable$Callback;
/* if-nez v0, :cond_0 */
/* .line 3 */
(( e.b.a.y.z.i.f ) p0 ).stop ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->stop()V
/* .line 4 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
/* .line 5 */
} // :cond_0
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
/* .line 6 */
v0 = (( e.b.a.y.z.i.f ) p0 ).g ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->g()I
v1 = (( e.b.a.y.z.i.f ) p0 ).f ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->f()I
/* add-int/lit8 v1, v1, -0x1 */
/* if-ne v0, v1, :cond_1 */
/* .line 7 */
/* iget v0, p0, Le/b/a/y/z/i/f;->g:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Le/b/a/y/z/i/f;->g:I */
/* .line 8 */
} // :cond_1
/* iget v0, p0, Le/b/a/y/z/i/f;->h:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_2 */
/* iget v1, p0, Le/b/a/y/z/i/f;->g:I */
/* if-lt v1, v0, :cond_2 */
/* .line 9 */
(( e.b.a.y.z.i.f ) p0 ).j ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->j()V
/* .line 10 */
(( e.b.a.y.z.i.f ) p0 ).stop ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->stop()V
} // :cond_2
return;
} // .end method
public void a ( Object p0, android.graphics.Bitmap p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/v<", */
/* "Landroid/graphics/Bitmap;", */
/* ">;", */
/* "Landroid/graphics/Bitmap;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
v0 = this.a;
(( e.b.a.y.z.i.n ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/b/a/y/z/i/n;->a(Le/b/a/y/v;Landroid/graphics/Bitmap;)V
return;
} // .end method
public final android.graphics.drawable.Drawable$Callback b ( ) {
/* .locals 2 */
/* .line 1 */
(( android.graphics.drawable.Drawable ) p0 ).getCallback ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
/* .line 2 */
} // :goto_0
/* instance-of v1, v0, Landroid/graphics/drawable/Drawable; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
/* check-cast v0, Landroid/graphics/drawable/Drawable; */
(( android.graphics.drawable.Drawable ) v0 ).getCallback ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
} // :cond_0
} // .end method
public java.nio.ByteBuffer c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = this.a;
(( e.b.a.y.z.i.n ) v0 ).b ( ); // invoke-virtual {v0}, Le/b/a/y/z/i/n;->b()Ljava/nio/ByteBuffer;
} // .end method
public final android.graphics.Rect d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
this.k = v0;
/* .line 3 */
} // :cond_0
v0 = this.k;
} // .end method
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 5 */
/* .line 1 */
/* iget-boolean v0, p0, Le/b/a/y/z/i/f;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 2 */
} // :cond_0
/* iget-boolean v0, p0, Le/b/a/y/z/i/f;->i:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* const/16 v0, 0x77 */
/* .line 3 */
v1 = (( e.b.a.y.z.i.f ) p0 ).getIntrinsicWidth ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->getIntrinsicWidth()I
v2 = (( e.b.a.y.z.i.f ) p0 ).getIntrinsicHeight ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->getIntrinsicHeight()I
(( android.graphics.drawable.Drawable ) p0 ).getBounds ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
(( e.b.a.y.z.i.f ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->d()Landroid/graphics/Rect;
android.view.Gravity .apply ( v0,v1,v2,v3,v4 );
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput-boolean v0, p0, Le/b/a/y/z/i/f;->i:Z */
/* .line 5 */
} // :cond_1
v0 = this.b;
v0 = this.a;
(( e.b.a.y.z.i.n ) v0 ).c ( ); // invoke-virtual {v0}, Le/b/a/y/z/i/n;->c()Landroid/graphics/Bitmap;
int v1 = 0; // const/4 v1, 0x0
/* .line 6 */
(( e.b.a.y.z.i.f ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->d()Landroid/graphics/Rect;
(( e.b.a.y.z.i.f ) p0 ).h ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->h()Landroid/graphics/Paint;
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
return;
} // .end method
public android.graphics.Bitmap e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = this.a;
(( e.b.a.y.z.i.n ) v0 ).e ( ); // invoke-virtual {v0}, Le/b/a/y/z/i/n;->e()Landroid/graphics/Bitmap;
} // .end method
public Integer f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = this.a;
v0 = (( e.b.a.y.z.i.n ) v0 ).f ( ); // invoke-virtual {v0}, Le/b/a/y/z/i/n;->f()I
} // .end method
public Integer g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = this.a;
v0 = (( e.b.a.y.z.i.n ) v0 ).d ( ); // invoke-virtual {v0}, Le/b/a/y/z/i/n;->d()I
} // .end method
public android.graphics.drawable.Drawable$ConstantState getConstantState ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public Integer getIntrinsicHeight ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = this.a;
v0 = (( e.b.a.y.z.i.n ) v0 ).g ( ); // invoke-virtual {v0}, Le/b/a/y/z/i/n;->g()I
} // .end method
public Integer getIntrinsicWidth ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = this.a;
v0 = (( e.b.a.y.z.i.n ) v0 ).i ( ); // invoke-virtual {v0}, Le/b/a/y/z/i/n;->i()I
} // .end method
public Integer getOpacity ( ) {
/* .locals 1 */
int v0 = -2; // const/4 v0, -0x2
} // .end method
public final android.graphics.Paint h ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.j;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Landroid/graphics/Paint; */
int v1 = 2; // const/4 v1, 0x2
/* invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V */
this.j = v0;
/* .line 3 */
} // :cond_0
v0 = this.j;
} // .end method
public Integer i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = this.a;
v0 = (( e.b.a.y.z.i.n ) v0 ).h ( ); // invoke-virtual {v0}, Le/b/a/y/z/i/n;->h()I
} // .end method
public Boolean isRunning ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/b/a/y/z/i/f;->c:Z */
} // .end method
public final void j ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.l;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
v0 = /* .line 2 */
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 3 */
v2 = this.l;
/* check-cast v2, Lc/w/a/a/b; */
(( c.w.a.a.b ) v2 ).a ( p0 ); // invoke-virtual {v2, p0}, Lc/w/a/a/b;->a(Landroid/graphics/drawable/Drawable;)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public void k ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Le/b/a/y/z/i/f;->e:Z */
/* .line 2 */
v0 = this.b;
v0 = this.a;
(( e.b.a.y.z.i.n ) v0 ).a ( ); // invoke-virtual {v0}, Le/b/a/y/z/i/n;->a()V
return;
} // .end method
public final void l ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput v0, p0, Le/b/a/y/z/i/f;->g:I */
return;
} // .end method
public final void m ( ) {
/* .locals 3 */
/* .line 1 */
/* iget-boolean v0, p0, Le/b/a/y/z/i/f;->e:Z */
int v1 = 1; // const/4 v1, 0x1
/* xor-int/2addr v0, v1 */
final String v2 = "You cannot start a recycled Drawable.Ensure thatyou clear any references to the Drawable when clearing the corresponding request."; // const-string v2, "You cannot start a recycled Drawable.Ensure thatyou clear any references to the Drawable when clearing the corresponding request."
e.b.a.e0.r .a ( v0,v2 );
/* .line 2 */
v0 = this.b;
v0 = this.a;
v0 = (( e.b.a.y.z.i.n ) v0 ).f ( ); // invoke-virtual {v0}, Le/b/a/y/z/i/n;->f()I
/* if-ne v0, v1, :cond_0 */
/* .line 3 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
/* .line 4 */
} // :cond_0
/* iget-boolean v0, p0, Le/b/a/y/z/i/f;->c:Z */
/* if-nez v0, :cond_1 */
/* .line 5 */
/* iput-boolean v1, p0, Le/b/a/y/z/i/f;->c:Z */
/* .line 6 */
v0 = this.b;
v0 = this.a;
(( e.b.a.y.z.i.n ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Le/b/a/y/z/i/n;->a(Le/b/a/y/z/i/k;)V
/* .line 7 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
} // :cond_1
} // :goto_0
return;
} // .end method
public final void n ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput-boolean v0, p0, Le/b/a/y/z/i/f;->c:Z */
/* .line 2 */
v0 = this.b;
v0 = this.a;
(( e.b.a.y.z.i.n ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Le/b/a/y/z/i/n;->b(Le/b/a/y/z/i/k;)V
return;
} // .end method
public void onBoundsChange ( android.graphics.Rect p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V */
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* iput-boolean p1, p0, Le/b/a/y/z/i/f;->i:Z */
return;
} // .end method
public void setAlpha ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( e.b.a.y.z.i.f ) p0 ).h ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->h()Landroid/graphics/Paint;
(( android.graphics.Paint ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V
return;
} // .end method
public void setColorFilter ( android.graphics.ColorFilter p0 ) {
/* .locals 1 */
/* .line 1 */
(( e.b.a.y.z.i.f ) p0 ).h ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->h()Landroid/graphics/Paint;
(( android.graphics.Paint ) v0 ).setColorFilter ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
return;
} // .end method
public Boolean setVisible ( Boolean p0, Boolean p1 ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Le/b/a/y/z/i/f;->e:Z */
/* xor-int/lit8 v0, v0, 0x1 */
final String v1 = "Cannot change the visibility of a recycled resource.Ensure that you unset the Drawable from your View before changing the View\'s visibility."; // const-string v1, "Cannot change the visibility of a recycled resource.Ensure that you unset the Drawable from your View before changing the View\'s visibility."
e.b.a.e0.r .a ( v0,v1 );
/* .line 2 */
/* iput-boolean p1, p0, Le/b/a/y/z/i/f;->f:Z */
/* if-nez p1, :cond_0 */
/* .line 3 */
(( e.b.a.y.z.i.f ) p0 ).n ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->n()V
/* .line 4 */
} // :cond_0
/* iget-boolean v0, p0, Le/b/a/y/z/i/f;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
(( e.b.a.y.z.i.f ) p0 ).m ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->m()V
/* .line 6 */
} // :cond_1
} // :goto_0
p1 = /* invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z */
} // .end method
public void start ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Le/b/a/y/z/i/f;->d:Z */
/* .line 2 */
(( e.b.a.y.z.i.f ) p0 ).l ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->l()V
/* .line 3 */
/* iget-boolean v0, p0, Le/b/a/y/z/i/f;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
(( e.b.a.y.z.i.f ) p0 ).m ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->m()V
} // :cond_0
return;
} // .end method
public void stop ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput-boolean v0, p0, Le/b/a/y/z/i/f;->d:Z */
/* .line 2 */
(( e.b.a.y.z.i.f ) p0 ).n ( ); // invoke-virtual {p0}, Le/b/a/y/z/i/f;->n()V
return;
} // .end method
