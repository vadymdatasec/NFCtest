public class com.google.android.material.internal.NavigationMenuItemView extends e.f.a.c.p.b implements c.b.p.o.a0$a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final G;
	 /* # instance fields */
	 public android.widget.FrameLayout A;
	 public c.b.p.o.p B;
	 public android.content.res.ColorStateList C;
	 public Boolean D;
	 public android.graphics.drawable.Drawable E;
	 public final c.h.n.d F;
	 public final Integer w;
	 public Boolean x;
	 public Boolean y;
	 public final android.widget.CheckedTextView z;
	 /* # direct methods */
	 public static com.google.android.material.internal.NavigationMenuItemView ( ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [I */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const v2, 0x10100a0 */
		 /* aput v2, v0, v1 */
		 /* .line 1 */
		 return;
	 } // .end method
	 public com.google.android.material.internal.NavigationMenuItemView ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public com.google.android.material.internal.NavigationMenuItemView ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public com.google.android.material.internal.NavigationMenuItemView ( ) {
		 /* .locals 1 */
		 /* .line 3 */
		 /* invoke-direct {p0, p1, p2, p3}, Le/f/a/c/p/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 4 */
		 /* new-instance p2, Lcom/google/android/material/internal/NavigationMenuItemView$a; */
		 /* invoke-direct {p2, p0}, Lcom/google/android/material/internal/NavigationMenuItemView$a;-><init>(Lcom/google/android/material/internal/NavigationMenuItemView;)V */
		 this.F = p2;
		 int p2 = 0; // const/4 p2, 0x0
		 /* .line 5 */
		 (( androidx.appcompat.widget.LinearLayoutCompat ) p0 ).setOrientation ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V
		 /* .line 6 */
		 android.view.LayoutInflater .from ( p1 );
		 int v0 = 1; // const/4 v0, 0x1
		 (( android.view.LayoutInflater ) p2 ).inflate ( p3, p0, v0 ); // invoke-virtual {p2, p3, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
		 /* .line 7 */
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 p1 = 		 (( android.content.res.Resources ) p1 ).getDimensionPixelSize ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
		 /* iput p1, p0, Lcom/google/android/material/internal/NavigationMenuItemView;->w:I */
		 /* .line 8 */
		 (( android.view.ViewGroup ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
		 /* check-cast p1, Landroid/widget/CheckedTextView; */
		 this.z = p1;
		 /* .line 9 */
		 (( android.widget.CheckedTextView ) p1 ).setDuplicateParentStateEnabled ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/CheckedTextView;->setDuplicateParentStateEnabled(Z)V
		 /* .line 10 */
		 p1 = this.z;
		 p2 = this.F;
		 c.h.n.v0 .a ( p1,p2 );
		 return;
	 } // .end method
	 private void setActionView ( android.view.View p0 ) {
		 /* .locals 1 */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 1 */
			 v0 = this.A;
			 /* if-nez v0, :cond_0 */
			 /* .line 2 */
			 /* .line 3 */
			 (( android.view.ViewGroup ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
			 /* check-cast v0, Landroid/view/ViewStub; */
			 (( android.view.ViewStub ) v0 ).inflate ( ); // invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;
			 /* check-cast v0, Landroid/widget/FrameLayout; */
			 this.A = v0;
			 /* .line 4 */
		 } // :cond_0
		 v0 = this.A;
		 (( android.widget.FrameLayout ) v0 ).removeAllViews ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V
		 /* .line 5 */
		 v0 = this.A;
		 (( android.widget.FrameLayout ) v0 ).addView ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
	 } // :cond_1
	 return;
} // .end method
/* # virtual methods */
public void a ( Object p0, Integer p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.B = p1;
	 /* .line 2 */
	 p2 = 	 (( c.b.p.o.p ) p1 ).isVisible ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->isVisible()Z
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 int p2 = 0; // const/4 p2, 0x0
	 } // :cond_0
	 /* const/16 p2, 0x8 */
} // :goto_0
(( android.view.ViewGroup ) p0 ).setVisibility ( p2 ); // invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setVisibility(I)V
/* .line 3 */
(( android.view.ViewGroup ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getBackground()Landroid/graphics/drawable/Drawable;
/* if-nez p2, :cond_1 */
/* .line 4 */
(( com.google.android.material.internal.NavigationMenuItemView ) p0 ).e ( ); // invoke-virtual {p0}, Lcom/google/android/material/internal/NavigationMenuItemView;->e()Landroid/graphics/drawable/StateListDrawable;
c.h.n.v0 .a ( p0,p2 );
/* .line 5 */
} // :cond_1
p2 = (( c.b.p.o.p ) p1 ).isCheckable ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->isCheckable()Z
(( com.google.android.material.internal.NavigationMenuItemView ) p0 ).setCheckable ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/android/material/internal/NavigationMenuItemView;->setCheckable(Z)V
/* .line 6 */
p2 = (( c.b.p.o.p ) p1 ).isChecked ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->isChecked()Z
(( com.google.android.material.internal.NavigationMenuItemView ) p0 ).setChecked ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/android/material/internal/NavigationMenuItemView;->setChecked(Z)V
/* .line 7 */
p2 = (( c.b.p.o.p ) p1 ).isEnabled ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->isEnabled()Z
(( android.view.ViewGroup ) p0 ).setEnabled ( p2 ); // invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setEnabled(Z)V
/* .line 8 */
(( c.b.p.o.p ) p1 ).getTitle ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->getTitle()Ljava/lang/CharSequence;
(( com.google.android.material.internal.NavigationMenuItemView ) p0 ).setTitle ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/android/material/internal/NavigationMenuItemView;->setTitle(Ljava/lang/CharSequence;)V
/* .line 9 */
(( c.b.p.o.p ) p1 ).getIcon ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->getIcon()Landroid/graphics/drawable/Drawable;
(( com.google.android.material.internal.NavigationMenuItemView ) p0 ).setIcon ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/android/material/internal/NavigationMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V
/* .line 10 */
(( c.b.p.o.p ) p1 ).getActionView ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->getActionView()Landroid/view/View;
/* invoke-direct {p0, p2}, Lcom/google/android/material/internal/NavigationMenuItemView;->setActionView(Landroid/view/View;)V */
/* .line 11 */
(( c.b.p.o.p ) p1 ).getContentDescription ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->getContentDescription()Ljava/lang/CharSequence;
(( android.view.ViewGroup ) p0 ).setContentDescription ( p2 ); // invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setContentDescription(Ljava/lang/CharSequence;)V
/* .line 12 */
(( c.b.p.o.p ) p1 ).getTooltipText ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->getTooltipText()Ljava/lang/CharSequence;
c.b.q.p2 .a ( p0,p1 );
/* .line 13 */
(( com.google.android.material.internal.NavigationMenuItemView ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/android/material/internal/NavigationMenuItemView;->d()V
return;
} // .end method
public Boolean c ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final void d ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( com.google.android.material.internal.NavigationMenuItemView ) p0 ).f ( ); // invoke-virtual {p0}, Lcom/google/android/material/internal/NavigationMenuItemView;->f()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.z;
/* const/16 v1, 0x8 */
(( android.widget.CheckedTextView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setVisibility(I)V
/* .line 3 */
v0 = this.A;
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 4 */
	 (( android.widget.FrameLayout ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
	 /* check-cast v0, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
	 int v1 = -1; // const/4 v1, -0x1
	 /* .line 5 */
	 /* iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
	 /* .line 6 */
	 v1 = this.A;
	 (( android.widget.FrameLayout ) v1 ).setLayoutParams ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
	 /* .line 7 */
} // :cond_0
v0 = this.z;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.CheckedTextView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setVisibility(I)V
/* .line 8 */
v0 = this.A;
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 9 */
	 (( android.widget.FrameLayout ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
	 /* check-cast v0, Landroidx/appcompat/widget/LinearLayoutCompat$a; */
	 int v1 = -2; // const/4 v1, -0x2
	 /* .line 10 */
	 /* iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
	 /* .line 11 */
	 v1 = this.A;
	 (( android.widget.FrameLayout ) v1 ).setLayoutParams ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
} // :cond_1
} // :goto_0
return;
} // .end method
public final android.graphics.drawable.StateListDrawable e ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* .line 3 */
(( android.content.Context ) v1 ).getTheme ( ); // invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
int v3 = 1; // const/4 v3, 0x1
/* .line 4 */
v1 = (( android.content.res.Resources$Theme ) v1 ).resolveAttribute ( v2, v0, v3 ); // invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 5 */
/* new-instance v1, Landroid/graphics/drawable/StateListDrawable; */
/* invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V */
/* .line 6 */
v2 = com.google.android.material.internal.NavigationMenuItemView.G;
/* new-instance v3, Landroid/graphics/drawable/ColorDrawable; */
/* iget v0, v0, Landroid/util/TypedValue;->data:I */
/* invoke-direct {v3, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V */
(( android.graphics.drawable.StateListDrawable ) v1 ).addState ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V
/* .line 7 */
v0 = android.view.ViewGroup.EMPTY_STATE_SET;
/* new-instance v2, Landroid/graphics/drawable/ColorDrawable; */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V */
(( android.graphics.drawable.StateListDrawable ) v1 ).addState ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Boolean f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.B;
(( c.b.p.o.p ) v0 ).getTitle ( ); // invoke-virtual {v0}, Lc/b/p/o/p;->getTitle()Ljava/lang/CharSequence;
/* if-nez v0, :cond_0 */
v0 = this.B;
/* .line 2 */
(( c.b.p.o.p ) v0 ).getIcon ( ); // invoke-virtual {v0}, Lc/b/p/o/p;->getIcon()Landroid/graphics/drawable/Drawable;
/* if-nez v0, :cond_0 */
v0 = this.B;
/* .line 3 */
(( c.b.p.o.p ) v0 ).getActionView ( ); // invoke-virtual {v0}, Lc/b/p/o/p;->getActionView()Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public c.b.p.o.p getItemData ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.B;
} // .end method
public onCreateDrawableState ( Integer p0 ) {
/* .locals 1 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onCreateDrawableState(I)[I */
/* .line 2 */
v0 = this.B;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.b.p.o.p ) v0 ).isCheckable ( ); // invoke-virtual {v0}, Lc/b/p/o/p;->isCheckable()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.B;
v0 = (( c.b.p.o.p ) v0 ).isChecked ( ); // invoke-virtual {v0}, Lc/b/p/o/p;->isChecked()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 3 */
	 v0 = com.google.android.material.internal.NavigationMenuItemView.G;
	 android.view.ViewGroup .mergeDrawableStates ( p1,v0 );
} // :cond_0
} // .end method
public void setCheckable ( Boolean p0 ) {
/* .locals 2 */
/* .line 1 */
(( android.view.ViewGroup ) p0 ).refreshDrawableState ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->refreshDrawableState()V
/* .line 2 */
/* iget-boolean v0, p0, Lcom/google/android/material/internal/NavigationMenuItemView;->y:Z */
/* if-eq v0, p1, :cond_0 */
/* .line 3 */
/* iput-boolean p1, p0, Lcom/google/android/material/internal/NavigationMenuItemView;->y:Z */
/* .line 4 */
p1 = this.F;
v0 = this.z;
/* const/16 v1, 0x800 */
(( c.h.n.d ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lc/h/n/d;->a(Landroid/view/View;I)V
} // :cond_0
return;
} // .end method
public void setChecked ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.view.ViewGroup ) p0 ).refreshDrawableState ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->refreshDrawableState()V
/* .line 2 */
v0 = this.z;
(( android.widget.CheckedTextView ) v0 ).setChecked ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/CheckedTextView;->setChecked(Z)V
return;
} // .end method
public void setHorizontalPadding ( Integer p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( android.view.ViewGroup ) p0 ).setPadding ( p1, v0, p1, v0 ); // invoke-virtual {p0, p1, v0, p1, v0}, Landroid/view/ViewGroup;->setPadding(IIII)V
return;
} // .end method
public void setIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 1 */
/* iget-boolean v1, p0, Lcom/google/android/material/internal/NavigationMenuItemView;->D:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 2 */
	 (( android.graphics.drawable.Drawable ) p1 ).getConstantState ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
	 /* if-nez v1, :cond_0 */
	 /* .line 3 */
} // :cond_0
(( android.graphics.drawable.Drawable$ConstantState ) v1 ).newDrawable ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;
} // :goto_0
c.h.g.r.a .h ( p1 );
(( android.graphics.drawable.Drawable ) p1 ).mutate ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
/* .line 4 */
v1 = this.C;
c.h.g.r.a .a ( p1,v1 );
/* .line 5 */
} // :cond_1
/* iget v1, p0, Lcom/google/android/material/internal/NavigationMenuItemView;->w:I */
(( android.graphics.drawable.Drawable ) p1 ).setBounds ( v0, v0, v1, v1 ); // invoke-virtual {p1, v0, v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 6 */
} // :cond_2
/* iget-boolean v1, p0, Lcom/google/android/material/internal/NavigationMenuItemView;->x:Z */
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 7 */
p1 = this.E;
/* if-nez p1, :cond_3 */
/* .line 8 */
(( android.view.ViewGroup ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) v2 ).getTheme ( ); // invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
/* .line 9 */
c.h.f.i.s .c ( p1,v1,v2 );
this.E = p1;
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 10 */
/* iget v1, p0, Lcom/google/android/material/internal/NavigationMenuItemView;->w:I */
(( android.graphics.drawable.Drawable ) p1 ).setBounds ( v0, v0, v1, v1 ); // invoke-virtual {p1, v0, v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 11 */
} // :cond_3
p1 = this.E;
/* .line 12 */
} // :cond_4
} // :goto_1
v0 = this.z;
int v1 = 0; // const/4 v1, 0x0
c.h.o.p .a ( v0,p1,v1,v1,v1 );
return;
} // .end method
public void setIconPadding ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.z;
(( android.widget.CheckedTextView ) v0 ).setCompoundDrawablePadding ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/CheckedTextView;->setCompoundDrawablePadding(I)V
return;
} // .end method
public void setIconTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 0 */
/* .line 1 */
this.C = p1;
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :goto_0
/* iput-boolean p1, p0, Lcom/google/android/material/internal/NavigationMenuItemView;->D:Z */
/* .line 3 */
p1 = this.B;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
(( c.b.p.o.p ) p1 ).getIcon ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->getIcon()Landroid/graphics/drawable/Drawable;
(( com.google.android.material.internal.NavigationMenuItemView ) p0 ).setIcon ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V
} // :cond_1
return;
} // .end method
public void setNeedsEmptyIcon ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lcom/google/android/material/internal/NavigationMenuItemView;->x:Z */
return;
} // .end method
public void setTextAppearance ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.z;
c.h.o.p .d ( v0,p1 );
return;
} // .end method
public void setTextColor ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.z;
(( android.widget.CheckedTextView ) v0 ).setTextColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/CheckedTextView;->setTextColor(Landroid/content/res/ColorStateList;)V
return;
} // .end method
public void setTitle ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.z;
(( android.widget.CheckedTextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/CheckedTextView;->setText(Ljava/lang/CharSequence;)V
return;
} // .end method
