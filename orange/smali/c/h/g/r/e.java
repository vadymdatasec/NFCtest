public class c.h.g.r.e extends c.h.g.r.d {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.reflect.Method i;
	 /* # direct methods */
	 public c.h.g.r.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Lc/h/g/r/d;-><init>(Landroid/graphics/drawable/Drawable;)V */
		 /* .line 2 */
		 (( c.h.g.r.e ) p0 ).d ( ); // invoke-virtual {p0}, Lc/h/g/r/e;->d()V
		 return;
	 } // .end method
	 public c.h.g.r.e ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0, p1, p2}, Lc/h/g/r/d;-><init>(Lc/h/g/r/f;Landroid/content/res/Resources;)V */
		 /* .line 4 */
		 (( c.h.g.r.e ) p0 ).d ( ); // invoke-virtual {p0}, Lc/h/g/r/e;->d()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean b ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const/16 v2, 0x15 */
		 /* if-ne v0, v2, :cond_1 */
		 /* .line 2 */
		 v0 = this.g;
		 /* .line 3 */
		 /* instance-of v2, v0, Landroid/graphics/drawable/GradientDrawable; */
		 /* if-nez v2, :cond_0 */
		 /* instance-of v2, v0, Landroid/graphics/drawable/DrawableContainer; */
		 /* if-nez v2, :cond_0 */
		 /* instance-of v2, v0, Landroid/graphics/drawable/InsetDrawable; */
		 /* if-nez v2, :cond_0 */
		 /* instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable; */
		 if ( v0 != null) { // if-eqz v0, :cond_1
		 } // :cond_0
		 int v1 = 1; // const/4 v1, 0x1
	 } // :cond_1
} // .end method
public final void d ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 v0 = c.h.g.r.e.i;
	 /* if-nez v0, :cond_0 */
	 /* .line 2 */
	 try { // :try_start_0
		 /* const-class v0, Landroid/graphics/drawable/Drawable; */
		 final String v1 = "isProjected"; // const-string v1, "isProjected"
		 int v2 = 0; // const/4 v2, 0x0
		 /* new-array v2, v2, [Ljava/lang/Class; */
		 (( java.lang.Class ) v0 ).getDeclaredMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 final String v1 = "WrappedDrawableApi21"; // const-string v1, "WrappedDrawableApi21"
		 final String v2 = "Failed to retrieve Drawable#isProjected() method"; // const-string v2, "Failed to retrieve Drawable#isProjected() method"
		 /* .line 3 */
		 android.util.Log .w ( v1,v2,v0 );
	 } // :cond_0
} // :goto_0
return;
} // .end method
public android.graphics.Rect getDirtyBounds ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
(( android.graphics.drawable.Drawable ) v0 ).getDirtyBounds ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getDirtyBounds()Landroid/graphics/Rect;
} // .end method
public void getOutline ( android.graphics.Outline p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
(( android.graphics.drawable.Drawable ) v0 ).getOutline ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getOutline(Landroid/graphics/Outline;)V
return;
} // .end method
public Boolean isProjected ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.g;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
	 v2 = c.h.g.r.e.i;
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 try { // :try_start_0
			 /* new-array v3, v1, [Ljava/lang/Object; */
			 /* .line 2 */
			 (( java.lang.reflect.Method ) v2 ).invoke ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v0, Ljava/lang/Boolean; */
			 v0 = 			 (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 final String v2 = "WrappedDrawableApi21"; // const-string v2, "WrappedDrawableApi21"
			 final String v3 = "Error calling Drawable#isProjected() method"; // const-string v3, "Error calling Drawable#isProjected() method"
			 /* .line 3 */
			 android.util.Log .w ( v2,v3,v0 );
		 } // :cond_0
	 } // .end method
	 public void setHotspot ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.g;
		 (( android.graphics.drawable.Drawable ) v0 ).setHotspot ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V
		 return;
	 } // .end method
	 public void setHotspotBounds ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.g;
		 (( android.graphics.drawable.Drawable ) v0 ).setHotspotBounds ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->setHotspotBounds(IIII)V
		 return;
	 } // .end method
	 public Boolean setState ( Integer[] p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = 		 /* invoke-super {p0, p1}, Lc/h/g/r/d;->setState([I)Z */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 (( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
			 int p1 = 1; // const/4 p1, 0x1
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
	 public void setTint ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = 		 (( c.h.g.r.e ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/g/r/e;->b()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 /* invoke-super {p0, p1}, Lc/h/g/r/d;->setTint(I)V */
			 /* .line 3 */
		 } // :cond_0
		 v0 = this.g;
		 (( android.graphics.drawable.Drawable ) v0 ).setTint ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V
	 } // :goto_0
	 return;
} // .end method
public void setTintList ( android.content.res.ColorStateList p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 (( c.h.g.r.e ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/g/r/e;->b()Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 /* invoke-super {p0, p1}, Lc/h/g/r/d;->setTintList(Landroid/content/res/ColorStateList;)V */
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.g;
	 (( android.graphics.drawable.Drawable ) v0 ).setTintList ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V
} // :goto_0
return;
} // .end method
public void setTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( c.h.g.r.e ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/g/r/e;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 /* invoke-super {p0, p1}, Lc/h/g/r/d;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V */
	 /* .line 3 */
} // :cond_0
v0 = this.g;
(( android.graphics.drawable.Drawable ) v0 ).setTintMode ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V
} // :goto_0
return;
} // .end method
