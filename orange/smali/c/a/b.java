public class c.a.b implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final androidx.activity.ComponentActivity b; //synthetic
	 /* # direct methods */
	 public c.a.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 try { // :try_start_0
			 v0 = this.b;
			 androidx.activity.ComponentActivity .a ( v0 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 2 */
			 (( java.lang.IllegalStateException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;
			 final String v2 = "Can not perform this action after onSaveInstanceState"; // const-string v2, "Can not perform this action after onSaveInstanceState"
			 v1 = 			 android.text.TextUtils .equals ( v1,v2 );
			 if ( v1 != null) { // if-eqz v1, :cond_0
			 } // :goto_0
			 return;
			 /* .line 3 */
		 } // :cond_0
		 /* throw v0 */
	 } // .end method
