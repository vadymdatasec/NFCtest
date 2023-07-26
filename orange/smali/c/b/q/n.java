public class c.b.q.n extends android.widget.Button implements c.h.n.z implements c.h.o.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.m b;
	 public final c.b.q.u0 c;
	 /* # direct methods */
	 public c.b.q.n ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Lc/b/q/n;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public c.b.q.n ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 c.b.q.h2 .b ( p1 );
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 3 */
		 /* new-instance p1, Lc/b/q/m; */
		 /* invoke-direct {p1, p0}, Lc/b/q/m;-><init>(Landroid/view/View;)V */
		 this.b = p1;
		 /* .line 4 */
		 (( c.b.q.m ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/m;->a(Landroid/util/AttributeSet;I)V
		 /* .line 5 */
		 /* new-instance p1, Lc/b/q/u0; */
		 /* invoke-direct {p1, p0}, Lc/b/q/u0;-><init>(Landroid/widget/TextView;)V */
		 this.c = p1;
		 /* .line 6 */
		 (( c.b.q.u0 ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/u0;->a(Landroid/util/AttributeSet;I)V
		 /* .line 7 */
		 p1 = this.c;
		 (( c.b.q.u0 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/u0;->a()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void drawableStateChanged ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0}, Landroid/widget/Button;->drawableStateChanged()V */
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
			 v0 = 			 /* invoke-super {p0}, Landroid/widget/Button;->getAutoSizeMaxTextSize()I */
			 /* .line 3 */
		 } // :cond_0
		 v0 = this.c;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 4 */
			 v0 = 			 (( c.b.q.u0 ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/q/u0;->c()I
		 } // :cond_1
		 int v0 = -1; // const/4 v0, -0x1
	 } // .end method
	 public Integer getAutoSizeMinTextSize ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* sget-boolean v0, Lc/h/o/d;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = 			 /* invoke-super {p0}, Landroid/widget/Button;->getAutoSizeMinTextSize()I */
			 /* .line 3 */
		 } // :cond_0
		 v0 = this.c;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 4 */
			 v0 = 			 (( c.b.q.u0 ) v0 ).d ( ); // invoke-virtual {v0}, Lc/b/q/u0;->d()I
		 } // :cond_1
		 int v0 = -1; // const/4 v0, -0x1
	 } // .end method
	 public Integer getAutoSizeStepGranularity ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* sget-boolean v0, Lc/h/o/d;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = 			 /* invoke-super {p0}, Landroid/widget/Button;->getAutoSizeStepGranularity()I */
			 /* .line 3 */
		 } // :cond_0
		 v0 = this.c;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 4 */
			 v0 = 			 (( c.b.q.u0 ) v0 ).e ( ); // invoke-virtual {v0}, Lc/b/q/u0;->e()I
		 } // :cond_1
		 int v0 = -1; // const/4 v0, -0x1
	 } // .end method
	 public getAutoSizeTextAvailableSizes ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* sget-boolean v0, Lc/h/o/d;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 /* invoke-super {p0}, Landroid/widget/Button;->getAutoSizeTextAvailableSizes()[I */
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
		 v0 = 		 /* invoke-super {p0}, Landroid/widget/Button;->getAutoSizeTextType()I */
		 int v2 = 1; // const/4 v2, 0x1
		 /* if-ne v0, v2, :cond_0 */
		 int v1 = 1; // const/4 v1, 0x1
	 } // :cond_0
	 /* .line 3 */
} // :cond_1
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 4 */
	 v0 = 	 (( c.b.q.u0 ) v0 ).g ( ); // invoke-virtual {v0}, Lc/b/q/u0;->g()I
} // :cond_2
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
public void onInitializeAccessibilityEvent ( android.view.accessibility.AccessibilityEvent p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/Button;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V */
/* .line 2 */
/* const-class v0, Landroid/widget/Button; */
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( android.view.accessibility.AccessibilityEvent ) p1 ).setClassName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
return;
} // .end method
public void onInitializeAccessibilityNodeInfo ( android.view.accessibility.AccessibilityNodeInfo p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/Button;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V */
/* .line 2 */
/* const-class v0, Landroid/widget/Button; */
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( android.view.accessibility.AccessibilityNodeInfo ) p1 ).setClassName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V
return;
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 6 */
/* .line 1 */
/* invoke-super/range {p0 ..p5}, Landroid/widget/Button;->onLayout(ZIIII)V */
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
public void onTextChanged ( java.lang.CharSequence p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/Button;->onTextChanged(Ljava/lang/CharSequence;III)V */
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
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/Button;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V */
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
/* invoke-super {p0, p1, p2}, Landroid/widget/Button;->setAutoSizeTextTypeUniformWithPresetSizes([II)V */
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
/* invoke-super {p0, p1}, Landroid/widget/Button;->setAutoSizeTextTypeWithDefaults(I)V */
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
/* invoke-super {p0, p1}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
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
/* invoke-super {p0, p1}, Landroid/widget/Button;->setBackgroundResource(I)V */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.q.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->a(I)V
} // :cond_0
return;
} // .end method
public void setCustomSelectionActionModeCallback ( android.view.ActionMode$Callback p0 ) {
/* .locals 0 */
/* .line 1 */
c.h.o.p .a ( p0,p1 );
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/widget/Button;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V */
return;
} // .end method
public void setSupportAllCaps ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.u0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/u0;->a(Z)V
} // :cond_0
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
public void setTextAppearance ( android.content.Context p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/widget/Button;->setTextAppearance(Landroid/content/Context;I)V */
/* .line 2 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.q.u0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/q/u0;->a(Landroid/content/Context;I)V
} // :cond_0
return;
} // .end method
public void setTextSize ( Integer p0, Float p1 ) {
/* .locals 1 */
/* .line 1 */
/* sget-boolean v0, Lc/h/o/d;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* invoke-super {p0, p1, p2}, Landroid/widget/Button;->setTextSize(IF)V */
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
