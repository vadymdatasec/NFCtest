public class c.h.g.r.d extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable$Callback implements c.h.g.r.c implements c.h.g.r.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final android.graphics.PorterDuff$Mode h;
	 /* # instance fields */
	 public Integer b;
	 public android.graphics.PorterDuff$Mode c;
	 public Boolean d;
	 public c.h.g.r.f e;
	 public Boolean f;
	 public android.graphics.drawable.Drawable g;
	 /* # direct methods */
	 public static c.h.g.r.d ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = android.graphics.PorterDuff$Mode.SRC_IN;
		 return;
	 } // .end method
	 public c.h.g.r.d ( ) {
		 /* .locals 1 */
		 /* .line 4 */
		 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V */
		 /* .line 5 */
		 (( c.h.g.r.d ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/g/r/d;->c()Lc/h/g/r/f;
		 this.e = v0;
		 /* .line 6 */
		 (( c.h.g.r.d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/h/g/r/d;->a(Landroid/graphics/drawable/Drawable;)V
		 return;
	 } // .end method
	 public c.h.g.r.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V */
		 /* .line 2 */
		 this.e = p1;
		 /* .line 3 */
		 (( c.h.g.r.d ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/h/g/r/d;->a(Landroid/content/res/Resources;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final android.graphics.drawable.Drawable a ( ) {
		 /* .locals 1 */
		 /* .line 14 */
		 v0 = this.g;
	 } // .end method
	 public final void a ( android.content.res.Resources p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.e;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.b;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 2 */
				 (( android.graphics.drawable.Drawable$ConstantState ) v0 ).newDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
				 (( c.h.g.r.d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/h/g/r/d;->a(Landroid/graphics/drawable/Drawable;)V
			 } // :cond_0
			 return;
		 } // .end method
		 public final void a ( android.graphics.drawable.Drawable p0 ) {
			 /* .locals 2 */
			 /* .line 15 */
			 v0 = this.g;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 int v1 = 0; // const/4 v1, 0x0
				 /* .line 16 */
				 (( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
				 /* .line 17 */
			 } // :cond_0
			 this.g = p1;
			 if ( p1 != null) { // if-eqz p1, :cond_1
				 /* .line 18 */
				 (( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
				 /* .line 19 */
				 v0 = 				 (( android.graphics.drawable.Drawable ) p1 ).isVisible ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isVisible()Z
				 int v1 = 1; // const/4 v1, 0x1
				 (( c.h.g.r.d ) p0 ).setVisible ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lc/h/g/r/d;->setVisible(ZZ)Z
				 /* .line 20 */
				 (( android.graphics.drawable.Drawable ) p1 ).getState ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getState()[I
				 (( c.h.g.r.d ) p0 ).setState ( v0 ); // invoke-virtual {p0, v0}, Lc/h/g/r/d;->setState([I)Z
				 /* .line 21 */
				 v0 = 				 (( android.graphics.drawable.Drawable ) p1 ).getLevel ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getLevel()I
				 (( android.graphics.drawable.Drawable ) p0 ).setLevel ( v0 ); // invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
				 /* .line 22 */
				 (( android.graphics.drawable.Drawable ) p1 ).getBounds ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
				 (( android.graphics.drawable.Drawable ) p0 ).setBounds ( v0 ); // invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
				 /* .line 23 */
				 v0 = this.e;
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 /* .line 24 */
					 (( android.graphics.drawable.Drawable ) p1 ).getConstantState ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
					 this.b = p1;
					 /* .line 25 */
				 } // :cond_1
				 (( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
				 return;
			 } // .end method
			 public final Boolean a ( Integer[] p0 ) {
				 /* .locals 4 */
				 /* .line 3 */
				 v0 = 				 (( c.h.g.r.d ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/g/r/d;->b()Z
				 int v1 = 0; // const/4 v1, 0x0
				 /* if-nez v0, :cond_0 */
				 /* .line 4 */
			 } // :cond_0
			 v0 = this.e;
			 v2 = this.c;
			 /* .line 5 */
			 v0 = this.d;
			 if ( v2 != null) { // if-eqz v2, :cond_2
				 if ( v0 != null) { // if-eqz v0, :cond_2
					 /* .line 6 */
					 v3 = 					 (( android.content.res.ColorStateList ) v2 ).getDefaultColor ( ); // invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I
					 p1 = 					 (( android.content.res.ColorStateList ) v2 ).getColorForState ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I
					 /* .line 7 */
					 /* iget-boolean v2, p0, Lc/h/g/r/d;->d:Z */
					 if ( v2 != null) { // if-eqz v2, :cond_1
						 /* iget v2, p0, Lc/h/g/r/d;->b:I */
						 /* if-ne p1, v2, :cond_1 */
						 v2 = this.c;
						 /* if-eq v0, v2, :cond_3 */
						 /* .line 8 */
					 } // :cond_1
					 (( android.graphics.drawable.Drawable ) p0 ).setColorFilter ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V
					 /* .line 9 */
					 /* iput p1, p0, Lc/h/g/r/d;->b:I */
					 /* .line 10 */
					 this.c = v0;
					 int p1 = 1; // const/4 p1, 0x1
					 /* .line 11 */
					 /* iput-boolean p1, p0, Lc/h/g/r/d;->d:Z */
					 /* .line 12 */
				 } // :cond_2
				 /* iput-boolean v1, p0, Lc/h/g/r/d;->d:Z */
				 /* .line 13 */
				 (( android.graphics.drawable.Drawable ) p0 ).clearColorFilter ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V
			 } // :cond_3
		 } // .end method
		 public Boolean b ( ) {
			 /* .locals 1 */
			 int v0 = 1; // const/4 v0, 0x1
		 } // .end method
		 public final c.h.g.r.f c ( ) {
			 /* .locals 2 */
			 /* .line 1 */
			 /* new-instance v0, Lc/h/g/r/f; */
			 v1 = this.e;
			 /* invoke-direct {v0, v1}, Lc/h/g/r/f;-><init>(Lc/h/g/r/f;)V */
		 } // .end method
		 public void draw ( android.graphics.Canvas p0 ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.g;
			 (( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
			 return;
		 } // .end method
		 public Integer getChangingConfigurations ( ) {
			 /* .locals 2 */
			 /* .line 1 */
			 v0 = 			 /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I */
			 /* .line 2 */
			 v1 = this.e;
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 v1 = 				 (( c.h.g.r.f ) v1 ).getChangingConfigurations ( ); // invoke-virtual {v1}, Lc/h/g/r/f;->getChangingConfigurations()I
			 } // :cond_0
			 int v1 = 0; // const/4 v1, 0x0
		 } // :goto_0
		 /* or-int/2addr v0, v1 */
		 v1 = this.g;
		 /* .line 3 */
		 v1 = 		 (( android.graphics.drawable.Drawable ) v1 ).getChangingConfigurations ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I
		 /* or-int/2addr v0, v1 */
	 } // .end method
	 public android.graphics.drawable.Drawable$ConstantState getConstantState ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.e;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 (( c.h.g.r.f ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/g/r/f;->a()Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 2 */
				 v0 = this.e;
				 v1 = 				 (( c.h.g.r.d ) p0 ).getChangingConfigurations ( ); // invoke-virtual {p0}, Lc/h/g/r/d;->getChangingConfigurations()I
				 /* iput v1, v0, Lc/h/g/r/f;->a:I */
				 /* .line 3 */
				 v0 = this.e;
			 } // :cond_0
			 int v0 = 0; // const/4 v0, 0x0
		 } // .end method
		 public android.graphics.drawable.Drawable getCurrent ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.g;
			 (( android.graphics.drawable.Drawable ) v0 ).getCurrent ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;
		 } // .end method
		 public Integer getIntrinsicHeight ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.g;
			 v0 = 			 (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
		 } // .end method
		 public Integer getIntrinsicWidth ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.g;
			 v0 = 			 (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
		 } // .end method
		 public Integer getLayoutDirection ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.g;
			 v0 = 			 c.h.g.r.a .d ( v0 );
		 } // .end method
		 public Integer getMinimumHeight ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.g;
			 v0 = 			 (( android.graphics.drawable.Drawable ) v0 ).getMinimumHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I
		 } // .end method
		 public Integer getMinimumWidth ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.g;
			 v0 = 			 (( android.graphics.drawable.Drawable ) v0 ).getMinimumWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I
		 } // .end method
		 public Integer getOpacity ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.g;
			 v0 = 			 (( android.graphics.drawable.Drawable ) v0 ).getOpacity ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I
		 } // .end method
		 public Boolean getPadding ( android.graphics.Rect p0 ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.g;
			 p1 = 			 (( android.graphics.drawable.Drawable ) v0 ).getPadding ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
		 } // .end method
		 public getState ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.g;
			 (( android.graphics.drawable.Drawable ) v0 ).getState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getState()[I
		 } // .end method
		 public android.graphics.Region getTransparentRegion ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.g;
			 (( android.graphics.drawable.Drawable ) v0 ).getTransparentRegion ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getTransparentRegion()Landroid/graphics/Region;
		 } // .end method
		 public void invalidateDrawable ( android.graphics.drawable.Drawable p0 ) {
			 /* .locals 0 */
			 /* .line 1 */
			 (( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
			 return;
		 } // .end method
		 public Boolean isAutoMirrored ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.g;
			 v0 = 			 c.h.g.r.a .e ( v0 );
		 } // .end method
		 public Boolean isStateful ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = 			 (( c.h.g.r.d ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/g/r/d;->b()Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = this.e;
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* .line 2 */
					 v0 = this.c;
				 } // :cond_0
				 int v0 = 0; // const/4 v0, 0x0
			 } // :goto_0
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 3 */
				 v0 = 				 (( android.content.res.ColorStateList ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z
				 /* if-nez v0, :cond_2 */
			 } // :cond_1
			 v0 = this.g;
			 v0 = 			 (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
			 if ( v0 != null) { // if-eqz v0, :cond_3
			 } // :cond_2
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_3
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_1
} // .end method
public void jumpToCurrentState ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.g;
	 (( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
	 return;
} // .end method
public android.graphics.drawable.Drawable mutate ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* iget-boolean v0, p0, Lc/h/g/r/d;->f:Z */
	 /* if-nez v0, :cond_3 */
	 /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable; */
	 /* if-ne v0, p0, :cond_3 */
	 /* .line 2 */
	 (( c.h.g.r.d ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/g/r/d;->c()Lc/h/g/r/f;
	 this.e = v0;
	 /* .line 3 */
	 v0 = this.g;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 4 */
		 (( android.graphics.drawable.Drawable ) v0 ).mutate ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
		 /* .line 5 */
	 } // :cond_0
	 v0 = this.e;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 6 */
		 v1 = this.g;
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 (( android.graphics.drawable.Drawable ) v1 ).getConstantState ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
		 } // :cond_1
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 this.b = v1;
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
/* .line 7 */
/* iput-boolean v0, p0, Lc/h/g/r/d;->f:Z */
} // :cond_3
} // .end method
public void onBoundsChange ( android.graphics.Rect p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
} // :cond_0
return;
} // .end method
public Boolean onLayoutDirectionChanged ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
p1 = c.h.g.r.a .a ( v0,p1 );
} // .end method
public Boolean onLevelChange ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
p1 = (( android.graphics.drawable.Drawable ) v0 ).setLevel ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
} // .end method
public void scheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1, Long p2 ) {
/* .locals 0 */
/* .line 1 */
(( android.graphics.drawable.Drawable ) p0 ).scheduleSelf ( p2, p3, p4 ); // invoke-virtual {p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V
return;
} // .end method
public void setAlpha ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
(( android.graphics.drawable.Drawable ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
return;
} // .end method
public void setAutoMirrored ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
c.h.g.r.a .a ( v0,p1 );
return;
} // .end method
public void setChangingConfigurations ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
(( android.graphics.drawable.Drawable ) v0 ).setChangingConfigurations ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V
return;
} // .end method
public void setColorFilter ( android.graphics.ColorFilter p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
(( android.graphics.drawable.Drawable ) v0 ).setColorFilter ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V
return;
} // .end method
public void setDither ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
(( android.graphics.drawable.Drawable ) v0 ).setDither ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setDither(Z)V
return;
} // .end method
public void setFilterBitmap ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
(( android.graphics.drawable.Drawable ) v0 ).setFilterBitmap ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V
return;
} // .end method
public Boolean setState ( Integer[] p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
v0 = (( android.graphics.drawable.Drawable ) v0 ).setState ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* .line 2 */
p1 = (( c.h.g.r.d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/h/g/r/d;->a([I)Z
/* if-nez p1, :cond_1 */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public void setTint ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
android.content.res.ColorStateList .valueOf ( p1 );
(( c.h.g.r.d ) p0 ).setTintList ( p1 ); // invoke-virtual {p0, p1}, Lc/h/g/r/d;->setTintList(Landroid/content/res/ColorStateList;)V
return;
} // .end method
public void setTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
this.c = p1;
/* .line 2 */
(( c.h.g.r.d ) p0 ).getState ( ); // invoke-virtual {p0}, Lc/h/g/r/d;->getState()[I
(( c.h.g.r.d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/h/g/r/d;->a([I)Z
return;
} // .end method
public void setTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
this.d = p1;
/* .line 2 */
(( c.h.g.r.d ) p0 ).getState ( ); // invoke-virtual {p0}, Lc/h/g/r/d;->getState()[I
(( c.h.g.r.d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/h/g/r/d;->a([I)Z
return;
} // .end method
public Boolean setVisible ( Boolean p0, Boolean p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z */
/* if-nez v0, :cond_1 */
v0 = this.g;
p1 = (( android.graphics.drawable.Drawable ) v0 ).setVisible ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public void unscheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1 ) {
/* .locals 0 */
/* .line 1 */
(( android.graphics.drawable.Drawable ) p0 ).unscheduleSelf ( p2 ); // invoke-virtual {p0, p2}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V
return;
} // .end method
