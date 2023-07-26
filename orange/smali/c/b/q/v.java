public class c.b.q.v extends android.widget.ImageButton implements c.h.n.z implements c.h.o.s {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.m b;
	 public final c.b.q.w c;
	 /* # direct methods */
	 public c.b.q.v ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Lc/b/q/v;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public c.b.q.v ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 c.b.q.h2 .b ( p1 );
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 3 */
		 /* new-instance p1, Lc/b/q/m; */
		 /* invoke-direct {p1, p0}, Lc/b/q/m;-><init>(Landroid/view/View;)V */
		 this.b = p1;
		 /* .line 4 */
		 (( c.b.q.m ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/m;->a(Landroid/util/AttributeSet;I)V
		 /* .line 5 */
		 /* new-instance p1, Lc/b/q/w; */
		 /* invoke-direct {p1, p0}, Lc/b/q/w;-><init>(Landroid/widget/ImageView;)V */
		 this.c = p1;
		 /* .line 6 */
		 (( c.b.q.w ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/w;->a(Landroid/util/AttributeSet;I)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void drawableStateChanged ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0}, Landroid/widget/ImageButton;->drawableStateChanged()V */
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
			 (( c.b.q.w ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/w;->a()V
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
public android.content.res.ColorStateList getSupportImageTintList ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 (( c.b.q.w ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/q/w;->b()Landroid/content/res/ColorStateList;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public android.graphics.PorterDuff$Mode getSupportImageTintMode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.w ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/q/w;->c()Landroid/graphics/PorterDuff$Mode;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean hasOverlappingRendering ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
v0 = (( c.b.q.w ) v0 ).d ( ); // invoke-virtual {v0}, Lc/b/q/w;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = /* invoke-super {p0}, Landroid/widget/ImageButton;->hasOverlappingRendering()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void setBackgroundDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V */
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
/* invoke-super {p0, p1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.q.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/m;->a(I)V
} // :cond_0
return;
} // .end method
public void setImageBitmap ( android.graphics.Bitmap p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/ImageButton;->setImageBitmap(Landroid/graphics/Bitmap;)V */
/* .line 2 */
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
(( c.b.q.w ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/w;->a()V
} // :cond_0
return;
} // .end method
public void setImageDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V */
/* .line 2 */
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
(( c.b.q.w ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/w;->a()V
} // :cond_0
return;
} // .end method
public void setImageResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
(( c.b.q.w ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/w;->a(I)V
return;
} // .end method
public void setImageURI ( android.net.Uri p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/ImageButton;->setImageURI(Landroid/net/Uri;)V */
/* .line 2 */
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
(( c.b.q.w ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/w;->a()V
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
public void setSupportImageTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.w ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/w;->a(Landroid/content/res/ColorStateList;)V
} // :cond_0
return;
} // .end method
public void setSupportImageTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.q.w ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/w;->a(Landroid/graphics/PorterDuff$Mode;)V
} // :cond_0
return;
} // .end method
