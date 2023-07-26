public class c.b.q.v0 extends android.widget.TextView implements c.h.n.z implements c.h.o.r implements c.h.o.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.m b;
	 public final c.b.q.u0 c;
	 public final c.b.q.r0 d;
	 public java.util.concurrent.Future e;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/concurrent/Future<", */
	 /* "Lc/h/l/c;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.b.q.v0 ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* invoke-direct {p0, p1, v0}, Lc/b/q/v0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public c.b.q.v0 ( ) {
/* .locals 1 */
/* const v0, 0x1010084 */
/* .line 2 */
/* invoke-direct {p0, p1, p2, v0}, Lc/b/q/v0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
return;
} // .end method
public c.b.q.v0 ( ) {
/* .locals 0 */
/* .line 3 */
c.b.q.h2 .b ( p1 );
/* invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* .line 4 */
/* new-instance p1, Lc/b/q/m; */
/* invoke-direct {p1, p0}, Lc/b/q/m;-><init>(Landroid/view/View;)V */
this.b = p1;
/* .line 5 */
(( c.b.q.m ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/m;->a(Landroid/util/AttributeSet;I)V
/* .line 6 */
/* new-instance p1, Lc/b/q/u0; */
/* invoke-direct {p1, p0}, Lc/b/q/u0;-><init>(Landroid/widget/TextView;)V */
this.c = p1;
/* .line 7 */
(( c.b.q.u0 ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/u0;->a(Landroid/util/AttributeSet;I)V
/* .line 8 */
p1 = this.c;
(( c.b.q.u0 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/u0;->a()V
/* .line 9 */
/* new-instance p1, Lc/b/q/r0; */
/* invoke-direct {p1, p0}, Lc/b/q/r0;-><init>(Landroid/widget/TextView;)V */
this.d = p1;
return;
} // .end method
/* # virtual methods */
public final void d ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 2 */
	 try { // :try_start_0
		 this.e = v1;
		 /* .line 3 */
		 /* check-cast v0, Lc/h/l/c; */
		 c.h.o.p .a ( p0,v0 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
	 } // :cond_0
	 return;
} // .end method
public void drawableStateChanged ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-super {p0}, Landroid/widget/TextView;->drawableStateChanged()V */
	 /* .line 2 */
	 v0 = this.b;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 3 */
		 (( c.b.q.m ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/m;->a()V
		 /* .line 4 */
	 } // :cond_0
	 v0 = this.c;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 5 */
		 (( c.b.q.u0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/u0;->a()V
	 } // :cond_1
	 return;
} // .end method
public Integer getAutoSizeMaxTextSize ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* sget-boolean v0, Lc/h/o/d;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 v0 = 		 /* invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I */
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.c;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 4 */
		 v0 = 		 (( c.b.q.u0 ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/q/u0;->c()I
	 } // :cond_1
	 int v0 = -1; // const/4 v0, -0x1
} // .end method
public Integer getAutoSizeMinTextSize ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* sget-boolean v0, Lc/h/o/d;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 v0 = 		 /* invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I */
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.c;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 4 */
		 v0 = 		 (( c.b.q.u0 ) v0 ).d ( ); // invoke-virtual {v0}, Lc/b/q/u0;->d()I
	 } // :cond_1
	 int v0 = -1; // const/4 v0, -0x1
} // .end method
public Integer getAutoSizeStepGranularity ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* sget-boolean v0, Lc/h/o/d;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 v0 = 		 /* invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I */
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.c;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 4 */
		 v0 = 		 (( c.b.q.u0 ) v0 ).e ( ); // invoke-virtual {v0}, Lc/b/q/u0;->e()I
	 } // :cond_1
	 int v0 = -1; // const/4 v0, -0x1
} // .end method
public getAutoSizeTextAvailableSizes ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* sget-boolean v0, Lc/h/o/d;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 /* invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I */
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.c;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 4 */
		 (( c.b.q.u0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/b/q/u0;->f()[I
	 } // :cond_1
	 int v0 = 0; // const/4 v0, 0x0
	 /* new-array v0, v0, [I */
} // .end method
public Integer getAutoSizeTextType ( ) {
	 /* .locals 3 */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "WrongConstant" */
	 /* } */
} // .end annotation
/* .line 1 */
/* sget-boolean v0, Lc/h/o/d;->a:Z */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 2 */
	 v0 = 	 /* invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextType()I */
	 int v2 = 1; // const/4 v2, 0x1
	 /* if-ne v0, v2, :cond_0 */
	 int v1 = 1; // const/4 v1, 0x1
} // :cond_0
/* .line 3 */
} // :cond_1
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 4 */
v0 = (( c.b.q.u0 ) v0 ).g ( ); // invoke-virtual {v0}, Lc/b/q/u0;->g()I
} // :cond_2
} // .end method
public Integer getFirstBaselineToTopHeight ( ) {
/* .locals 1 */
/* .line 1 */
v0 = c.h.o.p .a ( p0 );
} // .end method
public Integer getLastBaselineToBottomHeight ( ) {
/* .locals 1 */
/* .line 1 */
v0 = c.h.o.p .b ( p0 );
} // .end method
public android.content.res.ColorStateList getSupportBackgroundTintList ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.m ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/q/m;->b()Landroid/content/res/ColorStateList;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.graphics.PorterDuff$Mode getSupportBackgroundTintMode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.m ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/q/m;->c()Landroid/graphics/PorterDuff$Mode;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.content.res.ColorStateList getSupportCompoundDrawablesTintList ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
(( c.b.q.u0 ) v0 ).h ( ); // invoke-virtual {v0}, Lc/b/q/u0;->h()Landroid/content/res/ColorStateList;
} // .end method
public android.graphics.PorterDuff$Mode getSupportCompoundDrawablesTintMode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
(( c.b.q.u0 ) v0 ).i ( ); // invoke-virtual {v0}, Lc/b/q/u0;->i()Landroid/graphics/PorterDuff$Mode;
} // .end method
public java.lang.CharSequence getText ( ) {
/* .locals 1 */
/* .line 1 */
(( c.b.q.v0 ) p0 ).d ( ); // invoke-virtual {p0}, Lc/b/q/v0;->d()V
/* .line 2 */
/* invoke-super {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence; */
} // .end method
public android.view.textclassifier.TextClassifier getTextClassifier ( ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1c */
/* if-ge v0, v1, :cond_1 */
v0 = this.d;
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
(( c.b.q.r0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/r0;->a()Landroid/view/textclassifier/TextClassifier;
/* .line 3 */
} // :cond_1
} // :goto_0
/* invoke-super {p0}, Landroid/widget/TextView;->getTextClassifier()Landroid/view/textclassifier/TextClassifier; */
} // .end method
public c.h.l.b getTextMetricsParamsCompat ( ) {
/* .locals 1 */
/* .line 1 */
c.h.o.p .d ( p0 );
} // .end method
public android.view.inputmethod.InputConnection onCreateInputConnection ( android.view.inputmethod.EditorInfo p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/TextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection; */
c.b.q.u .a ( v0,p1,p0 );
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 6 */
/* .line 1 */
/* invoke-super/range {p0 ..p5}, Landroid/widget/TextView;->onLayout(ZIIII)V */
/* .line 2 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* move v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* move v5, p5 */
/* .line 3 */
/* invoke-virtual/range {v0 ..v5}, Lc/b/q/u0;->a(ZIIII)V */
} // :cond_0
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
(( c.b.q.v0 ) p0 ).d ( ); // invoke-virtual {p0}, Lc/b/q/v0;->d()V
/* .line 2 */
/* invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V */
return;
} // .end method
public void onTextChanged ( java.lang.CharSequence p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V */
/* .line 2 */
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_0
/* sget-boolean p2, Lc/h/o/d;->a:Z */
/* if-nez p2, :cond_0 */
p1 = (( c.b.q.u0 ) p1 ).j ( ); // invoke-virtual {p1}, Lc/b/q/u0;->j()Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
p1 = this.c;
(( c.b.q.u0 ) p1 ).b ( ); // invoke-virtual {p1}, Lc/b/q/u0;->b()V
} // :cond_0
return;
} // .end method
public void setAutoSizeTextTypeUniformWithConfiguration ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalArgumentException; */
/* } */
} // .end annotation
/* .line 1 */
/* sget-boolean v0, Lc/h/o/d;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V */
/* .line 3 */
} // :cond_0
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
(( c.b.q.u0 ) v0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lc/b/q/u0;->a(IIII)V
} // :cond_1
} // :goto_0
return;
} // .end method
public void setAutoSizeTextTypeUniformWithPresetSizes ( Integer[] p0, Integer p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalArgumentException; */
/* } */
} // .end annotation
/* .line 1 */
/* sget-boolean v0, Lc/h/o/d;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V */
/* .line 3 */
} // :cond_0
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
(( c.b.q.u0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/q/u0;->a([II)V
} // :cond_1
} // :goto_0
return;
} // .end method
public void setAutoSizeTextTypeWithDefaults ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* sget-boolean v0, Lc/h/o/d;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V */
/* .line 3 */
} // :cond_0
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
(( c.b.q.u0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/u0;->a(I)V
} // :cond_1
} // :goto_0
return;
} // .end method
public void setBackgroundDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.q.m ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->b(Landroid/graphics/drawable/Drawable;)V
} // :cond_0
return;
} // .end method
public void setBackgroundResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/TextView;->setBackgroundResource(I)V */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.q.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->a(I)V
} // :cond_0
return;
} // .end method
public void setCompoundDrawables ( android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V */
/* .line 2 */
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
(( c.b.q.u0 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/b/q/u0;->k()V
} // :cond_0
return;
} // .end method
public void setCompoundDrawablesRelative ( android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V */
/* .line 2 */
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
(( c.b.q.u0 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/b/q/u0;->k()V
} // :cond_0
return;
} // .end method
public void setCompoundDrawablesRelativeWithIntrinsicBounds ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 2 */
/* .line 4 */
(( android.widget.TextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 5 */
c.b.l.a.b .c ( v0,p1 );
} // :cond_0
/* move-object p1, v1 */
} // :goto_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 6 */
c.b.l.a.b .c ( v0,p2 );
} // :cond_1
/* move-object p2, v1 */
} // :goto_1
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 7 */
c.b.l.a.b .c ( v0,p3 );
} // :cond_2
/* move-object p3, v1 */
} // :goto_2
if ( p4 != null) { // if-eqz p4, :cond_3
/* .line 8 */
c.b.l.a.b .c ( v0,p4 );
/* .line 9 */
} // :cond_3
(( c.b.q.v0 ) p0 ).setCompoundDrawablesRelativeWithIntrinsicBounds ( p1, p2, p3, v1 ); // invoke-virtual {p0, p1, p2, p3, v1}, Lc/b/q/v0;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
/* .line 10 */
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 11 */
(( c.b.q.u0 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/b/q/u0;->k()V
} // :cond_4
return;
} // .end method
public void setCompoundDrawablesRelativeWithIntrinsicBounds ( android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V */
/* .line 2 */
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
(( c.b.q.u0 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/b/q/u0;->k()V
} // :cond_0
return;
} // .end method
public void setCompoundDrawablesWithIntrinsicBounds ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 2 */
/* .line 4 */
(( android.widget.TextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 5 */
c.b.l.a.b .c ( v0,p1 );
} // :cond_0
/* move-object p1, v1 */
} // :goto_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 6 */
c.b.l.a.b .c ( v0,p2 );
} // :cond_1
/* move-object p2, v1 */
} // :goto_1
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 7 */
c.b.l.a.b .c ( v0,p3 );
} // :cond_2
/* move-object p3, v1 */
} // :goto_2
if ( p4 != null) { // if-eqz p4, :cond_3
/* .line 8 */
c.b.l.a.b .c ( v0,p4 );
/* .line 9 */
} // :cond_3
(( c.b.q.v0 ) p0 ).setCompoundDrawablesWithIntrinsicBounds ( p1, p2, p3, v1 ); // invoke-virtual {p0, p1, p2, p3, v1}, Lc/b/q/v0;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
/* .line 10 */
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 11 */
(( c.b.q.u0 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/b/q/u0;->k()V
} // :cond_4
return;
} // .end method
public void setCompoundDrawablesWithIntrinsicBounds ( android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V */
/* .line 2 */
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
(( c.b.q.u0 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/b/q/u0;->k()V
} // :cond_0
return;
} // .end method
public void setCustomSelectionActionModeCallback ( android.view.ActionMode$Callback p0 ) {
/* .locals 0 */
/* .line 1 */
c.h.o.p .a ( p0,p1 );
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V */
return;
} // .end method
public void setFirstBaselineToTopHeight ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1c */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V */
/* .line 3 */
} // :cond_0
c.h.o.p .a ( p0,p1 );
} // :goto_0
return;
} // .end method
public void setLastBaselineToBottomHeight ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1c */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/widget/TextView;->setLastBaselineToBottomHeight(I)V */
/* .line 3 */
} // :cond_0
c.h.o.p .b ( p0,p1 );
} // :goto_0
return;
} // .end method
public void setLineHeight ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
c.h.o.p .c ( p0,p1 );
return;
} // .end method
public void setPrecomputedText ( Object p0 ) {
/* .locals 0 */
/* .line 1 */
c.h.o.p .a ( p0,p1 );
return;
} // .end method
public void setSupportBackgroundTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.m ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->b(Landroid/content/res/ColorStateList;)V
} // :cond_0
return;
} // .end method
public void setSupportBackgroundTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->a(Landroid/graphics/PorterDuff$Mode;)V
} // :cond_0
return;
} // .end method
public void setSupportCompoundDrawablesTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
(( c.b.q.u0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/u0;->a(Landroid/content/res/ColorStateList;)V
/* .line 2 */
p1 = this.c;
(( c.b.q.u0 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/u0;->a()V
return;
} // .end method
public void setSupportCompoundDrawablesTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
(( c.b.q.u0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/u0;->a(Landroid/graphics/PorterDuff$Mode;)V
/* .line 2 */
p1 = this.c;
(( c.b.q.u0 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/u0;->a()V
return;
} // .end method
public void setTextAppearance ( android.content.Context p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V */
/* .line 2 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.q.u0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/q/u0;->a(Landroid/content/Context;I)V
} // :cond_0
return;
} // .end method
public void setTextClassifier ( android.view.textclassifier.TextClassifier p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1c */
/* if-ge v0, v1, :cond_1 */
v0 = this.d;
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
(( c.b.q.r0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/r0;->a(Landroid/view/textclassifier/TextClassifier;)V
return;
/* .line 3 */
} // :cond_1
} // :goto_0
/* invoke-super {p0, p1}, Landroid/widget/TextView;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V */
return;
} // .end method
public void setTextFuture ( java.util.concurrent.Future p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/concurrent/Future<", */
/* "Lc/h/l/c;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
this.e = p1;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
(( android.widget.TextView ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->requestLayout()V
} // :cond_0
return;
} // .end method
public void setTextMetricsParamsCompat ( Object p0 ) {
/* .locals 0 */
/* .line 1 */
c.h.o.p .a ( p0,p1 );
return;
} // .end method
public void setTextSize ( Integer p0, Float p1 ) {
/* .locals 1 */
/* .line 1 */
/* sget-boolean v0, Lc/h/o/d;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V */
/* .line 3 */
} // :cond_0
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
(( c.b.q.u0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/q/u0;->a(IF)V
} // :cond_1
} // :goto_0
return;
} // .end method
public void setTypeface ( android.graphics.Typeface p0, Integer p1 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* if-lez p2, :cond_0 */
/* .line 1 */
(( android.widget.TextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;
c.h.g.g .a ( v0,p1,p2 );
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* move-object p1, v0 */
/* .line 2 */
} // :cond_1
/* invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V */
return;
} // .end method
