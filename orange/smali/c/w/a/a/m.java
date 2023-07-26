public abstract class c.w.a.a.m extends android.graphics.drawable.Drawable implements c.h.g.r.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public android.graphics.drawable.Drawable b;
	 /* # direct methods */
	 public c.w.a.a.m ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void applyTheme ( android.content.res.Resources$Theme p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 c.h.g.r.a .a ( v0,p1 );
		 } // :cond_0
		 return;
	 } // .end method
	 public void clearColorFilter ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( android.graphics.drawable.Drawable ) v0 ).clearColorFilter ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V
			 return;
			 /* .line 3 */
		 } // :cond_0
		 /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V */
		 return;
	 } // .end method
	 public android.graphics.drawable.Drawable getCurrent ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( android.graphics.drawable.Drawable ) v0 ).getCurrent ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;
			 /* .line 3 */
		 } // :cond_0
		 /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable; */
	 } // .end method
	 public Integer getMinimumHeight ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = 			 (( android.graphics.drawable.Drawable ) v0 ).getMinimumHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I
			 /* .line 3 */
		 } // :cond_0
		 v0 = 		 /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I */
	 } // .end method
	 public Integer getMinimumWidth ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = 			 (( android.graphics.drawable.Drawable ) v0 ).getMinimumWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I
			 /* .line 3 */
		 } // :cond_0
		 v0 = 		 /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I */
	 } // .end method
	 public Boolean getPadding ( android.graphics.Rect p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 p1 = 			 (( android.graphics.drawable.Drawable ) v0 ).getPadding ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
			 /* .line 3 */
		 } // :cond_0
		 p1 = 		 /* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z */
	 } // .end method
	 public getState ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( android.graphics.drawable.Drawable ) v0 ).getState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getState()[I
			 /* .line 3 */
		 } // :cond_0
		 /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getState()[I */
	 } // .end method
	 public android.graphics.Region getTransparentRegion ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( android.graphics.drawable.Drawable ) v0 ).getTransparentRegion ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getTransparentRegion()Landroid/graphics/Region;
			 /* .line 3 */
		 } // :cond_0
		 /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getTransparentRegion()Landroid/graphics/Region; */
	 } // .end method
	 public void jumpToCurrentState ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 c.h.g.r.a .f ( v0 );
		 } // :cond_0
		 return;
	 } // .end method
	 public Boolean onLevelChange ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 p1 = 			 (( android.graphics.drawable.Drawable ) v0 ).setLevel ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
			 /* .line 3 */
		 } // :cond_0
		 p1 = 		 /* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onLevelChange(I)Z */
	 } // .end method
	 public void setChangingConfigurations ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( android.graphics.drawable.Drawable ) v0 ).setChangingConfigurations ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V
			 return;
			 /* .line 3 */
		 } // :cond_0
		 /* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V */
		 return;
	 } // .end method
	 public void setColorFilter ( Integer p0, android.graphics.PorterDuff$Mode p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( android.graphics.drawable.Drawable ) v0 ).setColorFilter ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V
			 return;
			 /* .line 3 */
		 } // :cond_0
		 /* invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V */
		 return;
	 } // .end method
	 public void setFilterBitmap ( Boolean p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( android.graphics.drawable.Drawable ) v0 ).setFilterBitmap ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V
		 } // :cond_0
		 return;
	 } // .end method
	 public void setHotspot ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 c.h.g.r.a .a ( v0,p1,p2 );
		 } // :cond_0
		 return;
	 } // .end method
	 public void setHotspotBounds ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 c.h.g.r.a .a ( v0,p1,p2,p3,p4 );
		 } // :cond_0
		 return;
	 } // .end method
	 public Boolean setState ( Integer[] p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 p1 = 			 (( android.graphics.drawable.Drawable ) v0 ).setState ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
			 /* .line 3 */
		 } // :cond_0
		 p1 = 		 /* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z */
	 } // .end method
