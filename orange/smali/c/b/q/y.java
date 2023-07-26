public class c.b.q.y extends android.widget.MultiAutoCompleteTextView implements c.h.n.z {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final d;
	 /* # instance fields */
	 public final c.b.q.m b;
	 public final c.b.q.u0 c;
	 /* # direct methods */
	 public static c.b.q.y ( ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [I */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const v2, 0x1010176 */
		 /* aput v2, v0, v1 */
		 /* .line 1 */
		 return;
	 } // .end method
	 public c.b.q.y ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Lc/b/q/y;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public c.b.q.y ( ) {
		 /* .locals 2 */
		 /* .line 2 */
		 c.b.q.h2 .b ( p1 );
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/MultiAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 3 */
		 (( android.widget.MultiAutoCompleteTextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getContext()Landroid/content/Context;
		 v0 = c.b.q.y.d;
		 int v1 = 0; // const/4 v1, 0x0
		 c.b.q.k2 .a ( p1,p2,v0,p3,v1 );
		 /* .line 4 */
		 v0 = 		 (( c.b.q.k2 ) p1 ).g ( v1 ); // invoke-virtual {p1, v1}, Lc/b/q/k2;->g(I)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 5 */
			 (( c.b.q.k2 ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
			 (( android.widget.MultiAutoCompleteTextView ) p0 ).setDropDownBackgroundDrawable ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/MultiAutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
			 /* .line 6 */
		 } // :cond_0
		 (( c.b.q.k2 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/k2;->a()V
		 /* .line 7 */
		 /* new-instance p1, Lc/b/q/m; */
		 /* invoke-direct {p1, p0}, Lc/b/q/m;-><init>(Landroid/view/View;)V */
		 this.b = p1;
		 /* .line 8 */
		 (( c.b.q.m ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/m;->a(Landroid/util/AttributeSet;I)V
		 /* .line 9 */
		 /* new-instance p1, Lc/b/q/u0; */
		 /* invoke-direct {p1, p0}, Lc/b/q/u0;-><init>(Landroid/widget/TextView;)V */
		 this.c = p1;
		 /* .line 10 */
		 (( c.b.q.u0 ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/u0;->a(Landroid/util/AttributeSet;I)V
		 /* .line 11 */
		 p1 = this.c;
		 (( c.b.q.u0 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/u0;->a()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void drawableStateChanged ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->drawableStateChanged()V */
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
public android.view.inputmethod.InputConnection onCreateInputConnection ( android.view.inputmethod.EditorInfo p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection; */
c.b.q.u .a ( v0,p1,p0 );
} // .end method
public void setBackgroundDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
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
/* invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setBackgroundResource(I)V */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 3 */
	 (( c.b.q.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->a(I)V
} // :cond_0
return;
} // .end method
public void setDropDownBackgroundResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.widget.MultiAutoCompleteTextView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getContext()Landroid/content/Context;
c.b.l.a.b .c ( v0,p1 );
(( android.widget.MultiAutoCompleteTextView ) p0 ).setDropDownBackgroundDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
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
/* invoke-super {p0, p1, p2}, Landroid/widget/MultiAutoCompleteTextView;->setTextAppearance(Landroid/content/Context;I)V */
/* .line 2 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 3 */
	 (( c.b.q.u0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/q/u0;->a(Landroid/content/Context;I)V
} // :cond_0
return;
} // .end method
