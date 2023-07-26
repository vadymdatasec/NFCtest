public abstract class e.f.a.c.p.d {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.graphics.PorterDuff$Mode a ( Integer p0, android.graphics.PorterDuff$Mode p1 ) {
		 /* .locals 1 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* if-eq p0, v0, :cond_2 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* if-eq p0, v0, :cond_1 */
		 /* const/16 v0, 0x9 */
		 /* if-eq p0, v0, :cond_0 */
		 /* packed-switch p0, :pswitch_data_0 */
		 /* .line 1 */
		 /* :pswitch_0 */
		 p0 = android.graphics.PorterDuff$Mode.ADD;
		 /* .line 2 */
		 /* :pswitch_1 */
		 p0 = android.graphics.PorterDuff$Mode.SCREEN;
		 /* .line 3 */
		 /* :pswitch_2 */
		 p0 = android.graphics.PorterDuff$Mode.MULTIPLY;
		 /* .line 4 */
	 } // :cond_0
	 p0 = android.graphics.PorterDuff$Mode.SRC_ATOP;
	 /* .line 5 */
} // :cond_1
p0 = android.graphics.PorterDuff$Mode.SRC_IN;
/* .line 6 */
} // :cond_2
p0 = android.graphics.PorterDuff$Mode.SRC_OVER;
/* :pswitch_data_0 */
/* .packed-switch 0xe */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
