public class e.f.a.c.m.a extends c.b.q.n {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.a.c.m.c d;
	 public Integer e;
	 public android.graphics.PorterDuff$Mode f;
	 public android.content.res.ColorStateList g;
	 public android.graphics.drawable.Drawable h;
	 public Integer i;
	 public Integer j;
	 public Integer k;
	 /* # direct methods */
	 public e.f.a.c.m.a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Le/f/a/c/m/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public e.f.a.c.m.a ( ) {
		 /* .locals 7 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, p3}, Lc/b/q/n;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 3 */
		 v2 = e.f.a.c.i.MaterialButton;
		 int v6 = 0; // const/4 v6, 0x0
		 /* new-array v5, v6, [I */
		 /* move-object v0, p1 */
		 /* move-object v1, p2 */
		 /* move v3, p3 */
		 /* .line 4 */
		 /* invoke-static/range {v0 ..v5}, Le/f/a/c/p/c;->c(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray; */
		 /* .line 5 */
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( p2, v6 ); // invoke-virtual {p1, p2, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
		 /* iput p2, p0, Le/f/a/c/m/a;->e:I */
		 /* .line 6 */
		 int p3 = -1; // const/4 p3, -0x1
		 /* .line 7 */
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getInt ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I
		 p3 = android.graphics.PorterDuff$Mode.SRC_IN;
		 /* .line 8 */
		 e.f.a.c.p.d .a ( p2,p3 );
		 this.f = p2;
		 /* .line 9 */
		 (( android.widget.Button ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;
		 /* .line 10 */
		 e.f.a.c.q.a .a ( p2,p1,p3 );
		 this.g = p2;
		 /* .line 11 */
		 (( android.widget.Button ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;
		 e.f.a.c.q.a .b ( p2,p1,p3 );
		 this.h = p2;
		 /* .line 12 */
		 int p3 = 1; // const/4 p3, 0x1
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getInteger ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I
		 /* iput p2, p0, Le/f/a/c/m/a;->k:I */
		 /* .line 13 */
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( p2, v6 ); // invoke-virtual {p1, p2, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
		 /* iput p2, p0, Le/f/a/c/m/a;->i:I */
		 /* .line 14 */
		 /* new-instance p2, Le/f/a/c/m/c; */
		 /* invoke-direct {p2, p0}, Le/f/a/c/m/c;-><init>(Le/f/a/c/m/a;)V */
		 this.d = p2;
		 /* .line 15 */
		 (( e.f.a.c.m.c ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/f/a/c/m/c;->a(Landroid/content/res/TypedArray;)V
		 /* .line 16 */
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 /* .line 17 */
		 /* iget p1, p0, Le/f/a/c/m/a;->e:I */
		 (( android.widget.Button ) p0 ).setCompoundDrawablePadding ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/Button;->setCompoundDrawablePadding(I)V
		 /* .line 18 */
		 (( e.f.a.c.m.a ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->c()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Boolean a ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = 		 c.h.n.v0 .o ( p0 );
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-ne v0, v1, :cond_0 */
	 } // :cond_0
	 int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public final Boolean b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = 	 (( e.f.a.c.m.c ) v0 ).i ( ); // invoke-virtual {v0}, Le/f/a/c/m/c;->i()Z
	 /* if-nez v0, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final void c ( ) {
/* .locals 5 */
/* .line 1 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).mutate ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
this.h = v0;
/* .line 3 */
v1 = this.g;
c.h.g.r.a .a ( v0,v1 );
/* .line 4 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 5 */
	 v1 = this.h;
	 c.h.g.r.a .a ( v1,v0 );
	 /* .line 6 */
} // :cond_0
/* iget v0, p0, Le/f/a/c/m/a;->i:I */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
v0 = this.h;
v0 = (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* .line 7 */
} // :goto_0
/* iget v1, p0, Le/f/a/c/m/a;->i:I */
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_2
v1 = this.h;
v1 = (( android.graphics.drawable.Drawable ) v1 ).getIntrinsicHeight ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* .line 8 */
} // :goto_1
v2 = this.h;
/* iget v3, p0, Le/f/a/c/m/a;->j:I */
int v4 = 0; // const/4 v4, 0x0
/* add-int/2addr v0, v3 */
(( android.graphics.drawable.Drawable ) v2 ).setBounds ( v3, v4, v0, v1 ); // invoke-virtual {v2, v3, v4, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 9 */
} // :cond_3
v0 = this.h;
int v1 = 0; // const/4 v1, 0x0
c.h.o.p .a ( p0,v0,v1,v1,v1 );
return;
} // .end method
public android.content.res.ColorStateList getBackgroundTintList ( ) {
/* .locals 1 */
/* .line 1 */
(( e.f.a.c.m.a ) p0 ).getSupportBackgroundTintList ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
} // .end method
public android.graphics.PorterDuff$Mode getBackgroundTintMode ( ) {
/* .locals 1 */
/* .line 1 */
(( e.f.a.c.m.a ) p0 ).getSupportBackgroundTintMode ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
} // .end method
public Integer getCornerRadius ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.d;
v0 = (( e.f.a.c.m.c ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/a/c/m/c;->c()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.graphics.drawable.Drawable getIcon ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
} // .end method
public Integer getIconGravity ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/a/c/m/a;->k:I */
} // .end method
public Integer getIconPadding ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/a/c/m/a;->e:I */
} // .end method
public Integer getIconSize ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/a/c/m/a;->i:I */
} // .end method
public android.content.res.ColorStateList getIconTint ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
} // .end method
public android.graphics.PorterDuff$Mode getIconTintMode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
} // .end method
public android.content.res.ColorStateList getRippleColor ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.d;
(( e.f.a.c.m.c ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/a/c/m/c;->d()Landroid/content/res/ColorStateList;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.content.res.ColorStateList getStrokeColor ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.d;
(( e.f.a.c.m.c ) v0 ).e ( ); // invoke-virtual {v0}, Le/f/a/c/m/c;->e()Landroid/content/res/ColorStateList;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer getStrokeWidth ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.d;
v0 = (( e.f.a.c.m.c ) v0 ).f ( ); // invoke-virtual {v0}, Le/f/a/c/m/c;->f()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.content.res.ColorStateList getSupportBackgroundTintList ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.d;
(( e.f.a.c.m.c ) v0 ).g ( ); // invoke-virtual {v0}, Le/f/a/c/m/c;->g()Landroid/content/res/ColorStateList;
/* .line 3 */
} // :cond_0
/* invoke-super {p0}, Lc/b/q/n;->getSupportBackgroundTintList()Landroid/content/res/ColorStateList; */
} // .end method
public android.graphics.PorterDuff$Mode getSupportBackgroundTintMode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.d;
(( e.f.a.c.m.c ) v0 ).h ( ); // invoke-virtual {v0}, Le/f/a/c/m/c;->h()Landroid/graphics/PorterDuff$Mode;
/* .line 3 */
} // :cond_0
/* invoke-super {p0}, Lc/b/q/n;->getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode; */
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/Button;->onDraw(Landroid/graphics/Canvas;)V */
/* .line 2 */
/* const/16 v1, 0x15 */
/* if-ge v0, v1, :cond_0 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.d;
(( e.f.a.c.m.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/c/m/c;->a(Landroid/graphics/Canvas;)V
} // :cond_0
return;
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super/range {p0 ..p5}, Lc/b/q/n;->onLayout(ZIIII)V */
/* .line 2 */
/* const/16 v0, 0x15 */
/* if-ne p1, v0, :cond_0 */
p1 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_0
/* sub-int/2addr p5, p3 */
/* sub-int/2addr p4, p2 */
/* .line 3 */
(( e.f.a.c.m.c ) p1 ).a ( p5, p4 ); // invoke-virtual {p1, p5, p4}, Le/f/a/c/m/c;->a(II)V
} // :cond_0
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/widget/Button;->onMeasure(II)V */
/* .line 2 */
p1 = this.h;
if ( p1 != null) { // if-eqz p1, :cond_3
/* iget p1, p0, Le/f/a/c/m/a;->k:I */
int p2 = 2; // const/4 p2, 0x2
/* if-eq p1, p2, :cond_0 */
/* .line 3 */
} // :cond_0
(( android.widget.Button ) p0 ).getPaint ( ); // invoke-virtual {p0}, Landroid/widget/Button;->getPaint()Landroid/text/TextPaint;
/* .line 4 */
(( android.widget.Button ) p0 ).getText ( ); // invoke-virtual {p0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;
p1 = (( android.graphics.Paint ) p1 ).measureText ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* float-to-int p1, p1 */
/* .line 5 */
/* iget v0, p0, Le/f/a/c/m/a;->i:I */
/* if-nez v0, :cond_1 */
v0 = this.h;
v0 = (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* .line 6 */
} // :cond_1
v1 = (( android.widget.Button ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/widget/Button;->getMeasuredWidth()I
/* sub-int/2addr v1, p1 */
/* .line 7 */
p1 = c.h.n.v0 .r ( p0 );
/* sub-int/2addr v1, p1 */
/* sub-int/2addr v1, v0 */
/* iget p1, p0, Le/f/a/c/m/a;->e:I */
/* sub-int/2addr v1, p1 */
/* .line 8 */
p1 = c.h.n.v0 .s ( p0 );
/* sub-int/2addr v1, p1 */
/* div-int/2addr v1, p2 */
/* .line 9 */
p1 = (( e.f.a.c.m.a ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->a()Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* neg-int v1, v1 */
/* .line 10 */
} // :cond_2
/* iget p1, p0, Le/f/a/c/m/a;->j:I */
/* if-eq p1, v1, :cond_3 */
/* .line 11 */
/* iput v1, p0, Le/f/a/c/m/a;->j:I */
/* .line 12 */
(( e.f.a.c.m.a ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->c()V
} // :cond_3
} // :goto_0
return;
} // .end method
public void setBackground ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* .line 1 */
(( e.f.a.c.m.a ) p0 ).setBackgroundDrawable ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setBackgroundColor ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.d;
(( e.f.a.c.m.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/c/m/c;->a(I)V
/* .line 3 */
} // :cond_0
/* invoke-super {p0, p1}, Landroid/widget/Button;->setBackgroundColor(I)V */
} // :goto_0
return;
} // .end method
public void setBackgroundDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
(( android.widget.Button ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/widget/Button;->getBackground()Landroid/graphics/drawable/Drawable;
/* if-eq p1, v0, :cond_0 */
final String v0 = "MaterialButton"; // const-string v0, "MaterialButton"
final String v1 = "Setting a custom background is not supported."; // const-string v1, "Setting a custom background is not supported."
/* .line 3 */
android.util.Log .i ( v0,v1 );
/* .line 4 */
v0 = this.d;
(( e.f.a.c.m.c ) v0 ).j ( ); // invoke-virtual {v0}, Le/f/a/c/m/c;->j()V
/* .line 5 */
/* invoke-super {p0, p1}, Lc/b/q/n;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
/* .line 6 */
} // :cond_0
(( android.widget.Button ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/widget/Button;->getBackground()Landroid/graphics/drawable/Drawable;
(( android.graphics.drawable.Drawable ) p1 ).getState ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getState()[I
(( android.graphics.drawable.Drawable ) v0 ).setState ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* .line 7 */
} // :cond_1
/* invoke-super {p0, p1}, Lc/b/q/n;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
} // :goto_0
return;
} // .end method
public void setBackgroundResource ( Integer p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
(( android.widget.Button ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;
c.b.l.a.b .c ( v0,p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :goto_0
(( e.f.a.c.m.a ) p0 ).setBackgroundDrawable ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setBackgroundTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 0 */
/* .line 1 */
(( e.f.a.c.m.a ) p0 ).setSupportBackgroundTintList ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
return;
} // .end method
public void setBackgroundTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 0 */
/* .line 1 */
(( e.f.a.c.m.a ) p0 ).setSupportBackgroundTintMode ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
return;
} // .end method
public void setCornerRadius ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.d;
(( e.f.a.c.m.c ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/c/m/c;->b(I)V
} // :cond_0
return;
} // .end method
public void setCornerRadiusResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.widget.Button ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/Button;->getResources()Landroid/content/res/Resources;
p1 = (( android.content.res.Resources ) v0 ).getDimensionPixelSize ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
(( e.f.a.c.m.a ) p0 ).setCornerRadius ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setCornerRadius(I)V
} // :cond_0
return;
} // .end method
public void setIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
/* if-eq v0, p1, :cond_0 */
/* .line 2 */
this.h = p1;
/* .line 3 */
(( e.f.a.c.m.a ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->c()V
} // :cond_0
return;
} // .end method
public void setIconGravity ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Le/f/a/c/m/a;->k:I */
return;
} // .end method
public void setIconPadding ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/a/c/m/a;->e:I */
/* if-eq v0, p1, :cond_0 */
/* .line 2 */
/* iput p1, p0, Le/f/a/c/m/a;->e:I */
/* .line 3 */
(( android.widget.Button ) p0 ).setCompoundDrawablePadding ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/Button;->setCompoundDrawablePadding(I)V
} // :cond_0
return;
} // .end method
public void setIconResource ( Integer p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
(( android.widget.Button ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;
c.b.l.a.b .c ( v0,p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :goto_0
(( e.f.a.c.m.a ) p0 ).setIcon ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setIcon(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setIconSize ( Integer p0 ) {
/* .locals 1 */
/* if-ltz p1, :cond_1 */
/* .line 1 */
/* iget v0, p0, Le/f/a/c/m/a;->i:I */
/* if-eq v0, p1, :cond_0 */
/* .line 2 */
/* iput p1, p0, Le/f/a/c/m/a;->i:I */
/* .line 3 */
(( e.f.a.c.m.a ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->c()V
} // :cond_0
return;
/* .line 4 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "iconSize cannot be less than 0"; // const-string v0, "iconSize cannot be less than 0"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void setIconTint ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
/* if-eq v0, p1, :cond_0 */
/* .line 2 */
this.g = p1;
/* .line 3 */
(( e.f.a.c.m.a ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->c()V
} // :cond_0
return;
} // .end method
public void setIconTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
/* if-eq v0, p1, :cond_0 */
/* .line 2 */
this.f = p1;
/* .line 3 */
(( e.f.a.c.m.a ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->c()V
} // :cond_0
return;
} // .end method
public void setIconTintResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.widget.Button ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;
c.b.l.a.b .b ( v0,p1 );
(( e.f.a.c.m.a ) p0 ).setIconTint ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setIconTint(Landroid/content/res/ColorStateList;)V
return;
} // .end method
public void setInternalBackground ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Lc/b/q/n;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
return;
} // .end method
public void setRippleColor ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.d;
(( e.f.a.c.m.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/c/m/c;->a(Landroid/content/res/ColorStateList;)V
} // :cond_0
return;
} // .end method
public void setRippleColorResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.widget.Button ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;
c.b.l.a.b .b ( v0,p1 );
(( e.f.a.c.m.a ) p0 ).setRippleColor ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setRippleColor(Landroid/content/res/ColorStateList;)V
} // :cond_0
return;
} // .end method
public void setStrokeColor ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.d;
(( e.f.a.c.m.c ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/c/m/c;->b(Landroid/content/res/ColorStateList;)V
} // :cond_0
return;
} // .end method
public void setStrokeColorResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.widget.Button ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;
c.b.l.a.b .b ( v0,p1 );
(( e.f.a.c.m.a ) p0 ).setStrokeColor ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setStrokeColor(Landroid/content/res/ColorStateList;)V
} // :cond_0
return;
} // .end method
public void setStrokeWidth ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.d;
(( e.f.a.c.m.c ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/c/m/c;->c(I)V
} // :cond_0
return;
} // .end method
public void setStrokeWidthResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.widget.Button ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/Button;->getResources()Landroid/content/res/Resources;
p1 = (( android.content.res.Resources ) v0 ).getDimensionPixelSize ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
(( e.f.a.c.m.a ) p0 ).setStrokeWidth ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setStrokeWidth(I)V
} // :cond_0
return;
} // .end method
public void setSupportBackgroundTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.d;
(( e.f.a.c.m.c ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/c/m/c;->c(Landroid/content/res/ColorStateList;)V
/* .line 3 */
} // :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
/* invoke-super {p0, p1}, Lc/b/q/n;->setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V */
} // :cond_1
} // :goto_0
return;
} // .end method
public void setSupportBackgroundTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.f.a.c.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.d;
(( e.f.a.c.m.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/c/m/c;->a(Landroid/graphics/PorterDuff$Mode;)V
/* .line 3 */
} // :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
/* invoke-super {p0, p1}, Lc/b/q/n;->setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V */
} // :cond_1
} // :goto_0
return;
} // .end method
