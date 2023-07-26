public class androidx.appcompat.widget.SwitchCompat extends android.widget.CompoundButton {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final android.util.Property O;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/util/Property<", */
	 /* "Landroidx/appcompat/widget/SwitchCompat;", */
	 /* "Ljava/lang/Float;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final P;
/* # instance fields */
public Integer A;
public Integer B;
public Integer C;
public Integer D;
public Integer E;
public Integer F;
public final android.text.TextPaint G;
public android.content.res.ColorStateList H;
public android.text.Layout I;
public android.text.Layout J;
public android.text.method.TransformationMethod K;
public android.animation.ObjectAnimator L;
public final c.b.q.u0 M;
public final android.graphics.Rect N;
public android.graphics.drawable.Drawable b;
public android.content.res.ColorStateList c;
public android.graphics.PorterDuff$Mode d;
public Boolean e;
public Boolean f;
public android.graphics.drawable.Drawable g;
public android.content.res.ColorStateList h;
public android.graphics.PorterDuff$Mode i;
public Boolean j;
public Boolean k;
public Integer l;
public Integer m;
public Integer n;
public Boolean o;
public java.lang.CharSequence p;
public java.lang.CharSequence q;
public Boolean r;
public Integer s;
public Integer t;
public Float u;
public Float v;
public android.view.VelocityTracker w;
public Integer x;
public Float y;
public Integer z;
/* # direct methods */
public static androidx.appcompat.widget.SwitchCompat ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Landroidx/appcompat/widget/SwitchCompat$a; */
/* const-class v1, Ljava/lang/Float; */
final String v2 = "thumbPos"; // const-string v2, "thumbPos"
/* invoke-direct {v0, v1, v2}, Landroidx/appcompat/widget/SwitchCompat$a;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [I */
int v1 = 0; // const/4 v1, 0x0
/* const v2, 0x10100a0 */
/* aput v2, v0, v1 */
/* .line 2 */
return;
} // .end method
public androidx.appcompat.widget.SwitchCompat ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/SwitchCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public androidx.appcompat.widget.SwitchCompat ( ) {
/* .locals 1 */
/* .line 2 */
/* invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/SwitchCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public androidx.appcompat.widget.SwitchCompat ( ) {
/* .locals 7 */
/* .line 3 */
/* invoke-direct {p0, p1, p2, p3}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
this.c = v0;
/* .line 5 */
this.d = v0;
int v1 = 0; // const/4 v1, 0x0
/* .line 6 */
/* iput-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->e:Z */
/* .line 7 */
/* iput-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->f:Z */
/* .line 8 */
this.h = v0;
/* .line 9 */
this.i = v0;
/* .line 10 */
/* iput-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->j:Z */
/* .line 11 */
/* iput-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->k:Z */
/* .line 12 */
android.view.VelocityTracker .obtain ( );
this.w = v2;
/* .line 13 */
/* new-instance v2, Landroid/graphics/Rect; */
/* invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V */
this.N = v2;
/* .line 14 */
/* new-instance v2, Landroid/text/TextPaint; */
int v3 = 1; // const/4 v3, 0x1
/* invoke-direct {v2, v3}, Landroid/text/TextPaint;-><init>(I)V */
this.G = v2;
/* .line 15 */
(( android.widget.CompoundButton ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getResources()Landroid/content/res/Resources;
/* .line 16 */
v4 = this.G;
(( android.content.res.Resources ) v2 ).getDisplayMetrics ( ); // invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v2, v2, Landroid/util/DisplayMetrics;->density:F */
/* iput v2, v4, Landroid/text/TextPaint;->density:F */
/* .line 17 */
v2 = c.b.j.SwitchCompat;
c.b.q.k2 .a ( p1,p2,v2,p3,v1 );
/* .line 18 */
(( c.b.q.k2 ) v2 ).b ( v4 ); // invoke-virtual {v2, v4}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
this.b = v4;
if ( v4 != null) { // if-eqz v4, :cond_0
	 /* .line 19 */
	 (( android.graphics.drawable.Drawable ) v4 ).setCallback ( p0 ); // invoke-virtual {v4, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
	 /* .line 20 */
} // :cond_0
(( c.b.q.k2 ) v2 ).b ( v4 ); // invoke-virtual {v2, v4}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
this.g = v4;
if ( v4 != null) { // if-eqz v4, :cond_1
	 /* .line 21 */
	 (( android.graphics.drawable.Drawable ) v4 ).setCallback ( p0 ); // invoke-virtual {v4, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
	 /* .line 22 */
} // :cond_1
(( c.b.q.k2 ) v2 ).e ( v4 ); // invoke-virtual {v2, v4}, Lc/b/q/k2;->e(I)Ljava/lang/CharSequence;
this.p = v4;
/* .line 23 */
(( c.b.q.k2 ) v2 ).e ( v4 ); // invoke-virtual {v2, v4}, Lc/b/q/k2;->e(I)Ljava/lang/CharSequence;
this.q = v4;
/* .line 24 */
v4 = (( c.b.q.k2 ) v2 ).a ( v4, v3 ); // invoke-virtual {v2, v4, v3}, Lc/b/q/k2;->a(IZ)Z
/* iput-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->r:Z */
/* .line 25 */
v4 = (( c.b.q.k2 ) v2 ).c ( v4, v1 ); // invoke-virtual {v2, v4, v1}, Lc/b/q/k2;->c(II)I
/* iput v4, p0, Landroidx/appcompat/widget/SwitchCompat;->l:I */
/* .line 26 */
v4 = (( c.b.q.k2 ) v2 ).c ( v4, v1 ); // invoke-virtual {v2, v4, v1}, Lc/b/q/k2;->c(II)I
/* iput v4, p0, Landroidx/appcompat/widget/SwitchCompat;->m:I */
/* .line 27 */
v4 = (( c.b.q.k2 ) v2 ).c ( v4, v1 ); // invoke-virtual {v2, v4, v1}, Lc/b/q/k2;->c(II)I
/* iput v4, p0, Landroidx/appcompat/widget/SwitchCompat;->n:I */
/* .line 28 */
v4 = (( c.b.q.k2 ) v2 ).a ( v4, v1 ); // invoke-virtual {v2, v4, v1}, Lc/b/q/k2;->a(IZ)Z
/* iput-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->o:Z */
/* .line 29 */
(( c.b.q.k2 ) v2 ).a ( v4 ); // invoke-virtual {v2, v4}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
if ( v4 != null) { // if-eqz v4, :cond_2
	 /* .line 30 */
	 this.c = v4;
	 /* .line 31 */
	 /* iput-boolean v3, p0, Landroidx/appcompat/widget/SwitchCompat;->e:Z */
	 /* .line 32 */
} // :cond_2
int v5 = -1; // const/4 v5, -0x1
/* .line 33 */
v4 = (( c.b.q.k2 ) v2 ).d ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Lc/b/q/k2;->d(II)I
/* .line 34 */
c.b.q.a1 .a ( v4,v0 );
/* .line 35 */
v6 = this.d;
/* if-eq v6, v4, :cond_3 */
/* .line 36 */
this.d = v4;
/* .line 37 */
/* iput-boolean v3, p0, Landroidx/appcompat/widget/SwitchCompat;->f:Z */
/* .line 38 */
} // :cond_3
/* iget-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->e:Z */
/* if-nez v4, :cond_4 */
/* iget-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->f:Z */
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 39 */
} // :cond_4
(( androidx.appcompat.widget.SwitchCompat ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->a()V
/* .line 40 */
} // :cond_5
(( c.b.q.k2 ) v2 ).a ( v4 ); // invoke-virtual {v2, v4}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 41 */
this.h = v4;
/* .line 42 */
/* iput-boolean v3, p0, Landroidx/appcompat/widget/SwitchCompat;->j:Z */
/* .line 43 */
} // :cond_6
/* .line 44 */
v4 = (( c.b.q.k2 ) v2 ).d ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Lc/b/q/k2;->d(II)I
/* .line 45 */
c.b.q.a1 .a ( v4,v0 );
/* .line 46 */
v4 = this.i;
/* if-eq v4, v0, :cond_7 */
/* .line 47 */
this.i = v0;
/* .line 48 */
/* iput-boolean v3, p0, Landroidx/appcompat/widget/SwitchCompat;->k:Z */
/* .line 49 */
} // :cond_7
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->j:Z */
/* if-nez v0, :cond_8 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_9
/* .line 50 */
} // :cond_8
(( androidx.appcompat.widget.SwitchCompat ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->b()V
/* .line 51 */
} // :cond_9
v0 = (( c.b.q.k2 ) v2 ).g ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lc/b/q/k2;->g(II)I
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 52 */
(( androidx.appcompat.widget.SwitchCompat ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/SwitchCompat;->a(Landroid/content/Context;I)V
/* .line 53 */
} // :cond_a
/* new-instance v0, Lc/b/q/u0; */
/* invoke-direct {v0, p0}, Lc/b/q/u0;-><init>(Landroid/widget/TextView;)V */
this.M = v0;
/* .line 54 */
(( c.b.q.u0 ) v0 ).a ( p2, p3 ); // invoke-virtual {v0, p2, p3}, Lc/b/q/u0;->a(Landroid/util/AttributeSet;I)V
/* .line 55 */
(( c.b.q.k2 ) v2 ).a ( ); // invoke-virtual {v2}, Lc/b/q/k2;->a()V
/* .line 56 */
android.view.ViewConfiguration .get ( p1 );
/* .line 57 */
p2 = (( android.view.ViewConfiguration ) p1 ).getScaledTouchSlop ( ); // invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
/* iput p2, p0, Landroidx/appcompat/widget/SwitchCompat;->t:I */
/* .line 58 */
p1 = (( android.view.ViewConfiguration ) p1 ).getScaledMinimumFlingVelocity ( ); // invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I
/* iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->x:I */
/* .line 59 */
(( android.widget.CompoundButton ) p0 ).refreshDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->refreshDrawableState()V
/* .line 60 */
p1 = (( android.widget.CompoundButton ) p0 ).isChecked ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z
(( androidx.appcompat.widget.SwitchCompat ) p0 ).setChecked ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V
return;
} // .end method
public static Float a ( Float p0, Float p1, Float p2 ) {
/* .locals 1 */
/* cmpg-float v0, p0, p1 */
/* if-gez v0, :cond_0 */
/* move p0, p1 */
} // :cond_0
/* cmpl-float p1, p0, p2 */
/* if-lez p1, :cond_1 */
/* move p0, p2 */
} // :cond_1
} // :goto_0
} // .end method
private Boolean getTargetCheckedState ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->y:F */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
private Integer getThumbOffset ( ) {
/* .locals 2 */
/* .line 1 */
v0 = c.b.q.v2 .a ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* const/high16 v0, 0x3f800000 # 1.0f */
/* .line 2 */
/* iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->y:F */
/* sub-float/2addr v0, v1 */
/* .line 3 */
} // :cond_0
/* iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->y:F */
/* .line 4 */
} // :goto_0
v1 = /* invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->getThumbScrollRange()I */
/* int-to-float v1, v1 */
/* mul-float v0, v0, v1 */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* add-float/2addr v0, v1 */
/* float-to-int v0, v0 */
} // .end method
private Integer getThumbScrollRange ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v1 = this.N;
/* .line 3 */
(( android.graphics.drawable.Drawable ) v0 ).getPadding ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* .line 4 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
c.b.q.a1 .d ( v0 );
/* .line 6 */
} // :cond_0
v0 = c.b.q.a1.c;
/* .line 7 */
} // :goto_0
/* iget v2, p0, Landroidx/appcompat/widget/SwitchCompat;->z:I */
/* iget v3, p0, Landroidx/appcompat/widget/SwitchCompat;->B:I */
/* sub-int/2addr v2, v3 */
/* iget v3, v1, Landroid/graphics/Rect;->left:I */
/* sub-int/2addr v2, v3 */
/* iget v1, v1, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr v2, v1 */
/* iget v1, v0, Landroid/graphics/Rect;->left:I */
/* sub-int/2addr v2, v1 */
/* iget v0, v0, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr v2, v0 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public final android.text.Layout a ( java.lang.CharSequence p0 ) {
/* .locals 8 */
/* .line 37 */
v0 = this.K;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 38 */
} // :cond_0
/* move-object v1, p1 */
/* .line 39 */
/* new-instance p1, Landroid/text/StaticLayout; */
v2 = this.G;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 40 */
v0 = android.text.Layout .getDesiredWidth ( v1,v2 );
/* float-to-double v3, v0 */
java.lang.Math .ceil ( v3,v4 );
/* move-result-wide v3 */
/* double-to-int v0, v3 */
/* move v3, v0 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
v4 = android.text.Layout$Alignment.ALIGN_NORMAL;
/* const/high16 v5, 0x3f800000 # 1.0f */
int v6 = 0; // const/4 v6, 0x0
int v7 = 1; // const/4 v7, 0x1
/* move-object v0, p1 */
/* invoke-direct/range {v0 ..v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V */
} // .end method
public final void a ( ) {
/* .locals 2 */
/* .line 29 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_3
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->e:Z */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 30 */
} // :cond_0
v0 = this.b;
c.h.g.r.a .h ( v0 );
(( android.graphics.drawable.Drawable ) v0 ).mutate ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
this.b = v0;
/* .line 31 */
/* iget-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->e:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 32 */
v1 = this.c;
c.h.g.r.a .a ( v0,v1 );
/* .line 33 */
} // :cond_1
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 34 */
v0 = this.b;
v1 = this.d;
c.h.g.r.a .a ( v0,v1 );
/* .line 35 */
} // :cond_2
v0 = this.b;
v0 = (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 36 */
v0 = this.b;
(( android.widget.CompoundButton ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_3
return;
} // .end method
public final void a ( Integer p0, Integer p1 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* if-eq p1, v0, :cond_2 */
int v0 = 2; // const/4 v0, 0x2
/* if-eq p1, v0, :cond_1 */
int v0 = 3; // const/4 v0, 0x3
/* if-eq p1, v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 16 */
} // :cond_0
p1 = android.graphics.Typeface.MONOSPACE;
/* .line 17 */
} // :cond_1
p1 = android.graphics.Typeface.SERIF;
/* .line 18 */
} // :cond_2
p1 = android.graphics.Typeface.SANS_SERIF;
/* .line 19 */
} // :goto_0
(( androidx.appcompat.widget.SwitchCompat ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/SwitchCompat;->a(Landroid/graphics/Typeface;I)V
return;
} // .end method
public void a ( android.content.Context p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = c.b.j.TextAppearance;
c.b.q.k2 .a ( p1,p2,v0 );
/* .line 2 */
(( c.b.q.k2 ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 3 */
this.H = p2;
/* .line 4 */
} // :cond_0
(( android.widget.CompoundButton ) p0 ).getTextColors ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getTextColors()Landroid/content/res/ColorStateList;
this.H = p2;
/* .line 5 */
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
p2 = (( c.b.q.k2 ) p1 ).c ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lc/b/q/k2;->c(II)I
if ( p2 != null) { // if-eqz p2, :cond_1
/* int-to-float p2, p2 */
/* .line 6 */
v1 = this.G;
v1 = (( android.text.TextPaint ) v1 ).getTextSize ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTextSize()F
/* cmpl-float v1, p2, v1 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 7 */
v1 = this.G;
(( android.text.TextPaint ) v1 ).setTextSize ( p2 ); // invoke-virtual {v1, p2}, Landroid/text/TextPaint;->setTextSize(F)V
/* .line 8 */
(( android.widget.CompoundButton ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V
/* .line 9 */
} // :cond_1
int v1 = -1; // const/4 v1, -0x1
p2 = (( c.b.q.k2 ) p1 ).d ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/b/q/k2;->d(II)I
/* .line 10 */
v1 = (( c.b.q.k2 ) p1 ).d ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Lc/b/q/k2;->d(II)I
/* .line 11 */
(( androidx.appcompat.widget.SwitchCompat ) p0 ).a ( p2, v1 ); // invoke-virtual {p0, p2, v1}, Landroidx/appcompat/widget/SwitchCompat;->a(II)V
/* .line 12 */
p2 = (( c.b.q.k2 ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lc/b/q/k2;->a(IZ)Z
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 13 */
/* new-instance p2, Lc/b/o/a; */
(( android.widget.CompoundButton ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;
/* invoke-direct {p2, v0}, Lc/b/o/a;-><init>(Landroid/content/Context;)V */
this.K = p2;
} // :cond_2
int p2 = 0; // const/4 p2, 0x0
/* .line 14 */
this.K = p2;
/* .line 15 */
} // :goto_1
(( c.b.q.k2 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/k2;->a()V
return;
} // .end method
public void a ( android.graphics.Typeface p0, Integer p1 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* if-lez p2, :cond_4 */
/* if-nez p1, :cond_0 */
/* .line 20 */
android.graphics.Typeface .defaultFromStyle ( p2 );
/* .line 21 */
} // :cond_0
android.graphics.Typeface .create ( p1,p2 );
/* .line 22 */
} // :goto_0
(( androidx.appcompat.widget.SwitchCompat ) p0 ).setSwitchTypeface ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setSwitchTypeface(Landroid/graphics/Typeface;)V
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 23 */
p1 = (( android.graphics.Typeface ) p1 ).getStyle ( ); // invoke-virtual {p1}, Landroid/graphics/Typeface;->getStyle()I
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_1
/* not-int p1, p1 */
/* and-int/2addr p1, p2 */
/* .line 24 */
p2 = this.G;
/* and-int/lit8 v2, p1, 0x1 */
if ( v2 != null) { // if-eqz v2, :cond_2
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
(( android.text.TextPaint ) p2 ).setFakeBoldText ( v1 ); // invoke-virtual {p2, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V
/* .line 25 */
p2 = this.G;
/* and-int/lit8 p1, p1, 0x2 */
if ( p1 != null) { // if-eqz p1, :cond_3
/* const/high16 v0, -0x41800000 # -0.25f */
} // :cond_3
(( android.text.TextPaint ) p2 ).setTextSkewX ( v0 ); // invoke-virtual {p2, v0}, Landroid/text/TextPaint;->setTextSkewX(F)V
/* .line 26 */
} // :cond_4
p2 = this.G;
(( android.text.TextPaint ) p2 ).setFakeBoldText ( v1 ); // invoke-virtual {p2, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V
/* .line 27 */
p2 = this.G;
(( android.text.TextPaint ) p2 ).setTextSkewX ( v0 ); // invoke-virtual {p2, v0}, Landroid/text/TextPaint;->setTextSkewX(F)V
/* .line 28 */
(( androidx.appcompat.widget.SwitchCompat ) p0 ).setSwitchTypeface ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setSwitchTypeface(Landroid/graphics/Typeface;)V
} // :goto_2
return;
} // .end method
public final void a ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .line 48 */
android.view.MotionEvent .obtain ( p1 );
int v0 = 3; // const/4 v0, 0x3
/* .line 49 */
(( android.view.MotionEvent ) p1 ).setAction ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->setAction(I)V
/* .line 50 */
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z */
/* .line 51 */
(( android.view.MotionEvent ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->recycle()V
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 4 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* const/high16 p1, 0x3f800000 # 1.0f */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 52 */
} // :goto_0
v0 = androidx.appcompat.widget.SwitchCompat.O;
int v1 = 1; // const/4 v1, 0x1
/* new-array v2, v1, [F */
int v3 = 0; // const/4 v3, 0x0
/* aput p1, v2, v3 */
android.animation.ObjectAnimator .ofFloat ( p0,v0,v2 );
this.L = p1;
/* const-wide/16 v2, 0xfa */
/* .line 53 */
(( android.animation.ObjectAnimator ) p1 ).setDuration ( v2, v3 ); // invoke-virtual {p1, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;
/* .line 54 */
/* const/16 v0, 0x12 */
/* if-lt p1, v0, :cond_1 */
/* .line 55 */
p1 = this.L;
(( android.animation.ObjectAnimator ) p1 ).setAutoCancel ( v1 ); // invoke-virtual {p1, v1}, Landroid/animation/ObjectAnimator;->setAutoCancel(Z)V
/* .line 56 */
} // :cond_1
p1 = this.L;
(( android.animation.ObjectAnimator ) p1 ).start ( ); // invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V
return;
} // .end method
public final Boolean a ( Float p0, Float p1 ) {
/* .locals 7 */
/* .line 41 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 42 */
} // :cond_0
v0 = /* invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->getThumbOffset()I */
/* .line 43 */
v2 = this.b;
v3 = this.N;
(( android.graphics.drawable.Drawable ) v2 ).getPadding ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* .line 44 */
/* iget v2, p0, Landroidx/appcompat/widget/SwitchCompat;->D:I */
/* iget v3, p0, Landroidx/appcompat/widget/SwitchCompat;->t:I */
/* sub-int/2addr v2, v3 */
/* .line 45 */
/* iget v4, p0, Landroidx/appcompat/widget/SwitchCompat;->C:I */
/* add-int/2addr v4, v0 */
/* sub-int/2addr v4, v3 */
/* .line 46 */
/* iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->B:I */
/* add-int/2addr v0, v4 */
v5 = this.N;
/* iget v6, v5, Landroid/graphics/Rect;->left:I */
/* add-int/2addr v0, v6 */
/* iget v5, v5, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v0, v5 */
/* add-int/2addr v0, v3 */
/* .line 47 */
/* iget v5, p0, Landroidx/appcompat/widget/SwitchCompat;->F:I */
/* add-int/2addr v5, v3 */
/* int-to-float v3, v4 */
/* cmpl-float v3, p1, v3 */
/* if-lez v3, :cond_1 */
/* int-to-float v0, v0 */
/* cmpg-float p1, p1, v0 */
/* if-gez p1, :cond_1 */
/* int-to-float p1, v2 */
/* cmpl-float p1, p2, p1 */
/* if-lez p1, :cond_1 */
/* int-to-float p1, v5 */
/* cmpg-float p1, p2, p1 */
/* if-gez p1, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
} // .end method
public final void b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_3
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->j:Z */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 2 */
} // :cond_0
v0 = this.g;
c.h.g.r.a .h ( v0 );
(( android.graphics.drawable.Drawable ) v0 ).mutate ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
this.g = v0;
/* .line 3 */
/* iget-boolean v1, p0, Landroidx/appcompat/widget/SwitchCompat;->j:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
v1 = this.h;
c.h.g.r.a .a ( v0,v1 );
/* .line 5 */
} // :cond_1
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
v0 = this.g;
v1 = this.i;
c.h.g.r.a .a ( v0,v1 );
/* .line 7 */
} // :cond_2
v0 = this.g;
v0 = (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 8 */
v0 = this.g;
(( android.widget.CompoundButton ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_3
return;
} // .end method
public final void b ( android.view.MotionEvent p0 ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
/* .line 9 */
/* iput v0, p0, Landroidx/appcompat/widget/SwitchCompat;->s:I */
/* .line 10 */
v1 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_0 */
v1 = (( android.widget.CompoundButton ) p0 ).isEnabled ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->isEnabled()Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 11 */
} // :goto_0
v3 = (( android.widget.CompoundButton ) p0 ).isChecked ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 12 */
v1 = this.w;
/* const/16 v4, 0x3e8 */
(( android.view.VelocityTracker ) v1 ).computeCurrentVelocity ( v4 ); // invoke-virtual {v1, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V
/* .line 13 */
v1 = this.w;
v1 = (( android.view.VelocityTracker ) v1 ).getXVelocity ( ); // invoke-virtual {v1}, Landroid/view/VelocityTracker;->getXVelocity()F
/* .line 14 */
v4 = java.lang.Math .abs ( v1 );
/* iget v5, p0, Landroidx/appcompat/widget/SwitchCompat;->x:I */
/* int-to-float v5, v5 */
/* cmpl-float v4, v4, v5 */
/* if-lez v4, :cond_3 */
/* .line 15 */
v4 = c.b.q.v2 .a ( p0 );
int v5 = 0; // const/4 v5, 0x0
if ( v4 != null) { // if-eqz v4, :cond_1
/* cmpg-float v1, v1, v5 */
/* if-gez v1, :cond_2 */
} // :cond_1
/* cmpl-float v1, v1, v5 */
/* if-lez v1, :cond_2 */
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
/* .line 16 */
} // :cond_3
v2 = /* invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->getTargetCheckedState()Z */
} // :cond_4
/* move v2, v3 */
} // :goto_1
/* if-eq v2, v3, :cond_5 */
/* .line 17 */
(( android.widget.CompoundButton ) p0 ).playSoundEffect ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/CompoundButton;->playSoundEffect(I)V
/* .line 18 */
} // :cond_5
(( androidx.appcompat.widget.SwitchCompat ) p0 ).setChecked ( v2 ); // invoke-virtual {p0, v2}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V
/* .line 19 */
(( androidx.appcompat.widget.SwitchCompat ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->a(Landroid/view/MotionEvent;)V
return;
} // .end method
public final void c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.animation.ObjectAnimator ) v0 ).cancel ( ); // invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V
} // :cond_0
return;
} // .end method
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 10 */
/* .line 1 */
v0 = this.N;
/* .line 2 */
/* iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->C:I */
/* .line 3 */
/* iget v2, p0, Landroidx/appcompat/widget/SwitchCompat;->D:I */
/* .line 4 */
/* iget v3, p0, Landroidx/appcompat/widget/SwitchCompat;->E:I */
/* .line 5 */
/* iget v4, p0, Landroidx/appcompat/widget/SwitchCompat;->F:I */
/* .line 6 */
v5 = /* invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->getThumbOffset()I */
/* add-int/2addr v5, v1 */
/* .line 7 */
v6 = this.b;
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 8 */
c.b.q.a1 .d ( v6 );
/* .line 9 */
} // :cond_0
v6 = c.b.q.a1.c;
/* .line 10 */
} // :goto_0
v7 = this.g;
if ( v7 != null) { // if-eqz v7, :cond_6
/* .line 11 */
(( android.graphics.drawable.Drawable ) v7 ).getPadding ( v0 ); // invoke-virtual {v7, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* .line 12 */
/* iget v7, v0, Landroid/graphics/Rect;->left:I */
/* add-int/2addr v5, v7 */
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 13 */
/* iget v8, v6, Landroid/graphics/Rect;->left:I */
/* if-le v8, v7, :cond_1 */
/* sub-int/2addr v8, v7 */
/* add-int/2addr v1, v8 */
/* .line 14 */
} // :cond_1
/* iget v7, v6, Landroid/graphics/Rect;->top:I */
/* iget v8, v0, Landroid/graphics/Rect;->top:I */
/* if-le v7, v8, :cond_2 */
/* sub-int/2addr v7, v8 */
/* add-int/2addr v7, v2 */
} // :cond_2
/* move v7, v2 */
/* .line 15 */
} // :goto_1
/* iget v8, v6, Landroid/graphics/Rect;->right:I */
/* iget v9, v0, Landroid/graphics/Rect;->right:I */
/* if-le v8, v9, :cond_3 */
/* sub-int/2addr v8, v9 */
/* sub-int/2addr v3, v8 */
/* .line 16 */
} // :cond_3
/* iget v6, v6, Landroid/graphics/Rect;->bottom:I */
/* iget v8, v0, Landroid/graphics/Rect;->bottom:I */
/* if-le v6, v8, :cond_5 */
/* sub-int/2addr v6, v8 */
/* sub-int v6, v4, v6 */
} // :cond_4
/* move v7, v2 */
} // :cond_5
/* move v6, v4 */
/* .line 17 */
} // :goto_2
v8 = this.g;
(( android.graphics.drawable.Drawable ) v8 ).setBounds ( v1, v7, v3, v6 ); // invoke-virtual {v8, v1, v7, v3, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 18 */
} // :cond_6
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 19 */
(( android.graphics.drawable.Drawable ) v1 ).getPadding ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* .line 20 */
/* iget v1, v0, Landroid/graphics/Rect;->left:I */
/* sub-int v1, v5, v1 */
/* .line 21 */
/* iget v3, p0, Landroidx/appcompat/widget/SwitchCompat;->B:I */
/* add-int/2addr v5, v3 */
/* iget v0, v0, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v5, v0 */
/* .line 22 */
v0 = this.b;
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( v1, v2, v5, v4 ); // invoke-virtual {v0, v1, v2, v5, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 23 */
(( android.widget.CompoundButton ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getBackground()Landroid/graphics/drawable/Drawable;
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 24 */
c.h.g.r.a .a ( v0,v1,v2,v5,v4 );
/* .line 25 */
} // :cond_7
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->draw(Landroid/graphics/Canvas;)V */
return;
} // .end method
public void drawableHotspotChanged ( Float p0, Float p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
/* invoke-super {p0, p1, p2}, Landroid/widget/CompoundButton;->drawableHotspotChanged(FF)V */
/* .line 3 */
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
c.h.g.r.a .a ( v0,p1,p2 );
/* .line 5 */
} // :cond_1
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
c.h.g.r.a .a ( v0,p1,p2 );
} // :cond_2
return;
} // .end method
public void drawableStateChanged ( ) {
/* .locals 4 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/CompoundButton;->drawableStateChanged()V */
/* .line 2 */
(( android.widget.CompoundButton ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getDrawableState()[I
/* .line 3 */
v1 = this.b;
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
v3 = (( android.graphics.drawable.Drawable ) v1 ).isStateful ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 5 */
v1 = (( android.graphics.drawable.Drawable ) v1 ).setState ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* or-int/2addr v2, v1 */
/* .line 6 */
} // :cond_0
v1 = this.g;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 7 */
v3 = (( android.graphics.drawable.Drawable ) v1 ).isStateful ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 8 */
v0 = (( android.graphics.drawable.Drawable ) v1 ).setState ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* or-int/2addr v2, v0 */
} // :cond_1
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 9 */
(( android.widget.CompoundButton ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V
} // :cond_2
return;
} // .end method
public Integer getCompoundPaddingLeft ( ) {
/* .locals 2 */
/* .line 1 */
v0 = c.b.q.v2 .a ( p0 );
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = /* invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingLeft()I */
/* .line 3 */
} // :cond_0
v0 = /* invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingLeft()I */
/* iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->z:I */
/* add-int/2addr v0, v1 */
/* .line 4 */
(( android.widget.CompoundButton ) p0 ).getText ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getText()Ljava/lang/CharSequence;
v1 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v1, :cond_1 */
/* .line 5 */
/* iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->n:I */
/* add-int/2addr v0, v1 */
} // :cond_1
} // .end method
public Integer getCompoundPaddingRight ( ) {
/* .locals 2 */
/* .line 1 */
v0 = c.b.q.v2 .a ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = /* invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingRight()I */
/* .line 3 */
} // :cond_0
v0 = /* invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingRight()I */
/* iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->z:I */
/* add-int/2addr v0, v1 */
/* .line 4 */
(( android.widget.CompoundButton ) p0 ).getText ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getText()Ljava/lang/CharSequence;
v1 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v1, :cond_1 */
/* .line 5 */
/* iget v1, p0, Landroidx/appcompat/widget/SwitchCompat;->n:I */
/* add-int/2addr v0, v1 */
} // :cond_1
} // .end method
public Boolean getShowText ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->r:Z */
} // .end method
public Boolean getSplitTrack ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->o:Z */
} // .end method
public Integer getSwitchMinWidth ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->m:I */
} // .end method
public Integer getSwitchPadding ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->n:I */
} // .end method
public java.lang.CharSequence getTextOff ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.q;
} // .end method
public java.lang.CharSequence getTextOn ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.p;
} // .end method
public android.graphics.drawable.Drawable getThumbDrawable ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public Integer getThumbTextPadding ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->l:I */
} // .end method
public android.content.res.ColorStateList getThumbTintList ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public android.graphics.PorterDuff$Mode getThumbTintMode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public android.graphics.drawable.Drawable getTrackDrawable ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
} // .end method
public android.content.res.ColorStateList getTrackTintList ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
} // .end method
public android.graphics.PorterDuff$Mode getTrackTintMode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
} // .end method
public void jumpDrawablesToCurrentState ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/CompoundButton;->jumpDrawablesToCurrentState()V */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
/* .line 4 */
} // :cond_0
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
(( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
/* .line 6 */
} // :cond_1
v0 = this.L;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = (( android.animation.ObjectAnimator ) v0 ).isStarted ( ); // invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isStarted()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 7 */
v0 = this.L;
(( android.animation.ObjectAnimator ) v0 ).end ( ); // invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->end()V
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
this.L = v0;
} // :cond_2
return;
} // .end method
public onCreateDrawableState ( Integer p0 ) {
/* .locals 1 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onCreateDrawableState(I)[I */
/* .line 2 */
v0 = (( android.widget.CompoundButton ) p0 ).isChecked ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = androidx.appcompat.widget.SwitchCompat.P;
android.widget.CompoundButton .mergeDrawableStates ( p1,v0 );
} // :cond_0
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 9 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onDraw(Landroid/graphics/Canvas;)V */
/* .line 2 */
v0 = this.N;
/* .line 3 */
v1 = this.g;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
(( android.graphics.drawable.Drawable ) v1 ).getPadding ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* .line 5 */
} // :cond_0
(( android.graphics.Rect ) v0 ).setEmpty ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V
/* .line 6 */
} // :goto_0
/* iget v2, p0, Landroidx/appcompat/widget/SwitchCompat;->D:I */
/* .line 7 */
/* iget v3, p0, Landroidx/appcompat/widget/SwitchCompat;->F:I */
/* .line 8 */
/* iget v4, v0, Landroid/graphics/Rect;->top:I */
/* add-int/2addr v2, v4 */
/* .line 9 */
/* iget v4, v0, Landroid/graphics/Rect;->bottom:I */
/* sub-int/2addr v3, v4 */
/* .line 10 */
v4 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 11 */
/* iget-boolean v5, p0, Landroidx/appcompat/widget/SwitchCompat;->o:Z */
if ( v5 != null) { // if-eqz v5, :cond_1
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 12 */
c.b.q.a1 .d ( v4 );
/* .line 13 */
(( android.graphics.drawable.Drawable ) v4 ).copyBounds ( v0 ); // invoke-virtual {v4, v0}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V
/* .line 14 */
/* iget v6, v0, Landroid/graphics/Rect;->left:I */
/* iget v7, v5, Landroid/graphics/Rect;->left:I */
/* add-int/2addr v6, v7 */
/* iput v6, v0, Landroid/graphics/Rect;->left:I */
/* .line 15 */
/* iget v6, v0, Landroid/graphics/Rect;->right:I */
/* iget v5, v5, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr v6, v5 */
/* iput v6, v0, Landroid/graphics/Rect;->right:I */
/* .line 16 */
v5 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* .line 17 */
v6 = android.graphics.Region$Op.DIFFERENCE;
(( android.graphics.Canvas ) p1 ).clipRect ( v0, v6 ); // invoke-virtual {p1, v0, v6}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z
/* .line 18 */
(( android.graphics.drawable.Drawable ) v1 ).draw ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
/* .line 19 */
(( android.graphics.Canvas ) p1 ).restoreToCount ( v5 ); // invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V
/* .line 20 */
} // :cond_1
(( android.graphics.drawable.Drawable ) v1 ).draw ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
/* .line 21 */
} // :cond_2
} // :goto_1
v0 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 22 */
(( android.graphics.drawable.Drawable ) v4 ).draw ( p1 ); // invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
/* .line 23 */
} // :cond_3
v1 = /* invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->getTargetCheckedState()Z */
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = this.I;
} // :cond_4
v1 = this.J;
} // :goto_2
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 24 */
(( android.widget.CompoundButton ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getDrawableState()[I
/* .line 25 */
v6 = this.H;
if ( v6 != null) { // if-eqz v6, :cond_5
/* .line 26 */
v7 = this.G;
int v8 = 0; // const/4 v8, 0x0
v6 = (( android.content.res.ColorStateList ) v6 ).getColorForState ( v5, v8 ); // invoke-virtual {v6, v5, v8}, Landroid/content/res/ColorStateList;->getColorForState([II)I
(( android.text.TextPaint ) v7 ).setColor ( v6 ); // invoke-virtual {v7, v6}, Landroid/text/TextPaint;->setColor(I)V
/* .line 27 */
} // :cond_5
v6 = this.G;
this.drawableState = v5;
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 28 */
(( android.graphics.drawable.Drawable ) v4 ).getBounds ( ); // invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
/* .line 29 */
/* iget v5, v4, Landroid/graphics/Rect;->left:I */
/* iget v4, v4, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v5, v4 */
/* .line 30 */
} // :cond_6
v5 = (( android.widget.CompoundButton ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getWidth()I
/* .line 31 */
} // :goto_3
/* div-int/lit8 v5, v5, 0x2 */
v4 = (( android.text.Layout ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/text/Layout;->getWidth()I
/* div-int/lit8 v4, v4, 0x2 */
/* sub-int/2addr v5, v4 */
/* add-int/2addr v2, v3 */
/* .line 32 */
/* div-int/lit8 v2, v2, 0x2 */
v3 = (( android.text.Layout ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/text/Layout;->getHeight()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* int-to-float v3, v5 */
/* int-to-float v2, v2 */
/* .line 33 */
(( android.graphics.Canvas ) p1 ).translate ( v3, v2 ); // invoke-virtual {p1, v3, v2}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 34 */
(( android.text.Layout ) v1 ).draw ( p1 ); // invoke-virtual {v1, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V
/* .line 35 */
} // :cond_7
(( android.graphics.Canvas ) p1 ).restoreToCount ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V
return;
} // .end method
public void onInitializeAccessibilityEvent ( android.view.accessibility.AccessibilityEvent p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V */
final String v0 = "android.widget.Switch"; // const-string v0, "android.widget.Switch"
/* .line 2 */
(( android.view.accessibility.AccessibilityEvent ) p1 ).setClassName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
return;
} // .end method
public void onInitializeAccessibilityNodeInfo ( android.view.accessibility.AccessibilityNodeInfo p0 ) {
/* .locals 3 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V */
final String v0 = "android.widget.Switch"; // const-string v0, "android.widget.Switch"
/* .line 2 */
(( android.view.accessibility.AccessibilityNodeInfo ) p1 ).setClassName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V
/* .line 3 */
v0 = (( android.widget.CompoundButton ) p0 ).isChecked ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.p;
} // :cond_0
v0 = this.q;
/* .line 4 */
} // :goto_0
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_2 */
/* .line 5 */
(( android.view.accessibility.AccessibilityNodeInfo ) p1 ).getText ( ); // invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;
/* .line 6 */
v2 = android.text.TextUtils .isEmpty ( v1 );
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 7 */
(( android.view.accessibility.AccessibilityNodeInfo ) p1 ).setText ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V
/* .line 8 */
} // :cond_1
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 9 */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x20 */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
/* .line 10 */
(( android.view.accessibility.AccessibilityNodeInfo ) p1 ).setText ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V
} // :cond_2
} // :goto_1
return;
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super/range {p0 ..p5}, Landroid/widget/CompoundButton;->onLayout(ZIIII)V */
/* .line 2 */
p1 = this.b;
int p2 = 0; // const/4 p2, 0x0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 3 */
p1 = this.N;
/* .line 4 */
p3 = this.g;
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 5 */
(( android.graphics.drawable.Drawable ) p3 ).getPadding ( p1 ); // invoke-virtual {p3, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* .line 6 */
} // :cond_0
(( android.graphics.Rect ) p1 ).setEmpty ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->setEmpty()V
/* .line 7 */
} // :goto_0
p3 = this.b;
c.b.q.a1 .d ( p3 );
/* .line 8 */
/* iget p4, p3, Landroid/graphics/Rect;->left:I */
/* iget p5, p1, Landroid/graphics/Rect;->left:I */
/* sub-int/2addr p4, p5 */
p4 = java.lang.Math .max ( p2,p4 );
/* .line 9 */
/* iget p3, p3, Landroid/graphics/Rect;->right:I */
/* iget p1, p1, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr p3, p1 */
p2 = java.lang.Math .max ( p2,p3 );
} // :cond_1
int p4 = 0; // const/4 p4, 0x0
/* .line 10 */
} // :goto_1
p1 = c.b.q.v2 .a ( p0 );
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 11 */
p1 = (( android.widget.CompoundButton ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingLeft()I
/* add-int/2addr p1, p4 */
/* .line 12 */
/* iget p3, p0, Landroidx/appcompat/widget/SwitchCompat;->z:I */
/* add-int/2addr p3, p1 */
/* sub-int/2addr p3, p4 */
/* sub-int/2addr p3, p2 */
/* .line 13 */
} // :cond_2
p1 = (( android.widget.CompoundButton ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getWidth()I
p3 = (( android.widget.CompoundButton ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingRight()I
/* sub-int/2addr p1, p3 */
/* sub-int p3, p1, p2 */
/* .line 14 */
/* iget p1, p0, Landroidx/appcompat/widget/SwitchCompat;->z:I */
/* sub-int p1, p3, p1 */
/* add-int/2addr p1, p4 */
/* add-int/2addr p1, p2 */
/* .line 15 */
} // :goto_2
p2 = (( android.widget.CompoundButton ) p0 ).getGravity ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getGravity()I
/* and-int/lit8 p2, p2, 0x70 */
/* const/16 p4, 0x10 */
/* if-eq p2, p4, :cond_4 */
/* const/16 p4, 0x50 */
/* if-eq p2, p4, :cond_3 */
/* .line 16 */
p2 = (( android.widget.CompoundButton ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingTop()I
/* .line 17 */
/* iget p4, p0, Landroidx/appcompat/widget/SwitchCompat;->A:I */
/* .line 18 */
} // :cond_3
p2 = (( android.widget.CompoundButton ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getHeight()I
p4 = (( android.widget.CompoundButton ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingBottom()I
/* sub-int p4, p2, p4 */
/* .line 19 */
/* iget p2, p0, Landroidx/appcompat/widget/SwitchCompat;->A:I */
/* sub-int p2, p4, p2 */
/* .line 20 */
} // :cond_4
p2 = (( android.widget.CompoundButton ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingTop()I
p4 = (( android.widget.CompoundButton ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getHeight()I
/* add-int/2addr p2, p4 */
p4 = (( android.widget.CompoundButton ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingBottom()I
/* sub-int/2addr p2, p4 */
/* div-int/lit8 p2, p2, 0x2 */
/* iget p4, p0, Landroidx/appcompat/widget/SwitchCompat;->A:I */
/* div-int/lit8 p5, p4, 0x2 */
/* sub-int/2addr p2, p5 */
} // :goto_3
/* add-int/2addr p4, p2 */
/* .line 21 */
} // :goto_4
/* iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->C:I */
/* .line 22 */
/* iput p2, p0, Landroidx/appcompat/widget/SwitchCompat;->D:I */
/* .line 23 */
/* iput p4, p0, Landroidx/appcompat/widget/SwitchCompat;->F:I */
/* .line 24 */
/* iput p3, p0, Landroidx/appcompat/widget/SwitchCompat;->E:I */
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 6 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->r:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = this.I;
/* if-nez v0, :cond_0 */
/* .line 3 */
v0 = this.p;
(( androidx.appcompat.widget.SwitchCompat ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->a(Ljava/lang/CharSequence;)Landroid/text/Layout;
this.I = v0;
/* .line 4 */
} // :cond_0
v0 = this.J;
/* if-nez v0, :cond_1 */
/* .line 5 */
v0 = this.q;
(( androidx.appcompat.widget.SwitchCompat ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->a(Ljava/lang/CharSequence;)Landroid/text/Layout;
this.J = v0;
/* .line 6 */
} // :cond_1
v0 = this.N;
/* .line 7 */
v1 = this.b;
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 8 */
(( android.graphics.drawable.Drawable ) v1 ).getPadding ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* .line 9 */
v1 = this.b;
v1 = (( android.graphics.drawable.Drawable ) v1 ).getIntrinsicWidth ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* iget v3, v0, Landroid/graphics/Rect;->left:I */
/* sub-int/2addr v1, v3 */
/* iget v3, v0, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr v1, v3 */
/* .line 10 */
v3 = this.b;
v3 = (( android.graphics.drawable.Drawable ) v3 ).getIntrinsicHeight ( ); // invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
int v3 = 0; // const/4 v3, 0x0
/* .line 11 */
} // :goto_0
/* iget-boolean v4, p0, Landroidx/appcompat/widget/SwitchCompat;->r:Z */
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 12 */
v4 = this.I;
v4 = (( android.text.Layout ) v4 ).getWidth ( ); // invoke-virtual {v4}, Landroid/text/Layout;->getWidth()I
v5 = this.J;
v5 = (( android.text.Layout ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/text/Layout;->getWidth()I
v4 = java.lang.Math .max ( v4,v5 );
/* iget v5, p0, Landroidx/appcompat/widget/SwitchCompat;->l:I */
/* mul-int/lit8 v5, v5, 0x2 */
/* add-int/2addr v4, v5 */
} // :cond_3
int v4 = 0; // const/4 v4, 0x0
/* .line 13 */
} // :goto_1
v1 = java.lang.Math .max ( v4,v1 );
/* iput v1, p0, Landroidx/appcompat/widget/SwitchCompat;->B:I */
/* .line 14 */
v1 = this.g;
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 15 */
(( android.graphics.drawable.Drawable ) v1 ).getPadding ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
/* .line 16 */
v1 = this.g;
v2 = (( android.graphics.drawable.Drawable ) v1 ).getIntrinsicHeight ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* .line 17 */
} // :cond_4
(( android.graphics.Rect ) v0 ).setEmpty ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V
/* .line 18 */
} // :goto_2
/* iget v1, v0, Landroid/graphics/Rect;->left:I */
/* .line 19 */
/* iget v0, v0, Landroid/graphics/Rect;->right:I */
/* .line 20 */
v4 = this.b;
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 21 */
c.b.q.a1 .d ( v4 );
/* .line 22 */
/* iget v5, v4, Landroid/graphics/Rect;->left:I */
v1 = java.lang.Math .max ( v1,v5 );
/* .line 23 */
/* iget v4, v4, Landroid/graphics/Rect;->right:I */
v0 = java.lang.Math .max ( v0,v4 );
/* .line 24 */
} // :cond_5
/* iget v4, p0, Landroidx/appcompat/widget/SwitchCompat;->m:I */
/* iget v5, p0, Landroidx/appcompat/widget/SwitchCompat;->B:I */
/* mul-int/lit8 v5, v5, 0x2 */
/* add-int/2addr v5, v1 */
/* add-int/2addr v5, v0 */
v0 = java.lang.Math .max ( v4,v5 );
/* .line 25 */
v1 = java.lang.Math .max ( v2,v3 );
/* .line 26 */
/* iput v0, p0, Landroidx/appcompat/widget/SwitchCompat;->z:I */
/* .line 27 */
/* iput v1, p0, Landroidx/appcompat/widget/SwitchCompat;->A:I */
/* .line 28 */
/* invoke-super {p0, p1, p2}, Landroid/widget/CompoundButton;->onMeasure(II)V */
/* .line 29 */
p1 = (( android.widget.CompoundButton ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getMeasuredHeight()I
/* if-ge p1, v1, :cond_6 */
/* .line 30 */
p1 = (( android.widget.CompoundButton ) p0 ).getMeasuredWidthAndState ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getMeasuredWidthAndState()I
(( android.widget.CompoundButton ) p0 ).setMeasuredDimension ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Landroid/widget/CompoundButton;->setMeasuredDimension(II)V
} // :cond_6
return;
} // .end method
public void onPopulateAccessibilityEvent ( android.view.accessibility.AccessibilityEvent p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V */
/* .line 2 */
v0 = (( android.widget.CompoundButton ) p0 ).isChecked ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.p;
} // :cond_0
v0 = this.q;
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
(( android.view.accessibility.AccessibilityEvent ) p1 ).getText ( ); // invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;
} // :cond_1
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 6 */
/* .line 1 */
v0 = this.w;
(( android.view.VelocityTracker ) v0 ).addMovement ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
/* .line 2 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_a
int v2 = 2; // const/4 v2, 0x2
/* if-eq v0, v1, :cond_8 */
/* if-eq v0, v2, :cond_0 */
int v3 = 3; // const/4 v3, 0x3
/* if-eq v0, v3, :cond_8 */
/* goto/16 :goto_1 */
/* .line 3 */
} // :cond_0
/* iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->s:I */
/* if-eq v0, v1, :cond_6 */
/* if-eq v0, v2, :cond_1 */
/* goto/16 :goto_1 */
/* .line 4 */
} // :cond_1
p1 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* .line 5 */
v0 = /* invoke-direct {p0}, Landroidx/appcompat/widget/SwitchCompat;->getThumbScrollRange()I */
/* .line 6 */
/* iget v2, p0, Landroidx/appcompat/widget/SwitchCompat;->u:F */
/* sub-float v2, p1, v2 */
/* const/high16 v3, 0x3f800000 # 1.0f */
int v4 = 0; // const/4 v4, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
/* int-to-float v0, v0 */
/* div-float/2addr v2, v0 */
} // :cond_2
/* cmpl-float v0, v2, v4 */
/* if-lez v0, :cond_3 */
/* const/high16 v2, 0x3f800000 # 1.0f */
} // :cond_3
/* const/high16 v0, -0x40800000 # -1.0f */
/* const/high16 v2, -0x40800000 # -1.0f */
/* .line 7 */
} // :goto_0
v0 = c.b.q.v2 .a ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_4
/* neg-float v2, v2 */
/* .line 8 */
} // :cond_4
/* iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->y:F */
/* add-float/2addr v0, v2 */
v0 = androidx.appcompat.widget.SwitchCompat .a ( v0,v4,v3 );
/* .line 9 */
/* iget v2, p0, Landroidx/appcompat/widget/SwitchCompat;->y:F */
/* cmpl-float v2, v0, v2 */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 10 */
/* iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->u:F */
/* .line 11 */
(( androidx.appcompat.widget.SwitchCompat ) p0 ).setThumbPosition ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->setThumbPosition(F)V
} // :cond_5
/* .line 12 */
} // :cond_6
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* .line 13 */
v3 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* .line 14 */
/* iget v4, p0, Landroidx/appcompat/widget/SwitchCompat;->u:F */
/* sub-float v4, v0, v4 */
v4 = java.lang.Math .abs ( v4 );
/* iget v5, p0, Landroidx/appcompat/widget/SwitchCompat;->t:I */
/* int-to-float v5, v5 */
/* cmpl-float v4, v4, v5 */
/* if-gtz v4, :cond_7 */
/* iget v4, p0, Landroidx/appcompat/widget/SwitchCompat;->v:F */
/* sub-float v4, v3, v4 */
/* .line 15 */
v4 = java.lang.Math .abs ( v4 );
/* iget v5, p0, Landroidx/appcompat/widget/SwitchCompat;->t:I */
/* int-to-float v5, v5 */
/* cmpl-float v4, v4, v5 */
/* if-lez v4, :cond_b */
/* .line 16 */
} // :cond_7
/* iput v2, p0, Landroidx/appcompat/widget/SwitchCompat;->s:I */
/* .line 17 */
(( android.widget.CompoundButton ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getParent()Landroid/view/ViewParent;
/* .line 18 */
/* iput v0, p0, Landroidx/appcompat/widget/SwitchCompat;->u:F */
/* .line 19 */
/* iput v3, p0, Landroidx/appcompat/widget/SwitchCompat;->v:F */
/* .line 20 */
} // :cond_8
/* iget v0, p0, Landroidx/appcompat/widget/SwitchCompat;->s:I */
/* if-ne v0, v2, :cond_9 */
/* .line 21 */
(( androidx.appcompat.widget.SwitchCompat ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->b(Landroid/view/MotionEvent;)V
/* .line 22 */
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // :cond_9
int v0 = 0; // const/4 v0, 0x0
/* .line 23 */
/* iput v0, p0, Landroidx/appcompat/widget/SwitchCompat;->s:I */
/* .line 24 */
v0 = this.w;
(( android.view.VelocityTracker ) v0 ).clear ( ); // invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V
/* .line 25 */
} // :cond_a
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* .line 26 */
v2 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* .line 27 */
v3 = (( android.widget.CompoundButton ) p0 ).isEnabled ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->isEnabled()Z
if ( v3 != null) { // if-eqz v3, :cond_b
v3 = (( androidx.appcompat.widget.SwitchCompat ) p0 ).a ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Landroidx/appcompat/widget/SwitchCompat;->a(FF)Z
if ( v3 != null) { // if-eqz v3, :cond_b
/* .line 28 */
/* iput v1, p0, Landroidx/appcompat/widget/SwitchCompat;->s:I */
/* .line 29 */
/* iput v0, p0, Landroidx/appcompat/widget/SwitchCompat;->u:F */
/* .line 30 */
/* iput v2, p0, Landroidx/appcompat/widget/SwitchCompat;->v:F */
/* .line 31 */
} // :cond_b
} // :goto_1
p1 = /* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end method
public void setChecked ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V */
/* .line 2 */
p1 = (( android.widget.CompoundButton ) p0 ).isChecked ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z
/* .line 3 */
(( android.widget.CompoundButton ) p0 ).getWindowToken ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getWindowToken()Landroid/os/IBinder;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = c.h.n.v0 .D ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
(( androidx.appcompat.widget.SwitchCompat ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->a(Z)V
/* .line 5 */
} // :cond_0
(( androidx.appcompat.widget.SwitchCompat ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->c()V
if ( p1 != null) { // if-eqz p1, :cond_1
/* const/high16 p1, 0x3f800000 # 1.0f */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
/* .line 6 */
} // :goto_0
(( androidx.appcompat.widget.SwitchCompat ) p0 ).setThumbPosition ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setThumbPosition(F)V
} // :goto_1
return;
} // .end method
public void setCustomSelectionActionModeCallback ( android.view.ActionMode$Callback p0 ) {
/* .locals 0 */
/* .line 1 */
c.h.o.p .a ( p0,p1 );
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V */
return;
} // .end method
public void setShowText ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/SwitchCompat;->r:Z */
/* if-eq v0, p1, :cond_0 */
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->r:Z */
/* .line 3 */
(( android.widget.CompoundButton ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V
} // :cond_0
return;
} // .end method
public void setSplitTrack ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->o:Z */
/* .line 2 */
(( android.widget.CompoundButton ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V
return;
} // .end method
public void setSwitchMinWidth ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->m:I */
/* .line 2 */
(( android.widget.CompoundButton ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V
return;
} // .end method
public void setSwitchPadding ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->n:I */
/* .line 2 */
(( android.widget.CompoundButton ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V
return;
} // .end method
public void setSwitchTypeface ( android.graphics.Typeface p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.G;
(( android.text.TextPaint ) v0 ).getTypeface ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.G;
(( android.text.TextPaint ) v0 ).getTypeface ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
v0 = (( android.graphics.Typeface ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
v0 = this.G;
/* .line 2 */
(( android.text.TextPaint ) v0 ).getTypeface ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
/* if-nez v0, :cond_2 */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 3 */
} // :cond_1
v0 = this.G;
(( android.text.TextPaint ) v0 ).setTypeface ( p1 ); // invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 4 */
(( android.widget.CompoundButton ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V
/* .line 5 */
(( android.widget.CompoundButton ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V
} // :cond_2
return;
} // .end method
public void setTextOff ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 1 */
this.q = p1;
/* .line 2 */
(( android.widget.CompoundButton ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V
return;
} // .end method
public void setTextOn ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 1 */
this.p = p1;
/* .line 2 */
(( android.widget.CompoundButton ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V
return;
} // .end method
public void setThumbDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 3 */
} // :cond_0
this.b = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 5 */
} // :cond_1
(( android.widget.CompoundButton ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V
return;
} // .end method
public void setThumbPosition ( Float p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->y:F */
/* .line 2 */
(( android.widget.CompoundButton ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V
return;
} // .end method
public void setThumbResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.widget.CompoundButton ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;
c.b.l.a.b .c ( v0,p1 );
(( androidx.appcompat.widget.SwitchCompat ) p0 ).setThumbDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setThumbDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setThumbTextPadding ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/appcompat/widget/SwitchCompat;->l:I */
/* .line 2 */
(( android.widget.CompoundButton ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V
return;
} // .end method
public void setThumbTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 0 */
/* .line 1 */
this.c = p1;
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->e:Z */
/* .line 3 */
(( androidx.appcompat.widget.SwitchCompat ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->a()V
return;
} // .end method
public void setThumbTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 0 */
/* .line 1 */
this.d = p1;
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->f:Z */
/* .line 3 */
(( androidx.appcompat.widget.SwitchCompat ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->a()V
return;
} // .end method
public void setTrackDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 3 */
} // :cond_0
this.g = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 5 */
} // :cond_1
(( android.widget.CompoundButton ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V
return;
} // .end method
public void setTrackResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.widget.CompoundButton ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;
c.b.l.a.b .c ( v0,p1 );
(( androidx.appcompat.widget.SwitchCompat ) p0 ).setTrackDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setTrackDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setTrackTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 0 */
/* .line 1 */
this.h = p1;
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->j:Z */
/* .line 3 */
(( androidx.appcompat.widget.SwitchCompat ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->b()V
return;
} // .end method
public void setTrackTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 0 */
/* .line 1 */
this.i = p1;
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/SwitchCompat;->k:Z */
/* .line 3 */
(( androidx.appcompat.widget.SwitchCompat ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->b()V
return;
} // .end method
public void toggle ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( android.widget.CompoundButton ) p0 ).isChecked ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z
/* xor-int/lit8 v0, v0, 0x1 */
(( androidx.appcompat.widget.SwitchCompat ) p0 ).setChecked ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V
return;
} // .end method
public Boolean verifyDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0, p1}, Landroid/widget/CompoundButton;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z */
/* if-nez v0, :cond_1 */
v0 = this.b;
/* if-eq p1, v0, :cond_1 */
v0 = this.g;
/* if-ne p1, v0, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
