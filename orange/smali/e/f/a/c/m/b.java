public class e.f.a.c.m.b extends android.graphics.drawable.RippleDrawable {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/TargetApi; */
	 /* value = 0x15 */
} // .end annotation
/* # direct methods */
public e.f.a.c.m.b ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0, p1, p2, p3}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V */
	 return;
} // .end method
/* # virtual methods */
public void setColorFilter ( android.graphics.ColorFilter p0 ) {
	 /* .locals 2 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 1 */
	 (( android.graphics.drawable.RippleDrawable ) p0 ).getDrawable ( v0 ); // invoke-virtual {p0, v0}, Landroid/graphics/drawable/RippleDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 2 */
		 (( android.graphics.drawable.RippleDrawable ) p0 ).getDrawable ( v0 ); // invoke-virtual {p0, v0}, Landroid/graphics/drawable/RippleDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;
		 /* check-cast v1, Landroid/graphics/drawable/InsetDrawable; */
		 /* .line 3 */
		 (( android.graphics.drawable.InsetDrawable ) v1 ).getDrawable ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/InsetDrawable;->getDrawable()Landroid/graphics/drawable/Drawable;
		 /* check-cast v1, Landroid/graphics/drawable/LayerDrawable; */
		 /* .line 4 */
		 (( android.graphics.drawable.LayerDrawable ) v1 ).getDrawable ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;
		 /* check-cast v0, Landroid/graphics/drawable/GradientDrawable; */
		 /* .line 5 */
		 (( android.graphics.drawable.GradientDrawable ) v0 ).setColorFilter ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColorFilter(Landroid/graphics/ColorFilter;)V
	 } // :cond_0
	 return;
} // .end method
