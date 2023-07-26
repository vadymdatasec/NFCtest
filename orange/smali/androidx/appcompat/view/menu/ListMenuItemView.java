public class androidx.appcompat.view.menu.ListMenuItemView extends android.widget.LinearLayout implements c.b.p.o.a0$a implements android.widget.AbsListView$SelectionBoundsAdjuster {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.b.p.o.p b;
	 public android.widget.ImageView c;
	 public android.widget.RadioButton d;
	 public android.widget.TextView e;
	 public android.widget.CheckBox f;
	 public android.widget.TextView g;
	 public android.widget.ImageView h;
	 public android.widget.ImageView i;
	 public android.widget.LinearLayout j;
	 public android.graphics.drawable.Drawable k;
	 public Integer l;
	 public android.content.Context m;
	 public Boolean n;
	 public android.graphics.drawable.Drawable o;
	 public Boolean p;
	 public android.view.LayoutInflater q;
	 public Boolean r;
	 /* # direct methods */
	 public androidx.appcompat.view.menu.ListMenuItemView ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public androidx.appcompat.view.menu.ListMenuItemView ( ) {
		 /* .locals 3 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 3 */
		 (( android.widget.LinearLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;
		 v1 = c.b.j.MenuView;
		 int v2 = 0; // const/4 v2, 0x0
		 c.b.q.k2 .a ( v0,p2,v1,p3,v2 );
		 /* .line 4 */
		 (( c.b.q.k2 ) p2 ).b ( p3 ); // invoke-virtual {p2, p3}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
		 this.k = p3;
		 /* .line 5 */
		 int v0 = -1; // const/4 v0, -0x1
		 p3 = 		 (( c.b.q.k2 ) p2 ).g ( p3, v0 ); // invoke-virtual {p2, p3, v0}, Lc/b/q/k2;->g(II)I
		 /* iput p3, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->l:I */
		 /* .line 6 */
		 p3 = 		 (( c.b.q.k2 ) p2 ).a ( p3, v2 ); // invoke-virtual {p2, p3, v2}, Lc/b/q/k2;->a(IZ)Z
		 /* iput-boolean p3, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->n:Z */
		 /* .line 7 */
		 this.m = p1;
		 /* .line 8 */
		 (( c.b.q.k2 ) p2 ).b ( p3 ); // invoke-virtual {p2, p3}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
		 this.o = p3;
		 /* .line 9 */
		 (( android.content.Context ) p1 ).getTheme ( ); // invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
		 int p3 = 1; // const/4 p3, 0x1
		 /* new-array p3, p3, [I */
		 /* const v0, 0x1010129 */
		 /* aput v0, p3, v2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 10 */
		 (( android.content.res.Resources$Theme ) p1 ).obtainStyledAttributes ( v1, p3, v0, v2 ); // invoke-virtual {p1, v1, p3, v0, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
		 /* .line 11 */
		 p3 = 		 (( android.content.res.TypedArray ) p1 ).hasValue ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
		 /* iput-boolean p3, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->p:Z */
		 /* .line 12 */
		 (( c.b.q.k2 ) p2 ).a ( ); // invoke-virtual {p2}, Lc/b/q/k2;->a()V
		 /* .line 13 */
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 return;
	 } // .end method
	 private android.view.LayoutInflater getInflater ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.q;
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 (( android.widget.LinearLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;
		 android.view.LayoutInflater .from ( v0 );
		 this.q = v0;
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.q;
} // .end method
private void setSubMenuArrowVisible ( Boolean p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.h;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int p1 = 0; // const/4 p1, 0x0
		 } // :cond_0
		 /* const/16 p1, 0x8 */
		 /* .line 2 */
	 } // :goto_0
	 (( android.widget.ImageView ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V
} // :cond_1
return;
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 3 */
/* .line 18 */
/* invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater; */
/* .line 19 */
int v2 = 0; // const/4 v2, 0x0
/* .line 20 */
(( android.view.LayoutInflater ) v0 ).inflate ( v1, p0, v2 ); // invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
/* check-cast v0, Landroid/widget/CheckBox; */
this.f = v0;
/* .line 21 */
(( androidx.appcompat.view.menu.ListMenuItemView ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->a(Landroid/view/View;)V
return;
} // .end method
public final void a ( android.view.View p0 ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* .line 10 */
(( androidx.appcompat.view.menu.ListMenuItemView ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->a(Landroid/view/View;I)V
return;
} // .end method
public final void a ( android.view.View p0, Integer p1 ) {
/* .locals 1 */
/* .line 11 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 12 */
	 (( android.widget.LinearLayout ) v0 ).addView ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V
	 /* .line 13 */
} // :cond_0
(( android.widget.LinearLayout ) p0 ).addView ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V
} // :goto_0
return;
} // .end method
public void a ( Object p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
this.b = p1;
/* .line 2 */
p2 = (( c.b.p.o.p ) p1 ).isVisible ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->isVisible()Z
if ( p2 != null) { // if-eqz p2, :cond_0
int p2 = 0; // const/4 p2, 0x0
} // :cond_0
/* const/16 p2, 0x8 */
} // :goto_0
(( android.widget.LinearLayout ) p0 ).setVisibility ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* .line 3 */
(( c.b.p.o.p ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lc/b/p/o/p;->a(Lc/b/p/o/a0$a;)Ljava/lang/CharSequence;
(( androidx.appcompat.view.menu.ListMenuItemView ) p0 ).setTitle ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/view/menu/ListMenuItemView;->setTitle(Ljava/lang/CharSequence;)V
/* .line 4 */
p2 = (( c.b.p.o.p ) p1 ).isCheckable ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->isCheckable()Z
(( androidx.appcompat.view.menu.ListMenuItemView ) p0 ).setCheckable ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/view/menu/ListMenuItemView;->setCheckable(Z)V
/* .line 5 */
p2 = (( c.b.p.o.p ) p1 ).m ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->m()Z
v0 = (( c.b.p.o.p ) p1 ).d ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->d()C
(( androidx.appcompat.view.menu.ListMenuItemView ) p0 ).a ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->a(ZC)V
/* .line 6 */
(( c.b.p.o.p ) p1 ).getIcon ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->getIcon()Landroid/graphics/drawable/Drawable;
(( androidx.appcompat.view.menu.ListMenuItemView ) p0 ).setIcon ( p2 ); // invoke-virtual {p0, p2}, Landroidx/appcompat/view/menu/ListMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V
/* .line 7 */
p2 = (( c.b.p.o.p ) p1 ).isEnabled ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->isEnabled()Z
(( android.widget.LinearLayout ) p0 ).setEnabled ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setEnabled(Z)V
/* .line 8 */
p2 = (( c.b.p.o.p ) p1 ).hasSubMenu ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->hasSubMenu()Z
/* invoke-direct {p0, p2}, Landroidx/appcompat/view/menu/ListMenuItemView;->setSubMenuArrowVisible(Z)V */
/* .line 9 */
(( c.b.p.o.p ) p1 ).getContentDescription ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->getContentDescription()Ljava/lang/CharSequence;
(( android.widget.LinearLayout ) p0 ).setContentDescription ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setContentDescription(Ljava/lang/CharSequence;)V
return;
} // .end method
public void a ( Boolean p0, Object p1 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 14 */
p1 = this.b;
p1 = (( c.b.p.o.p ) p1 ).m ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->m()Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
/* const/16 p1, 0x8 */
} // :goto_0
/* if-nez p1, :cond_1 */
/* .line 15 */
p2 = this.g;
v0 = this.b;
(( c.b.p.o.p ) v0 ).e ( ); // invoke-virtual {v0}, Lc/b/p/o/p;->e()Ljava/lang/String;
(( android.widget.TextView ) p2 ).setText ( v0 ); // invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 16 */
} // :cond_1
p2 = this.g;
p2 = (( android.widget.TextView ) p2 ).getVisibility ( ); // invoke-virtual {p2}, Landroid/widget/TextView;->getVisibility()I
/* if-eq p2, p1, :cond_2 */
/* .line 17 */
p2 = this.g;
(( android.widget.TextView ) p2 ).setVisibility ( p1 ); // invoke-virtual {p2, p1}, Landroid/widget/TextView;->setVisibility(I)V
} // :cond_2
return;
} // .end method
public void adjustListItemSelectionBounds ( android.graphics.Rect p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.widget.ImageView ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.i;
(( android.widget.ImageView ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 3 */
/* iget v1, p1, Landroid/graphics/Rect;->top:I */
v2 = this.i;
v2 = (( android.widget.ImageView ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/widget/ImageView;->getHeight()I
/* iget v3, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v2, v3 */
/* iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v2, v0 */
/* add-int/2addr v1, v2 */
/* iput v1, p1, Landroid/graphics/Rect;->top:I */
} // :cond_0
return;
} // .end method
public final void b ( ) {
/* .locals 3 */
/* .line 1 */
/* invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater; */
/* .line 2 */
int v2 = 0; // const/4 v2, 0x0
(( android.view.LayoutInflater ) v0 ).inflate ( v1, p0, v2 ); // invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
/* check-cast v0, Landroid/widget/ImageView; */
this.c = v0;
/* .line 3 */
(( androidx.appcompat.view.menu.ListMenuItemView ) p0 ).a ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Landroidx/appcompat/view/menu/ListMenuItemView;->a(Landroid/view/View;I)V
return;
} // .end method
public Boolean c ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final void d ( ) {
/* .locals 3 */
/* .line 1 */
/* invoke-direct {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater; */
/* .line 2 */
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
(( android.view.LayoutInflater ) v0 ).inflate ( v1, p0, v2 ); // invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
/* check-cast v0, Landroid/widget/RadioButton; */
this.d = v0;
/* .line 4 */
(( androidx.appcompat.view.menu.ListMenuItemView ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->a(Landroid/view/View;)V
return;
} // .end method
public c.b.p.o.p getItemData ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public void onFinishInflate ( ) {
/* .locals 3 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V */
/* .line 2 */
v0 = this.k;
c.h.n.v0 .a ( p0,v0 );
/* .line 3 */
(( android.widget.LinearLayout ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
this.e = v0;
/* .line 4 */
/* iget v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->l:I */
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_0 */
/* .line 5 */
v2 = this.m;
(( android.widget.TextView ) v0 ).setTextAppearance ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
/* .line 6 */
} // :cond_0
(( android.widget.LinearLayout ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
this.g = v0;
/* .line 7 */
(( android.widget.LinearLayout ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/ImageView; */
this.h = v0;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 8 */
v1 = this.o;
(( android.widget.ImageView ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 9 */
} // :cond_1
(( android.widget.LinearLayout ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/ImageView; */
this.i = v0;
/* .line 10 */
(( android.widget.LinearLayout ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/LinearLayout; */
this.j = v0;
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.widget.LinearLayout ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 3 */
v1 = this.c;
(( android.widget.ImageView ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 4 */
/* iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* if-lez v0, :cond_0 */
/* iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I */
/* if-gtz v2, :cond_0 */
/* .line 5 */
/* iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I */
/* .line 6 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V */
return;
} // .end method
public void setCheckable ( Boolean p0 ) {
/* .locals 3 */
/* if-nez p1, :cond_0 */
/* .line 1 */
v0 = this.d;
/* if-nez v0, :cond_0 */
v0 = this.f;
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
v0 = this.b;
v0 = (( c.b.p.o.p ) v0 ).i ( ); // invoke-virtual {v0}, Lc/b/p/o/p;->i()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 3 */
v0 = this.d;
/* if-nez v0, :cond_1 */
/* .line 4 */
(( androidx.appcompat.view.menu.ListMenuItemView ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->d()V
/* .line 5 */
} // :cond_1
v0 = this.d;
/* .line 6 */
v1 = this.f;
/* .line 7 */
} // :cond_2
v0 = this.f;
/* if-nez v0, :cond_3 */
/* .line 8 */
(( androidx.appcompat.view.menu.ListMenuItemView ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->a()V
/* .line 9 */
} // :cond_3
v0 = this.f;
/* .line 10 */
v1 = this.d;
} // :goto_0
/* const/16 v2, 0x8 */
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 11 */
p1 = this.b;
p1 = (( c.b.p.o.p ) p1 ).isChecked ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->isChecked()Z
(( android.widget.CompoundButton ) v0 ).setChecked ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V
/* .line 12 */
p1 = (( android.widget.CompoundButton ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/widget/CompoundButton;->getVisibility()I
if ( p1 != null) { // if-eqz p1, :cond_4
int p1 = 0; // const/4 p1, 0x0
/* .line 13 */
(( android.widget.CompoundButton ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setVisibility(I)V
} // :cond_4
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 14 */
p1 = (( android.widget.CompoundButton ) v1 ).getVisibility ( ); // invoke-virtual {v1}, Landroid/widget/CompoundButton;->getVisibility()I
/* if-eq p1, v2, :cond_7 */
/* .line 15 */
(( android.widget.CompoundButton ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setVisibility(I)V
/* .line 16 */
} // :cond_5
p1 = this.f;
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 17 */
(( android.widget.CheckBox ) p1 ).setVisibility ( v2 ); // invoke-virtual {p1, v2}, Landroid/widget/CheckBox;->setVisibility(I)V
/* .line 18 */
} // :cond_6
p1 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_7
/* .line 19 */
(( android.widget.RadioButton ) p1 ).setVisibility ( v2 ); // invoke-virtual {p1, v2}, Landroid/widget/RadioButton;->setVisibility(I)V
} // :cond_7
} // :goto_1
return;
} // .end method
public void setChecked ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( c.b.p.o.p ) v0 ).i ( ); // invoke-virtual {v0}, Lc/b/p/o/p;->i()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = this.d;
/* if-nez v0, :cond_0 */
/* .line 3 */
(( androidx.appcompat.view.menu.ListMenuItemView ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->d()V
/* .line 4 */
} // :cond_0
v0 = this.d;
/* .line 5 */
} // :cond_1
v0 = this.f;
/* if-nez v0, :cond_2 */
/* .line 6 */
(( androidx.appcompat.view.menu.ListMenuItemView ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->a()V
/* .line 7 */
} // :cond_2
v0 = this.f;
/* .line 8 */
} // :goto_0
(( android.widget.CompoundButton ) v0 ).setChecked ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V
return;
} // .end method
public void setForceShowIcon ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->r:Z */
/* iput-boolean p1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->n:Z */
return;
} // .end method
public void setGroupDividerEnabled ( Boolean p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
/* iget-boolean v1, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->p:Z */
/* if-nez v1, :cond_0 */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
/* const/16 p1, 0x8 */
} // :goto_0
(( android.widget.ImageView ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V
} // :cond_1
return;
} // .end method
public void setIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
v0 = (( c.b.p.o.p ) v0 ).l ( ); // invoke-virtual {v0}, Lc/b/p/o/p;->l()Z
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->r:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
/* if-nez v0, :cond_2 */
/* .line 2 */
/* iget-boolean v2, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->n:Z */
/* if-nez v2, :cond_2 */
return;
/* .line 3 */
} // :cond_2
v2 = this.c;
/* if-nez v2, :cond_3 */
/* if-nez p1, :cond_3 */
/* iget-boolean v2, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->n:Z */
/* if-nez v2, :cond_3 */
return;
/* .line 4 */
} // :cond_3
v2 = this.c;
/* if-nez v2, :cond_4 */
/* .line 5 */
(( androidx.appcompat.view.menu.ListMenuItemView ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/appcompat/view/menu/ListMenuItemView;->b()V
} // :cond_4
/* if-nez p1, :cond_6 */
/* .line 6 */
/* iget-boolean v2, p0, Landroidx/appcompat/view/menu/ListMenuItemView;->n:Z */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 7 */
} // :cond_5
p1 = this.c;
/* const/16 v0, 0x8 */
(( android.widget.ImageView ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 8 */
} // :cond_6
} // :goto_2
v2 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_7
} // :cond_7
int p1 = 0; // const/4 p1, 0x0
} // :goto_3
(( android.widget.ImageView ) v2 ).setImageDrawable ( p1 ); // invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 9 */
p1 = this.c;
p1 = (( android.widget.ImageView ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->getVisibility()I
if ( p1 != null) { // if-eqz p1, :cond_8
/* .line 10 */
p1 = this.c;
(( android.widget.ImageView ) p1 ).setVisibility ( v1 ); // invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V
} // :cond_8
} // :goto_4
return;
} // .end method
public void setTitle ( java.lang.CharSequence p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
v0 = this.e;
(( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 2 */
p1 = this.e;
p1 = (( android.widget.TextView ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getVisibility()I
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = this.e;
int v0 = 0; // const/4 v0, 0x0
(( android.widget.TextView ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 3 */
} // :cond_0
p1 = this.e;
p1 = (( android.widget.TextView ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getVisibility()I
/* const/16 v0, 0x8 */
/* if-eq p1, v0, :cond_1 */
p1 = this.e;
(( android.widget.TextView ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V
} // :cond_1
} // :goto_0
return;
} // .end method
