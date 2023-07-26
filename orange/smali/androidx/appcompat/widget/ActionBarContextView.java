public class androidx.appcompat.widget.ActionBarContextView extends c.b.q.b {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.CharSequence j;
	 public java.lang.CharSequence k;
	 public android.view.View l;
	 public android.view.View m;
	 public android.widget.LinearLayout n;
	 public android.widget.TextView o;
	 public android.widget.TextView p;
	 public Integer q;
	 public Integer r;
	 public Boolean s;
	 public Integer t;
	 /* # direct methods */
	 public androidx.appcompat.widget.ActionBarContextView ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public androidx.appcompat.widget.ActionBarContextView ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public androidx.appcompat.widget.ActionBarContextView ( ) {
		 /* .locals 2 */
		 /* .line 3 */
		 /* invoke-direct {p0, p1, p2, p3}, Lc/b/q/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 4 */
		 v0 = c.b.j.ActionMode;
		 int v1 = 0; // const/4 v1, 0x0
		 c.b.q.k2 .a ( p1,p2,v0,p3,v1 );
		 /* .line 5 */
		 (( c.b.q.k2 ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
		 c.h.n.v0 .a ( p0,p2 );
		 /* .line 6 */
		 p2 = 		 (( c.b.q.k2 ) p1 ).g ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/b/q/k2;->g(II)I
		 /* iput p2, p0, Landroidx/appcompat/widget/ActionBarContextView;->q:I */
		 /* .line 7 */
		 p2 = 		 (( c.b.q.k2 ) p1 ).g ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/b/q/k2;->g(II)I
		 /* iput p2, p0, Landroidx/appcompat/widget/ActionBarContextView;->r:I */
		 /* .line 8 */
		 p2 = 		 (( c.b.q.k2 ) p1 ).f ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/b/q/k2;->f(II)I
		 /* iput p2, p0, Lc/b/q/b;->f:I */
		 /* .line 9 */
		 p2 = 		 (( c.b.q.k2 ) p1 ).g ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/k2;->g(II)I
		 /* iput p2, p0, Landroidx/appcompat/widget/ActionBarContextView;->t:I */
		 /* .line 10 */
		 (( c.b.q.k2 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/k2;->a()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 1 */
		 /* .line 19 */
		 v0 = this.l;
		 /* if-nez v0, :cond_0 */
		 /* .line 20 */
		 (( androidx.appcompat.widget.ActionBarContextView ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContextView;->d()V
	 } // :cond_0
	 return;
} // .end method
public void a ( Object p0 ) {
	 /* .locals 3 */
	 /* .line 1 */
	 v0 = this.l;
	 /* if-nez v0, :cond_0 */
	 /* .line 2 */
	 (( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
	 android.view.LayoutInflater .from ( v0 );
	 /* .line 3 */
	 /* iget v1, p0, Landroidx/appcompat/widget/ActionBarContextView;->t:I */
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.view.LayoutInflater ) v0 ).inflate ( v1, p0, v2 ); // invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
	 this.l = v0;
	 /* .line 4 */
	 (( android.view.ViewGroup ) p0 ).addView ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
	 /* .line 5 */
} // :cond_0
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* if-nez v0, :cond_1 */
/* .line 6 */
v0 = this.l;
(( android.view.ViewGroup ) p0 ).addView ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
/* .line 7 */
} // :cond_1
} // :goto_0
v0 = this.l;
(( android.view.View ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* .line 8 */
/* new-instance v1, Landroidx/appcompat/widget/ActionBarContextView$a; */
/* invoke-direct {v1, p0, p1}, Landroidx/appcompat/widget/ActionBarContextView$a;-><init>(Landroidx/appcompat/widget/ActionBarContextView;Lc/b/p/c;)V */
(( android.view.View ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 9 */
(( c.b.p.c ) p1 ).c ( ); // invoke-virtual {p1}, Lc/b/p/c;->c()Landroid/view/Menu;
/* check-cast p1, Lc/b/p/o/m; */
/* .line 10 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 11 */
(( c.b.q.k ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/q/k;->b()Z
/* .line 12 */
} // :cond_2
/* new-instance v0, Lc/b/q/k; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Lc/b/q/k;-><init>(Landroid/content/Context;)V */
this.e = v0;
int v1 = 1; // const/4 v1, 0x1
/* .line 13 */
(( c.b.q.k ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/k;->c(Z)V
/* .line 14 */
/* new-instance v0, Landroid/view/ViewGroup$LayoutParams; */
int v1 = -2; // const/4 v1, -0x2
int v2 = -1; // const/4 v2, -0x1
/* invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
/* .line 15 */
v1 = this.e;
v2 = this.c;
(( c.b.p.o.m ) p1 ).a ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Lc/b/p/o/m;->a(Lc/b/p/o/z;Landroid/content/Context;)V
/* .line 16 */
p1 = this.e;
(( c.b.q.k ) p1 ).b ( p0 ); // invoke-virtual {p1, p0}, Lc/b/q/k;->b(Landroid/view/ViewGroup;)Lc/b/p/o/a0;
/* check-cast p1, Landroidx/appcompat/widget/ActionMenuView; */
this.d = p1;
int v1 = 0; // const/4 v1, 0x0
/* .line 17 */
c.h.n.v0 .a ( p1,v1 );
/* .line 18 */
p1 = this.d;
(( android.view.ViewGroup ) p0 ).addView ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
return;
} // .end method
public final void b ( ) {
/* .locals 6 */
/* .line 1 */
v0 = this.n;
/* if-nez v0, :cond_1 */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
android.view.LayoutInflater .from ( v0 );
/* .line 3 */
(( android.view.LayoutInflater ) v0 ).inflate ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
/* .line 4 */
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* add-int/lit8 v0, v0, -0x1 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/LinearLayout; */
this.n = v0;
/* .line 5 */
(( android.widget.LinearLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
this.o = v0;
/* .line 6 */
v0 = this.n;
(( android.widget.LinearLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
this.p = v0;
/* .line 7 */
/* iget v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->q:I */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 8 */
v0 = this.o;
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* iget v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->q:I */
(( android.widget.TextView ) v0 ).setTextAppearance ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
/* .line 9 */
} // :cond_0
/* iget v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->r:I */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 10 */
v0 = this.p;
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* iget v2, p0, Landroidx/appcompat/widget/ActionBarContextView;->r:I */
(( android.widget.TextView ) v0 ).setTextAppearance ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
/* .line 11 */
} // :cond_1
v0 = this.o;
v1 = this.j;
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 12 */
v0 = this.p;
v1 = this.k;
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 13 */
v0 = this.j;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* xor-int/lit8 v0, v0, 0x1 */
/* .line 14 */
v1 = this.k;
v1 = android.text.TextUtils .isEmpty ( v1 );
/* xor-int/lit8 v1, v1, 0x1 */
/* .line 15 */
v2 = this.p;
int v3 = 0; // const/4 v3, 0x0
/* const/16 v4, 0x8 */
if ( v1 != null) { // if-eqz v1, :cond_2
int v5 = 0; // const/4 v5, 0x0
} // :cond_2
/* const/16 v5, 0x8 */
} // :goto_0
(( android.widget.TextView ) v2 ).setVisibility ( v5 ); // invoke-virtual {v2, v5}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 16 */
v2 = this.n;
/* if-nez v0, :cond_4 */
if ( v1 != null) { // if-eqz v1, :cond_3
} // :cond_3
/* const/16 v3, 0x8 */
} // :cond_4
} // :goto_1
(( android.widget.LinearLayout ) v2 ).setVisibility ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 17 */
v0 = this.n;
(( android.widget.LinearLayout ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;
/* if-nez v0, :cond_5 */
/* .line 18 */
v0 = this.n;
(( android.view.ViewGroup ) p0 ).addView ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
} // :cond_5
return;
} // .end method
public Boolean c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->s:Z */
} // .end method
public void d ( ) {
/* .locals 1 */
/* .line 1 */
(( android.view.ViewGroup ) p0 ).removeAllViews ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.m = v0;
/* .line 3 */
this.d = v0;
return;
} // .end method
public Boolean e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( c.b.q.k ) v0 ).i ( ); // invoke-virtual {v0}, Lc/b/q/k;->i()Z
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams; */
int v1 = -1; // const/4 v1, -0x1
int v2 = -2; // const/4 v2, -0x2
/* invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V */
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public Integer getAnimatedVisibility ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0}, Lc/b/q/b;->getAnimatedVisibility()I */
} // .end method
public Integer getContentHeight ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0}, Lc/b/q/b;->getContentHeight()I */
} // .end method
public java.lang.CharSequence getSubtitle ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k;
} // .end method
public java.lang.CharSequence getTitle ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
} // .end method
public void onDetachedFromWindow ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V */
/* .line 2 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.q.k ) v0 ).e ( ); // invoke-virtual {v0}, Lc/b/q/k;->e()Z
/* .line 4 */
v0 = this.e;
(( c.b.q.k ) v0 ).f ( ); // invoke-virtual {v0}, Lc/b/q/k;->f()Z
} // :cond_0
return;
} // .end method
public void onInitializeAccessibilityEvent ( android.view.accessibility.AccessibilityEvent p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( android.view.accessibility.AccessibilityEvent ) p1 ).getEventType ( ); // invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I
/* const/16 v1, 0x20 */
/* if-ne v0, v1, :cond_0 */
/* .line 2 */
(( android.view.accessibility.AccessibilityEvent ) p1 ).setSource ( p0 ); // invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityEvent;->setSource(Landroid/view/View;)V
/* .line 3 */
/* const-class v0, Landroidx/appcompat/widget/ActionBarContextView; */
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( android.view.accessibility.AccessibilityEvent ) p1 ).setClassName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
/* .line 4 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( android.view.accessibility.AccessibilityEvent ) p1 ).setPackageName ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V
/* .line 5 */
v0 = this.j;
(( android.view.accessibility.AccessibilityEvent ) p1 ).setContentDescription ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setContentDescription(Ljava/lang/CharSequence;)V
/* .line 6 */
} // :cond_0
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V */
} // :goto_0
return;
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 9 */
/* .line 1 */
p1 = c.b.q.v2 .a ( p0 );
if ( p1 != null) { // if-eqz p1, :cond_0
/* sub-int v0, p4, p2 */
/* .line 2 */
v1 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* sub-int/2addr v0, v1 */
} // :cond_0
v0 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* .line 3 */
} // :goto_0
v6 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
/* sub-int/2addr p5, p3 */
/* .line 4 */
p3 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
/* sub-int/2addr p5, p3 */
p3 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* sub-int p3, p5, p3 */
/* .line 5 */
p5 = this.l;
/* const/16 v7, 0x8 */
if ( p5 != null) { // if-eqz p5, :cond_3
p5 = (( android.view.View ) p5 ).getVisibility ( ); // invoke-virtual {p5}, Landroid/view/View;->getVisibility()I
/* if-eq p5, v7, :cond_3 */
/* .line 6 */
p5 = this.l;
(( android.view.View ) p5 ).getLayoutParams ( ); // invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p5, Landroid/view/ViewGroup$MarginLayoutParams; */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 7 */
/* iget v1, p5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
} // :cond_1
/* iget v1, p5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
} // :goto_1
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 8 */
/* iget p5, p5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
} // :cond_2
/* iget p5, p5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* .line 9 */
} // :goto_2
v8 = c.b.q.b .a ( v0,v1,p1 );
/* .line 10 */
v1 = this.l;
/* move-object v0, p0 */
/* move v2, v8 */
/* move v3, v6 */
/* move v4, p3 */
/* move v5, p1 */
v0 = /* invoke-virtual/range {v0 ..v5}, Lc/b/q/b;->a(Landroid/view/View;IIIZ)I */
/* add-int/2addr v8, v0 */
/* .line 11 */
v0 = c.b.q.b .a ( v8,p5,p1 );
} // :cond_3
/* move p5, v0 */
/* .line 12 */
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_4
v1 = this.m;
/* if-nez v1, :cond_4 */
v0 = (( android.widget.LinearLayout ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I
/* if-eq v0, v7, :cond_4 */
/* .line 13 */
v1 = this.n;
/* move-object v0, p0 */
/* move v2, p5 */
/* move v3, v6 */
/* move v4, p3 */
/* move v5, p1 */
v0 = /* invoke-virtual/range {v0 ..v5}, Lc/b/q/b;->a(Landroid/view/View;IIIZ)I */
/* add-int/2addr p5, v0 */
} // :cond_4
/* move v2, p5 */
/* .line 14 */
v1 = this.m;
if ( v1 != null) { // if-eqz v1, :cond_5
/* move-object v0, p0 */
/* move v3, v6 */
/* move v4, p3 */
/* move v5, p1 */
/* .line 15 */
/* invoke-virtual/range {v0 ..v5}, Lc/b/q/b;->a(Landroid/view/View;IIIZ)I */
} // :cond_5
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 16 */
p2 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* move v3, p2 */
} // :cond_6
/* sub-int/2addr p4, p2 */
p2 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* sub-int/2addr p4, p2 */
/* move v3, p4 */
/* .line 17 */
} // :goto_3
v2 = this.d;
if ( v2 != null) { // if-eqz v2, :cond_7
/* xor-int/lit8 p1, p1, 0x1 */
/* move-object v1, p0 */
/* move v4, v6 */
/* move v5, p3 */
/* move v6, p1 */
/* .line 18 */
/* invoke-virtual/range {v1 ..v6}, Lc/b/q/b;->a(Landroid/view/View;IIIZ)I */
} // :cond_7
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 10 */
/* .line 1 */
v0 = android.view.View$MeasureSpec .getMode ( p1 );
/* const/high16 v1, 0x40000000 # 2.0f */
/* if-ne v0, v1, :cond_11 */
/* .line 2 */
v0 = android.view.View$MeasureSpec .getMode ( p2 );
if ( v0 != null) { // if-eqz v0, :cond_10
/* .line 3 */
p1 = android.view.View$MeasureSpec .getSize ( p1 );
/* .line 4 */
/* iget v0, p0, Lc/b/q/b;->f:I */
/* if-lez v0, :cond_0 */
/* .line 5 */
} // :cond_0
v0 = android.view.View$MeasureSpec .getSize ( p2 );
/* .line 6 */
} // :goto_0
p2 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
v2 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* add-int/2addr p2, v2 */
/* .line 7 */
v2 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* sub-int v2, p1, v2 */
v3 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* sub-int/2addr v2, v3 */
/* sub-int v3, v0, p2 */
/* const/high16 v4, -0x80000000 */
/* .line 8 */
v5 = android.view.View$MeasureSpec .makeMeasureSpec ( v3,v4 );
/* .line 9 */
v6 = this.l;
int v7 = 0; // const/4 v7, 0x0
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 10 */
v2 = (( c.b.q.b ) p0 ).a ( v6, v2, v5, v7 ); // invoke-virtual {p0, v6, v2, v5, v7}, Lc/b/q/b;->a(Landroid/view/View;III)I
/* .line 11 */
v6 = this.l;
(( android.view.View ) v6 ).getLayoutParams ( ); // invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams; */
/* .line 12 */
/* iget v8, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v8, v6 */
/* sub-int/2addr v2, v8 */
/* .line 13 */
} // :cond_1
v6 = this.d;
if ( v6 != null) { // if-eqz v6, :cond_2
(( android.view.ViewGroup ) v6 ).getParent ( ); // invoke-virtual {v6}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
/* if-ne v6, p0, :cond_2 */
/* .line 14 */
v6 = this.d;
v2 = (( c.b.q.b ) p0 ).a ( v6, v2, v5, v7 ); // invoke-virtual {p0, v6, v2, v5, v7}, Lc/b/q/b;->a(Landroid/view/View;III)I
/* .line 15 */
} // :cond_2
v6 = this.n;
if ( v6 != null) { // if-eqz v6, :cond_7
v8 = this.m;
/* if-nez v8, :cond_7 */
/* .line 16 */
/* iget-boolean v8, p0, Landroidx/appcompat/widget/ActionBarContextView;->s:Z */
if ( v8 != null) { // if-eqz v8, :cond_6
/* .line 17 */
v6 = android.view.View$MeasureSpec .makeMeasureSpec ( v7,v7 );
/* .line 18 */
v8 = this.n;
(( android.widget.LinearLayout ) v8 ).measure ( v6, v5 ); // invoke-virtual {v8, v6, v5}, Landroid/widget/LinearLayout;->measure(II)V
/* .line 19 */
v5 = this.n;
v5 = (( android.widget.LinearLayout ) v5 ).getMeasuredWidth ( ); // invoke-virtual {v5}, Landroid/widget/LinearLayout;->getMeasuredWidth()I
/* if-gt v5, v2, :cond_3 */
int v6 = 1; // const/4 v6, 0x1
} // :cond_3
int v6 = 0; // const/4 v6, 0x0
} // :goto_1
if ( v6 != null) { // if-eqz v6, :cond_4
/* sub-int/2addr v2, v5 */
/* .line 20 */
} // :cond_4
v5 = this.n;
if ( v6 != null) { // if-eqz v6, :cond_5
int v6 = 0; // const/4 v6, 0x0
} // :cond_5
/* const/16 v6, 0x8 */
} // :goto_2
(( android.widget.LinearLayout ) v5 ).setVisibility ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 21 */
} // :cond_6
v2 = (( c.b.q.b ) p0 ).a ( v6, v2, v5, v7 ); // invoke-virtual {p0, v6, v2, v5, v7}, Lc/b/q/b;->a(Landroid/view/View;III)I
/* .line 22 */
} // :cond_7
} // :goto_3
v5 = this.m;
if ( v5 != null) { // if-eqz v5, :cond_c
/* .line 23 */
(( android.view.View ) v5 ).getLayoutParams ( ); // invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 24 */
/* iget v6, v5, Landroid/view/ViewGroup$LayoutParams;->width:I */
int v8 = -2; // const/4 v8, -0x2
/* if-eq v6, v8, :cond_8 */
/* const/high16 v6, 0x40000000 # 2.0f */
} // :cond_8
/* const/high16 v6, -0x80000000 */
/* .line 25 */
} // :goto_4
/* iget v9, v5, Landroid/view/ViewGroup$LayoutParams;->width:I */
/* if-ltz v9, :cond_9 */
/* .line 26 */
v2 = java.lang.Math .min ( v9,v2 );
/* .line 27 */
} // :cond_9
/* iget v9, v5, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* if-eq v9, v8, :cond_a */
} // :cond_a
/* const/high16 v1, -0x80000000 */
/* .line 28 */
} // :goto_5
/* iget v4, v5, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* if-ltz v4, :cond_b */
/* .line 29 */
v3 = java.lang.Math .min ( v4,v3 );
/* .line 30 */
} // :cond_b
v4 = this.m;
v2 = android.view.View$MeasureSpec .makeMeasureSpec ( v2,v6 );
/* .line 31 */
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v3,v1 );
/* .line 32 */
(( android.view.View ) v4 ).measure ( v2, v1 ); // invoke-virtual {v4, v2, v1}, Landroid/view/View;->measure(II)V
/* .line 33 */
} // :cond_c
/* iget v1, p0, Lc/b/q/b;->f:I */
/* if-gtz v1, :cond_f */
/* .line 34 */
v0 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_6
/* if-ge v7, v0, :cond_e */
/* .line 35 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v7 ); // invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 36 */
v2 = (( android.view.View ) v2 ).getMeasuredHeight ( ); // invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I
/* add-int/2addr v2, p2 */
/* if-le v2, v1, :cond_d */
/* move v1, v2 */
} // :cond_d
/* add-int/lit8 v7, v7, 0x1 */
/* .line 37 */
} // :cond_e
(( android.view.ViewGroup ) p0 ).setMeasuredDimension ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V
/* .line 38 */
} // :cond_f
(( android.view.ViewGroup ) p0 ).setMeasuredDimension ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V
} // :goto_7
return;
/* .line 39 */
} // :cond_10
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
/* const-class v0, Landroidx/appcompat/widget/ActionBarContextView; */
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " can only be used with android:layout_height=\"wrap_content\""; // const-string v0, " can only be used with android:layout_height=\"wrap_content\""
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 40 */
} // :cond_11
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
/* const-class v0, Landroidx/appcompat/widget/ActionBarContextView; */
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"; // const-string v0, " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void setContentHeight ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lc/b/q/b;->f:I */
return;
} // .end method
public void setCustomView ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.m;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.view.ViewGroup ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 3 */
} // :cond_0
this.m = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
(( android.view.ViewGroup ) p0 ).removeView ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
this.n = v0;
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 7 */
(( android.view.ViewGroup ) p0 ).addView ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
/* .line 8 */
} // :cond_2
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
return;
} // .end method
public void setSubtitle ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 1 */
this.k = p1;
/* .line 2 */
(( androidx.appcompat.widget.ActionBarContextView ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContextView;->b()V
return;
} // .end method
public void setTitle ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 1 */
this.j = p1;
/* .line 2 */
(( androidx.appcompat.widget.ActionBarContextView ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContextView;->b()V
return;
} // .end method
public void setTitleOptional ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarContextView;->s:Z */
/* if-eq p1, v0, :cond_0 */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
/* .line 3 */
} // :cond_0
/* iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarContextView;->s:Z */
return;
} // .end method
public void setVisibility ( Integer p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Lc/b/q/b;->setVisibility(I)V */
return;
} // .end method
public Boolean shouldDelayChildPressedState ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
