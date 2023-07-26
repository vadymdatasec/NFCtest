public abstract class c.b.m.a.l extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable$Callback {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.b.m.a.k b;
	 public android.graphics.Rect c;
	 public android.graphics.drawable.Drawable d;
	 public android.graphics.drawable.Drawable e;
	 public Integer f;
	 public Boolean g;
	 public Integer h;
	 public Boolean i;
	 public java.lang.Runnable j;
	 public Long k;
	 public Long l;
	 public c.b.m.a.j m;
	 /* # direct methods */
	 public c.b.m.a.l ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V */
		 /* const/16 v0, 0xff */
		 /* .line 2 */
		 /* iput v0, p0, Lc/b/m/a/l;->f:I */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 3 */
		 /* iput v0, p0, Lc/b/m/a/l;->h:I */
		 return;
	 } // .end method
	 public static Integer a ( android.content.res.Resources p0, Integer p1 ) {
		 /* .locals 0 */
		 /* if-nez p0, :cond_0 */
		 /* .line 77 */
	 } // :cond_0
	 (( android.content.res.Resources ) p0 ).getDisplayMetrics ( ); // invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 /* iget p1, p0, Landroid/util/DisplayMetrics;->densityDpi:I */
} // :goto_0
/* if-nez p1, :cond_1 */
/* const/16 p1, 0xa0 */
} // :cond_1
} // .end method
/* # virtual methods */
public abstract c.b.m.a.k a ( ) {
} // .end method
public final void a ( android.content.res.Resources p0 ) {
/* .locals 1 */
/* .line 71 */
v0 = this.b;
(( c.b.m.a.k ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/m/a/k;->a(Landroid/content/res/Resources;)V
return;
} // .end method
public final void a ( android.graphics.drawable.Drawable p0 ) {
/* .locals 4 */
/* .line 28 */
v0 = this.m;
/* if-nez v0, :cond_0 */
/* .line 29 */
/* new-instance v0, Lc/b/m/a/j; */
/* invoke-direct {v0}, Lc/b/m/a/j;-><init>()V */
this.m = v0;
/* .line 30 */
} // :cond_0
v0 = this.m;
(( android.graphics.drawable.Drawable ) p1 ).getCallback ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
(( c.b.m.a.j ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/m/a/j;->a(Landroid/graphics/drawable/Drawable$Callback;)Lc/b/m/a/j;
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 31 */
try { // :try_start_0
v0 = this.b;
/* iget v0, v0, Lc/b/m/a/k;->A:I */
/* if-gtz v0, :cond_1 */
/* iget-boolean v0, p0, Lc/b/m/a/l;->g:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 32 */
/* iget v0, p0, Lc/b/m/a/l;->f:I */
(( android.graphics.drawable.Drawable ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
/* .line 33 */
} // :cond_1
v0 = this.b;
/* iget-boolean v0, v0, Lc/b/m/a/k;->E:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 34 */
v0 = this.b;
v0 = this.D;
(( android.graphics.drawable.Drawable ) p1 ).setColorFilter ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V
/* .line 35 */
} // :cond_2
v0 = this.b;
/* iget-boolean v0, v0, Lc/b/m/a/k;->H:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 36 */
v0 = this.b;
v0 = this.F;
c.h.g.r.a .a ( p1,v0 );
/* .line 37 */
} // :cond_3
v0 = this.b;
/* iget-boolean v0, v0, Lc/b/m/a/k;->I:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 38 */
v0 = this.b;
v0 = this.G;
c.h.g.r.a .a ( p1,v0 );
/* .line 39 */
} // :cond_4
} // :goto_0
v0 = (( android.graphics.drawable.Drawable ) p0 ).isVisible ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z
int v1 = 1; // const/4 v1, 0x1
(( android.graphics.drawable.Drawable ) p1 ).setVisible ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
/* .line 40 */
v0 = this.b;
/* iget-boolean v0, v0, Lc/b/m/a/k;->x:Z */
(( android.graphics.drawable.Drawable ) p1 ).setDither ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setDither(Z)V
/* .line 41 */
(( android.graphics.drawable.Drawable ) p0 ).getState ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I
(( android.graphics.drawable.Drawable ) p1 ).setState ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* .line 42 */
v0 = (( android.graphics.drawable.Drawable ) p0 ).getLevel ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I
(( android.graphics.drawable.Drawable ) p1 ).setLevel ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
/* .line 43 */
(( android.graphics.drawable.Drawable ) p0 ).getBounds ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
(( android.graphics.drawable.Drawable ) p1 ).setBounds ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
/* .line 44 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_5 */
/* .line 45 */
v0 = (( android.graphics.drawable.Drawable ) p0 ).getLayoutDirection ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I
(( android.graphics.drawable.Drawable ) p1 ).setLayoutDirection ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z
/* .line 46 */
} // :cond_5
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_6 */
/* .line 47 */
v0 = this.b;
/* iget-boolean v0, v0, Lc/b/m/a/k;->C:Z */
(( android.graphics.drawable.Drawable ) p1 ).setAutoMirrored ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V
/* .line 48 */
} // :cond_6
v0 = this.c;
/* .line 49 */
/* const/16 v2, 0x15 */
/* if-lt v1, v2, :cond_7 */
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 50 */
/* iget v1, v0, Landroid/graphics/Rect;->left:I */
/* iget v2, v0, Landroid/graphics/Rect;->top:I */
/* iget v3, v0, Landroid/graphics/Rect;->right:I */
/* iget v0, v0, Landroid/graphics/Rect;->bottom:I */
(( android.graphics.drawable.Drawable ) p1 ).setHotspotBounds ( v1, v2, v3, v0 ); // invoke-virtual {p1, v1, v2, v3, v0}, Landroid/graphics/drawable/Drawable;->setHotspotBounds(IIII)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 51 */
} // :cond_7
v0 = this.m;
(( c.b.m.a.j ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/m/a/j;->a()Landroid/graphics/drawable/Drawable$Callback;
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
return;
/* :catchall_0 */
/* move-exception v0 */
v1 = this.m;
(( c.b.m.a.j ) v1 ).a ( ); // invoke-virtual {v1}, Lc/b/m/a/j;->a()Landroid/graphics/drawable/Drawable$Callback;
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 52 */
/* throw v0 */
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* .line 72 */
this.b = p1;
/* .line 73 */
/* iget v0, p0, Lc/b/m/a/l;->h:I */
/* if-ltz v0, :cond_0 */
/* .line 74 */
(( c.b.m.a.k ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/b/m/a/k;->a(I)Landroid/graphics/drawable/Drawable;
this.d = p1;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 75 */
(( c.b.m.a.l ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/m/a/l;->a(Landroid/graphics/drawable/Drawable;)V
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 76 */
this.e = p1;
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 13 */
int v0 = 1; // const/4 v0, 0x1
/* .line 53 */
/* iput-boolean v0, p0, Lc/b/m/a/l;->g:Z */
/* .line 54 */
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v1 */
/* .line 55 */
v3 = this.d;
/* const-wide/16 v4, 0xff */
int v6 = 0; // const/4 v6, 0x0
/* const-wide/16 v7, 0x0 */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 56 */
/* iget-wide v9, p0, Lc/b/m/a/l;->k:J */
/* cmp-long v11, v9, v7 */
if ( v11 != null) { // if-eqz v11, :cond_2
/* cmp-long v11, v9, v1 */
/* if-gtz v11, :cond_0 */
/* .line 57 */
/* iget v9, p0, Lc/b/m/a/l;->f:I */
(( android.graphics.drawable.Drawable ) v3 ).setAlpha ( v9 ); // invoke-virtual {v3, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
/* .line 58 */
/* iput-wide v7, p0, Lc/b/m/a/l;->k:J */
} // :cond_0
/* sub-long/2addr v9, v1 */
/* mul-long v9, v9, v4 */
/* long-to-int v10, v9 */
/* .line 59 */
v9 = this.b;
/* iget v9, v9, Lc/b/m/a/k;->A:I */
/* div-int/2addr v10, v9 */
/* rsub-int v9, v10, 0xff */
/* .line 60 */
/* iget v10, p0, Lc/b/m/a/l;->f:I */
/* mul-int v9, v9, v10 */
/* div-int/lit16 v9, v9, 0xff */
(( android.graphics.drawable.Drawable ) v3 ).setAlpha ( v9 ); // invoke-virtual {v3, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
int v3 = 1; // const/4 v3, 0x1
/* .line 61 */
} // :cond_1
/* iput-wide v7, p0, Lc/b/m/a/l;->k:J */
} // :cond_2
} // :goto_0
int v3 = 0; // const/4 v3, 0x0
/* .line 62 */
} // :goto_1
v9 = this.e;
if ( v9 != null) { // if-eqz v9, :cond_4
/* .line 63 */
/* iget-wide v10, p0, Lc/b/m/a/l;->l:J */
/* cmp-long v12, v10, v7 */
if ( v12 != null) { // if-eqz v12, :cond_5
/* cmp-long v12, v10, v1 */
/* if-gtz v12, :cond_3 */
/* .line 64 */
(( android.graphics.drawable.Drawable ) v9 ).setVisible ( v6, v6 ); // invoke-virtual {v9, v6, v6}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
int v0 = 0; // const/4 v0, 0x0
/* .line 65 */
this.e = v0;
/* .line 66 */
/* iput-wide v7, p0, Lc/b/m/a/l;->l:J */
} // :cond_3
/* sub-long/2addr v10, v1 */
/* mul-long v10, v10, v4 */
/* long-to-int v3, v10 */
/* .line 67 */
v4 = this.b;
/* iget v4, v4, Lc/b/m/a/k;->B:I */
/* div-int/2addr v3, v4 */
/* .line 68 */
/* iget v4, p0, Lc/b/m/a/l;->f:I */
/* mul-int v3, v3, v4 */
/* div-int/lit16 v3, v3, 0xff */
(( android.graphics.drawable.Drawable ) v9 ).setAlpha ( v3 ); // invoke-virtual {v9, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
/* .line 69 */
} // :cond_4
/* iput-wide v7, p0, Lc/b/m/a/l;->l:J */
} // :cond_5
} // :goto_2
/* move v0, v3 */
} // :goto_3
if ( p1 != null) { // if-eqz p1, :cond_6
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 70 */
p1 = this.j;
/* const-wide/16 v3, 0x10 */
/* add-long/2addr v1, v3 */
(( android.graphics.drawable.Drawable ) p0 ).scheduleSelf ( p1, v1, v2 ); // invoke-virtual {p0, p1, v1, v2}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V
} // :cond_6
return;
} // .end method
public Boolean a ( Integer p0 ) {
/* .locals 9 */
/* .line 1 */
/* iget v0, p0, Lc/b/m/a/l;->h:I */
int v1 = 0; // const/4 v1, 0x0
/* if-ne p1, v0, :cond_0 */
/* .line 2 */
} // :cond_0
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v2 */
/* .line 3 */
v0 = this.b;
/* iget v0, v0, Lc/b/m/a/k;->B:I */
int v4 = 0; // const/4 v4, 0x0
/* const-wide/16 v5, 0x0 */
/* if-lez v0, :cond_3 */
/* .line 4 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
(( android.graphics.drawable.Drawable ) v0 ).setVisible ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
/* .line 6 */
} // :cond_1
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 7 */
this.e = v0;
/* .line 8 */
v0 = this.b;
/* iget v0, v0, Lc/b/m/a/k;->B:I */
/* int-to-long v0, v0 */
/* add-long/2addr v0, v2 */
/* iput-wide v0, p0, Lc/b/m/a/l;->l:J */
/* .line 9 */
} // :cond_2
this.e = v4;
/* .line 10 */
/* iput-wide v5, p0, Lc/b/m/a/l;->l:J */
/* .line 11 */
} // :cond_3
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 12 */
(( android.graphics.drawable.Drawable ) v0 ).setVisible ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
} // :cond_4
} // :goto_0
/* if-ltz p1, :cond_6 */
/* .line 13 */
v0 = this.b;
/* iget v1, v0, Lc/b/m/a/k;->h:I */
/* if-ge p1, v1, :cond_6 */
/* .line 14 */
(( c.b.m.a.k ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/m/a/k;->a(I)Landroid/graphics/drawable/Drawable;
/* .line 15 */
this.d = v0;
/* .line 16 */
/* iput p1, p0, Lc/b/m/a/l;->h:I */
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 17 */
p1 = this.b;
/* iget p1, p1, Lc/b/m/a/k;->A:I */
/* if-lez p1, :cond_5 */
/* int-to-long v7, p1 */
/* add-long/2addr v2, v7 */
/* .line 18 */
/* iput-wide v2, p0, Lc/b/m/a/l;->k:J */
/* .line 19 */
} // :cond_5
(( c.b.m.a.l ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/m/a/l;->a(Landroid/graphics/drawable/Drawable;)V
/* .line 20 */
} // :cond_6
this.d = v4;
int p1 = -1; // const/4 p1, -0x1
/* .line 21 */
/* iput p1, p0, Lc/b/m/a/l;->h:I */
/* .line 22 */
} // :cond_7
} // :goto_1
/* iget-wide v0, p0, Lc/b/m/a/l;->k:J */
int p1 = 1; // const/4 p1, 0x1
/* cmp-long v2, v0, v5 */
/* if-nez v2, :cond_8 */
/* iget-wide v0, p0, Lc/b/m/a/l;->l:J */
/* cmp-long v2, v0, v5 */
if ( v2 != null) { // if-eqz v2, :cond_a
/* .line 23 */
} // :cond_8
v0 = this.j;
/* if-nez v0, :cond_9 */
/* .line 24 */
/* new-instance v0, Lc/b/m/a/i; */
/* invoke-direct {v0, p0}, Lc/b/m/a/i;-><init>(Lc/b/m/a/l;)V */
this.j = v0;
/* .line 25 */
} // :cond_9
(( android.graphics.drawable.Drawable ) p0 ).unscheduleSelf ( v0 ); // invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V
/* .line 26 */
} // :goto_2
(( c.b.m.a.l ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/m/a/l;->a(Z)V
/* .line 27 */
} // :cond_a
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
} // .end method
public void applyTheme ( android.content.res.Resources$Theme p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( c.b.m.a.k ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/m/a/k;->a(Landroid/content/res/Resources$Theme;)V
return;
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/m/a/l;->h:I */
} // .end method
public final Boolean c ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( c.b.m.a.l ) p0 ).isAutoMirrored ( ); // invoke-virtual {p0}, Lc/b/m/a/l;->isAutoMirrored()Z
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = c.h.g.r.a .d ( p0 );
/* if-ne v0, v1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public Boolean canApplyTheme ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( c.b.m.a.k ) v0 ).canApplyTheme ( ); // invoke-virtual {v0}, Lc/b/m/a/k;->canApplyTheme()Z
} // .end method
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
/* .line 3 */
} // :cond_0
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
(( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
} // :cond_1
return;
} // .end method
public Integer getAlpha ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/b/m/a/l;->f:I */
} // .end method
public Integer getChangingConfigurations ( ) {
/* .locals 2 */
/* .line 1 */
v0 = /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I */
v1 = this.b;
/* .line 2 */
v1 = (( c.b.m.a.k ) v1 ).getChangingConfigurations ( ); // invoke-virtual {v1}, Lc/b/m/a/k;->getChangingConfigurations()I
/* or-int/2addr v0, v1 */
} // .end method
public final android.graphics.drawable.Drawable$ConstantState getConstantState ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
v0 = (( c.b.m.a.k ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/m/a/k;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.b;
v1 = (( c.b.m.a.l ) p0 ).getChangingConfigurations ( ); // invoke-virtual {p0}, Lc/b/m/a/l;->getChangingConfigurations()I
/* iput v1, v0, Lc/b/m/a/k;->d:I */
/* .line 3 */
v0 = this.b;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.graphics.drawable.Drawable getCurrent ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public void getHotspotBounds ( android.graphics.Rect p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.Rect ) p1 ).set ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
/* .line 3 */
} // :cond_0
/* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getHotspotBounds(Landroid/graphics/Rect;)V */
} // :goto_0
return;
} // .end method
public Integer getIntrinsicHeight ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( c.b.m.a.k ) v0 ).m ( ); // invoke-virtual {v0}, Lc/b/m/a/k;->m()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.b;
v0 = (( c.b.m.a.k ) v0 ).f ( ); // invoke-virtual {v0}, Lc/b/m/a/k;->f()I
/* .line 3 */
} // :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
} // :cond_1
int v0 = -1; // const/4 v0, -0x1
} // :goto_0
} // .end method
public Integer getIntrinsicWidth ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( c.b.m.a.k ) v0 ).m ( ); // invoke-virtual {v0}, Lc/b/m/a/k;->m()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.b;
v0 = (( c.b.m.a.k ) v0 ).j ( ); // invoke-virtual {v0}, Lc/b/m/a/k;->j()I
/* .line 3 */
} // :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
} // :cond_1
int v0 = -1; // const/4 v0, -0x1
} // :goto_0
} // .end method
public Integer getMinimumHeight ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( c.b.m.a.k ) v0 ).m ( ); // invoke-virtual {v0}, Lc/b/m/a/k;->m()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.b;
v0 = (( c.b.m.a.k ) v0 ).g ( ); // invoke-virtual {v0}, Lc/b/m/a/k;->g()I
/* .line 3 */
} // :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( android.graphics.drawable.Drawable ) v0 ).getMinimumHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer getMinimumWidth ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( c.b.m.a.k ) v0 ).m ( ); // invoke-virtual {v0}, Lc/b/m/a/k;->m()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.b;
v0 = (( c.b.m.a.k ) v0 ).h ( ); // invoke-virtual {v0}, Lc/b/m/a/k;->h()I
/* .line 3 */
} // :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( android.graphics.drawable.Drawable ) v0 ).getMinimumWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer getOpacity ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( android.graphics.drawable.Drawable ) v0 ).isVisible ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z
/* if-nez v0, :cond_0 */
} // :cond_0
v0 = this.b;
/* .line 2 */
v0 = (( c.b.m.a.k ) v0 ).k ( ); // invoke-virtual {v0}, Lc/b/m/a/k;->k()I
} // :cond_1
} // :goto_0
int v0 = -2; // const/4 v0, -0x2
} // :goto_1
} // .end method
public void getOutline ( android.graphics.Outline p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).getOutline ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getOutline(Landroid/graphics/Outline;)V
} // :cond_0
return;
} // .end method
public Boolean getPadding ( android.graphics.Rect p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
(( c.b.m.a.k ) v0 ).i ( ); // invoke-virtual {v0}, Lc/b/m/a/k;->i()Landroid/graphics/Rect;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
(( android.graphics.Rect ) p1 ).set ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
/* .line 3 */
/* iget v1, v0, Landroid/graphics/Rect;->left:I */
/* iget v2, v0, Landroid/graphics/Rect;->top:I */
/* or-int/2addr v1, v2 */
/* iget v2, v0, Landroid/graphics/Rect;->bottom:I */
/* or-int/2addr v1, v2 */
/* iget v0, v0, Landroid/graphics/Rect;->right:I */
/* or-int/2addr v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
} // :cond_1
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 5 */
v0 = (( android.graphics.drawable.Drawable ) v0 ).getPadding ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* .line 6 */
} // :cond_2
v0 = /* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z */
/* .line 7 */
} // :goto_0
v1 = (( c.b.m.a.l ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/m/a/l;->c()Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 8 */
/* iget v1, p1, Landroid/graphics/Rect;->left:I */
/* .line 9 */
/* iget v2, p1, Landroid/graphics/Rect;->right:I */
/* .line 10 */
/* iput v2, p1, Landroid/graphics/Rect;->left:I */
/* .line 11 */
/* iput v1, p1, Landroid/graphics/Rect;->right:I */
} // :cond_3
} // .end method
public void invalidateDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.m.a.k ) v0 ).l ( ); // invoke-virtual {v0}, Lc/b/m/a/k;->l()V
/* .line 3 */
} // :cond_0
v0 = this.d;
/* if-ne p1, v0, :cond_1 */
(( android.graphics.drawable.Drawable ) p0 ).getCallback ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
(( android.graphics.drawable.Drawable ) p0 ).getCallback ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
} // :cond_1
return;
} // .end method
public Boolean isAutoMirrored ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
/* iget-boolean v0, v0, Lc/b/m/a/k;->C:Z */
} // .end method
public void jumpToCurrentState ( ) {
/* .locals 7 */
/* .line 1 */
v0 = this.e;
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
this.e = v0;
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
} // :goto_0
v2 = this.d;
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 5 */
(( android.graphics.drawable.Drawable ) v2 ).jumpToCurrentState ( ); // invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
/* .line 6 */
/* iget-boolean v2, p0, Lc/b/m/a/l;->g:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 7 */
v2 = this.d;
/* iget v3, p0, Lc/b/m/a/l;->f:I */
(( android.graphics.drawable.Drawable ) v2 ).setAlpha ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
/* .line 8 */
} // :cond_1
/* iget-wide v2, p0, Lc/b/m/a/l;->l:J */
/* const-wide/16 v4, 0x0 */
/* cmp-long v6, v2, v4 */
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 9 */
/* iput-wide v4, p0, Lc/b/m/a/l;->l:J */
int v0 = 1; // const/4 v0, 0x1
/* .line 10 */
} // :cond_2
/* iget-wide v2, p0, Lc/b/m/a/l;->k:J */
/* cmp-long v6, v2, v4 */
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 11 */
/* iput-wide v4, p0, Lc/b/m/a/l;->k:J */
} // :cond_3
/* move v1, v0 */
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 12 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
} // :cond_4
return;
} // .end method
public android.graphics.drawable.Drawable mutate ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/m/a/l;->i:Z */
/* if-nez v0, :cond_0 */
/* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable; */
/* if-ne v0, p0, :cond_0 */
/* .line 2 */
(( c.b.m.a.l ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/m/a/l;->a()Lc/b/m/a/k;
/* .line 3 */
(( c.b.m.a.k ) v0 ).n ( ); // invoke-virtual {v0}, Lc/b/m/a/k;->n()V
/* .line 4 */
(( c.b.m.a.l ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/m/a/l;->a(Lc/b/m/a/k;)V
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
/* iput-boolean v0, p0, Lc/b/m/a/l;->i:Z */
} // :cond_0
} // .end method
public void onBoundsChange ( android.graphics.Rect p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
/* .line 3 */
} // :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
} // :cond_1
return;
} // .end method
public Boolean onLayoutDirectionChanged ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
v1 = (( c.b.m.a.l ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/m/a/l;->b()I
p1 = (( c.b.m.a.k ) v0 ).b ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/b/m/a/k;->b(II)Z
} // .end method
public Boolean onLevelChange ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
p1 = (( android.graphics.drawable.Drawable ) v0 ).setLevel ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
/* .line 3 */
} // :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
p1 = (( android.graphics.drawable.Drawable ) v0 ).setLevel ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void scheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1, Long p2 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
/* if-ne p1, v0, :cond_0 */
(( android.graphics.drawable.Drawable ) p0 ).getCallback ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) p0 ).getCallback ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
} // :cond_0
return;
} // .end method
public void setAlpha ( Integer p0 ) {
/* .locals 6 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/m/a/l;->g:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lc/b/m/a/l;->f:I */
/* if-eq v0, p1, :cond_2 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Lc/b/m/a/l;->g:Z */
/* .line 3 */
/* iput p1, p0, Lc/b/m/a/l;->f:I */
/* .line 4 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 5 */
/* iget-wide v1, p0, Lc/b/m/a/l;->k:J */
/* const-wide/16 v3, 0x0 */
/* cmp-long v5, v1, v3 */
/* if-nez v5, :cond_1 */
/* .line 6 */
(( android.graphics.drawable.Drawable ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
/* .line 7 */
(( c.b.m.a.l ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/m/a/l;->a(Z)V
} // :cond_2
} // :goto_0
return;
} // .end method
public void setAutoMirrored ( Boolean p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
/* iget-boolean v1, v0, Lc/b/m/a/k;->C:Z */
/* if-eq v1, p1, :cond_0 */
/* .line 2 */
/* iput-boolean p1, v0, Lc/b/m/a/k;->C:Z */
/* .line 3 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
c.h.g.r.a .a ( v0,p1 );
} // :cond_0
return;
} // .end method
public void setColorFilter ( android.graphics.ColorFilter p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lc/b/m/a/k;->E:Z */
/* .line 2 */
v1 = this.D;
/* if-eq v1, p1, :cond_0 */
/* .line 3 */
this.D = p1;
/* .line 4 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
(( android.graphics.drawable.Drawable ) v0 ).setColorFilter ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V
} // :cond_0
return;
} // .end method
public void setDither ( Boolean p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
/* iget-boolean v1, v0, Lc/b/m/a/k;->x:Z */
/* if-eq v1, p1, :cond_0 */
/* .line 2 */
/* iput-boolean p1, v0, Lc/b/m/a/k;->x:Z */
/* .line 3 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
(( android.graphics.drawable.Drawable ) v0 ).setDither ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setDither(Z)V
} // :cond_0
return;
} // .end method
public void setHotspot ( Float p0, Float p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
c.h.g.r.a .a ( v0,p1,p2 );
} // :cond_0
return;
} // .end method
public void setHotspotBounds ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;-><init>(IIII)V */
this.c = v0;
/* .line 3 */
} // :cond_0
(( android.graphics.Rect ) v0 ).set ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V
/* .line 4 */
} // :goto_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
c.h.g.r.a .a ( v0,p1,p2,p3,p4 );
} // :cond_1
return;
} // .end method
public void setTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lc/b/m/a/k;->H:Z */
/* .line 2 */
v1 = this.F;
/* if-eq v1, p1, :cond_0 */
/* .line 3 */
this.F = p1;
/* .line 4 */
v0 = this.d;
c.h.g.r.a .a ( v0,p1 );
} // :cond_0
return;
} // .end method
public void setTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lc/b/m/a/k;->I:Z */
/* .line 2 */
v1 = this.G;
/* if-eq v1, p1, :cond_0 */
/* .line 3 */
this.G = p1;
/* .line 4 */
v0 = this.d;
c.h.g.r.a .a ( v0,p1 );
} // :cond_0
return;
} // .end method
public Boolean setVisible ( Boolean p0, Boolean p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z */
/* .line 2 */
v1 = this.e;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
(( android.graphics.drawable.Drawable ) v1 ).setVisible ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
/* .line 4 */
} // :cond_0
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 5 */
(( android.graphics.drawable.Drawable ) v1 ).setVisible ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
} // :cond_1
} // .end method
public void unscheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
/* if-ne p1, v0, :cond_0 */
(( android.graphics.drawable.Drawable ) p0 ).getCallback ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) p0 ).getCallback ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;
} // :cond_0
return;
} // .end method
