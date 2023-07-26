public abstract class c.v.x {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.animation.ObjectAnimator a ( java.lang.Object p0, android.util.Property p1, android.graphics.Path p2 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(TT;", */
		 /* "Landroid/util/Property<", */
		 /* "TT;", */
		 /* "Landroid/graphics/PointF;", */
		 /* ">;", */
		 /* "Landroid/graphics/Path;", */
		 /* ")", */
		 /* "Landroid/animation/ObjectAnimator;" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* const/16 v1, 0x15 */
	 /* if-lt v0, v1, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 android.animation.ObjectAnimator .ofObject ( p0,p1,v0,p2 );
	 /* .line 3 */
} // :cond_0
/* new-instance v0, Lc/v/z; */
/* invoke-direct {v0, p1, p2}, Lc/v/z;-><init>(Landroid/util/Property;Landroid/graphics/Path;)V */
int p1 = 2; // const/4 p1, 0x2
/* new-array p1, p1, [F */
/* fill-array-data p1, :array_0 */
android.animation.ObjectAnimator .ofFloat ( p0,v0,p1 );
/* :array_0 */
/* .array-data 4 */
/* 0x0 */
/* 0x3f800000 # 1.0f */
} // .end array-data
} // .end method
