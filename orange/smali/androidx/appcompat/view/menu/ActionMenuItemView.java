public class androidx.appcompat.view.menu.ActionMenuItemView extends c.b.q.v0 implements c.b.p.o.a0$a implements android.view.View$OnClickListener implements androidx.appcompat.widget.ActionMenuView$a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/appcompat/view/menu/ActionMenuItemView$b;, */
	 /* Landroidx/appcompat/view/menu/ActionMenuItemView$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public c.b.p.o.p f;
public java.lang.CharSequence g;
public android.graphics.drawable.Drawable h;
public c.b.p.o.m$b i;
public c.b.q.h1 j;
public androidx.appcompat.view.menu.ActionMenuItemView$b k;
public Boolean l;
public Boolean m;
public Integer n;
public Integer o;
public Integer p;
/* # direct methods */
public androidx.appcompat.view.menu.ActionMenuItemView ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 1 */
	 /* invoke-direct {p0, p1, v0}, Landroidx/appcompat/view/menu/ActionMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public androidx.appcompat.view.menu.ActionMenuItemView ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 /* invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/view/menu/ActionMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 return;
} // .end method
public androidx.appcompat.view.menu.ActionMenuItemView ( ) {
	 /* .locals 3 */
	 /* .line 3 */
	 /* invoke-direct {p0, p1, p2, p3}, Lc/b/q/v0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 /* .line 4 */
	 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 /* .line 5 */
	 v1 = 	 (( androidx.appcompat.view.menu.ActionMenuItemView ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->f()Z
	 /* iput-boolean v1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->l:Z */
	 /* .line 6 */
	 v1 = c.b.j.ActionMenuItemView;
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v1, p3, v2 ); // invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
	 /* .line 7 */
	 p2 = 	 (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
	 /* iput p2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->n:I */
	 /* .line 8 */
	 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
	 /* .line 9 */
	 (( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 /* iget p1, p1, Landroid/util/DisplayMetrics;->density:F */
	 /* const/high16 p2, 0x42000000 # 32.0f */
	 /* mul-float p1, p1, p2 */
	 /* const/high16 p2, 0x3f000000 # 0.5f */
	 /* add-float/2addr p1, p2 */
	 /* float-to-int p1, p1 */
	 /* .line 10 */
	 /* iput p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->p:I */
	 /* .line 11 */
	 (( android.widget.TextView ) p0 ).setOnClickListener ( p0 ); // invoke-virtual {p0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
	 int p1 = -1; // const/4 p1, -0x1
	 /* .line 12 */
	 /* iput p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->o:I */
	 /* .line 13 */
	 (( android.widget.TextView ) p0 ).setSaveEnabled ( v2 ); // invoke-virtual {p0, v2}, Landroid/widget/TextView;->setSaveEnabled(Z)V
	 return;
} // .end method
/* # virtual methods */
public void a ( Object p0, Integer p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.f = p1;
	 /* .line 2 */
	 (( c.b.p.o.p ) p1 ).getIcon ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->getIcon()Landroid/graphics/drawable/Drawable;
	 (( androidx.appcompat.view.menu.ActionMenuItemView ) p0 ).setIcon ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V
	 /* .line 3 */
	 (( c.b.p.o.p ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lc/b/p/o/p;->a(Lc/b/p/o/a0$a;)Ljava/lang/CharSequence;
	 (( androidx.appcompat.view.menu.ActionMenuItemView ) p0 ).setTitle ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setTitle(Ljava/lang/CharSequence;)V
	 /* .line 4 */
	 p2 = 	 (( c.b.p.o.p ) p1 ).getItemId ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->getItemId()I
	 (( android.widget.TextView ) p0 ).setId ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/TextView;->setId(I)V
	 /* .line 5 */
	 p2 = 	 (( c.b.p.o.p ) p1 ).isVisible ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->isVisible()Z
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 int p2 = 0; // const/4 p2, 0x0
	 } // :cond_0
	 /* const/16 p2, 0x8 */
} // :goto_0
(( android.widget.TextView ) p0 ).setVisibility ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 6 */
p2 = (( c.b.p.o.p ) p1 ).isEnabled ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->isEnabled()Z
(( android.widget.TextView ) p0 ).setEnabled ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/TextView;->setEnabled(Z)V
/* .line 7 */
p1 = (( c.b.p.o.p ) p1 ).hasSubMenu ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->hasSubMenu()Z
if ( p1 != null) { // if-eqz p1, :cond_1
	 /* .line 8 */
	 p1 = this.j;
	 /* if-nez p1, :cond_1 */
	 /* .line 9 */
	 /* new-instance p1, Landroidx/appcompat/view/menu/ActionMenuItemView$a; */
	 /* invoke-direct {p1, p0}, Landroidx/appcompat/view/menu/ActionMenuItemView$a;-><init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V */
	 this.j = p1;
} // :cond_1
return;
} // .end method
public Boolean a ( ) {
/* .locals 1 */
/* .line 10 */
v0 = (( androidx.appcompat.view.menu.ActionMenuItemView ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->e()Z
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( androidx.appcompat.view.menu.ActionMenuItemView ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.f;
	 (( c.b.p.o.p ) v0 ).getIcon ( ); // invoke-virtual {v0}, Lc/b/p/o/p;->getIcon()Landroid/graphics/drawable/Drawable;
	 /* if-nez v0, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean c ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean e ( ) {
/* .locals 1 */
/* .line 1 */
(( c.b.q.v0 ) p0 ).getText ( ); // invoke-virtual {p0}, Lc/b/q/v0;->getText()Ljava/lang/CharSequence;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* xor-int/lit8 v0, v0, 0x1 */
} // .end method
public final Boolean f ( ) {
/* .locals 5 */
/* .line 1 */
(( android.widget.TextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* .line 2 */
/* iget v1, v0, Landroid/content/res/Configuration;->screenWidthDp:I */
/* .line 3 */
/* iget v2, v0, Landroid/content/res/Configuration;->screenHeightDp:I */
/* const/16 v3, 0x1e0 */
/* if-ge v1, v3, :cond_2 */
/* const/16 v4, 0x280 */
/* if-lt v1, v4, :cond_0 */
/* if-ge v2, v3, :cond_2 */
/* .line 4 */
} // :cond_0
/* iget v0, v0, Landroid/content/res/Configuration;->orientation:I */
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_1 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :cond_2
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public final void g ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.g;
v0 = android.text.TextUtils .isEmpty ( v0 );
int v1 = 1; // const/4 v1, 0x1
/* xor-int/2addr v0, v1 */
/* .line 2 */
v2 = this.h;
if ( v2 != null) { // if-eqz v2, :cond_1
v2 = this.f;
/* .line 3 */
v2 = (( c.b.p.o.p ) v2 ).n ( ); // invoke-virtual {v2}, Lc/b/p/o/p;->n()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* iget-boolean v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->l:Z */
/* if-nez v2, :cond_1 */
/* iget-boolean v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->m:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :cond_1
} // :goto_0
/* and-int/2addr v0, v1 */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 4 */
v2 = this.g;
} // :cond_2
/* move-object v2, v1 */
} // :goto_1
(( android.widget.TextView ) p0 ).setText ( v2 ); // invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 5 */
v2 = this.f;
(( c.b.p.o.p ) v2 ).getContentDescription ( ); // invoke-virtual {v2}, Lc/b/p/o/p;->getContentDescription()Ljava/lang/CharSequence;
/* .line 6 */
v3 = android.text.TextUtils .isEmpty ( v2 );
if ( v3 != null) { // if-eqz v3, :cond_4
if ( v0 != null) { // if-eqz v0, :cond_3
/* move-object v2, v1 */
/* .line 7 */
} // :cond_3
v2 = this.f;
(( c.b.p.o.p ) v2 ).getTitle ( ); // invoke-virtual {v2}, Lc/b/p/o/p;->getTitle()Ljava/lang/CharSequence;
} // :goto_2
(( android.widget.TextView ) p0 ).setContentDescription ( v2 ); // invoke-virtual {p0, v2}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V
/* .line 8 */
} // :cond_4
(( android.widget.TextView ) p0 ).setContentDescription ( v2 ); // invoke-virtual {p0, v2}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V
/* .line 9 */
} // :goto_3
v2 = this.f;
(( c.b.p.o.p ) v2 ).getTooltipText ( ); // invoke-virtual {v2}, Lc/b/p/o/p;->getTooltipText()Ljava/lang/CharSequence;
/* .line 10 */
v3 = android.text.TextUtils .isEmpty ( v2 );
if ( v3 != null) { // if-eqz v3, :cond_6
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 11 */
} // :cond_5
v0 = this.f;
(( c.b.p.o.p ) v0 ).getTitle ( ); // invoke-virtual {v0}, Lc/b/p/o/p;->getTitle()Ljava/lang/CharSequence;
} // :goto_4
c.b.q.p2 .a ( p0,v1 );
/* .line 12 */
} // :cond_6
c.b.q.p2 .a ( p0,v2 );
} // :goto_5
return;
} // .end method
public c.b.p.o.p getItemData ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
} // .end method
public void onClick ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
p1 = this.i;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
v0 = this.f;
} // :cond_0
return;
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/TextView;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
/* .line 2 */
p1 = (( androidx.appcompat.view.menu.ActionMenuItemView ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->f()Z
/* iput-boolean p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->l:Z */
/* .line 3 */
(( androidx.appcompat.view.menu.ActionMenuItemView ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->g()V
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 5 */
/* .line 1 */
v0 = (( androidx.appcompat.view.menu.ActionMenuItemView ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iget v1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->o:I */
/* if-ltz v1, :cond_0 */
/* .line 3 */
v2 = (( android.widget.TextView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingTop()I
/* .line 4 */
v3 = (( android.widget.TextView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingRight()I
v4 = (( android.widget.TextView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingBottom()I
/* .line 5 */
/* invoke-super {p0, v1, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V */
/* .line 6 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Lc/b/q/v0;->onMeasure(II)V */
/* .line 7 */
v1 = android.view.View$MeasureSpec .getMode ( p1 );
/* .line 8 */
p1 = android.view.View$MeasureSpec .getSize ( p1 );
/* .line 9 */
v2 = (( android.widget.TextView ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredWidth()I
/* const/high16 v3, -0x80000000 */
/* if-ne v1, v3, :cond_1 */
/* .line 10 */
/* iget v3, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->n:I */
p1 = java.lang.Math .min ( p1,v3 );
} // :cond_1
/* iget p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->n:I */
} // :goto_0
/* const/high16 v3, 0x40000000 # 2.0f */
/* if-eq v1, v3, :cond_2 */
/* .line 11 */
/* iget v1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->n:I */
/* if-lez v1, :cond_2 */
/* if-ge v2, p1, :cond_2 */
/* .line 12 */
p1 = android.view.View$MeasureSpec .makeMeasureSpec ( p1,v3 );
/* invoke-super {p0, p1, p2}, Lc/b/q/v0;->onMeasure(II)V */
} // :cond_2
/* if-nez v0, :cond_3 */
/* .line 13 */
p1 = this.h;
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 14 */
p1 = (( android.widget.TextView ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredWidth()I
/* .line 15 */
p2 = this.h;
(( android.graphics.drawable.Drawable ) p2 ).getBounds ( ); // invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
p2 = (( android.graphics.Rect ) p2 ).width ( ); // invoke-virtual {p2}, Landroid/graphics/Rect;->width()I
/* sub-int/2addr p1, p2 */
/* .line 16 */
/* div-int/lit8 p1, p1, 0x2 */
p2 = (( android.widget.TextView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingTop()I
v0 = (( android.widget.TextView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingRight()I
v1 = (( android.widget.TextView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingBottom()I
/* invoke-super {p0, p1, p2, v0, v1}, Landroid/widget/TextView;->setPadding(IIII)V */
} // :cond_3
return;
} // .end method
public void onRestoreInstanceState ( android.os.Parcelable p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/TextView;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
v0 = (( c.b.p.o.p ) v0 ).hasSubMenu ( ); // invoke-virtual {v0}, Lc/b/p/o/p;->hasSubMenu()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( c.b.q.h1 ) v0 ).onTouch ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lc/b/q/h1;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 1; // const/4 p1, 0x1
/* .line 3 */
} // :cond_0
p1 = /* invoke-super {p0, p1}, Landroid/widget/TextView;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end method
public void setCheckable ( Boolean p0 ) {
/* .locals 0 */
return;
} // .end method
public void setChecked ( Boolean p0 ) {
/* .locals 0 */
return;
} // .end method
public void setExpandedFormat ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->m:Z */
/* if-eq v0, p1, :cond_0 */
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->m:Z */
/* .line 3 */
p1 = this.f;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4 */
(( c.b.p.o.p ) p1 ).b ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->b()V
} // :cond_0
return;
} // .end method
public void setIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 4 */
/* .line 1 */
this.h = p1;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 2 */
v0 = (( android.graphics.drawable.Drawable ) p1 ).getIntrinsicWidth ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* .line 3 */
v1 = (( android.graphics.drawable.Drawable ) p1 ).getIntrinsicHeight ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* .line 4 */
/* iget v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->p:I */
/* if-le v0, v2, :cond_0 */
/* int-to-float v3, v2 */
/* int-to-float v0, v0 */
/* div-float/2addr v3, v0 */
/* int-to-float v0, v1 */
/* mul-float v0, v0, v3 */
/* float-to-int v1, v0 */
/* move v0, v2 */
/* .line 5 */
} // :cond_0
/* iget v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->p:I */
/* if-le v1, v2, :cond_1 */
/* int-to-float v3, v2 */
/* int-to-float v1, v1 */
/* div-float/2addr v3, v1 */
/* int-to-float v0, v0 */
/* mul-float v0, v0, v3 */
/* float-to-int v0, v0 */
/* move v1, v2 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
/* .line 6 */
(( android.graphics.drawable.Drawable ) p1 ).setBounds ( v2, v2, v0, v1 ); // invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
(( c.b.q.v0 ) p0 ).setCompoundDrawables ( p1, v0, v0, v0 ); // invoke-virtual {p0, p1, v0, v0, v0}, Lc/b/q/v0;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
/* .line 8 */
(( androidx.appcompat.view.menu.ActionMenuItemView ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->g()V
return;
} // .end method
public void setItemInvoker ( c.b.p.o.m$b p0 ) {
/* .locals 0 */
/* .line 1 */
this.i = p1;
return;
} // .end method
public void setPadding ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->o:I */
/* .line 2 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setPadding(IIII)V */
return;
} // .end method
public void setPopupCallback ( androidx.appcompat.view.menu.ActionMenuItemView$b p0 ) {
/* .locals 0 */
/* .line 1 */
this.k = p1;
return;
} // .end method
public void setTitle ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 1 */
this.g = p1;
/* .line 2 */
(( androidx.appcompat.view.menu.ActionMenuItemView ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->g()V
return;
} // .end method
