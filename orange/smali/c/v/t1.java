public class c.v.t1 implements c.v.u1 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.WindowId a;
	 /* # direct methods */
	 public c.v.t1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 (( android.view.View ) p1 ).getWindowId ( ); // invoke-virtual {p1}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* instance-of v0, p1, Lc/v/t1; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* check-cast p1, Lc/v/t1; */
			 p1 = this.a;
			 v0 = this.a;
			 p1 = 			 (( android.view.WindowId ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 int p1 = 1; // const/4 p1, 0x1
			 } // :cond_0
			 int p1 = 0; // const/4 p1, 0x0
		 } // :goto_0
	 } // .end method
	 public Integer hashCode ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 v0 = 		 (( android.view.WindowId ) v0 ).hashCode ( ); // invoke-virtual {v0}, Landroid/view/WindowId;->hashCode()I
	 } // .end method
