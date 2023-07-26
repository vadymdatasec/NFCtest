public class c.l.d.k0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.view.animation.Animation a;
	 public final android.animation.Animator b;
	 /* # direct methods */
	 public c.l.d.k0 ( ) {
		 /* .locals 1 */
		 /* .line 5 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 6 */
		 this.a = v0;
		 /* .line 7 */
		 this.b = p1;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 return;
			 /* .line 8 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/IllegalStateException; */
		 final String v0 = "Animator cannot be null"; // const-string v0, "Animator cannot be null"
		 /* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 public c.l.d.k0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 this.b = v0;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 return;
			 /* .line 4 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/IllegalStateException; */
		 final String v0 = "Animation cannot be null"; // const-string v0, "Animation cannot be null"
		 /* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
