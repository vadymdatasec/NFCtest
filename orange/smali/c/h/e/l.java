public abstract class c.h.e.l {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( android.app.AppOpsManager p0, java.lang.String p1, Integer p2, java.lang.String p3 ) {
		 /* .locals 0 */
		 /* if-nez p0, :cond_0 */
		 int p0 = 1; // const/4 p0, 0x1
		 /* .line 1 */
	 } // :cond_0
	 p0 = 	 (( android.app.AppOpsManager ) p0 ).checkOpNoThrow ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroid/app/AppOpsManager;->checkOpNoThrow(Ljava/lang/String;ILjava/lang/String;)I
} // .end method
public static java.lang.String a ( android.content.Context p0 ) {
	 /* .locals 0 */
	 /* .line 2 */
	 (( android.content.Context ) p0 ).getOpPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getOpPackageName()Ljava/lang/String;
} // .end method
public static android.app.AppOpsManager b ( android.content.Context p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* const-class v0, Landroid/app/AppOpsManager; */
	 (( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;
	 /* check-cast p0, Landroid/app/AppOpsManager; */
} // .end method
