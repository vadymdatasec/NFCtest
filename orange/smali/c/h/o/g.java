public abstract class c.h.o.g {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Float a ( android.widget.EdgeEffect p0 ) {
		 /* .locals 1 */
		 /* .line 4 */
		 v0 = 		 c.h.j.a .b ( );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 5 */
			 p0 = 			 c.h.o.f .a ( p0 );
		 } // :cond_0
		 int p0 = 0; // const/4 p0, 0x0
	 } // .end method
	 public static android.widget.EdgeEffect a ( android.content.Context p0, android.util.AttributeSet p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = 		 c.h.j.a .b ( );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 c.h.o.f .a ( p0,p1 );
			 /* .line 3 */
		 } // :cond_0
		 /* new-instance p1, Landroid/widget/EdgeEffect; */
		 /* invoke-direct {p1, p0}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V */
	 } // .end method
	 public static void a ( android.widget.EdgeEffect p0, Float p1, Float p2 ) {
		 /* .locals 2 */
		 /* .line 6 */
		 /* const/16 v1, 0x15 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 7 */
		 (( android.widget.EdgeEffect ) p0 ).onPull ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/widget/EdgeEffect;->onPull(FF)V
		 /* .line 8 */
	 } // :cond_0
	 (( android.widget.EdgeEffect ) p0 ).onPull ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/EdgeEffect;->onPull(F)V
} // :goto_0
return;
} // .end method
public static Float b ( android.widget.EdgeEffect p0, Float p1, Float p2 ) {
/* .locals 1 */
/* .line 1 */
v0 = c.h.j.a .b ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 p0 = 	 c.h.o.f .a ( p0,p1,p2 );
	 /* .line 3 */
} // :cond_0
c.h.o.g .a ( p0,p1,p2 );
} // .end method
