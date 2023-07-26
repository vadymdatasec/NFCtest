public class com.google.android.play.core.assetpacks.AssetPackException extends com.google.android.play.core.tasks.j {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.google.android.play.core.assetpacks.AssetPackException ( ) {
		 /* .locals 3 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 java.lang.Integer .valueOf ( p1 );
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-object v1, v0, v2 */
		 e.f.a.d.a.b.z2.a .a ( p1 );
		 int v2 = 1; // const/4 v2, 0x1
		 /* aput-object v1, v0, v2 */
		 final String v1 = "Asset Pack Download Error(%d): %s"; // const-string v1, "Asset Pack Download Error(%d): %s"
		 java.lang.String .format ( v1,v0 );
		 /* invoke-direct {p0, v0}, Lcom/google/android/play/core/tasks/j;-><init>(Ljava/lang/String;)V */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 return;
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String v0 = "errorCode should not be 0."; // const-string v0, "errorCode should not be 0."
		 /* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
