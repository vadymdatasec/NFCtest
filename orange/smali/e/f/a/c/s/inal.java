public class inal implements android.os.Handler$Callback {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean handleMessage ( android.os.Message p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* iget v0, p1, Landroid/os/Message;->what:I */
		 int v1 = 1; // const/4 v1, 0x1
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* if-eq v0, v1, :cond_0 */
			 int p1 = 0; // const/4 p1, 0x0
			 /* .line 2 */
		 } // :cond_0
		 v0 = this.obj;
		 /* check-cast v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar; */
		 /* iget p1, p1, Landroid/os/Message;->arg1:I */
		 (( com.google.android.material.snackbar.BaseTransientBottomBar ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->c(I)V
		 /* .line 3 */
	 } // :cond_1
	 p1 = this.obj;
	 /* check-cast p1, Lcom/google/android/material/snackbar/BaseTransientBottomBar; */
	 (( com.google.android.material.snackbar.BaseTransientBottomBar ) p1 ).m ( ); // invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->m()V
} // .end method
