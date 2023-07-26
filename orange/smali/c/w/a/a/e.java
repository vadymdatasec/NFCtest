public class c.w.a.a.e extends android.graphics.drawable.Drawable$ConstantState {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer a;
	 public c.w.a.a.w b;
	 public android.animation.AnimatorSet c;
	 public java.util.ArrayList d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Landroid/animation/Animator;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public c.e.b e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/b<", */
/* "Landroid/animation/Animator;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.w.a.a.e ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V */
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 2 */
/* iget p1, p2, Lc/w/a/a/e;->a:I */
/* iput p1, p0, Lc/w/a/a/e;->a:I */
/* .line 3 */
p1 = this.b;
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
(( c.w.a.a.w ) p1 ).getConstantState ( ); // invoke-virtual {p1}, Lc/w/a/a/w;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
if ( p4 != null) { // if-eqz p4, :cond_0
	 /* .line 5 */
	 (( android.graphics.drawable.Drawable$ConstantState ) p1 ).newDrawable ( p4 ); // invoke-virtual {p1, p4}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
	 /* check-cast p1, Lc/w/a/a/w; */
	 this.b = p1;
	 /* .line 6 */
} // :cond_0
(( android.graphics.drawable.Drawable$ConstantState ) p1 ).newDrawable ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;
/* check-cast p1, Lc/w/a/a/w; */
this.b = p1;
/* .line 7 */
} // :goto_0
p1 = this.b;
(( c.w.a.a.w ) p1 ).mutate ( ); // invoke-virtual {p1}, Lc/w/a/a/w;->mutate()Landroid/graphics/drawable/Drawable;
/* check-cast p1, Lc/w/a/a/w; */
this.b = p1;
/* .line 8 */
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( p3 ); // invoke-virtual {p1, p3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 9 */
p1 = this.b;
p3 = this.b;
(( android.graphics.drawable.Drawable ) p3 ).getBounds ( ); // invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
(( android.graphics.drawable.Drawable ) p1 ).setBounds ( p3 ); // invoke-virtual {p1, p3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
/* .line 10 */
p1 = this.b;
(( c.w.a.a.w ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/w/a/a/w;->a(Z)V
/* .line 11 */
} // :cond_1
p1 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 12 */
p1 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
/* .line 13 */
/* new-instance p3, Ljava/util/ArrayList; */
/* invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(I)V */
this.d = p3;
/* .line 14 */
/* new-instance p3, Lc/e/b; */
/* invoke-direct {p3, p1}, Lc/e/b;-><init>(I)V */
this.e = p3;
} // :goto_1
/* if-ge v0, p1, :cond_2 */
/* .line 15 */
p3 = this.d;
(( java.util.ArrayList ) p3 ).get ( v0 ); // invoke-virtual {p3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p3, Landroid/animation/Animator; */
/* .line 16 */
(( android.animation.Animator ) p3 ).clone ( ); // invoke-virtual {p3}, Landroid/animation/Animator;->clone()Landroid/animation/Animator;
/* .line 17 */
v1 = this.e;
(( c.e.i ) v1 ).get ( p3 ); // invoke-virtual {v1, p3}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p3, Ljava/lang/String; */
/* .line 18 */
v1 = this.b;
(( c.w.a.a.w ) v1 ).a ( p3 ); // invoke-virtual {v1, p3}, Lc/w/a/a/w;->a(Ljava/lang/String;)Ljava/lang/Object;
/* .line 19 */
(( android.animation.Animator ) p4 ).setTarget ( v1 ); // invoke-virtual {p4, v1}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V
/* .line 20 */
v1 = this.d;
(( java.util.ArrayList ) v1 ).add ( p4 ); // invoke-virtual {v1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 21 */
v1 = this.e;
(( c.e.i ) v1 ).put ( p4, p3 ); // invoke-virtual {v1, p4, p3}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* add-int/lit8 v0, v0, 0x1 */
/* .line 22 */
} // :cond_2
(( c.w.a.a.e ) p0 ).a ( ); // invoke-virtual {p0}, Lc/w/a/a/e;->a()V
} // :cond_3
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.c;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Landroid/animation/AnimatorSet; */
/* invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V */
this.c = v0;
/* .line 3 */
} // :cond_0
v0 = this.c;
v1 = this.d;
(( android.animation.AnimatorSet ) v0 ).playTogether ( v1 ); // invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V
return;
} // .end method
public Integer getChangingConfigurations ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/w/a/a/e;->a:I */
} // .end method
public android.graphics.drawable.Drawable newDrawable ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "No constant state support for SDK < 24."; // const-string v1, "No constant state support for SDK < 24."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public android.graphics.drawable.Drawable newDrawable ( android.content.res.Resources p0 ) {
/* .locals 1 */
/* .line 2 */
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "No constant state support for SDK < 24."; // const-string v0, "No constant state support for SDK < 24."
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
