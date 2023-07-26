public abstract class c.h.o.h {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.content.res.ColorStateList a ( android.widget.ImageView p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* const/16 v1, 0x15 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 2 */
		 (( android.widget.ImageView ) p0 ).getImageTintList ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getImageTintList()Landroid/content/res/ColorStateList;
		 /* .line 3 */
	 } // :cond_0
	 /* instance-of v0, p0, Lc/h/o/s; */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 4 */
		 /* check-cast p0, Lc/h/o/s; */
	 } // :cond_1
	 int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static void a ( android.widget.ImageView p0, android.content.res.ColorStateList p1 ) {
/* .locals 2 */
/* .line 5 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_1 */
/* .line 6 */
(( android.widget.ImageView ) p0 ).setImageTintList ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V
/* .line 7 */
/* if-ne p1, v1, :cond_2 */
/* .line 8 */
(( android.widget.ImageView ) p0 ).getDrawable ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
if ( p1 != null) { // if-eqz p1, :cond_2
	 /* .line 9 */
	 (( android.widget.ImageView ) p0 ).getImageTintList ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getImageTintList()Landroid/content/res/ColorStateList;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 10 */
		 v0 = 		 (( android.graphics.drawable.Drawable ) p1 ).isStateful ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 11 */
			 (( android.widget.ImageView ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawableState()[I
			 (( android.graphics.drawable.Drawable ) p1 ).setState ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
			 /* .line 12 */
		 } // :cond_0
		 (( android.widget.ImageView ) p0 ).setImageDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
		 /* .line 13 */
	 } // :cond_1
	 /* instance-of v0, p0, Lc/h/o/s; */
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 14 */
		 /* check-cast p0, Lc/h/o/s; */
	 } // :cond_2
} // :goto_0
return;
} // .end method
public static void a ( android.widget.ImageView p0, android.graphics.PorterDuff$Mode p1 ) {
/* .locals 2 */
/* .line 15 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_1 */
/* .line 16 */
(( android.widget.ImageView ) p0 ).setImageTintMode ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
/* .line 17 */
/* if-ne p1, v1, :cond_2 */
/* .line 18 */
(( android.widget.ImageView ) p0 ).getDrawable ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
if ( p1 != null) { // if-eqz p1, :cond_2
	 /* .line 19 */
	 (( android.widget.ImageView ) p0 ).getImageTintList ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getImageTintList()Landroid/content/res/ColorStateList;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 20 */
		 v0 = 		 (( android.graphics.drawable.Drawable ) p1 ).isStateful ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 21 */
			 (( android.widget.ImageView ) p0 ).getDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawableState()[I
			 (( android.graphics.drawable.Drawable ) p1 ).setState ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
			 /* .line 22 */
		 } // :cond_0
		 (( android.widget.ImageView ) p0 ).setImageDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
		 /* .line 23 */
	 } // :cond_1
	 /* instance-of v0, p0, Lc/h/o/s; */
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 24 */
		 /* check-cast p0, Lc/h/o/s; */
	 } // :cond_2
} // :goto_0
return;
} // .end method
public static android.graphics.PorterDuff$Mode b ( android.widget.ImageView p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( android.widget.ImageView ) p0 ).getImageTintMode ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getImageTintMode()Landroid/graphics/PorterDuff$Mode;
/* .line 3 */
} // :cond_0
/* instance-of v0, p0, Lc/h/o/s; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
/* check-cast p0, Lc/h/o/s; */
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
