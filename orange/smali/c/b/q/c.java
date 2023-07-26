public class c.b.q.c extends android.graphics.drawable.Drawable {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final androidx.appcompat.widget.ActionBarContainer a;
	 /* # direct methods */
	 public c.b.q.c ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void draw ( android.graphics.Canvas p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.a;
		 /* iget-boolean v1, v0, Landroidx/appcompat/widget/ActionBarContainer;->i:Z */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 2 */
			 v0 = this.h;
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 /* .line 3 */
				 (( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
				 /* .line 4 */
			 } // :cond_0
			 v0 = this.f;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 5 */
				 (( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
				 /* .line 6 */
			 } // :cond_1
			 v0 = this.a;
			 v1 = this.g;
			 if ( v1 != null) { // if-eqz v1, :cond_2
				 /* iget-boolean v0, v0, Landroidx/appcompat/widget/ActionBarContainer;->j:Z */
				 if ( v0 != null) { // if-eqz v0, :cond_2
					 /* .line 7 */
					 (( android.graphics.drawable.Drawable ) v1 ).draw ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
				 } // :cond_2
			 } // :goto_0
			 return;
		 } // .end method
		 public Integer getOpacity ( ) {
			 /* .locals 1 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // .end method
		 public void getOutline ( android.graphics.Outline p0 ) {
			 /* .locals 2 */
			 /* .line 1 */
			 v0 = this.a;
			 /* iget-boolean v1, v0, Landroidx/appcompat/widget/ActionBarContainer;->i:Z */
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* .line 2 */
				 v0 = this.h;
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 /* .line 3 */
					 (( android.graphics.drawable.Drawable ) v0 ).getOutline ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getOutline(Landroid/graphics/Outline;)V
					 /* .line 4 */
				 } // :cond_0
				 v0 = this.f;
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 /* .line 5 */
					 (( android.graphics.drawable.Drawable ) v0 ).getOutline ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getOutline(Landroid/graphics/Outline;)V
				 } // :cond_1
			 } // :goto_0
			 return;
		 } // .end method
		 public void setAlpha ( Integer p0 ) {
			 /* .locals 0 */
			 return;
		 } // .end method
		 public void setColorFilter ( android.graphics.ColorFilter p0 ) {
			 /* .locals 0 */
			 return;
		 } // .end method
