public abstract class c.h.j.e {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Boolean a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* const/16 v1, 0x18 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 2 */
		 /* const-class v0, Landroid/os/UserManager; */
		 (( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;
		 /* check-cast p0, Landroid/os/UserManager; */
		 p0 = 		 (( android.os.UserManager ) p0 ).isUserUnlocked ( ); // invoke-virtual {p0}, Landroid/os/UserManager;->isUserUnlocked()Z
	 } // :cond_0
	 int p0 = 1; // const/4 p0, 0x1
} // .end method
