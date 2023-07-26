public class c.w.a.a.g extends c.w.a.a.m implements c.w.a.a.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.w.a.a.e c;
	 public android.content.Context d;
	 public android.animation.ArgbEvaluator e;
	 public final android.graphics.drawable.Drawable$Callback f;
	 /* # direct methods */
	 public c.w.a.a.g ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, v0, v0, v0}, Lc/w/a/a/g;-><init>(Landroid/content/Context;Lc/w/a/a/e;Landroid/content/res/Resources;)V */
		 return;
	 } // .end method
	 public c.w.a.a.g ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* invoke-direct {p0, p1, v0, v0}, Lc/w/a/a/g;-><init>(Landroid/content/Context;Lc/w/a/a/e;Landroid/content/res/Resources;)V */
		 return;
	 } // .end method
	 public c.w.a.a.g ( ) {
		 /* .locals 2 */
		 /* .line 3 */
		 /* invoke-direct {p0}, Lc/w/a/a/m;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 this.e = v0;
		 /* .line 5 */
		 /* new-instance v0, Lc/w/a/a/d; */
		 /* invoke-direct {v0, p0}, Lc/w/a/a/d;-><init>(Lc/w/a/a/g;)V */
		 this.f = v0;
		 /* .line 6 */
		 this.d = p1;
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 7 */
			 this.c = p2;
			 /* .line 8 */
		 } // :cond_0
		 /* new-instance v0, Lc/w/a/a/e; */
		 v1 = this.f;
		 /* invoke-direct {v0, p1, p2, v1, p3}, Lc/w/a/a/e;-><init>(Landroid/content/Context;Lc/w/a/a/e;Landroid/graphics/drawable/Drawable$Callback;Landroid/content/res/Resources;)V */
		 this.c = v0;
	 } // :goto_0
	 return;
} // .end method
public static c.w.a.a.g a ( android.content.Context p0, android.content.res.Resources p1, org.xmlpull.v1.XmlPullParser p2, android.util.AttributeSet p3, android.content.res.Resources$Theme p4 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/xmlpull/v1/XmlPullParserException;, */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lc/w/a/a/g; */
/* invoke-direct {v0, p0}, Lc/w/a/a/g;-><init>(Landroid/content/Context;)V */
/* .line 2 */
(( c.w.a.a.g ) v0 ).inflate ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lc/w/a/a/g;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
} // .end method
/* # virtual methods */
public final void a ( android.animation.Animator p0 ) {
/* .locals 3 */
/* .line 3 */
/* instance-of v0, p1, Landroid/animation/AnimatorSet; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 4 */
	 /* move-object v0, p1 */
	 /* check-cast v0, Landroid/animation/AnimatorSet; */
	 (( android.animation.AnimatorSet ) v0 ).getChildAnimations ( ); // invoke-virtual {v0}, Landroid/animation/AnimatorSet;->getChildAnimations()Ljava/util/ArrayList;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 5 */
	 v2 = 	 } // :goto_0
	 /* if-ge v1, v2, :cond_0 */
	 /* .line 6 */
	 /* check-cast v2, Landroid/animation/Animator; */
	 (( c.w.a.a.g ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lc/w/a/a/g;->a(Landroid/animation/Animator;)V
	 /* add-int/lit8 v1, v1, 0x1 */
	 /* .line 7 */
} // :cond_0
/* instance-of v0, p1, Landroid/animation/ObjectAnimator; */
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* .line 8 */
	 /* check-cast p1, Landroid/animation/ObjectAnimator; */
	 /* .line 9 */
	 (( android.animation.ObjectAnimator ) p1 ).getPropertyName ( ); // invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->getPropertyName()Ljava/lang/String;
	 final String v1 = "fillColor"; // const-string v1, "fillColor"
	 /* .line 10 */
	 v1 = 	 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 /* if-nez v1, :cond_1 */
	 final String v1 = "strokeColor"; // const-string v1, "strokeColor"
	 v0 = 	 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* .line 11 */
	 } // :cond_1
	 v0 = this.e;
	 /* if-nez v0, :cond_2 */
	 /* .line 12 */
	 /* new-instance v0, Landroid/animation/ArgbEvaluator; */
	 /* invoke-direct {v0}, Landroid/animation/ArgbEvaluator;-><init>()V */
	 this.e = v0;
	 /* .line 13 */
} // :cond_2
v0 = this.e;
(( android.animation.ObjectAnimator ) p1 ).setEvaluator ( v0 ); // invoke-virtual {p1, v0}, Landroid/animation/ObjectAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V
} // :cond_3
return;
} // .end method
public final void a ( java.lang.String p0, android.animation.Animator p1 ) {
/* .locals 2 */
/* .line 14 */
v0 = this.c;
v0 = this.b;
(( c.w.a.a.w ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/w/a/a/w;->a(Ljava/lang/String;)Ljava/lang/Object;
/* .line 15 */
(( android.animation.Animator ) p2 ).setTarget ( v0 ); // invoke-virtual {p2, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V
/* .line 16 */
/* const/16 v1, 0x15 */
/* if-ge v0, v1, :cond_0 */
/* .line 17 */
(( c.w.a.a.g ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/w/a/a/g;->a(Landroid/animation/Animator;)V
/* .line 18 */
} // :cond_0
v0 = this.c;
v1 = this.d;
/* if-nez v1, :cond_1 */
/* .line 19 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.d = v1;
/* .line 20 */
v0 = this.c;
/* new-instance v1, Lc/e/b; */
/* invoke-direct {v1}, Lc/e/b;-><init>()V */
this.e = v1;
/* .line 21 */
} // :cond_1
v0 = this.c;
v0 = this.d;
(( java.util.ArrayList ) v0 ).add ( p2 ); // invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 22 */
v0 = this.c;
v0 = this.e;
(( c.e.i ) v0 ).put ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
public void applyTheme ( android.content.res.Resources$Theme p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
c.h.g.r.a .a ( v0,p1 );
} // :cond_0
return;
} // .end method
public Boolean canApplyTheme ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = c.h.g.r.a .a ( v0 );
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
return;
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
(( c.w.a.a.w ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Lc/w/a/a/w;->draw(Landroid/graphics/Canvas;)V
/* .line 4 */
p1 = this.c;
p1 = this.c;
p1 = (( android.animation.AnimatorSet ) p1 ).isStarted ( ); // invoke-virtual {p1}, Landroid/animation/AnimatorSet;->isStarted()Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 5 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
} // :cond_1
return;
} // .end method
public Integer getAlpha ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = c.h.g.r.a .b ( v0 );
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
v0 = (( c.w.a.a.w ) v0 ).getAlpha ( ); // invoke-virtual {v0}, Lc/w/a/a/w;->getAlpha()I
} // .end method
public Integer getChangingConfigurations ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( android.graphics.drawable.Drawable ) v0 ).getChangingConfigurations ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I
/* .line 3 */
} // :cond_0
v0 = /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I */
v1 = this.c;
/* iget v1, v1, Lc/w/a/a/e;->a:I */
/* or-int/2addr v0, v1 */
} // .end method
public android.graphics.ColorFilter getColorFilter ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
c.h.g.r.a .c ( v0 );
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
(( c.w.a.a.w ) v0 ).getColorFilter ( ); // invoke-virtual {v0}, Lc/w/a/a/w;->getColorFilter()Landroid/graphics/ColorFilter;
} // .end method
public android.graphics.drawable.Drawable$ConstantState getConstantState ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* const/16 v1, 0x18 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/w/a/a/f; */
v1 = this.b;
(( android.graphics.drawable.Drawable ) v1 ).getConstantState ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
/* invoke-direct {v0, v1}, Lc/w/a/a/f;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getIntrinsicHeight ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
v0 = (( c.w.a.a.w ) v0 ).getIntrinsicHeight ( ); // invoke-virtual {v0}, Lc/w/a/a/w;->getIntrinsicHeight()I
} // .end method
public Integer getIntrinsicWidth ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
v0 = (( c.w.a.a.w ) v0 ).getIntrinsicWidth ( ); // invoke-virtual {v0}, Lc/w/a/a/w;->getIntrinsicWidth()I
} // .end method
public Integer getOpacity ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( android.graphics.drawable.Drawable ) v0 ).getOpacity ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
v0 = (( c.w.a.a.w ) v0 ).getOpacity ( ); // invoke-virtual {v0}, Lc/w/a/a/w;->getOpacity()I
} // .end method
public void inflate ( android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 31 */
(( c.w.a.a.g ) p0 ).inflate ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lc/w/a/a/g;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
return;
} // .end method
public void inflate ( android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources$Theme p3 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
c.h.g.r.a .a ( v0,p1,p2,p3,p4 );
return;
/* .line 3 */
v0 = } // :cond_0
v1 = /* .line 4 */
int v2 = 1; // const/4 v2, 0x1
/* add-int/2addr v1, v2 */
} // :goto_0
/* if-eq v0, v2, :cond_8 */
v3 = /* .line 5 */
/* if-ge v3, v1, :cond_1 */
int v3 = 3; // const/4 v3, 0x3
/* if-eq v0, v3, :cond_8 */
} // :cond_1
int v3 = 2; // const/4 v3, 0x2
/* if-ne v0, v3, :cond_7 */
/* .line 6 */
final String v3 = "animated-vector"; // const-string v3, "animated-vector"
/* .line 7 */
v3 = (( java.lang.String ) v3 ).equals ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int v4 = 0; // const/4 v4, 0x0
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 8 */
v0 = c.w.a.a.a.e;
/* .line 9 */
c.h.f.i.t .a ( p1,p4,p3,v0 );
/* .line 10 */
v3 = (( android.content.res.TypedArray ) v0 ).getResourceId ( v4, v4 ); // invoke-virtual {v0, v4, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 11 */
c.w.a.a.w .a ( p1,v3,p4 );
/* .line 12 */
(( c.w.a.a.w ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Lc/w/a/a/w;->a(Z)V
/* .line 13 */
v4 = this.f;
(( android.graphics.drawable.Drawable ) v3 ).setCallback ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 14 */
v4 = this.c;
v4 = this.b;
if ( v4 != null) { // if-eqz v4, :cond_2
int v5 = 0; // const/4 v5, 0x0
/* .line 15 */
(( android.graphics.drawable.Drawable ) v4 ).setCallback ( v5 ); // invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 16 */
} // :cond_2
v4 = this.c;
this.b = v3;
/* .line 17 */
} // :cond_3
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
} // :cond_4
final String v3 = "target"; // const-string v3, "target"
/* .line 18 */
v0 = (( java.lang.String ) v3 ).equals ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 19 */
v0 = c.w.a.a.a.f;
/* .line 20 */
(( android.content.res.Resources ) p1 ).obtainAttributes ( p3, v0 ); // invoke-virtual {p1, p3, v0}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
/* .line 21 */
(( android.content.res.TypedArray ) v0 ).getString ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
/* .line 22 */
v4 = (( android.content.res.TypedArray ) v0 ).getResourceId ( v2, v4 ); // invoke-virtual {v0, v2, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 23 */
v5 = this.d;
if ( v5 != null) { // if-eqz v5, :cond_5
/* .line 24 */
c.w.a.a.j .a ( v5,v4 );
/* .line 25 */
(( c.w.a.a.g ) p0 ).a ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Lc/w/a/a/g;->a(Ljava/lang/String;Landroid/animation/Animator;)V
/* .line 26 */
} // :cond_5
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
/* .line 27 */
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "Context can\'t be null when inflating animators"; // const-string p2, "Context can\'t be null when inflating animators"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 28 */
} // :cond_6
} // :goto_1
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
/* .line 29 */
} // :cond_7
v0 = } // :goto_2
/* .line 30 */
} // :cond_8
p1 = this.c;
(( c.w.a.a.e ) p1 ).a ( ); // invoke-virtual {p1}, Lc/w/a/a/e;->a()V
return;
} // .end method
public Boolean isAutoMirrored ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = c.h.g.r.a .e ( v0 );
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
v0 = (( c.w.a.a.w ) v0 ).isAutoMirrored ( ); // invoke-virtual {v0}, Lc/w/a/a/w;->isAutoMirrored()Z
} // .end method
public Boolean isRunning ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable; */
v0 = (( android.graphics.drawable.AnimatedVectorDrawable ) v0 ).isRunning ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->isRunning()Z
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.c;
v0 = (( android.animation.AnimatorSet ) v0 ).isRunning ( ); // invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isRunning()Z
} // .end method
public Boolean isStateful ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
v0 = (( c.w.a.a.w ) v0 ).isStateful ( ); // invoke-virtual {v0}, Lc/w/a/a/w;->isStateful()Z
} // .end method
public android.graphics.drawable.Drawable mutate ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).mutate ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
} // :cond_0
} // .end method
public void onBoundsChange ( android.graphics.Rect p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
return;
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
return;
} // .end method
public Boolean onLevelChange ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
p1 = (( android.graphics.drawable.Drawable ) v0 ).setLevel ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
p1 = (( android.graphics.drawable.Drawable ) v0 ).setLevel ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
} // .end method
public Boolean onStateChange ( Integer[] p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
p1 = (( android.graphics.drawable.Drawable ) v0 ).setState ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
p1 = (( c.w.a.a.m ) v0 ).setState ( p1 ); // invoke-virtual {v0, p1}, Lc/w/a/a/m;->setState([I)Z
} // .end method
public void setAlpha ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
return;
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
(( c.w.a.a.w ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Lc/w/a/a/w;->setAlpha(I)V
return;
} // .end method
public void setAutoMirrored ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
c.h.g.r.a .a ( v0,p1 );
return;
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
(( c.w.a.a.w ) v0 ).setAutoMirrored ( p1 ); // invoke-virtual {v0, p1}, Lc/w/a/a/w;->setAutoMirrored(Z)V
return;
} // .end method
public void setColorFilter ( android.graphics.ColorFilter p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).setColorFilter ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V
return;
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
(( c.w.a.a.w ) v0 ).setColorFilter ( p1 ); // invoke-virtual {v0, p1}, Lc/w/a/a/w;->setColorFilter(Landroid/graphics/ColorFilter;)V
return;
} // .end method
public void setTint ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
c.h.g.r.a .b ( v0,p1 );
return;
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
(( c.w.a.a.w ) v0 ).setTint ( p1 ); // invoke-virtual {v0, p1}, Lc/w/a/a/w;->setTint(I)V
return;
} // .end method
public void setTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
c.h.g.r.a .a ( v0,p1 );
return;
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
(( c.w.a.a.w ) v0 ).setTintList ( p1 ); // invoke-virtual {v0, p1}, Lc/w/a/a/w;->setTintList(Landroid/content/res/ColorStateList;)V
return;
} // .end method
public void setTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
c.h.g.r.a .a ( v0,p1 );
return;
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
(( c.w.a.a.w ) v0 ).setTintMode ( p1 ); // invoke-virtual {v0, p1}, Lc/w/a/a/w;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V
return;
} // .end method
public Boolean setVisible ( Boolean p0, Boolean p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
p1 = (( android.graphics.drawable.Drawable ) v0 ).setVisible ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
(( c.w.a.a.w ) v0 ).setVisible ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/w/a/a/w;->setVisible(ZZ)Z
/* .line 4 */
p1 = /* invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z */
} // .end method
public void start ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable; */
(( android.graphics.drawable.AnimatedVectorDrawable ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->start()V
return;
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.c;
v0 = (( android.animation.AnimatorSet ) v0 ).isStarted ( ); // invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isStarted()Z
if ( v0 != null) { // if-eqz v0, :cond_1
return;
/* .line 4 */
} // :cond_1
v0 = this.c;
v0 = this.c;
(( android.animation.AnimatorSet ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V
/* .line 5 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
public void stop ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable; */
(( android.graphics.drawable.AnimatedVectorDrawable ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->stop()V
return;
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.c;
(( android.animation.AnimatorSet ) v0 ).end ( ); // invoke-virtual {v0}, Landroid/animation/AnimatorSet;->end()V
return;
} // .end method
