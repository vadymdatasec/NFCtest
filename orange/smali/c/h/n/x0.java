public abstract class c.h.n.x0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Boolean a ( android.view.ViewGroup p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* const/16 v1, 0x15 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 2 */
		 p0 = 		 (( android.view.ViewGroup ) p0 ).isTransitionGroup ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->isTransitionGroup()Z
		 /* .line 3 */
	 } // :cond_0
	 (( android.view.ViewGroup ) p0 ).getTag ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getTag(I)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/Boolean; */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 4 */
		 v0 = 		 (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
		 /* if-nez v0, :cond_3 */
		 /* .line 5 */
	 } // :cond_1
	 (( android.view.ViewGroup ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getBackground()Landroid/graphics/drawable/Drawable;
	 /* if-nez v0, :cond_3 */
	 /* .line 6 */
	 c.h.n.v0 .v ( p0 );
	 if ( p0 != null) { // if-eqz p0, :cond_2
	 } // :cond_2
	 int p0 = 0; // const/4 p0, 0x0
} // :cond_3
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // :goto_1
} // .end method
