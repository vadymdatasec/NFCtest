public class c.b.q.b0 extends android.widget.RadioButton implements c.h.o.q implements c.h.n.z {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.q b;
	 public final c.b.q.m c;
	 public final c.b.q.u0 d;
	 /* # direct methods */
	 public c.b.q.b0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Lc/b/q/b0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public c.b.q.b0 ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 c.b.q.h2 .b ( p1 );
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 3 */
		 /* new-instance p1, Lc/b/q/q; */
		 /* invoke-direct {p1, p0}, Lc/b/q/q;-><init>(Landroid/widget/CompoundButton;)V */
		 this.b = p1;
		 /* .line 4 */
		 (( c.b.q.q ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/q;->a(Landroid/util/AttributeSet;I)V
		 /* .line 5 */
		 /* new-instance p1, Lc/b/q/m; */
		 /* invoke-direct {p1, p0}, Lc/b/q/m;-><init>(Landroid/view/View;)V */
		 this.c = p1;
		 /* .line 6 */
		 (( c.b.q.m ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/m;->a(Landroid/util/AttributeSet;I)V
		 /* .line 7 */
		 /* new-instance p1, Lc/b/q/u0; */
		 /* invoke-direct {p1, p0}, Lc/b/q/u0;-><init>(Landroid/widget/TextView;)V */
		 this.d = p1;
		 /* .line 8 */
		 (( c.b.q.u0 ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/u0;->a(Landroid/util/AttributeSet;I)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void drawableStateChanged ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0}, Landroid/widget/RadioButton;->drawableStateChanged()V */
		 /* .line 2 */
		 v0 = this.c;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 (( c.b.q.m ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/m;->a()V
			 /* .line 4 */
		 } // :cond_0
		 v0 = this.d;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 5 */
			 (( c.b.q.u0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/u0;->a()V
		 } // :cond_1
		 return;
	 } // .end method
	 public Integer getCompoundPaddingLeft ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = 		 /* invoke-super {p0}, Landroid/widget/RadioButton;->getCompoundPaddingLeft()I */
		 /* .line 2 */
		 v1 = this.b;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 3 */
			 v0 = 			 (( c.b.q.q ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lc/b/q/q;->a(I)I
		 } // :cond_0
	 } // .end method
	 public android.content.res.ColorStateList getSupportBackgroundTintList ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
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
	 v0 = this.c;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 (( c.b.q.m ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/q/m;->c()Landroid/graphics/PorterDuff$Mode;
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.content.res.ColorStateList getSupportButtonTintList ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 (( c.b.q.q ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/q/q;->b()Landroid/content/res/ColorStateList;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.graphics.PorterDuff$Mode getSupportButtonTintMode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.q ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/q/q;->c()Landroid/graphics/PorterDuff$Mode;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void setBackgroundDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/RadioButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
/* .line 2 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.q.m ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->b(Landroid/graphics/drawable/Drawable;)V
} // :cond_0
return;
} // .end method
public void setBackgroundResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V */
/* .line 2 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.q.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->a(I)V
} // :cond_0
return;
} // .end method
public void setButtonDrawable ( Integer p0 ) {
/* .locals 1 */
/* .line 4 */
(( android.widget.RadioButton ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/RadioButton;->getContext()Landroid/content/Context;
c.b.l.a.b .c ( v0,p1 );
(( c.b.q.b0 ) p0 ).setButtonDrawable ( p1 ); // invoke-virtual {p0, p1}, Lc/b/q/b0;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setButtonDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/RadioButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V */
/* .line 2 */
p1 = this.b;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
(( c.b.q.q ) p1 ).d ( ); // invoke-virtual {p1}, Lc/b/q/q;->d()V
} // :cond_0
return;
} // .end method
public void setSupportBackgroundTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.m ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->b(Landroid/content/res/ColorStateList;)V
} // :cond_0
return;
} // .end method
public void setSupportBackgroundTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->a(Landroid/graphics/PorterDuff$Mode;)V
} // :cond_0
return;
} // .end method
public void setSupportButtonTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.q ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/q;->a(Landroid/content/res/ColorStateList;)V
} // :cond_0
return;
} // .end method
public void setSupportButtonTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.q ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/q;->a(Landroid/graphics/PorterDuff$Mode;)V
} // :cond_0
return;
} // .end method
