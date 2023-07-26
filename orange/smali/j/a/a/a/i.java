public class j.a.a.a.i {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.hardware.Camera a;
	 public final Integer b;
	 /* # direct methods */
	 public j.a.a.a.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 this.a = p1;
			 /* .line 3 */
			 /* iput p2, p0, Lj/a/a/a/i;->b:I */
			 return;
			 /* .line 4 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/NullPointerException; */
		 final String p2 = "Camera cannot be null"; // const-string p2, "Camera cannot be null"
		 /* invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 public static j.a.a.a.i a ( android.hardware.Camera p0, Integer p1 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int p0 = 0; // const/4 p0, 0x0
		 /* .line 1 */
	 } // :cond_0
	 /* new-instance v0, Lj/a/a/a/i; */
	 /* invoke-direct {v0, p0, p1}, Lj/a/a/a/i;-><init>(Landroid/hardware/Camera;I)V */
} // .end method
