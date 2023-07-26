public class c.b.k.c implements android.view.View$OnClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final androidx.appcompat.app.AlertController b; //synthetic
	 /* # direct methods */
	 public c.b.k.c ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onClick ( android.view.View p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 v1 = this.o;
		 /* if-ne p1, v1, :cond_0 */
		 v0 = this.q;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 android.os.Message .obtain ( v0 );
			 /* .line 3 */
		 } // :cond_0
		 v0 = this.b;
		 v1 = this.s;
		 /* if-ne p1, v1, :cond_1 */
		 v0 = this.u;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 4 */
			 android.os.Message .obtain ( v0 );
			 /* .line 5 */
		 } // :cond_1
		 v0 = this.b;
		 v1 = this.w;
		 /* if-ne p1, v1, :cond_2 */
		 p1 = this.y;
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 /* .line 6 */
			 android.os.Message .obtain ( p1 );
		 } // :cond_2
		 int p1 = 0; // const/4 p1, 0x0
	 } // :goto_0
	 if ( p1 != null) { // if-eqz p1, :cond_3
		 /* .line 7 */
		 (( android.os.Message ) p1 ).sendToTarget ( ); // invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
		 /* .line 8 */
	 } // :cond_3
	 p1 = this.b;
	 v0 = this.R;
	 int v1 = 1; // const/4 v1, 0x1
	 p1 = this.b;
	 (( android.os.Handler ) v0 ).obtainMessage ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
	 /* .line 9 */
	 (( android.os.Message ) p1 ).sendToTarget ( ); // invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
	 return;
} // .end method
