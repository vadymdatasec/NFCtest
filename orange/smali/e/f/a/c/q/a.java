public abstract class e.f.a.c.q.a {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.content.res.ColorStateList a ( android.content.Context p0, android.content.res.TypedArray p1, Integer p2 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = 		 (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 2 */
			 v0 = 			 (( android.content.res.TypedArray ) p1 ).getResourceId ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 3 */
				 c.b.l.a.b .b ( p0,v0 );
				 if ( p0 != null) { // if-eqz p0, :cond_0
					 /* .line 4 */
				 } // :cond_0
				 (( android.content.res.TypedArray ) p1 ).getColorStateList ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;
			 } // .end method
			 public static android.graphics.drawable.Drawable b ( android.content.Context p0, android.content.res.TypedArray p1, Integer p2 ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = 				 (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 int v0 = 0; // const/4 v0, 0x0
					 /* .line 2 */
					 v0 = 					 (( android.content.res.TypedArray ) p1 ).getResourceId ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I
					 if ( v0 != null) { // if-eqz v0, :cond_0
						 /* .line 3 */
						 c.b.l.a.b .c ( p0,v0 );
						 if ( p0 != null) { // if-eqz p0, :cond_0
							 /* .line 4 */
						 } // :cond_0
						 (( android.content.res.TypedArray ) p1 ).getDrawable ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
					 } // .end method
